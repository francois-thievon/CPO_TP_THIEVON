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
        
        // Création des différentes armes
        
        Excalibur.setLvlAttaque(245);
        Chêne.setAge(-25);
        
        // Tests pour les limites des caractéristiques des objets avec la fonction set
        
        ArrayList<Arme> inventaire = new ArrayList<Arme>();
        inventaire.add(Excalibur);
        inventaire.add(Durandal);     
        inventaire.add(Chêne);
        inventaire.add(Charme);
        
        // Création d'un ArrayList dans lequel on range toutes les armes
        
        System.out.println(inventaire);
        
        // Affichage de cet ArrayList
        
        Magicien Gandalf = new Magicien("Gandalf", 65, true);
        Magicien Garcimore = new Magicien("Garcimore", 44, false);
        Guerrier Conan = new Guerrier("Conan", 78, false);
        Guerrier Lannister = new Guerrier("Lannister", 45, true);
        
        // Création des différents personnages
        
        ArrayList<Personnage> personnages = new ArrayList<Personnage>();
        personnages.add(Gandalf);
        personnages.add(Garcimore);
        personnages.add(Conan);
        personnages.add(Lannister);
        
        // Cration d'un ArrayList dans lequel on range tout les personnages
        
        System.out.println(personnages);
        
        // Affichage de cet ArrayList
        
        
        Gandalf.Ajouter_Arme(Excalibur);
        Gandalf.Equiper_Arme("Excalibur");
        System.out.println(Gandalf);
        
        // Tests pour Gandalf
        
        Magicien Hisoka = new Magicien("Hisoka", 90, true);
        Guerrier Jotaro = new Guerrier("Jotaro", 85, false);
        Epee Carte = new Epee("Carte", 40, 1);
        Epee Epéeendiamant = new Epee("Epée en diamant", 80, 50);
        Epee Epéeenfer = new Epee("Epée en fer", 60, 40);
        Baton Massue = new Baton("Massue", 30, 10);
        Baton Battedebaseball = new Baton("Batte de baseball", 35, 5);
        Baton BatonMagique = new Baton("Baton magique", 90, 50);
        
        // Création des 6 armes et des 2 personnages
        
        Hisoka.Ajouter_Arme(Carte);
        Hisoka.Ajouter_Arme(Massue);
        Hisoka.Ajouter_Arme(BatonMagique);
        
        Jotaro.Ajouter_Arme(Epéeendiamant);
        Jotaro.Ajouter_Arme(Epéeenfer);
        Jotaro.Ajouter_Arme(Battedebaseball);
        
        // Ajout des armes aux personnages
        
        Hisoka.Equiper_Arme("Massue");
        Jotaro.Equiper_Arme("Epée en diamant");
        
        // Equipement des armes
        
        System.out.println(Hisoka);
        System.out.println(Jotaro);
    }
    
}
