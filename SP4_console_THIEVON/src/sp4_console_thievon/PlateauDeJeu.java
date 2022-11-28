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
    
    public int ajouterJetonDansColonne(Jeton j, int a) {
        int l = 0;
        if (this.colonneRemplie(a) == false) {
            for (int i = 0; i<6; i++) {
            if (grille[5-i][a-1].presenceJeton() == false) {
                if (grille[5-i][a-1].presenceTrouNoir() == true) {
                    System.out.println("\nPresence d'un trou noir, Jeton absorbe\n");
                    grille[5-i][a-1].supprimerTrouNoir();
                    grille[5-i][a-1].affecterJeton(j);
                    if (grille[5-i][a-1].presenceDesintegrateur() == true) {
                        grille[5-i][a-1].supprimerDesintegrateur();
                        grille[5-i][a-1].supprimerJeton();
                        return 999;
                    }
                    //this.suppprimerTrouNoir((6-i), (a));
                    grille[5-i][a-1].supprimerJeton();
                    l = 6-i;
                    return l;
                }
                else {
                    if (grille[5-i][a-1].presenceDesintegrateur() == true) {
                        grille[5-i][a-1].affecterJeton(j);
                        grille[5-i][a-1].supprimerDesintegrateur();
                        return 999;
                    }
                    grille[5-i][a-1].affecterJeton(j);
                    l = 6-i;
                    return l;
                }
            }
        }
        return l;
        }
        else {
            System.out.println("Colonne deja complete");
            return l;
        }
    }
    
    public boolean grilleRemplie() {
        boolean res = true;
        for (int i = 0; i<6 ; i++) {
            for (int j = 0; j<7; j++) {
                if (grille[i][j].presenceJeton() == false) {
                    res = false;
                }
            }
        }
        return res;
    }
    
    
    public void viderGrille(Joueur R, Joueur J) {
        for (int i = 0; i<6 ; i++) {
            for (int j = 0; j<7; j++) {
                Jeton jetontmp = grille[i][j].recupererJeton();
                if (jetontmp != null) {
                    if (jetontmp.lireCouleur() == "Rouge") {
                        R.ajouterJeton(jetontmp);
                    }
                    else {
                        J.ajouterJeton(jetontmp);
                    }
                }
            }
        }
    }
    
    
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
        System.out.println(WHITE_BACKGROUND + "\n 1  2  3  4  5  6  7  ");
    }

    public boolean presenceJeton(int x, int y) {
        return grille[x-1][y-1].presenceJeton();
    }
    
    public String lireCouleurDuJeton(int x, int y) {
        return grille[x][y].lireCouleurDuJeton();
    }
    
    
    public boolean ligneGagnantePourCouleur(String a) {
        int cpt = 0;
        boolean res = false;
        for (int i = 0; i<6; i++) {
            for (int j = 0; j<7; j++) {
                if (grille[i][j].lireCouleurDuJeton() == a) {
                    cpt += 1;
                    if (cpt == 4) {
                        res = true;                       
                        return res;                        
                    }
                }
                else {
                    cpt = 0;
                }
            }
        }
        return res;
    }
    
    public boolean colonneGagnantePourCouleur(String a) {
        int cpt = 0;
        boolean res = false;
        for (int j = 0; j<7; j++) {
            for (int i = 0; i<6; i++) {
                if (grille[i][j].lireCouleurDuJeton() == a) {
                    cpt += 1;
                    if (cpt == 4) {
                        res = true;                       
                        return res;                        
                    }
                }
                else {
                    cpt = 0;
                }
            }
        }
        return res;

        
    }
    
    public boolean diagonaleMontanteGagnantePourCouleur(String a) {
        boolean res = false;
        for (int i = 3; i<6; i++) {
            for (int j = 0; j<4; j++) {
                if (grille[i][j].lireCouleurDuJeton() == a) {
                    if (grille[i-1][j+1].lireCouleurDuJeton() == a && grille[i-2][j+2].lireCouleurDuJeton() == a && grille[i-3][j+3].lireCouleurDuJeton() == a) {
                        res = true;
                        return res;
                    }
                }
            }
        }
        return res;
    }
        

    public boolean diagonaleDescendanteGagnantePourCouleur(String a) {
        boolean res = false;
        for (int i = 3; i<6; i++) {
            for (int j = 3; j<7; j++) {
                if (grille[i][j].lireCouleurDuJeton() == a) {
                    if (grille[i-1][j-1].lireCouleurDuJeton() == a && grille[i-2][j-2].lireCouleurDuJeton() == a && grille[i-3][j-3].lireCouleurDuJeton() == a) {
                        res = true;
                        return res;
                    }
                }
            }
        }
        return res;
    }
    
    public boolean etreGagnantePourCouleur(String a) {
        if (ligneGagnantePourCouleur(a) == true || colonneGagnantePourCouleur(a) == true || diagonaleMontanteGagnantePourCouleur(a) == true || diagonaleDescendanteGagnantePourCouleur(a) == true) {
            return true;
        }
        else {
            return false;
        }
    }
    
    
    public void tasserLigne(int a) {
        for (int i = 0; i<5; i++) {
            if (grille[5-i][a-1].presenceJeton() == false) {
                if (grille[4-i][a-1].presenceJeton() == true) {
                    Jeton jetontmp = new Jeton("Blanc");
                    jetontmp = grille[4-i][a-1].recupererJeton();
                    grille[5-i][a-1].affecterJeton(jetontmp);
                }
            }
        }
    }
    
    public boolean colonneRemplie(int a) {
        boolean res = true;
        for (int i = 0; i<6; i++) {
            if (grille[i][a-1].presenceJeton() == false) {
                res = false;
                return res;
            }
        }
        return res;
    }
    
    public boolean placerTrouNoir(int x, int y) {
        boolean res = false;
        if (grille[x-1][y-1].presenceTrouNoir() == false && grille[x-1][y-1].presenceJeton() == false) {
            grille[x-1][y-1].placerTrouNoir();
            res = true;
            return res;
        }
        return res;
    }
    
    public boolean suppprimerTrouNoir(int x, int y) {
        boolean res = false;
        if (grille[x-1][y-1].presenceTrouNoir() == true) {
            grille[x-1][y-1].supprimerTrouNoir();
            res = true;
            System.out.println("Trou noir, jeton absorbé");
            return res;
        }
        return res;
    }
    
    public boolean placerDesintegrateur(int x, int y) {
        boolean res = false;
        if (grille[x-1][y-1].presenceDesintegrateur() == false) {
            grille[x-1][y-1].placerDesintegrateur();
            res = true;
            return res;
        }
        return res;
    }
    
    public boolean supprimerJeton(int x, int y) {
        boolean res = false;
        if (grille[x-1][y-1].presenceJeton() == true) {
            grille[x-1][y-1].supprimerJeton();
            res = true;
            return res;
        }
        return res;
    }
    
    public Jeton recupererJeton(int x, int y) {
        Jeton jetontmp = grille[x-1][y-1].recupererJeton();
        return jetontmp;
    }
    
    public boolean presenceTrouNoir(int x, int y) {
        if (grille[x-1][y-1].presenceTrouNoir() == true) {
            return true;
        }
        else {
            return false;
        }
    }
}