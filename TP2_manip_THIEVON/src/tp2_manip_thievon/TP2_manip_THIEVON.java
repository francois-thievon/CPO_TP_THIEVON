/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_thievon;

/**
 *
 * @author thiev
 */
public class TP2_manip_THIEVON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        
        // 2 tartiflettes on été crées car seulement 2 new, on a assiette2 et assiette3 qui renvoient au même objet
        
        System.out.println("nb de calories de Assiette 2 : " +
        assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +
        assiette3.nbCalories) ;
        
        // On a bien les 2 assiettes 2 et 3 qui renvoient à la même Tartiflette
        
        assiette2 = assiette1;
        assiette1 = assiette3;
            
        System.out.println("\nAprès les inversions nous avons :\n");
        System.out.println("nb de calories de Assiette 1 : " +
        assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " +
        assiette2.nbCalories) ;
        
        // On a bien les valeures des calories de assiette 1 et 2 qui ont été interverties
        
        //Moussaka assiette666 = assiette1 ;
        //Moussaka assiette667 = new Tartiflette() ;
        
        // Ces 2 lignes de code sont fausses car elles demandent de convertir un objet en un autre objet
        // Ici on assimile à un objet de type Moussaka un objet de type Tartiflette
        // Une référence objet qui annonce référencer un type d'objet ne peut pas en référencer un autre qui n'a aucun rapport
        
        Moussaka[] tab = new Moussaka[10];
        
        // Création d'un tableau de 10 objets Moussaka
        
        tab[0] = new Moussaka(400);
        tab[1] = new Moussaka(250);
        tab[2] = new Moussaka(310);
        tab[3] = new Moussaka(180);
        tab[4] = new Moussaka(230);
        tab[5] = new Moussaka(420);
        tab[6] = new Moussaka(540);
        tab[7] = new Moussaka(200);
        tab[8] = new Moussaka(380);
        tab[9] = new Moussaka(800);
        
        // Assignation des 10 cases du tableau tab à des objets Moussaka crées et dont la nbCalorie est assigné arbitrairement
    }
    
}
