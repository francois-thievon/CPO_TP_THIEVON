/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_thievon;

/**
 *
 * @author thiev
 */
public class Convertisseur {
    int nbConversions;
    
    // On initialise les attributs (seulement nbConversions ici)


public void Convertisseur() {
    nbConversions = 0;
    
    // On initialise le nombre de conversions à 0
}

public void CelciusVersKelvin(double nb) {
    nbConversions += 1;     // Ajoute 1 au nombre de conversions
    double nb2;
    nb2 = nb - 273;
    System.out.println("La valeur " + nb + " degrés celcius vaut " + nb2 + " degrés kelvin");
    
    // On crée une méthode qui recoit en entrée un double assimilé à une valeur en degré Celcius
    // Elle renvoie une phrase qui donne son équivalent en Kelvin
    
}

public void KelvinVersCelcius(double nb) {
    nbConversions +=1;      // Ajoute 1 au nombre de conversions
    double nb2;
    nb2 = nb + 273.15;
    System.out.println("La valeur " + nb + " degrés kelvin vaut " + nb2 + " degrés celcius");
    
    // On crée une méthode qui recoit en entrée un double assimilé à une valeur en degré Kelvin
    // Elle renvoie une phrase qui donne son équivalent en Celcius
}

public void FahrenheitVersCelcius(double nb) {
    nbConversions +=1;      // Ajoute 1 au nombre de conversions
    double nb2;
    nb2 = (nb - 32) * 0.56;
    System.out.println("La valeur " + nb + " degrés fahrenheit vaut " + nb2 + " degrés celcius");
    
    // On crée une méthode qui recoit en entrée un double assimilé à une valeur en degré Fahrenheit
    // Elle renvoie une phrase qui donne son équivalent en Celcius
}

public void CelciusVersFahrenheit(double nb) {
    nbConversions +=1;      // Ajoute 1 au nombre de conversions
    double nb2;
    nb2 = (nb * 1.8) + 32;
    System.out.println("La valeur " + nb + " degrés celcius vaut " + nb2 + " degrés fahrenheit");
    
    // On crée une méthode qui recoit en entrée un double assimilé à une valeur en degré Celcius
    // Elle renvoie une phrase qui donne son équivalent en Fahrenheit
}

public void FahrenheitVersKelvin(double nb) {
    nbConversions +=1;      // Ajoute 1 au nombre de conversions
    double nb2;
    nb2 = ((nb - 32) * 0.56 + 273.15);
    System.out.println("La valeur " + nb + " degrés fahrenheit vaut " + nb2 + " degrés kelvin");
    
    // On crée une méthode qui recoit en entrée un double assimilé à une valeur en degré Fahrenheit
    // Elle renvoie une phrase qui donne son équivalent en Kelvin
}

public void KelvinVersFahrenheit(double nb) {
    nbConversions +=1;      // Ajoute 1 au nombre de conversions
    double nb2;
    nb2 = ((nb - 273.15) * 1.8) + 32;
    System.out.println("La valeur " + nb + " degrés kelvin vaut " + nb2 + " degrés fahrenheit");
    
    // On crée une méthode qui recoit en entrée un double assimilé à une valeur en degré Kelvin
    // Elle renvoie une phrase qui donne son équivalent en Fahrenheit
}

@Override
public String toString () {
 return "nombre de conversions : "+ nbConversions;
}

// Renvoie le nombre de conversions effectuées sous forme d'une chaine de caractère

}

