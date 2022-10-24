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

public void CelciusVersKelvin(float nb) {
    nbConversions += 1;
    float nb2;
    nb2 = nb - 273;
    System.out.println("La valeur " + nb + " degrés celcius vaut " + nb2 + " degrés kelvin");
    
}

public void KelvinVersCelcius(float nb) {
    nbConversions +=1;
    float nb2;
    nb2 = nb + 273;
    System.out.println("La valeur " + nb + " degrés kelvin vaut " + nb2 + " degrés celcius");
}

public void FarenheitVersCelcius(float) {
    nbConversions +=1;
    
}

public void CelciusVersFarenheit(float) {
    nbConversions +=1;
    
}

public void FarenheitVersKelvin(float) {
    nbConversions +=1;
    
}

public void KelvinVersFarenheit(float) {
    nbConversions +=1;
    
}

@Override
public String toString () {
 return "nb de conversions"+ nbConversions;
}
}

