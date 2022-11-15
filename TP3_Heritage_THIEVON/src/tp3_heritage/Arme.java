/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage;

/**
 *
 * @author thiev
 */
public class Arme {
    String nom;
    int lvlAttaque;  
    Personnage proprietaire;
    

    public int getLvlAttaque() {
        return lvlAttaque;
    }

    public void setLvlAttaque(int lvlAttaque) {
        if (lvlAttaque < 0) {
            this.lvlAttaque = 0;
        }
        else if(lvlAttaque > 100) {
            this.lvlAttaque = 100;
        }
        else {
            this.lvlAttaque = lvlAttaque;
        }
        
    }
     

public Arme(String unNom, int lvla) {
    nom = unNom;
    lvlAttaque = lvla;
}

@Override
public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + lvlAttaque + " points d'attaques)";
    return chaine_a_retourner ;
}
}