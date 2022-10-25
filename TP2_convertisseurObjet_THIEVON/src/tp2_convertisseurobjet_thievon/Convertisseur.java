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


public void Convertisseur() {
    nbConversions = 0;
}

public void CelciusVersKelvin(double nb) {
    nbConversions += 1;
    double nb2;
    nb2 = nb - 273;
    System.out.println("La valeur " + nb + " degrés celcius vaut " + nb2 + " degrés kelvin");
    
}

public void KelvinVersCelcius(double nb) {
    nbConversions +=1;
    double nb2;
    nb2 = nb + 273.15;
    System.out.println("La valeur " + nb + " degrés kelvin vaut " + nb2 + " degrés celcius");
}

public void FahrenheitVersCelcius(double nb) {
    nbConversions +=1;
    double nb2;
    nb2 = (nb - 32) * 0.56;
    System.out.println("La valeur " + nb + " degrés fahrenheit vaut " + nb2 + " degrés celcius");
}

public void CelciusVersFahrenheit(double nb) {
    nbConversions +=1;
    double nb2;
    nb2 = (nb * 1.8) + 32;
    System.out.println("La valeur " + nb + " degrés celcius vaut " + nb2 + " degrés fahrenheit");
}

public void FahrenheitVersKelvin(double nb) {
    nbConversions +=1;
    double nb2;
    nb2 = ((nb - 32) * 0.56 + 273.15);
    System.out.println("La valeur " + nb + " degrés fahrenheit vaut " + nb2 + " degrés kelvin");
}

public void KelvinVersFahrenheit(double nb) {
    nbConversions +=1;
    double nb2;
    nb2 = ((nb - 273.15) * 1.8) + 32;
    System.out.println("La valeur " + nb + " degrés kelvin vaut " + nb2 + " degrés fahrenheit");
    
}

@Override
public String toString () {
 return "nombre de conversions : "+ nbConversions;
}
}

