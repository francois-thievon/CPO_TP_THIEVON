/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onitama_thievon;

/**
 *
 * @author thiev
 */
public class Pion {
    
    private int equipe;
    private boolean etreRoi;
    
    
    public Pion(int a, boolean r) {
        equipe = a;
        etreRoi = r;
    }
    
    public int avoirEquipe() {
        return equipe;
    }
    
    public boolean etreLeRoi() {
        if (etreRoi == true) {
            return true;
        }
        else {
            return false;
        }
    }
}
