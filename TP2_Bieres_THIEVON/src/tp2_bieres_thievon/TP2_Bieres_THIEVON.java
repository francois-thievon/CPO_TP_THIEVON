/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_thievon;

/**
 *
 * @author thiev
 */
public class TP2_Bieres_THIEVON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des Trolls", 7.0, "Dubuisson");
        //uneBiere.Nom = "Cuvee des Trolls";
        //uneBiere.degreAlcool = 7.0;
        //uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;
        uneBiere.lireEtiquette();
        System.out.println(uneBiere);
        
        System.out.println("\n");
        
        BouteilleBiere BiereLeffe = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        //autreBiere.Nom = "Leffe";
        //autreBiere.degreAlcool = 6.6;
        //autreBiere.brasserie = "Abbaye de Leffe";
        BiereLeffe.ouverte = true;
        BiereLeffe.lireEtiquette();
        BiereLeffe.Décapsuler();
        
        System.out.println("\n");
        
        BouteilleBiere BiereHK = new BouteilleBiere("Heineken", 4.8, "Vogue Merry");
        BiereHK.lireEtiquette();
        BiereHK.Décapsuler();
        System.out.println(BiereHK);
        
        System.out.println("\n");
        
        BouteilleBiere BierePF = new BouteilleBiere("Pelforth", 5.4, "Sunny");
        BierePF.lireEtiquette();
        System.out.println(BierePF);
        
        System.out.println("\n");
        
        BouteilleBiere Biere1664 = new BouteilleBiere("1664", 5.2, "Konoha no Kuni");
        Biere1664.lireEtiquette();
        Biere1664.Décapsuler();
        System.out.println(Biere1664);
    }
    
    
}
