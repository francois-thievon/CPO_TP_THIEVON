/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_thievon;

/**
 *
 * @author thiev
 */
public class Voiture {
    
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;
    
    
    public Voiture (String unModele, String uneMarque, int unePuissance) {
        Modele = unModele;
        Marque = uneMarque;
        PuissanceCV = unePuissance;  
    }
    
    @Override
    public String toString () {
    return(Marque + " " + Modele);
    }
}
