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
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, veuillez saisir une valeure");
        nb = sc.nextFloat();
        System.out.println("Veuillez maintenant choisir le convertisseur en saisissant :");
        System.out.println("(1) pour convertir des celcius en kelvin");
        System.out.println("(2) pour convertir des kelvin en celcius");
        System.out.println("(3) pour convertir des farenheit en celcius");
        System.out.println("(4) pour convertir des celcius en farenheit");
        System.out.println("(5) pour convertir des farenheit en kelvin");
        System.out.println("(6) pour convertir des kelvin en farenheit");
        resp = sc.nextInt();
        
        
        if (resp == 1) {
            c.CelciusVersKelvin(nb);
            c.toString();
        }
        if (resp == 2) {
            c.KelvinVersCelcius(nb);
            c.toString();
        }
        if (resp == 3) {
            c.FahrenheitVersCelcius(nb);
            c.toString();

        }
        if (resp == 4) {
            c.CelciusVersFahrenheit(nb);
            c.toString();
        }
        if (resp == 5) {
            c.FahrenheitVersKelvin(nb);
            c.toString();
        }
        if (resp == 6) {
            c.KelvinVersFahrenheit(nb);
            c.toString();
        }
        
        if (resp > 6) {
            System.out.println("Erreur de saisie");
        }
        
        if (resp < 1) {
            System.out.println("Erreur de saisie");
        }
    }
    
}
