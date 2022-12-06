/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onitama_thievon;

/**
 *
 * @author thiev
 */
public class PlateauDeJeu {
    
    CaseDePlateau[][] Plateau = new CaseDePlateau[5][5];
    
    public PlateauDeJeu(){
        for (int i = 0; i<5; i++) {
            for (int j = 0; j<5; j++) {
                Plateau[i][j] = new CaseDePlateau();
            }
        }
    }
    
    public boolean deplacerPion(int x, int y, int X, int Y) {
        Pion piontmp = new Pion(1, false);
        if (Plateau[x][y].avoirPion() == true) {
            piontmp = Plateau[x][y].renvoyerEtSupprimerPion();
            Plateau[X][Y].affecterPion(piontmp);
            return true;
        }
        else {
            return false;
        }
    }
    
    public void viderPlateau(Joueur J1, Joueur J2) {
        for (int i = 0; i<5; i++) {
            for (int j = 0; j<5; j++) {
                if (Plateau[i][j].avoirPion() == true) {
                    Pion piontmp = new Pion(1, false);
                    piontmp = Plateau[i][j].renvoyerEtSupprimerPion();
                    if (piontmp.avoirEquipe() == J1.avoirEquipe()) {
                        J1.recupererPion(piontmp);
                    }
                    if (piontmp.avoirEquipe() == J2.avoirEquipe()) {
                        J2.recupererPion(piontmp);
                    }
                }
                Plateau[i][j].supprimerPion();
            }
        }
    }
    
    public boolean avoirPion(int x, int y) {
        return Plateau[x-1][y-1].avoirPion();
    }
    
    public int equipePion(int x, int y) {
        return Plateau[x-1][y-1].equipePion();
    }
    
    public boolean RoiEquipe1mort() {
        for (int i = 0; i<5; i++) {
            for (int j = 0; j<5; j++) {
                if (Plateau[i][j].renvoyerPion().avoirEquipe() == 1) {
                    if (Plateau[i][j].renvoyerPion().etreLeRoi() == true) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean RoiEquipe2mort() {
        for (int i = 0; i<5; i++) {
            for (int j = 0; j<5; j++) {
                if (Plateau[i][j].renvoyerPion().avoirEquipe() == 2) {
                    if (Plateau[i][j].renvoyerPion().etreLeRoi() == true) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
