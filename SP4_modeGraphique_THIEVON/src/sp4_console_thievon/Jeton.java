/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_thievon;

/**
 *
 * @author thiev
 */
public class Jeton {
    
    private String couleur;
    
    public Jeton(String a) {
        couleur = a;
    }
    
    public String lireCouleur() {
        return couleur;
    }
    
    @Override
    public String toString() {
        if (couleur == "rouge") {
            return "R";
        }
        if (couleur == "jaune") {
            return "J";
        }
        else {
            return "erreur";
        }
    }
}

