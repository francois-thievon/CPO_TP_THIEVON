/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage;
import java.util.ArrayList;

/**
 *
 * @author thiev
 */
public class Personnage {
    String nom;
    int hp;
    ArrayList<Arme> inventaire = new ArrayList<Arme>();
    Arme Arme_en_main = null;

    
    public int getHp() {
        return hp;
    }
    
    
    public void setHp(int hp) {
        this.hp = hp;
    }
    
    
    public void Ajouter_Arme(Arme Arme_a_ajouter) {
        if (inventaire.size()<5) {
            this.inventaire.add(Arme_a_ajouter);
            Arme_a_ajouter.proprietaire = this;
            System.out.println(Arme_a_ajouter + " a bien été ajoutée à " + this.nom);
        }
        else {
            System.out.println(this.nom + " possède déjà 5 armes");
        }
        
    }
    
    // Méthode qui permet d'ajouter une arme à l'inventaire d'un personnage
    
    
    public void Equiper_Arme(String nomArme) {
        for (int i = 0; i < this.inventaire.size(); i++) {
            if (inventaire.get(i).nom == nomArme) {
                Arme_en_main = inventaire.get(i);
                System.out.println(inventaire.get(i).nom + " a bien été saisi par " + this.nom);
            }
        }
    }
    
    // Méthode qui permet à un personnage d'équiper une arme
    
    
    

public Personnage(String unNom, int nbhp) {
    nom = unNom;
    hp = nbhp;
}


@Override
public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + hp + " points de vie)";
    return chaine_a_retourner ;
}
    
}
