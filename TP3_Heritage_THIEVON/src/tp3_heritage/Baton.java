/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage;

/**
 *
 * @author thiev
 */
public class Baton extends Arme {
    int age;
    
    public Baton(String n, int i, int a) {
        super(n, i);
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        }
        else if(age > 100) {
            this.age = 100;
        }
        else {
            this.age = age;
    }
}
}
