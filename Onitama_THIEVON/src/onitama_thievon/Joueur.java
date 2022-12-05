/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onitama_thievon;

import java.util.ArrayList;

/**
 *
 * @author thiev
 */
public class Joueur {
    
    private String nom;
    private int equipe;
    ArrayList<Pion> reservePions = new ArrayList<Pion>();
    
    
    public Joueur(String a) {
        nom = a;
    }
    
    public void AffecterEquipe(int a) {
        equipe = a;
    }
    
    
    
    @Override
    public String toString() {
        return nom;
    }

}
    
