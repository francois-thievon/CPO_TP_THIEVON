/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage;

/**
 *
 * @author thiev
 */
public class Epee extends Arme{
    int finesse;
    
    public Epee(String n, int i, int a) {
        super(n,i);
        finesse = a;
    }

    public int getFinesse() {
        return finesse;
    }

    public void setFinesse(int finesse) {
        if (finesse < 0) {
            this.finesse = 0;
        }
        else if(finesse > 100) {
            this.finesse = 100;
        }
        else {
            this.finesse = finesse;
        }
    }
    
    
    
}
