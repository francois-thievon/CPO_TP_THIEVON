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
        Jeton b = new Jeton("Jaune");

      
        PlateauDeJeu p = new PlateauDeJeu();
        
        p.ajouterJetonDansColonne(b, 1);
        p.ajouterJetonDansColonne(b, 2);
        p.ajouterJetonDansColonne(b, 3);
        p.ajouterJetonDansColonne(a, 4);
        p.ajouterJetonDansColonne(a, 4);
        p.ajouterJetonDansColonne(b, 2);
        p.ajouterJetonDansColonne(a, 1);
        p.ajouterJetonDansColonne(b, 2);
        p.ajouterJetonDansColonne(b, 3);
        p.ajouterJetonDansColonne(b, 3);
        p.ajouterJetonDansColonne(b, 4);
        p.ajouterJetonDansColonne(b, 4);

        
        
        boolean g = p.colonneRemplie(2);
        
        if (g == true) {
            System.out.println("remplie");
        }
        else {
            System.out.println("Colonne pas remplie");
        }
        
        p.afficherGrilleSurConsole();
        
        
        System.out.println("\n");
        
        boolean k = p.etreGagnantePourCouleur("Rouge");
        if (k ==true) {
            System.out.println("Rouge Winner");
        }
        else {
            System.out.println("Rouge pas winner");
        }
        
        boolean l = p.etreGagnantePourCouleur("Jaune");
        if (l ==true) {
            System.out.println("Jaune Winner");
        }
        else {
            System.out.println("Jaune pas winner");
        }

        
        
        
        
    }
}
