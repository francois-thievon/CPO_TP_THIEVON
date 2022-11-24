/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_thievon;
import java.util.Scanner;
import java.util.Random;

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
        
        int cpttn = 0;
        int cpt = 0;
        do {
            int a = 1 + (int)(Math.random() * 6);
            int b = 1 + (int)(Math.random() * 7);
            boolean p = grilleJeu.placerTrouNoir(a, b);
            if (p == true) {
                cpttn +=1;
                cpt +=1;
                if (cpt == 1 || cpt == 2) {
                    grilleJeu.placerDesintegrateur(a, b);
                }
            }
        }while (cpttn<5);
        
        int cptd = 0;
        do {
            int c = 1 + (int)(Math.random() * 6);
            int d = 1 + (int)(Math.random() * 7);
            if (grilleJeu.presenceTrouNoir(c, d) == false) {
                boolean q = grilleJeu.placerDesintegrateur(c, d);
                if (q == true) {
                    cptd +=1;
                }
            }
        }while (cptd<3);
    }
    
    public void debuterPartie() {
        System.out.println("\nNouvelle partie de SuperPuissance4 !");
        Scanner sc = new Scanner(System.in);
        grilleJeu.afficherGrilleSurConsole();
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
                System.out.println("\n" + joueurCourant + " (Rouge) choisissez dans quelle colonne jouer :");
                int n = sc.nextInt();
                if (n>0 && n<8) {
                    if (grilleJeu.colonneRemplie(n) == false) {
                        int varJ = grilleJeu.ajouterJetonDansColonne(joueurCourant.reserveJeton.get(a), n);
                        if (varJ == 999) {
                            joueurCourant.nombreDesintegrateurs += 1;
                            System.out.println(joueurCourant + " a obtenu un désintégrateur !");
                        }
                        joueurCourant = ListeJoueurs[1];
                        System.out.println("\n");
                        grilleJeu.afficherGrilleSurConsole();
                    }
                    else {
                        System.out.println("Colonne remplie ");
                    }
                }
                if (n < 1) {
                    System.out.println("Erreure de saisie ");
                    joueurCourant = ListeJoueurs[1];
                    System.out.println("\n");
                    grilleJeu.afficherGrilleSurConsole();
                }
                if (n>7) {
                    System.out.println("Erreure de saisie ");
                    joueurCourant = ListeJoueurs[1];
                    System.out.println("\n");
                    grilleJeu.afficherGrilleSurConsole();
                }
            }
            else {
                int b = joueurCourant.reserveJeton.size() - 1;
                System.out.println("\n" + joueurCourant + " (Jaune) choisissez dans quelle colonne jouer :");
                int m = sc.nextInt();
                if (m>0 && m<8) {
                    if (grilleJeu.colonneRemplie(m) == false) {
                        int varD = grilleJeu.ajouterJetonDansColonne(joueurCourant.reserveJeton.get(b), m);
                        if (varD == 999) {
                            joueurCourant.nombreDesintegrateurs += 1;
                            System.out.println(joueurCourant + " a obtenu un désintégrateur !");
                        }
                        joueurCourant = ListeJoueurs[0];
                        System.out.println("\n");
                        grilleJeu.afficherGrilleSurConsole();
                    }
                    else {
                        System.out.println("Colonne remplie ");
                    }
                }
                if (m<1) {
                    System.out.println("Erreure de saisie ");
                    joueurCourant = ListeJoueurs[0];
                    System.out.println("\n");
                    grilleJeu.afficherGrilleSurConsole();
                }
                if (m>7) {
                    System.out.println("Erreure de saisie ");
                    joueurCourant = ListeJoueurs[0];
                    System.out.println("\n");
                    grilleJeu.afficherGrilleSurConsole();
                }
            }
            }
            if (rep == 2) {
                System.out.println("Saisissez le numéro de la ligne correspondante");
                int lignerecup = sc.nextInt();
                System.out.println("Saisissez le numéro de la colonne correspondante");
                int colonnerecup = sc.nextInt();
                if (grilleJeu.grille[lignerecup - 1][colonnerecup - 1].presenceJeton() == true) {
                    grilleJeu.recupererJeton(lignerecup, colonnerecup);
                    grilleJeu.tasserLigne(colonnerecup);
                }
                else {
                    System.out.println("Erreur de saisie de ligne");
                }
                grilleJeu.afficherGrilleSurConsole();
            }
            if (rep == 3) {
                
            }
            if (rep >3 || rep <0) {
                System.out.println("Erreur de saisie ");
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
