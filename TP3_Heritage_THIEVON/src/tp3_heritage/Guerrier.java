/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage;

/**
 *
 * @author thiev
 */
public class Guerrier extends Personnage {  
    boolean cheval;
    

    public Guerrier(String n, int i, boolean a) {
        super(n, i);
        cheval = a;
    }

    @Override
    public String toString() {
        if (this.Arme_en_main == null) {
            if (cheval == true) {
                return "Guerrier "+ nom + " (" + hp + " points de vie), à cheval";
            }
            else {
                return "Guerrier "+ nom + " (" + hp + " points de vie), à pieds";
            }
        }
        else {
            if (cheval == true) {
                return "Guerrier "+ nom + " (" + hp + " points de vie), à cheval est équipé de "+ Arme_en_main;
            }
            else {
                return "Guerrier "+ nom + " (" + hp + " points de vie), à pieds est équipé de " + Arme_en_main;
            }
        }
    }
    
    
}
