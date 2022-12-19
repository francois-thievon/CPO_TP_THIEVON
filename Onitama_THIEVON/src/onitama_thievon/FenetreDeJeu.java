/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package onitama_thievon;

import java.awt.Color;
import KentHipos.Kensoft;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


/**
 *
 * @author thiev
 */
public class FenetreDeJeu extends javax.swing.JFrame {
    
    static Joueur[] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    
    PlateauDeJeu PlateauDeJeu = new PlateauDeJeu();
    
    Carte carteJ1nb1;
    Carte carteJ1nb2;
    Carte carteJ2nb1;
    Carte carteJ2nb2;
    Carte carteFlottante;
    
    boolean reverse;
    
    boolean deplacer = false;
    Pion piontmp = null;
    Carte cartetmp = null;
    
    int Xtmp;
    int Ytmp;
    int x1;
    int y1;
    int x2;
    int y2;
    int x3;
    int y3;
    int x4;
    int y4;
            
    Carte carteStarPlatinium     = new Carte("Star Platinium"  , 2,  1,  -2, 1,  1,  -1, -1, -1);
    Carte carteCrazyDiamond      = new Carte("Crazy Diamond"   , 1,  1,  1,  0,  -1, 0,  -1, -1);
    Carte carteGoldExperience    = new Carte("Gold Experience" , 1,  0,  1,  -1, -1, 0,  -1, 1);
    Carte carteStoneFree         = new Carte("Stone Free"      , 0,  1,  -1, 0,  0,  -1, 9,  9);
    Carte carteTheWorld          = new Carte("The World"       , 1,  1,  1,  -1, -1, -1, -1, 1);
    Carte carteKillerQueen       = new Carte("Killer Queen"    , 1,  1,  -1, 1,  0,  -1, 0,  9);
    Carte carteKingCrimson       = new Carte("King Crimson"    , 1,  1,  1,  0,  -1, 1,  -1, 0);
    Carte carteWhiteSnake        = new Carte("White Snake"     , 1,  0,  -1, 1,  -1, -1, 9,  9);
    Carte carteSilverChariot     = new Carte("Silver Chariot"  , 1,  -1, -1, 1,  -2, 0,  9,  9);
    Carte carteEchoesAct3        = new Carte("Echoes Act3"     , 1,  0,  0,  1,  0,  -1, 9,  9);
    Carte carteStickyFingers     = new Carte("Sticky Fingers"  , 1,  1,  2,  0,  -1, -1, 9,  9);
    Carte carteKiss              = new Carte("Kiss"            , 1,  1,  1,  -1, -1, 0,  9,  9);
    Carte carteEpeePluck         = new Carte("Epée pluck"      , 0,  1,  1,  -1, -1, -1, 9,  9);
    Carte carteHermitPurple      = new Carte("Hermit purple"   , 0,  1,  2,  0,  -2, 0,  9,  9);
    Carte carteSavonLauncher     = new Carte("Savon Launcher"  , 0,  -1, 0,  2,  9,  9,  9,  9);
    Carte carteMasquePierre      = new Carte("Masque de pierre", 0,  1,  1,  0,  -1, 0,  9,  9);
    
    Carte[] listeCartes = new Carte[16];
    
    int Ax = 300;
    int Ay = 300;
    int Bx = 900;
    int By = 900;
    
  
    
    /**
     * Creates new form FenetreDeJeu
     */
    public FenetreDeJeu(Joueur J1, Joueur J2) {
        ListeJoueurs[0] = J1;
        ListeJoueurs[1] = J2;
        initComponents();
        
        int a = (int)(Math.random()*2);
        joueurCourant = ListeJoueurs[a];
        
        LabelJ1.setText(J1.toString());
        LabelJ2.setText(J2.toString());
        LabelJC.setText(joueurCourant.toString());
        
        
        ListeJoueurs[0].AffecterEquipe(1);
        ListeJoueurs[1].AffecterEquipe(2);
        
        listeCartes[0]  = carteStarPlatinium;
        listeCartes[1]  = carteCrazyDiamond;
        listeCartes[2]  = carteGoldExperience;
        listeCartes[3]  = carteStoneFree;
        listeCartes[4]  = carteTheWorld;
        listeCartes[5]  = carteKillerQueen;
        listeCartes[6]  = carteKingCrimson;
        listeCartes[7]  = carteWhiteSnake;
        listeCartes[8]  = carteSilverChariot;
        listeCartes[9]  = carteEchoesAct3;
        listeCartes[10] = carteStickyFingers;
        listeCartes[11] = carteKiss;
        listeCartes[12] = carteEpeePluck;
        listeCartes[13] = carteHermitPurple;
        listeCartes[14] = carteSavonLauncher;
        listeCartes[15] = carteMasquePierre;
        
        
        int rdm1;
        int rdm2;
        int rdm3;
        int rdm4;
        int rdm5;
        boolean z = false;
        do {
            rdm1 = (int)(Math.random()*16);
            rdm2 = (int)(Math.random()*16);
            rdm3 = (int)(Math.random()*16);
            rdm4 = (int)(Math.random()*16);
            rdm5 = (int)(Math.random()*16);
            if (rdm1 != rdm2 && rdm1 != rdm3 && rdm1 != rdm4 && rdm1 != rdm5 && rdm2 != rdm3 && rdm2 != rdm4 && rdm2 != rdm5 && rdm3 != rdm4 && rdm3 != rdm5 && rdm4 != rdm5) {
                z = true;
        }
        }while(z == false);
        

        carteJ1nb1 = listeCartes[rdm1];
        carteJ1nb2 = listeCartes[rdm2];
        carteJ2nb1 = listeCartes[rdm3];
        carteJ2nb2 = listeCartes[rdm4];
        carteFlottante = listeCartes[rdm5];
        
        afficherCartes();
        
       
        
        for (int cp = 0; cp<5; cp++) {
            if (cp == 2) {
                Pion pionJ1 = new Pion(1, true);
                pionJ1.affecterJoueur(J1);
                PlateauDeJeu.Plateau[0][cp].affecterPion(pionJ1);
                J1.reservePions.add(pionJ1);
                
                Pion pionJ2 = new Pion(2, true);
                pionJ2.affecterJoueur(J2);
                PlateauDeJeu.Plateau[4][cp].affecterPion(pionJ2);
                J2.reservePions.add(pionJ2);
            }
            if (cp != 2) {
                Pion pionJ1 = new Pion(1, false);
                pionJ1.affecterJoueur(J1);
                PlateauDeJeu.Plateau[0][cp].affecterPion(pionJ1);
                J1.reservePions.add(pionJ1);
                
                Pion pionJ2 = new Pion(2, false);
                pionJ2.affecterJoueur(J2);
                PlateauDeJeu.Plateau[4][cp].affecterPion(pionJ2);
                J2.reservePions.add(pionJ2);
            }      
        }
        
        for (int i = 4; i>=0; i--) {
            for (int j = 0; j<5; j++) {
                CaseGraphique caseGraph = new CaseGraphique(PlateauDeJeu.Plateau[i][j], i, j);
                
                caseGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt){
                        
                        CaseDePlateau c = caseGraph.caseAssociee;
                        Panel_PlateauDeJeu.repaint();
                        
                        if (deplacer == false) {
                            if (c.avoirPion() == true) {
                                if (c.renvoyerPion().renvoyerJoueur() == J1 && joueurCourant == J1) {
                                    if (cartetmp != null) {
                                        if (reverse == false) {
                                            Xtmp = caseGraph.X;
                                            Ytmp = caseGraph.Y;
                                            x1 = cartetmp.d1X;
                                            y1 = cartetmp.d1Y;
                                            x2 = cartetmp.d2X;
                                            y2 = cartetmp.d2Y;
                                            x3 = cartetmp.d3X;
                                            y3 = cartetmp.d3Y;
                                            x4 = cartetmp.d4X;
                                            y4 = cartetmp.d4Y;
                                        }
                                        else {
                                            Xtmp = caseGraph.X;
                                            Ytmp = caseGraph.Y;
                                            x1 = -cartetmp.d1X;
                                            y1 = -cartetmp.d1Y;
                                            x2 = -cartetmp.d2X;
                                            y2 = -cartetmp.d2Y;
                                            x3 = -cartetmp.d3X;
                                            y3 = -cartetmp.d3Y;
                                            x4 = -cartetmp.d4X;
                                            y4 = -cartetmp.d4Y;
                                        }
                                        piontmp = c.renvoyerPion();
                                        c.cible = true;
                                        
                                        if ((Xtmp + y1) < 5 && (Ytmp + x1) < 5 && (Xtmp + y1)>= 0 && (Ytmp + x1) >= 0) {
                                            if (PlateauDeJeu.Plateau[Xtmp + y1][Ytmp + x1].avoirPion() == true) {
                                                if (PlateauDeJeu.Plateau[Xtmp + y1][Ytmp + x1].renvoyerPion().avoirEquipe() == 2) {
                                                    PlateauDeJeu.Plateau[Xtmp + y1][Ytmp + x1].viser = true;
                                                }
                                            }
                                            else {
                                                PlateauDeJeu.Plateau[Xtmp + y1][Ytmp + x1].viser = true;
                                            }
                                        }
                                        if ((Xtmp + y2) < 5 && (Ytmp + x2) < 5 && (Xtmp + y2)>= 0 && (Ytmp + x2) >= 0) {
                                            if (PlateauDeJeu.Plateau[Xtmp + y2][Ytmp + x2].avoirPion() == true) {
                                                if (PlateauDeJeu.Plateau[Xtmp + y2][Ytmp + x2].renvoyerPion().avoirEquipe() == 2) {
                                                    PlateauDeJeu.Plateau[Xtmp + y2][Ytmp + x2].viser = true;
                                                }
                                            }
                                            else {
                                                PlateauDeJeu.Plateau[Xtmp + y2][Ytmp + x2].viser = true;
                                            }
                                        }
                                        if ((Xtmp + y3) < 5 && (Ytmp + x3) < 5 && (Xtmp + y3)>= 0 && (Ytmp + x3) >= 0) {
                                            if (PlateauDeJeu.Plateau[Xtmp + y3][Ytmp + x3].avoirPion() == true) {
                                                if (PlateauDeJeu.Plateau[Xtmp + y3][Ytmp + x3].renvoyerPion().avoirEquipe() == 2) {
                                                    PlateauDeJeu.Plateau[Xtmp + y3][Ytmp + x3].viser = true;
                                                }
                                            }
                                            else {
                                                PlateauDeJeu.Plateau[Xtmp + y3][Ytmp + x3].viser = true;
                                            }
                                        }
                                        if ((Xtmp + y4) < 5 && (Ytmp + x4) < 5 && (Xtmp + y4)>= 0 && (Ytmp + x4) >= 0) {
                                            if (PlateauDeJeu.Plateau[Xtmp + y4][Ytmp + x4].avoirPion() == true) {
                                                if (PlateauDeJeu.Plateau[Xtmp + y4][Ytmp + x4].renvoyerPion().avoirEquipe() == 2) {
                                                    PlateauDeJeu.Plateau[Xtmp + y4][Ytmp + x4].viser = true;
                                                }
                                            }
                                            else {
                                                PlateauDeJeu.Plateau[Xtmp + y4][Ytmp + x4].viser = true;
                                            }
                                        }

                                        Panel_PlateauDeJeu.repaint();
                                        deplacer = true;
                                        
                                    }
                                    else {
                                        InfoPartie.setText("Saisissez d'abord une carte de mouvement");
                                    }
                                    
                                }
                                else if (c.renvoyerPion().renvoyerJoueur() == J2 && joueurCourant == J2) {
                                    if (cartetmp != null) {
                                        if (reverse == false) {
                                            Xtmp = caseGraph.X;
                                            Ytmp = caseGraph.Y;
                                            x1 = -cartetmp.d1X;
                                            y1 = -cartetmp.d1Y;
                                            x2 = -cartetmp.d2X;
                                            y2 = -cartetmp.d2Y;
                                            x3 = -cartetmp.d3X;
                                            y3 = -cartetmp.d3Y;
                                            x4 = -cartetmp.d4X;
                                            y4 = -cartetmp.d4Y;
                                        }
                                        else {
                                            Xtmp = caseGraph.X;
                                            Ytmp = caseGraph.Y;
                                            x1 = cartetmp.d1X;
                                            y1 = cartetmp.d1Y;
                                            x2 = cartetmp.d2X;
                                            y2 = cartetmp.d2Y;
                                            x3 = cartetmp.d3X;
                                            y3 = cartetmp.d3Y;
                                            x4 = cartetmp.d4X;
                                            y4 = cartetmp.d4Y;
                                        }
                                        piontmp = c.renvoyerPion();
                                        c.cible = true;
                                        
                                        if ((Xtmp + y1) < 5 && (Ytmp + x1) < 5 && (Xtmp + y1)>= 0 && (Ytmp + x1) >= 0) {
                                            if (PlateauDeJeu.Plateau[Xtmp + y1][Ytmp + x1].avoirPion() == true) {
                                                if (PlateauDeJeu.Plateau[Xtmp + y1][Ytmp + x1].renvoyerPion().avoirEquipe() == 1) {
                                                    PlateauDeJeu.Plateau[Xtmp + y1][Ytmp + x1].viser = true;
                                                }
                                            }
                                            else {
                                                PlateauDeJeu.Plateau[Xtmp + y1][Ytmp + x1].viser = true;
                                            }
                                        }
                                        if ((Xtmp + y2) < 5 && (Ytmp + x2) < 5 && (Xtmp + y2)>= 0 && (Ytmp + x2) >= 0) {
                                            if (PlateauDeJeu.Plateau[Xtmp + y2][Ytmp + x2].avoirPion() == true) {
                                                if (PlateauDeJeu.Plateau[Xtmp + y2][Ytmp + x2].renvoyerPion().avoirEquipe() == 1) {
                                                    PlateauDeJeu.Plateau[Xtmp + y2][Ytmp + x2].viser = true;
                                                }
                                            }
                                            else {
                                                PlateauDeJeu.Plateau[Xtmp + y2][Ytmp + x2].viser = true;
                                            }
                                        }
                                        if ((Xtmp + y3) < 5 && (Ytmp + x3) < 5 && (Xtmp + y3)>= 0 && (Ytmp + x3) >= 0) {
                                            if (PlateauDeJeu.Plateau[Xtmp + y3][Ytmp + x3].avoirPion() == true) {
                                                if (PlateauDeJeu.Plateau[Xtmp + y3][Ytmp + x3].renvoyerPion().avoirEquipe() == 1) {
                                                    PlateauDeJeu.Plateau[Xtmp + y3][Ytmp + x3].viser = true;
                                                }
                                            }
                                            else {
                                                PlateauDeJeu.Plateau[Xtmp + y3][Ytmp + x3].viser = true;
                                            }
                                        }
                                        if ((Xtmp + y4) < 5 && (Ytmp + x4) < 5 && (Xtmp + y4)>= 0 && (Ytmp + x4) >= 0) {
                                            if (PlateauDeJeu.Plateau[Xtmp + y4][Ytmp + x4].avoirPion() == true) {
                                                if (PlateauDeJeu.Plateau[Xtmp + y4][Ytmp + x4].renvoyerPion().avoirEquipe() == 1) {
                                                    PlateauDeJeu.Plateau[Xtmp + y4][Ytmp + x4].viser = true;
                                                }
                                            }
                                            else {
                                                PlateauDeJeu.Plateau[Xtmp + y4][Ytmp + x4].viser = true;
                                            }
                                        }
                                        
                                        Panel_PlateauDeJeu.repaint();
                                        deplacer = true;
                                        
                                    }
                                    else {
                                        InfoPartie.setText("Saisissez d'abord une carte de mouvement");
                                    }
                                }
                                
                            }
                        }
                        else {
                            
                            if (c.avoirPion() == true && c.renvoyerPion().renvoyerJoueur() == joueurCourant) {
                                PlateauDeJeu.supprimerCibles();
                                PlateauDeJeu.supprimerViser();
                                if (c.renvoyerPion().renvoyerJoueur() == J1 && joueurCourant == J1) {
                                    if (cartetmp != null) {
                                        if (reverse == false) {
                                            Xtmp = caseGraph.X;
                                            Ytmp = caseGraph.Y;
                                            x1 = cartetmp.d1X;
                                            y1 = cartetmp.d1Y;
                                            x2 = cartetmp.d2X;
                                            y2 = cartetmp.d2Y;
                                            x3 = cartetmp.d3X;
                                            y3 = cartetmp.d3Y;
                                            x4 = cartetmp.d4X;
                                            y4 = cartetmp.d4Y;
                                        }
                                        else {
                                            Xtmp = caseGraph.X;
                                            Ytmp = caseGraph.Y;
                                            x1 = -cartetmp.d1X;
                                            y1 = -cartetmp.d1Y;
                                            x2 = -cartetmp.d2X;
                                            y2 = -cartetmp.d2Y;
                                            x3 = -cartetmp.d3X;
                                            y3 = -cartetmp.d3Y;
                                            x4 = -cartetmp.d4X;
                                            y4 = -cartetmp.d4Y;
                                        }
                                        piontmp = c.renvoyerPion();
                                        c.cible = true;
                                        
                                        if ((Xtmp + y1) < 5 && (Ytmp + x1) < 5 && (Xtmp + y1)>= 0 && (Ytmp + x1) >= 0) {
                                            if (PlateauDeJeu.Plateau[Xtmp + y1][Ytmp + x1].avoirPion() == true) {
                                                if (PlateauDeJeu.Plateau[Xtmp + y1][Ytmp + x1].renvoyerPion().avoirEquipe() == 2) {
                                                    PlateauDeJeu.Plateau[Xtmp + y1][Ytmp + x1].viser = true;
                                                }
                                            }
                                            else {
                                                PlateauDeJeu.Plateau[Xtmp + y1][Ytmp + x1].viser = true;
                                            }
                                        }
                                        if ((Xtmp + y2) < 5 && (Ytmp + x2) < 5 && (Xtmp + y2)>= 0 && (Ytmp + x2) >= 0) {
                                            if (PlateauDeJeu.Plateau[Xtmp + y2][Ytmp + x2].avoirPion() == true) {
                                                if (PlateauDeJeu.Plateau[Xtmp + y2][Ytmp + x2].renvoyerPion().avoirEquipe() == 2) {
                                                    PlateauDeJeu.Plateau[Xtmp + y2][Ytmp + x2].viser = true;
                                                }
                                            }
                                            else {
                                                PlateauDeJeu.Plateau[Xtmp + y2][Ytmp + x2].viser = true;
                                            }
                                        }
                                        if ((Xtmp + y3) < 5 && (Ytmp + x3) < 5 && (Xtmp + y3)>= 0 && (Ytmp + x3) >= 0) {
                                            if (PlateauDeJeu.Plateau[Xtmp + y3][Ytmp + x3].avoirPion() == true) {
                                                if (PlateauDeJeu.Plateau[Xtmp + y3][Ytmp + x3].renvoyerPion().avoirEquipe() == 2) {
                                                    PlateauDeJeu.Plateau[Xtmp + y3][Ytmp + x3].viser = true;
                                                }
                                            }
                                            else {
                                                PlateauDeJeu.Plateau[Xtmp + y3][Ytmp + x3].viser = true;
                                            }
                                        }
                                        if ((Xtmp + y4) < 5 && (Ytmp + x4) < 5 && (Xtmp + y4)>= 0 && (Ytmp + x4) >= 0) {
                                            if (PlateauDeJeu.Plateau[Xtmp + y4][Ytmp + x4].avoirPion() == true) {
                                                if (PlateauDeJeu.Plateau[Xtmp + y4][Ytmp + x4].renvoyerPion().avoirEquipe() == 2) {
                                                    PlateauDeJeu.Plateau[Xtmp + y4][Ytmp + x4].viser = true;
                                                }
                                            }
                                            else {
                                                PlateauDeJeu.Plateau[Xtmp + y4][Ytmp + x4].viser = true;
                                            }
                                        }

                                        Panel_PlateauDeJeu.repaint();
                                        deplacer = true;
                                        
                                    }
                                    else {
                                        InfoPartie.setText("Saisissez d'abord une carte de mouvement");
                                    }
                                    
                                }
                                else if (c.renvoyerPion().renvoyerJoueur() == J2 && joueurCourant == J2) {
                                    if (cartetmp != null) {
                                        if (reverse == false) {
                                            Xtmp = caseGraph.X;
                                            Ytmp = caseGraph.Y;
                                            x1 = -cartetmp.d1X;
                                            y1 = -cartetmp.d1Y;
                                            x2 = -cartetmp.d2X;
                                            y2 = -cartetmp.d2Y;
                                            x3 = -cartetmp.d3X;
                                            y3 = -cartetmp.d3Y;
                                            x4 = -cartetmp.d4X;
                                            y4 = -cartetmp.d4Y;
                                        }
                                        else {
                                            Xtmp = caseGraph.X;
                                            Ytmp = caseGraph.Y;
                                            x1 = cartetmp.d1X;
                                            y1 = cartetmp.d1Y;
                                            x2 = cartetmp.d2X;
                                            y2 = cartetmp.d2Y;
                                            x3 = cartetmp.d3X;
                                            y3 = cartetmp.d3Y;
                                            x4 = cartetmp.d4X;
                                            y4 = cartetmp.d4Y;
                                        }
                                        piontmp = c.renvoyerPion();
                                        c.cible = true;
                                        
                                        if ((Xtmp + y1) < 5 && (Ytmp + x1) < 5 && (Xtmp + y1)>= 0 && (Ytmp + x1) >= 0) {
                                            if (PlateauDeJeu.Plateau[Xtmp + y1][Ytmp + x1].avoirPion() == true) {
                                                if (PlateauDeJeu.Plateau[Xtmp + y1][Ytmp + x1].renvoyerPion().avoirEquipe() == 1) {
                                                    PlateauDeJeu.Plateau[Xtmp + y1][Ytmp + x1].viser = true;
                                                }
                                            }
                                            else {
                                                PlateauDeJeu.Plateau[Xtmp + y1][Ytmp + x1].viser = true;
                                            }
                                        }
                                        if ((Xtmp + y2) < 5 && (Ytmp + x2) < 5 && (Xtmp + y2)>= 0 && (Ytmp + x2) >= 0) {
                                            if (PlateauDeJeu.Plateau[Xtmp + y2][Ytmp + x2].avoirPion() == true) {
                                                if (PlateauDeJeu.Plateau[Xtmp + y2][Ytmp + x2].renvoyerPion().avoirEquipe() == 1) {
                                                    PlateauDeJeu.Plateau[Xtmp + y2][Ytmp + x2].viser = true;
                                                }
                                            }
                                            else {
                                                PlateauDeJeu.Plateau[Xtmp + y2][Ytmp + x2].viser = true;
                                            }
                                        }
                                        if ((Xtmp + y3) < 5 && (Ytmp + x3) < 5 && (Xtmp + y3)>= 0 && (Ytmp + x3) >= 0) {
                                            if (PlateauDeJeu.Plateau[Xtmp + y3][Ytmp + x3].avoirPion() == true) {
                                                if (PlateauDeJeu.Plateau[Xtmp + y3][Ytmp + x3].renvoyerPion().avoirEquipe() == 1) {
                                                    PlateauDeJeu.Plateau[Xtmp + y3][Ytmp + x3].viser = true;
                                                }
                                            }
                                            else {
                                                PlateauDeJeu.Plateau[Xtmp + y3][Ytmp + x3].viser = true;
                                            }
                                        }
                                        if ((Xtmp + y4) < 5 && (Ytmp + x4) < 5 && (Xtmp + y4)>= 0 && (Ytmp + x4) >= 0) {
                                            if (PlateauDeJeu.Plateau[Xtmp + y4][Ytmp + x4].avoirPion() == true) {
                                                if (PlateauDeJeu.Plateau[Xtmp + y4][Ytmp + x4].renvoyerPion().avoirEquipe() == 1) {
                                                    PlateauDeJeu.Plateau[Xtmp + y4][Ytmp + x4].viser = true;
                                                }
                                            }
                                            else {
                                                PlateauDeJeu.Plateau[Xtmp + y4][Ytmp + x4].viser = true;
                                            }
                                        }
                                        
                                        Panel_PlateauDeJeu.repaint();
                                        deplacer = true;
                                        
                                    }
                                    else {
                                        InfoPartie.setText("Saisissez d'abord une carte de mouvement");
                                    }
                                }
                                
                            }

                            if (c.viser == true) {

                                PlateauDeJeu.Plateau[Xtmp][Ytmp].supprimerPion();
                                int k;
                                
                                ImageIcon Icontmp = new javax.swing.ImageIcon();
                                
                                
                                if (joueurCourant.prenom == "Jonathan" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp1 = new javax.swing.ImageIcon(getClass().getResource("/images/Jonathan.png"));
                                    Icontmp = Icontmp1;
                                }
                                else if (joueurCourant.prenom == "Joseph" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp2 = new javax.swing.ImageIcon(getClass().getResource("/images/Joseph.png"));
                                    Icontmp = Icontmp2;
                                }
                                else if (joueurCourant.prenom == "Jotaro" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp3 = new javax.swing.ImageIcon(getClass().getResource("/images/Jotaro.png"));
                                    Icontmp = Icontmp3;
                                }
                                else if (joueurCourant.prenom == "Josuke" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp4 = new javax.swing.ImageIcon(getClass().getResource("/images/Josuke.png"));
                                    Icontmp = Icontmp4;
                                }
                                else if (joueurCourant.prenom == "Giorno" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp5 = new javax.swing.ImageIcon(getClass().getResource("/images/Giorno.png"));
                                    Icontmp = Icontmp5;
                                }
                                else if (joueurCourant.prenom == "Jolyne" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp6 = new javax.swing.ImageIcon(getClass().getResource("/images/Jolyne.png"));
                                    Icontmp = Icontmp6;
                                }
                                else if (joueurCourant.prenom == "Kars" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp7 = new javax.swing.ImageIcon(getClass().getResource("/images/Kars.png"));
                                    Icontmp = Icontmp7;
                                }
                                else if (joueurCourant.prenom == "Dio" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp8 = new javax.swing.ImageIcon(getClass().getResource("/images/Dio.png"));
                                    Icontmp = Icontmp8;
                                }
                                else if (joueurCourant.prenom == "Yoshikage" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp9 = new javax.swing.ImageIcon(getClass().getResource("/images/Kira.png"));
                                    Icontmp = Icontmp9;
                                }
                                else if (joueurCourant.prenom == "Diavolo" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp10 = new javax.swing.ImageIcon(getClass().getResource("/images/Diavolo.png"));
                                    Icontmp = Icontmp10;
                                }
                                else if (joueurCourant.prenom == "Enrico" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp11 = new javax.swing.ImageIcon(getClass().getResource("/images/Pucci.png"));
                                    Icontmp = Icontmp11;
                                }
                                else if (joueurCourant.prenom == "Cesear" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp12 = new javax.swing.ImageIcon(getClass().getResource("/images/Cesear.png"));
                                    Icontmp = Icontmp12;
                                }
                                else if (joueurCourant.prenom == "Jean-Pierre" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp13 = new javax.swing.ImageIcon(getClass().getResource("/images/Polnareff.png"));
                                    Icontmp = Icontmp13;
                                }
                                else if (joueurCourant.prenom == "Koichi" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp14 = new javax.swing.ImageIcon(getClass().getResource("/images/Koichi.png"));
                                    Icontmp = Icontmp14;
                                }
                                else if (joueurCourant.prenom == "Bruno" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp15 = new javax.swing.ImageIcon(getClass().getResource("/images/Bucciarati.png"));
                                    Icontmp = Icontmp15;
                                }
                                else if (joueurCourant.prenom == "Ermes" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp16 = new javax.swing.ImageIcon(getClass().getResource("/images/Ermes.png"));
                                    Icontmp = Icontmp16;
                                }
                                
                                else if (joueurCourant.prenom == "Jonathan" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp17 = new javax.swing.ImageIcon(getClass().getResource("/images/Punch.png"));
                                    Icontmp = Icontmp17;
                                }
                                else if (joueurCourant.prenom == "Joseph" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp18 = new javax.swing.ImageIcon(getClass().getResource("/images/HermitPurple.png"));
                                    Icontmp = Icontmp18;
                                }
                                else if (joueurCourant.prenom == "Jotaro" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp19 = new javax.swing.ImageIcon(getClass().getResource("/images/StarPlatinium.png"));
                                    Icontmp = Icontmp19;
                                }
                                else if (joueurCourant.prenom == "Josuke" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp20 = new javax.swing.ImageIcon(getClass().getResource("/images/CrazyDiamond.png"));
                                    Icontmp = Icontmp20;
                                }
                                else if (joueurCourant.prenom == "Giorno" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp21 = new javax.swing.ImageIcon(getClass().getResource("/images/GoldExperience.png"));
                                    Icontmp = Icontmp21;
                                }
                                else if (joueurCourant.prenom == "Jolyne" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp22 = new javax.swing.ImageIcon(getClass().getResource("/images/StoneFree.png"));
                                    Icontmp = Icontmp22;
                                }
                                else if (joueurCourant.prenom == "Kars" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp23 = new javax.swing.ImageIcon(getClass().getResource("/images/PierreAja.png"));
                                    Icontmp = Icontmp23;
                                }
                                else if (joueurCourant.prenom == "Dio" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp24 = new javax.swing.ImageIcon(getClass().getResource("/images/TheWorld.png"));
                                    Icontmp = Icontmp24;
                                }
                                else if (joueurCourant.prenom == "Yoshikage" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp25 = new javax.swing.ImageIcon(getClass().getResource("/images/KillerQueen.png"));
                                    Icontmp = Icontmp25;
                                }
                                else if (joueurCourant.prenom == "Diavolo" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp26 = new javax.swing.ImageIcon(getClass().getResource("/images/KingCrimson.png"));
                                    Icontmp = Icontmp26;
                                }
                                else if (joueurCourant.prenom == "Enrico" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp27 = new javax.swing.ImageIcon(getClass().getResource("/images/WhiteSnake.png"));
                                    Icontmp = Icontmp27;
                                }
                                else if (joueurCourant.prenom == "Cesear" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp28 = new javax.swing.ImageIcon(getClass().getResource("/images/SavonLauncher.png"));
                                    Icontmp = Icontmp28;
                                }
                                else if (joueurCourant.prenom == "Jean-Pierre" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp29 = new javax.swing.ImageIcon(getClass().getResource("/images/SilverChariot.png"));
                                    Icontmp = Icontmp29;
                                }
                                else if (joueurCourant.prenom == "Koichi" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp30 = new javax.swing.ImageIcon(getClass().getResource("/images/Echoes.png"));
                                    Icontmp = Icontmp30;
                                }
                                else if (joueurCourant.prenom == "Bruno" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp31 = new javax.swing.ImageIcon(getClass().getResource("/images/StickyFingers.png"));
                                    Icontmp = Icontmp31;
                                }
                                else if (joueurCourant.prenom == "Ermes" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp32 = new javax.swing.ImageIcon(getClass().getResource("/images/Kiss.png"));
                                    Icontmp = Icontmp32;
                                }
                                
                                
                                
                                
                                
                                
                                labeltmp = new javax.swing.JLabel();
                                labeltmp.setIcon(Icontmp);
                                labeltmp.setBounds(100, 500, 150, 150);
                                

                                getContentPane().add(labeltmp);
                                getContentPane().setComponentZOrder(labeltmp, 0);
                                
                                
                                
                                
                                
                                
                                Kensoft animate = new Kensoft();
                                animate.jLabelXRight(100, 900, 5, 1, labeltmp);
                                animate.jLabelYDown(500, 1000, 5, 1, labeltmp);
                                
                                
                                
                                
                                c.affecterPion(piontmp);                                
                                Panel_PlateauDeJeu.repaint();
                                deplacer = false;
                                changerJoueurCourant();
                                changerCarte(cartetmp);
                                cartetmp = null;
                                PlateauDeJeu.supprimerCibles();
                                PlateauDeJeu.supprimerViser();
                            }
                            Victoire(reverse);
                        }                        
                    }
                });
                Panel_PlateauDeJeu.add(caseGraph);
            }
        }
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bouton_Arreter = new javax.swing.JButton();
        Panel_PlateauDeJeu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LabelJ1 = new javax.swing.JLabel();
        LabelJ2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LabelJC = new javax.swing.JLabel();
        Carte1J1 = new javax.swing.JButton();
        Carte2J1 = new javax.swing.JButton();
        Carte1J2 = new javax.swing.JButton();
        Carte2J2 = new javax.swing.JButton();
        CartePioche = new javax.swing.JButton();
        InfoPartie = new javax.swing.JLabel();
        Bouton_retournerPlateau = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        Bouton_Arreter.setText("Arreter la partie");
        Bouton_Arreter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_ArreterActionPerformed(evt);
            }
        });
        getContentPane().add(Bouton_Arreter);
        Bouton_Arreter.setBounds(330, 830, 111, 23);

        Panel_PlateauDeJeu.setBackground(new java.awt.Color(102, 102, 102));
        Panel_PlateauDeJeu.setPreferredSize(new java.awt.Dimension(820, 820));
        Panel_PlateauDeJeu.setLayout(new java.awt.GridLayout(5, 5));
        getContentPane().add(Panel_PlateauDeJeu);
        Panel_PlateauDeJeu.setBounds(470, 100, 820, 820);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Joueur  1:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 100, 118, 29);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Joueur 2:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 150, 112, 29);

        LabelJ1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LabelJ1.setForeground(new java.awt.Color(204, 204, 204));
        LabelJ1.setText("J1");
        getContentPane().add(LabelJ1);
        LabelJ1.setBounds(210, 100, 250, 29);

        LabelJ2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LabelJ2.setForeground(new java.awt.Color(204, 204, 204));
        LabelJ2.setText("J2");
        getContentPane().add(LabelJ2);
        LabelJ2.setBounds(210, 150, 250, 29);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Joueur courant :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 40, 197, 29);

        LabelJC.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LabelJC.setForeground(new java.awt.Color(204, 204, 204));
        LabelJC.setText("JC");
        getContentPane().add(LabelJC);
        LabelJC.setBounds(270, 40, 230, 29);

        Carte1J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carte1J1ActionPerformed(evt);
            }
        });
        getContentPane().add(Carte1J1);
        Carte1J1.setBounds(20, 240, 390, 225);

        Carte2J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carte2J1ActionPerformed(evt);
            }
        });
        getContentPane().add(Carte2J1);
        Carte2J1.setBounds(30, 520, 390, 225);

        Carte1J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carte1J2ActionPerformed(evt);
            }
        });
        getContentPane().add(Carte1J2);
        Carte1J2.setBounds(1320, 100, 390, 225);

        Carte2J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carte2J2ActionPerformed(evt);
            }
        });
        getContentPane().add(Carte2J2);
        Carte2J2.setBounds(1320, 360, 390, 225);

        CartePioche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartePiocheActionPerformed(evt);
            }
        });
        getContentPane().add(CartePioche);
        CartePioche.setBounds(1320, 630, 374, 211);

        InfoPartie.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        getContentPane().add(InfoPartie);
        InfoPartie.setBounds(150, 30, 0, 0);

        Bouton_retournerPlateau.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Bouton_retournerPlateau.setText("Retourner le plateau");
        Bouton_retournerPlateau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_retournerPlateauActionPerformed(evt);
            }
        });
        getContentPane().add(Bouton_retournerPlateau);
        Bouton_retournerPlateau.setBounds(80, 820, 230, 60);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 20, 75, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bouton_ArreterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_ArreterActionPerformed
        // TODO add your handling code here:
        FenetreDeJeu.super.dispose();
    }//GEN-LAST:event_Bouton_ArreterActionPerformed

    private void Carte1J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carte1J1ActionPerformed
        // TODO add your handling code here:
        if (joueurCourant.avoirEquipe() == 1) {
            cartetmp = carteJ1nb1;
            Carte1J1.setBackground(Color.CYAN);
            Carte2J1.setBackground(Color.WHITE);
            InfoPartie.setText("");
            PlateauDeJeu.supprimerCibles();
            PlateauDeJeu.supprimerViser();
            Panel_PlateauDeJeu.repaint();
            
        }
    }//GEN-LAST:event_Carte1J1ActionPerformed

    private void Carte2J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carte2J1ActionPerformed
        // TODO add your handling code here:
        if (joueurCourant.avoirEquipe() == 1) {
            cartetmp = carteJ1nb2;
            Carte2J1.setBackground(Color.CYAN);
            Carte1J1.setBackground(Color.WHITE);
            InfoPartie.setText("");
            PlateauDeJeu.supprimerCibles();
            PlateauDeJeu.supprimerViser();
            Panel_PlateauDeJeu.repaint();
        }
    }//GEN-LAST:event_Carte2J1ActionPerformed

    private void Carte1J2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carte1J2ActionPerformed
        // TODO add your handling code here:
        if (joueurCourant.avoirEquipe() == 2) {
            cartetmp = carteJ2nb1;
            Carte1J2.setBackground(Color.CYAN);
            Carte2J2.setBackground(Color.WHITE);
            InfoPartie.setText("");
            PlateauDeJeu.supprimerCibles();
            PlateauDeJeu.supprimerViser();
            Panel_PlateauDeJeu.repaint();
        }
    }//GEN-LAST:event_Carte1J2ActionPerformed

    private void Carte2J2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carte2J2ActionPerformed
        // TODO add your handling code here:
        if (joueurCourant.avoirEquipe() == 2) {
            cartetmp = carteJ2nb2;
            Carte2J2.setBackground(Color.CYAN);
            Carte1J2.setBackground(Color.WHITE);
            InfoPartie.setText("");
            PlateauDeJeu.supprimerCibles();
            PlateauDeJeu.supprimerViser();
            Panel_PlateauDeJeu.repaint();
        }
    }//GEN-LAST:event_Carte2J2ActionPerformed

    private void CartePiocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartePiocheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CartePiocheActionPerformed

    private void Bouton_retournerPlateauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_retournerPlateauActionPerformed
        // TODO add your handling code here:
        retournerPlateau(); 
    }//GEN-LAST:event_Bouton_retournerPlateauActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Kensoft animate = new Kensoft();
        animate.jButtonXRight(560, 900, 5, 1, jButton1);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void Victoire(boolean reverse) {
        if (PlateauDeJeu.plateauGagnantPourEquipe1(reverse) == true) {
            FenetreDeJeu.super.dispose();
        }
        if (PlateauDeJeu.plateauGagnantPourEquipe2(reverse) == true) {
            FenetreDeJeu.super.dispose();
        }
    }
    
    
    public void retournerPlateau() {
        PlateauDeJeu plateautmp = new PlateauDeJeu();
        PlateauDeJeu.supprimerCibles();
        PlateauDeJeu.supprimerViser();
        
        for (int i = 0; i<5; i++) {
            for (int j = 0; j<5; j++) {
                if (PlateauDeJeu.Plateau[i][j].avoirPion() == true) {
                    plateautmp.Plateau[4-i][4-j].affecterPion(PlateauDeJeu.Plateau[i][j].renvoyerEtSupprimerPion());
                }
            }
        }
        
        for (int i = 0; i<5; i++) {
            for (int j = 0; j<5; j++) {
                if (plateautmp.Plateau[i][j].avoirPion() == true) {
                    PlateauDeJeu.Plateau[i][j].affecterPion(plateautmp.Plateau[i][j].renvoyerEtSupprimerPion());
                }
            }
        }
        
        if (reverse == true) {
            reverse = false;
        }
        else {
            reverse = true;
        }       
        Panel_PlateauDeJeu.repaint();

    }
    
    public void changerCarte(Carte c) {
        if (c == carteJ1nb1) {
            Carte cartetmp = carteFlottante;
            carteFlottante = carteJ1nb1;
            carteJ1nb1 = cartetmp;
            afficherCartes();
        }
        if (c == carteJ1nb2) {
            Carte cartetmp = carteFlottante;
            carteFlottante = carteJ1nb2;
            carteJ1nb2 = cartetmp;
            afficherCartes();
        }
        if (c == carteJ2nb1) {
            Carte cartetmp = carteFlottante;
            carteFlottante = carteJ2nb1;
            carteJ2nb1 = cartetmp;
            afficherCartes();
        }
        if (c == carteJ2nb2) {
            Carte cartetmp = carteFlottante;
            carteFlottante = carteJ2nb2;
            carteJ2nb2 = cartetmp;
            afficherCartes();
        }
        Carte1J1.setBackground(Color.WHITE);
        Carte2J1.setBackground(Color.WHITE);
        Carte1J2.setBackground(Color.WHITE);
        Carte2J2.setBackground(Color.WHITE);
    }
    
    
    public void afficherCartes() {
        if (carteJ1nb1 == carteStarPlatinium) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte StarPlatinium.png")));
        }
        if (carteJ1nb1 == carteCrazyDiamond) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte CrazyDiamond.png")));
        }
        if (carteJ1nb1 == carteGoldExperience) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte GoldExperience.png")));
        }
        if (carteJ1nb1 == carteStoneFree) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte StoneFree.png")));
        }
        if (carteJ1nb1 == carteTheWorld) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte TheWorld.png")));
        }
        if (carteJ1nb1 == carteKillerQueen) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte KillerQueen.png")));
        }
        if (carteJ1nb1 == carteKingCrimson) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte KingCrimson.png")));
        }
        if (carteJ1nb1 == carteWhiteSnake) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte WhiteSnake.png")));
        }
        if (carteJ1nb1 == carteSilverChariot) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte SilverChariot.png")));
        }
        if (carteJ1nb1 == carteEchoesAct3) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte EchoesAct3.png")));
        }
        if (carteJ1nb1 == carteStickyFingers) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte StickyFingers.png")));
        }
        if (carteJ1nb1 == carteKiss) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte Kiss.png")));
        }
        if (carteJ1nb1 == carteEpeePluck) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte EpeePluck.png")));
        }
        if (carteJ1nb1 == carteHermitPurple) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte HermitPurple.png")));
        }
        if (carteJ1nb1 == carteSavonLauncher) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte SavonLauncher.png")));
        }
        if (carteJ1nb1 == carteMasquePierre) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte MasquePierre.png")));
        }
        
        
        
        if (carteJ1nb2 == carteStarPlatinium) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte StarPlatinium.png")));
        }
        if (carteJ1nb2 == carteCrazyDiamond) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte CrazyDiamond.png")));
        }
        if (carteJ1nb2 == carteGoldExperience) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte GoldExperience.png")));
        }
        if (carteJ1nb2 == carteStoneFree) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte StoneFree.png")));
        }
        if (carteJ1nb2 == carteTheWorld) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte TheWorld.png")));
        }
        if (carteJ1nb2 == carteKillerQueen) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte KillerQueen.png")));
        }
        if (carteJ1nb2 == carteKingCrimson) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte KingCrimson.png")));
        }
        if (carteJ1nb2 == carteWhiteSnake) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte WhiteSnake.png")));
        }
        if (carteJ1nb2 == carteSilverChariot) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte SilverChariot.png")));
        }
        if (carteJ1nb2 == carteEchoesAct3) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte EchoesAct3.png")));
        }
        if (carteJ1nb2 == carteStickyFingers) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte StickyFingers.png")));
        }
        if (carteJ1nb2 == carteKiss) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte Kiss.png")));
        }
        if (carteJ1nb2 == carteEpeePluck) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte EpeePluck.png")));
        }
        if (carteJ1nb2 == carteHermitPurple) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte HermitPurple.png")));
        }
        if (carteJ1nb2 == carteSavonLauncher) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte SavonLauncher.png")));
        }
        if (carteJ1nb2 == carteMasquePierre) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte MasquePierre.png")));
        }
        
        
        
        if (carteJ2nb1 == carteStarPlatinium) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte StarPlatinium.png")));
        }
        if (carteJ2nb1 == carteCrazyDiamond) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte CrazyDiamond.png")));
        }
        if (carteJ2nb1 == carteGoldExperience) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte GoldExperience.png")));
        }
        if (carteJ2nb1 == carteStoneFree) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte StoneFree.png")));
        }
        if (carteJ2nb1 == carteTheWorld) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte TheWorld.png")));
        }
        if (carteJ2nb1 == carteKillerQueen) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte KillerQueen.png")));
        }
        if (carteJ2nb1 == carteKingCrimson) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte KingCrimson.png")));
        }
        if (carteJ2nb1 == carteWhiteSnake) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte WhiteSnake.png")));
        }
        if (carteJ2nb1 == carteSilverChariot) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte SilverChariot.png")));
        }
        if (carteJ2nb1 == carteEchoesAct3) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte EchoesAct3.png")));
        }
        if (carteJ2nb1 == carteStickyFingers) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte StickyFingers.png")));
        }
        if (carteJ2nb1 == carteKiss) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte Kiss.png")));
        }
        if (carteJ2nb1 == carteEpeePluck) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte EpeePluck.png")));
        }
        if (carteJ2nb1 == carteHermitPurple) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte HermitPurple.png")));
        }
        if (carteJ2nb1 == carteSavonLauncher) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte SavonLauncher.png")));
        }
        if (carteJ2nb1 == carteMasquePierre) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte MasquePierre.png")));
        }
        
        
        
        if (carteJ2nb2 == carteStarPlatinium) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte StarPlatinium.png")));
        }
        if (carteJ2nb2 == carteCrazyDiamond) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte CrazyDiamond.png")));
        }
        if (carteJ2nb2 == carteGoldExperience) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte GoldExperience.png")));
        }
        if (carteJ2nb2 == carteStoneFree) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte StoneFree.png")));
        }
        if (carteJ2nb2 == carteTheWorld) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte TheWorld.png")));
        }
        if (carteJ2nb2 == carteKillerQueen) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte KillerQueen.png")));
        }
        if (carteJ2nb2 == carteKingCrimson) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte KingCrimson.png")));
        }
        if (carteJ2nb2 == carteWhiteSnake) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte WhiteSnake.png")));
        }
        if (carteJ2nb2 == carteSilverChariot) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte SilverChariot.png")));
        }
        if (carteJ2nb2 == carteEchoesAct3) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte EchoesAct3.png")));
        }
        if (carteJ2nb2 == carteStickyFingers) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte StickyFingers.png")));
        }
        if (carteJ2nb2 == carteKiss) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte Kiss.png")));
        }
        if (carteJ2nb2 == carteEpeePluck) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte EpeePluck.png")));
        }
        if (carteJ2nb2 == carteHermitPurple) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte HermitPurple.png")));
        }
        if (carteJ2nb2 == carteSavonLauncher) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte SavonLauncher.png")));
        }
        if (carteJ2nb2 == carteMasquePierre) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte MasquePierre.png")));
        }
        
        
        
        if (carteFlottante == carteStarPlatinium) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte StarPlatinium.png")));
        }
        if (carteFlottante == carteCrazyDiamond) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte CrazyDiamond.png")));
        }
        if (carteFlottante == carteGoldExperience) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte GoldExperience.png")));
        }
        if (carteFlottante == carteStoneFree) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte StoneFree.png")));
        }
        if (carteFlottante == carteTheWorld) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte TheWorld.png")));
        }
        if (carteFlottante == carteKillerQueen) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte KillerQueen.png")));
        }
        if (carteFlottante == carteKingCrimson) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte KingCrimson.png")));
        }
        if (carteFlottante == carteWhiteSnake) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte WhiteSnake.png")));
        }
        if (carteFlottante == carteSilverChariot) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte SilverChariot.png")));
        }
        if (carteFlottante == carteEchoesAct3) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte EchoesAct3.png")));
        }
        if (carteFlottante == carteStickyFingers) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte StickyFingers.png")));
        }
        if (carteFlottante == carteKiss) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte Kiss.png")));
        }
        if (carteFlottante == carteEpeePluck) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte EpeePluck.png")));
        }
        if (carteFlottante == carteHermitPurple) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte HermitPurple.png")));
        }
        if (carteFlottante == carteSavonLauncher) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte SavonLauncher.png")));
        }
        if (carteFlottante == carteMasquePierre) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte MasquePierre.png")));
        }
    }
    
    
    public void changerJoueurCourant() {
        if (joueurCourant == ListeJoueurs[0]) {
            joueurCourant = ListeJoueurs[1];
        }
        else {
            joueurCourant = ListeJoueurs[0];
        }
        LabelJC.setText(joueurCourant.toString());
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreDeJeu(ListeJoueurs[0], ListeJoueurs[1]).setVisible(true);
            }
        });
    }

    private javax.swing.JLabel labeltmp;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bouton_Arreter;
    private javax.swing.JButton Bouton_retournerPlateau;
    private javax.swing.JButton Carte1J1;
    private javax.swing.JButton Carte1J2;
    private javax.swing.JButton Carte2J1;
    private javax.swing.JButton Carte2J2;
    private javax.swing.JButton CartePioche;
    private javax.swing.JLabel InfoPartie;
    private javax.swing.JLabel LabelJ1;
    private javax.swing.JLabel LabelJ2;
    private javax.swing.JLabel LabelJC;
    private javax.swing.JPanel Panel_PlateauDeJeu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
