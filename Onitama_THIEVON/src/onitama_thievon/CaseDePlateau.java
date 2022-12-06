/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onitama_thievon;

/**
 *
 * @author thiev
 */
public class CaseDePlateau {
    
    private Pion pionCourant;
    
    
    public CaseDePlateau() {
        pionCourant = null;
        
    }
    
    public boolean avoirPion() {
        if (pionCourant == null) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public void affecterPion(Pion p) {
        pionCourant = p;
    }
    
    public void supprimerPion() {
        pionCourant = null;
    }
    
    public Pion renvoyerPion() {
        return pionCourant;
    }
    
    public Pion renvoyerEtSupprimerPion(){
        Pion piontmp;
        if (pionCourant != null) {
            piontmp = pionCourant;
            pionCourant = null;
            return piontmp;
        }
        else {
            return null;
        }
    }
    
    public int equipePion() {
        return pionCourant.avoirEquipe();
    }
}
