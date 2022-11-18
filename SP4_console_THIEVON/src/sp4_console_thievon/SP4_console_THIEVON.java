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
        
        Jeton a = new Jeton("Rouge");
        Jeton b = new Jeton("Rouge");
        Jeton c = new Jeton("Rouge");
        Jeton d = new Jeton("Jaune");
        Jeton e = new Jeton("Rouge");
        Jeton f = new Jeton("Jaune");
        PlateauDeJeu p = new PlateauDeJeu();
        
        
        p.ajouterJetonDansColonne(a, 1);
        p.ajouterJetonDansColonne(b, 2);
        p.ajouterJetonDansColonne(c, 3);
        p.ajouterJetonDansColonne(d, 3);
        p.ajouterJetonDansColonne(e, 4);
        p.ajouterJetonDansColonne(f, 5);
        p.afficherGrilleSurConsole();
        /*
        
        boolean k = p.ligneGagnantePourCouleur("Rouge");
        if (k==true) {
            System.out.append("Winner");
        }
        else {
            System.out.println("looser");
        }
        */
    }
}
