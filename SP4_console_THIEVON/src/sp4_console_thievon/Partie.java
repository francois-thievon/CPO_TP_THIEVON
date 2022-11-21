/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_thievon;
import java.util.Scanner;

/**
 *
 * @author thiev
 */
public class Partie {
    
    Joueur[] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant = ListeJoueurs[0];
    PlateauDeJeu grilleJeu = new PlateauDeJeu();
    
    public void attribuerCouleursAuxJoueurs() {
        ListeJoueurs[0].affecterCouleur("Rouge");
        ListeJoueurs[1].affecterCouleur("Jaune");
    }
    
    public void initialiserPartie() {
        this.attribuerCouleursAuxJoueurs();
        for (int i = 0; i<30; i++) {
            Jeton jetonrouge = new Jeton("Rouge");
            Jeton jetonjaune = new Jeton("Jaune");
            ListeJoueurs[0].ajouterJeton(jetonrouge);
            ListeJoueurs[1].ajouterJeton(jetonjaune);
        }
    }
    
    public void debuterPartie() {
        Scanner sc = new Scanner(System.in);
        do {
            if (joueurCourant == ListeJoueurs[0]) {
                int a = joueurCourant.reserveJeton.size() - 1;
                System.out.println("\nRouge choisissez dans quelle colonne jouer :");
                int n = sc.nextInt();
                grilleJeu.ajouterJetonDansColonne(joueurCourant.reserveJeton.get(a), n);
                joueurCourant = ListeJoueurs[1];
                System.out.println("\n");
                grilleJeu.afficherGrilleSurConsole();
            }
            else {
                int b = joueurCourant.reserveJeton.size() - 1;
                System.out.println("\nJaune choisissez dans quelle colonne jouer :");
                int m = sc.nextInt();
                grilleJeu.ajouterJetonDansColonne(joueurCourant.reserveJeton.get(b), m);
                joueurCourant = ListeJoueurs[0];
                System.out.println("\n");
                grilleJeu.afficherGrilleSurConsole();
            }
            
        }while (grilleJeu.etreGagnantePourCouleur("Rouge") == false && grilleJeu.etreGagnantePourCouleur("Jaune") == false);
    if (grilleJeu.etreGagnantePourCouleur("Rouge") == true) {
        System.out.println("\n" + ListeJoueurs[0] + " (Rouge) a gagné !");
    }
    if (grilleJeu.etreGagnantePourCouleur("Jaune") == true) {
        System.out.println("\n" + ListeJoueurs[1] + " (Jaune) a gagné !");
    }
    }   
    
}
