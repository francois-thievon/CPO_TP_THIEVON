/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heritage;
import java.util.ArrayList;

/**
 *
 * @author thiev
 */
public class TP3_Heritage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Epee Excalibur = new Epee("Excalibur", 7, 5);
        Epee Durandal = new Epee("Durandal", 4, 7);
        Baton Chêne = new Baton("Chêne", 4, 5);
        Baton Charme = new Baton("Charme", 5, 6);
        
        ArrayList<Arme> inventaire = new ArrayList<Arme>();
        inventaire.add(Excalibur);
        inventaire.add(Durandal);     
        inventaire.add(Chêne);
        inventaire.add(Charme);
        
        System.out.println(inventaire);
    }
    
}
