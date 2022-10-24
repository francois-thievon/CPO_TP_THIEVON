/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_thievon;

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
        
        int resp;
        float nb;
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
            CelciusVersKelvin(nb);
        }
        if (resp == 2) {
            KelvinVersCelcius(nb);
        }
        if (resp == 3) {
            FarenheitVersCelcius(nb);
        }
        if (resp == 4) {
            CelciusVersFarenheit(nb);
        }
        if (resp == 5) {
            FarenheitVersKelvin(nb);
        }
        if (resp == 6) {
            KelvinVersFarenheit(nb);
        }
    }
    
}
