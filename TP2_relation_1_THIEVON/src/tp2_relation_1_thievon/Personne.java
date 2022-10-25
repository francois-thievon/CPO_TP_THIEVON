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
    
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
              
        if (voiture_a_ajouter.proprietaire != null) {
            System.out.println("La voiture " + voiture_a_ajouter + " a ete volee !\nElle appartient deja a "+ voiture_a_ajouter.proprietaire);
            return false;
            
            // Si la voiture a déjà un propriétaire, on ne fait rien car elle a été volée
        }
        
        if (this.nbVoitures > 2) {  
            System.out.println(voiture_a_ajouter + " n'a pas pu etre ajoutee car " + this + " possede deja 3 voitures");
            return false;
            
            // Si le proprietaire auquel on veut ajouter une voiture en possède déjà 3, on ne fait rien
        }   
        
        else {
            this.liste_voitures[this.nbVoitures] = voiture_a_ajouter;
            voiture_a_ajouter.proprietaire = this ;
            this.nbVoitures += 1;
            System.out.println("La voiture " + voiture_a_ajouter + " a bien ete ajoutee a "+ this);
            return true;
            
            // Si la voiture n'a pas de proprietaire et que le personne n'a pas déjà 3 voitures, on assimile le proprietaire de la voiture a cette personne et on rajoute la voiture à ses autres voitures
        }
               
    }
    
    
    @Override
    public String toString () {
    return(Nom + " " + Prenom);
    }
}
