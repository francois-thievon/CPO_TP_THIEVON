/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_thievon;

/**
 *
 * @author thiev
 */
public class TP2_relation_1_THIEVON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        
        // On initialise 4 voitures
        
        Personne Bob = new Personne ("Bobby", "Sixkiller");
        Personne Reno = new Personne ("Reno", "Raines");
        System.out.println("liste des voitures disponibles :\n"+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        // On initialise 2 personnes et on affiche la liste des voitures
        
        Bob.liste_voitures[0] = uneClio;
        Bob.nbVoitures += 1;
        uneClio.proprietaire = Bob;
        Bob.liste_voitures[1] = une2008;
        Bob.nbVoitures +=1;
        une2008.proprietaire = Bob;
        
        // On crée des relations entre Bob et 2 voitures
        
        System.out.println("la premiere voiture de Bob est " + Bob.liste_voitures[0] ) ;
        System.out.println("la deuxieme voiture de Bob est " + Bob.liste_voitures[1] ) ;
        
        // On affiche les voitures de Bob
        
        Reno.liste_voitures[0] = uneAutreClio;
        Reno.nbVoitures += 1;
        uneAutreClio.proprietaire = Reno;
        Reno.liste_voitures[1] = uneMicra;
        Reno.nbVoitures +=1;
        uneMicra.proprietaire = Reno;
        
        // On crée des relations entre Reno et 2 voitures

        System.out.println("la premiere voiture de Reno est " + Reno.liste_voitures[0] ) ;
        System.out.println("la deuxieme voiture de Reno est " + Reno.liste_voitures[1] ) ;
        
        // On affiche les voitures de Reno
    }
    
}
