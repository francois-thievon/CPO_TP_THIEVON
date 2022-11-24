/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_thievon;

/**
 *
 * @author thiev
 */
public class SP4_console_THIEVON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Joueur Jotaro = new Joueur("Jotaro");
        Joueur Dio = new Joueur("Dio");
        
        Partie partie = new Partie();
        
        partie.ListeJoueurs[0] = Jotaro;
        partie.ListeJoueurs[1] = Dio;
        partie.joueurCourant = Jotaro;
        
        partie.initialiserPartie();
        partie.debuterPartie();
                

        
    }
}


// Prblm : Joueur peut recupérer le jeton de l'autre joueur + peut saisir nimporte quel nbligne et nbcolonne
