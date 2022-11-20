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
        
        p.ajouterJetonDansColonne(a, 2);
        p.ajouterJetonDansColonne(b, 2);
        p.ajouterJetonDansColonne(a, 2);
        p.ajouterJetonDansColonne(b, 2);
        p.ajouterJetonDansColonne(a, 2);
        p.ajouterJetonDansColonne(b, 2);

        boolean g = p.colonneRemplie(2);
        
        if (g == true) {
            System.out.println("remplie");
        }
        else {
            System.out.println("Colonne pas remplie");
        }
        
        p.afficherGrilleSurConsole();
        
        
        
        
        boolean k = p.etreGagnantePourCouleur("Rouge");
        if (k ==true) {
            System.out.println("Winner");
        }
        else {
            System.out.println("looser");
        }

        
        
        
        
    }
}
