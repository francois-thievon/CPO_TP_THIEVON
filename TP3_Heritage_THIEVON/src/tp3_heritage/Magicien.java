/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage;

/**
 *
 * @author thiev
 */
public class Magicien extends Personnage{ 
    boolean conf;
    public static int nbMagiciens;
    
    
    public Magicien (String n, int i, boolean a) {
        super(n, i);
        conf = a;
        nbMagiciens ++;
    }
    
    public void finalize(){
    nbMagiciens = nbMagiciens - 1;
}

    @Override
    public String toString() {
        if (this.Arme_en_main == null) {
            if (conf == true) {
                return "Magicien "+ nom + " (" + hp + " points de vie), confirmé";
            }
            else {
                return "Magicien "+ nom + " (" + hp + " points de vie), novice";
            }
        }
        else {
            if (conf == true) {
                return "Magicien "+ nom + " (" + hp + " points de vie), confirmé est équipé de "+ Arme_en_main;
            }
            else {
                return "Magicien "+ nom + " (" + hp + " points de vie), novice est équipé de " + Arme_en_main;
            }
        }
    }
}

