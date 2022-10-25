/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_thievon;

/**
 *
 * @author thiev
 */
public class Personne {
    
    String Nom;
    String Prenom;
    int nbVoitures ;
    Voiture [] liste_voitures ;    
    
    
    public Personne(String unNom, String unPrenom) {
        Nom = unNom;
        Prenom = unPrenom;
        liste_voitures = new Voiture [3];
        nbVoitures = 0;
    }
    
    @Override
    public String toString () {
    return(Nom + " " + Prenom);
    }
}
