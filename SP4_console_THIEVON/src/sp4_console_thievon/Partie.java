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
            System.out.println("\n" + joueurCourant + " Choisissez :\n1 pour placer un jeton\n2 pour recupérer un jeton\n3 pour utiliser un desintegrateur\n0 pour arreter le temps");
            int rep = sc.nextInt();
            if (rep == 0) {
                System.out.println("\nLa partie ne peut malheureusement pas être jouée si le temps est arreté\nElle a donc été interrompue");
                break;
            }
            if (rep == 1) {
                
                if (joueurCourant == ListeJoueurs[0]) {
                int a = joueurCourant.reserveJeton.size() - 1;
                System.out.println("\nRouge choisissez dans quelle colonne jouer :");
                int n = sc.nextInt();
                if (n>0 && n<8) {
                    grilleJeu.ajouterJetonDansColonne(joueurCourant.reserveJeton.get(a), n);
                    joueurCourant = ListeJoueurs[1];
                    System.out.println("\n");
                    grilleJeu.afficherGrilleSurConsole();
                }
                if (n < 1) {
                    System.out.println("Erreure de saisie, jeton placé dans la colonne 1");
                    grilleJeu.ajouterJetonDansColonne(joueurCourant.reserveJeton.get(a), 1);
                    joueurCourant = ListeJoueurs[1];
                    System.out.println("\n");
                    grilleJeu.afficherGrilleSurConsole();
                }
                if (n>7) {
                    System.out.println("Erreure de saisie, jeton placé dans la colonne 7");
                    grilleJeu.ajouterJetonDansColonne(joueurCourant.reserveJeton.get(a), 7);
                    joueurCourant = ListeJoueurs[1];
                    System.out.println("\n");
                    grilleJeu.afficherGrilleSurConsole();
                }
            }
            else {
                int b = joueurCourant.reserveJeton.size() - 1;
                System.out.println("\nJaune choisissez dans quelle colonne jouer :");
                int m = sc.nextInt();
                if (m>0 && m<8) {
                    grilleJeu.ajouterJetonDansColonne(joueurCourant.reserveJeton.get(b), m);
                    joueurCourant = ListeJoueurs[0];
                    System.out.println("\n");
                    grilleJeu.afficherGrilleSurConsole();
                }
                if (m<1) {
                    System.out.println("Erreure de saisie, jeton placé dans la colonne 1");
                    grilleJeu.ajouterJetonDansColonne(joueurCourant.reserveJeton.get(b), 1);
                    joueurCourant = ListeJoueurs[0];
                    System.out.println("\n");
                    grilleJeu.afficherGrilleSurConsole();
                }
                if (m>7) {
                    System.out.println("Erreure de saisie, jeton placé dans la colonne 7");
                    grilleJeu.ajouterJetonDansColonne(joueurCourant.reserveJeton.get(b), 7);
                    joueurCourant = ListeJoueurs[0];
                    System.out.println("\n");
                    grilleJeu.afficherGrilleSurConsole();
                }
            }
            }
            if (rep == 2) {
                
            }
            if (rep == 3) {
                
            }
              
        }while (grilleJeu.etreGagnantePourCouleur("Rouge") == false && grilleJeu.etreGagnantePourCouleur("Jaune") == false && grilleJeu.grilleRemplie() == false);
        if (grilleJeu.etreGagnantePourCouleur("Rouge") == true) {
            System.out.println("\n" + ListeJoueurs[0] + " (Rouge) a gagné !");
            grilleJeu.viderGrille(ListeJoueurs[0], ListeJoueurs[1]);
            this.debuterPartie();
        }
        if (grilleJeu.etreGagnantePourCouleur("Jaune") == true) {
            System.out.println("\n" + ListeJoueurs[1] + " (Jaune) a gagné !");
            grilleJeu.viderGrille(ListeJoueurs[0], ListeJoueurs[1]);
            this.debuterPartie();
        }
        if (grilleJeu.grilleRemplie() == true) {
            System.out.println("\nLa grille est pleine");
        }
    }   
}
