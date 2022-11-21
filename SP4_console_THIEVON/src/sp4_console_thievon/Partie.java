/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_thievon;

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
        grilleJeu.afficherGrilleSurConsole();
        while (grilleJeu.etreGagnantePourCouleur("Rouge") == false && grilleJeu.etreGagnantePourCouleur("Jaune") == false) {
            if (joueurCourant == ListeJoueurs[0]) {
                int a = joueurCourant.reserveJeton.size() - 1;
                grilleJeu.ajouterJetonDansColonne(joueurCourant.reserveJeton.get(a), 1);
                joueurCourant = ListeJoueurs[1];
            }
            else {
                int b = joueurCourant.reserveJeton.size() - 1;
                grilleJeu.ajouterJetonDansColonne(joueurCourant.reserveJeton.get(b), 1);
                joueurCourant = ListeJoueurs[0];
            }
        }
    }   
}
