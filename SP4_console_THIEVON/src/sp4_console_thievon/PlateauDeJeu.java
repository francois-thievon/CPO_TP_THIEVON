/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_thievon;

/**
 *
 * @author thiev
 */
public class PlateauDeJeu {
    
    CelluleDeGrille[][] grille = new CelluleDeGrille[6][7];
    
    public PlateauDeJeu() {
        for (int i = 0; i<6 ; i++) {
            for (int j = 0; j<7; j++) {
                grille[i][j] = new CelluleDeGrille();
            }
        }
    }
    
    public void ajouterJetonDansColonne(Jeton j, int a) {
        for (int i = 0; i<6; i++) {
            if (grille[5-i][a-1].presenceJeton() == false) {
                grille[5-i][a-1].affecterJeton(j);
                break;
            }
        }
    }
    
    public boolean grilleRemplie() {
        boolean b = true;
        for (int i = 0; i<6 ; i++) {
            for (int j = 0; j<7; j++) {
                if (grille[i][j].presenceJeton() == false) {
                    b = false;
                }
            }
        }
        return b;
    }
    
    /*
    public void viderGrille(Joueur R, Joueur J) {
        for (int i = 0; i<6 ; i++) {
            for (int j = 0; j<7; j++) {
                Jeton jetontmp() = grille[i][j].recupererJeton();
                if (jetontmp.lireCouleur() == "Rouge") {
                    R.ajouterJeton();
                }
                else {
                    J.ajouterJeton();
                }
            }
        }
    }
    */
    
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String WHITE_BACKGROUND = "\u001B[47m";
    
    public void afficherGrilleSurConsole() {
        for (int i = 0; i<6 ; i++) {
            System.out.print("\n");
            for (int j = 0; j<7; j++) {
                if (grille[i][j].lireCouleurDuJeton() == "Rouge") {
                    System.out.print(RED_BACKGROUND + grille[i][j]);
                }
                else if (grille[i][j].lireCouleurDuJeton() == "Jaune") {
                    System.out.print(YELLOW_BACKGROUND + grille[i][j]);
                }
                else {
                    System.out.print(WHITE_BACKGROUND + grille[i][j]);
                }
            }
        }
    }

    public boolean presenceJeton(int x, int y) {
        return grille[x][y].presenceJeton();
    }
    
    public String lireCouleurDuJeton(int x, int y) {
        return grille[x][y].lireCouleurDuJeton();
    }
    
    
    /*
    public boolean ligneGagnantePourCouleur(String a) {
        boolean res = false;
        int cpt = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; i<7; i++) {
                if (grille[i][j].lireCouleurDuJeton() == a){
                    cpt += 1;
                    }
                else {
                    cpt = 0;
                }
                if (cpt == 4) {
                    res = true;
                    return res;
            }
            }
        }
        return res;
    }
/*
    public boolean colonneGagnantePourCouleur(String a) {
        
    }
    
    public boolean diagonaleMontanteGagnantePourCouleur(String a) {
        
    }
    
    public boolean diagonaleDescendanteGagnantePourCouleur(String a) {
        
    }
    
    
    public boolean etreGagnantePourCouleur(String a) {
        
    }
*/
}
