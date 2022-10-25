/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_thievon;

import java.util.Scanner;

/**
 *
 * @author thiev
 */
public class TP2_convertisseurObjet_THIEVON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Convertisseur c = new Convertisseur();
        int resp;
        double nb;
        String nbconv;
        Scanner sc;
        sc = new Scanner(System.in);
        
        // On initialise les variables ainsi que le Scanner qui va récupérer les valeurs saisies par l'utilisateur
        
        do {
            
            // On crée un boucle qui va se répeter tant que l'utilisateur ne veut pas en sortir
        
        System.out.println("Bonjour, veuillez saisir une valeure");
        nb = sc.nextFloat();
        System.out.println("Veuillez maintenant choisir le convertisseur en saisissant :");
        System.out.println("(1) pour convertir des celcius en kelvin");
        System.out.println("(2) pour convertir des kelvin en celcius");
        System.out.println("(3) pour convertir des farenheit en celcius");
        System.out.println("(4) pour convertir des celcius en farenheit");
        System.out.println("(5) pour convertir des farenheit en kelvin");
        System.out.println("(6) pour convertir des kelvin en farenheit");
        System.out.println("(7) pour sortir du convertisseur");
        resp = sc.nextInt();
        
        // On fait choisir à l'utilisateur le convertisseur souhaité dans la commande
        
        if (resp == 1) {
            c.CelciusVersKelvin(nb);
        }
        
        if (resp == 2) {
            c.KelvinVersCelcius(nb);
        }
        
        if (resp == 3) {
            c.FahrenheitVersCelcius(nb);
        }
        
        if (resp == 4) {
            c.CelciusVersFahrenheit(nb);
        }
        
        if (resp == 5) {
            c.FahrenheitVersKelvin(nb);
        }
        
        if (resp == 6) {
            c.KelvinVersFahrenheit(nb);
        }
        
        // On appelle en fonction de la réponse de l'utilisateur le convertisseur correspondant
        
        if (resp > 7) {
            System.out.println("Erreur de saisie");
        }
        
        if (resp < 1) {
            System.out.println("Erreur de saisie");
        }
        
        // On crée un message d'erreur de saisie si l'utilisateur n'a pas saisie une valeur attendue
        
        
        } while (resp != 7);
        
        // On sort de la boucle si l'utilisateur saisit 7 (ou plutot on y reste tant qu'il ne l'a pas saisi)
        
    nbconv = c.toString();
    System.out.println(nbconv);
    
    // On renvoie le nombre de conversions effectuées par l'utilisateur
    }
    
}
