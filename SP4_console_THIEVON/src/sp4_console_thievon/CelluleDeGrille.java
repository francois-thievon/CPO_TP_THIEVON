/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_thievon;

/**
 *
 * @author thiev
 */
public class CelluleDeGrille {
    
    private Jeton jetonCourant;
    private boolean avoirTrouNoir;
    private boolean avoirDesintegrateur;
    
    public CelluleDeGrille() {
        jetonCourant = null;
        avoirTrouNoir = false;
        avoirDesintegrateur = false;
    }
    
    public boolean presenceJeton() {
        if (jetonCourant == null) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public void affecterJeton(Jeton J) {
        jetonCourant = J;
    }
    
    public String lireCouleurDuJeton() {
        if(jetonCourant != null) {
            return jetonCourant.lireCouleur();
        }
        else {
            return "vide";
        }
    }
    
    public void placerTrouNoir() {
        avoirTrouNoir = true;
    }
    
    public void supprimerTrouNoir() {
        avoirDesintegrateur = false;
    }
    
    public boolean presenceTrouNoir() {
        return avoirTrouNoir;
    }
    
    public Jeton recupererJeton() {
        if (jetonCourant != null) {
            Jeton jetontmp = jetonCourant;
            jetonCourant = null;
            return jetontmp;
        }
        else {
            return (null);
        }
    }
    
    public void supprimerJeton() {
        jetonCourant =  null;
    }
    
    public boolean presenceDesintegrateur() {
        return avoirDesintegrateur;
        }
    
    public void placerDesintegrateur() {
        avoirDesintegrateur = true;
    }
    
    public void supprimerDesintegrateur() {
        avoirDesintegrateur = false;
    }
    
    public void activerTrouNoir() {
        supprimerJeton();
        supprimerTrouNoir();
    }
}
    
