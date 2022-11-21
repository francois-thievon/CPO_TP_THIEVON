/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_thievon;
import java.util.ArrayList;

/**
 *
 * @author thiev
 */
public class Joueur {
    
    private String nom;
    String couleur;
    ArrayList<Jeton> reserveJeton = new ArrayList<Jeton>();
    int nombreJetonRestants = reserveJeton.size();
    int nombreDesintegrateurs;
    
    public Joueur(String a) {
        nom = a;
    }
    
    public void affecterCouleur(String a) {
        couleur = a;
    }
    
    public void ajouterJeton(Jeton jeton) {
        reserveJeton.add(jeton);
    }
    
    public void obtenirDesintegrateur() {
        nombreDesintegrateurs += 1;
    }
    
    public boolean utiliserDesintegrateur() {
        if (nombreDesintegrateurs > 0) {
            nombreDesintegrateurs -= 1;
            return true;
        }
        else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return this.nom;
    }
}
