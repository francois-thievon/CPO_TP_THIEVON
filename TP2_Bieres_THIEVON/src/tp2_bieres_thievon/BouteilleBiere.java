/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_thievon;

/**
 *
 * @author thiev
 */
public class BouteilleBiere {   
    String Nom;
    Double degreAlcool;
    String brasserie;
    Boolean ouverte;

    // On initialise les attributs de BouteilleBiere
    
public void lireEtiquette() {
    System.out.println("Bouteille de "+ Nom + " (" + degreAlcool + " degres) \nBrasserie : " + brasserie);
}

// On crée la méthode lireEtiquette qui va afficher une chaine de caractere dans la console


public void Décapsuler() {
    if (ouverte == true) {
        System.out.println("La biere est deja ouverte");
    }
    
    if (ouverte == false) {
        ouverte = true;
        System.out.println("La biere a ete ouverte!");
    }
}

// On crée la méthode Décapsuller qui ouvre la bière si elle est fermé et ne fait rien si elle est déjà ouverte a part le dire

public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
    Nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
}

// On crée le constructeur qui va permettre de créer un objet BouteilleBiere bien plus rapidement en donnant immédiatement ses attributs

@Override
public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = Nom + " (" + degreAlcool + " degres) Ouverte ? ";
    if (ouverte == true ) chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;

    // Quand on lit la Bouteille bière, cette methode va directement renvoyer une chaine de caractère correspondant et caractérisant l'objet BouteilleBiere
}
}