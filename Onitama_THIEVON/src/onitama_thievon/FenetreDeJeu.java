/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package onitama_thievon;

import java.awt.Color;
import KentHipos.Kensoft;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.Timer;


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
    
    int x;
    int y;
    
    int X;
    int Y;
    
    int X2;
    int Y2;
    
    int Xi;
    int Yi;
    
    int Xf;
    int Yf;
    
    int Xtmp2;
    int Ytmp2;
    
    ImageIcon Icontmp = new javax.swing.ImageIcon();
            
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
    
    
    static int timer;
    
    Timer ChronoJ1;
    Timer ChronoJ2;
    
    int timerJ1;
    int timerJ2;
    
  
    
    /**
     * Creates new form FenetreDeJeu
     */
    public FenetreDeJeu(Joueur J1, Joueur J2, int unTimer) {
        
        ListeJoueurs[0] = J1;
        ListeJoueurs[1] = J2;
        timer = unTimer;
        timerJ1 = unTimer;
        timerJ2 = unTimer;
        
        initComponents();
        
        
        ActionListener tache_recurJ1 = new ActionListener() {
            int timeJ1 = timerJ1;
            
            @Override
            public void actionPerformed(ActionEvent e1) {
                
                if (timeJ1 == 0) {
                    ChronoJ1.stop();
                    changerJoueurCourant();
                    if (joueurCourant.prenom == "Jonathan") {
                        VictoireJonathan fenetre = new VictoireJonathan();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Joseph") {
                        VictoireJoseph fenetre = new VictoireJoseph();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Jotaro") {
                        VictoireJotaro fenetre = new VictoireJotaro();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Josuke") {
                        VictoireJosuke fenetre = new VictoireJosuke();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Giorno") {
                        VictoireGiorno fenetre = new VictoireGiorno();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Jolyne") {
                        VictoireJolyne fenetre = new VictoireJolyne();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Kars") {
                        VictoireKars fenetre = new VictoireKars();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Dio") {
                        VictoireDio fenetre = new VictoireDio();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Yoshikage") {
                        VictoireKira fenetre = new VictoireKira();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Diavolo") {
                        VictoireDiavolo fenetre = new VictoireDiavolo();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Enrico") {
                        VictoirePucci fenetre = new VictoirePucci();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Cesear") {
                        VictoireCesear fenetre = new VictoireCesear();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Jean-Pierre") {
                        VictoirePolnareff fenetre = new VictoirePolnareff();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Koichi") {
                        VictoireKoichi fenetre = new VictoireKoichi();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Bruno") {
                        VictoireBucciarati fenetre = new VictoireBucciarati();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Ermes") {
                        VictoireErmes fenetre = new VictoireErmes();
                        fenetre.setVisible(true);
                    }
                    FenetreDeJeu.super.dispose();
                }
                
                else{
                    timeJ1 --;
                    LabelTimeJ1.setText(timeJ1 + "");
                }
                
            }
        ;};
        
        ActionListener tache_recurJ2 = new ActionListener() {
            int timeJ2 = timerJ2;
            
            @Override
            public void actionPerformed(ActionEvent e1) {
                
                if (timeJ2 == 0) {
                    ChronoJ2.stop();
                    changerJoueurCourant();
                    if (joueurCourant.prenom == "Jonathan") {
                        VictoireJonathan fenetre = new VictoireJonathan();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Joseph") {
                        VictoireJoseph fenetre = new VictoireJoseph();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Jotaro") {
                        VictoireJotaro fenetre = new VictoireJotaro();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Josuke") {
                        VictoireJosuke fenetre = new VictoireJosuke();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Giorno") {
                        VictoireGiorno fenetre = new VictoireGiorno();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Jolyne") {
                        VictoireJolyne fenetre = new VictoireJolyne();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Kars") {
                        VictoireKars fenetre = new VictoireKars();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Dio") {
                        VictoireDio fenetre = new VictoireDio();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Yoshikage") {
                        VictoireKira fenetre = new VictoireKira();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Diavolo") {
                        VictoireDiavolo fenetre = new VictoireDiavolo();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Enrico") {
                        VictoirePucci fenetre = new VictoirePucci();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Cesear") {
                        VictoireCesear fenetre = new VictoireCesear();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Jean-Pierre") {
                        VictoirePolnareff fenetre = new VictoirePolnareff();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Koichi") {
                        VictoireKoichi fenetre = new VictoireKoichi();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Bruno") {
                        VictoireBucciarati fenetre = new VictoireBucciarati();
                        fenetre.setVisible(true);
                    }
                    if (joueurCourant.prenom == "Ermes") {
                        VictoireErmes fenetre = new VictoireErmes();
                        fenetre.setVisible(true);
                    }
                    FenetreDeJeu.super.dispose();
                }
                
                else{
                    timeJ2 --;
                    LabelTimeJ2.setText(timeJ2 + "");
                }
                
            }
        ;};
       
        if (timer != 999) {
            ChronoJ1 = new Timer(1000, tache_recurJ1);
            ChronoJ2 = new Timer(1000, tache_recurJ2);
        }
        

        

        
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
                        nettoyerPlateau();
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
                                Panel_PlateauDeJeu.repaint();

                                
                                if (joueurCourant.prenom == "Jonathan" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp1 = new javax.swing.ImageIcon(getClass().getResource("/images/Jonathan.png"));
                                    Icontmp = Icontmp1;
                                    x = 20;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Joseph" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp2 = new javax.swing.ImageIcon(getClass().getResource("/images/Joseph.png"));
                                    Icontmp = Icontmp2;
                                    x = 25;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Jotaro" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp3 = new javax.swing.ImageIcon(getClass().getResource("/images/Jotaro.png"));
                                    Icontmp = Icontmp3;
                                    x = 30;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Josuke" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp4 = new javax.swing.ImageIcon(getClass().getResource("/images/Josuke.png"));
                                    Icontmp = Icontmp4;
                                    x = 30;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Giorno" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp5 = new javax.swing.ImageIcon(getClass().getResource("/images/Giorno.png"));
                                    Icontmp = Icontmp5;
                                    x = 13;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Jolyne" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp6 = new javax.swing.ImageIcon(getClass().getResource("/images/Jolyne.png"));
                                    Icontmp = Icontmp6;
                                    x = 18;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Kars" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp7 = new javax.swing.ImageIcon(getClass().getResource("/images/Kars.png"));
                                    Icontmp = Icontmp7;
                                    x = 17;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Dio" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp8 = new javax.swing.ImageIcon(getClass().getResource("/images/Dio.png"));
                                    Icontmp = Icontmp8;
                                    x = 25;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Yoshikage" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp9 = new javax.swing.ImageIcon(getClass().getResource("/images/Kira.png"));
                                    Icontmp = Icontmp9;
                                    x = 20;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Diavolo" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp10 = new javax.swing.ImageIcon(getClass().getResource("/images/Diavolo.png"));
                                    Icontmp = Icontmp10;
                                    x = 25;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Enrico" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp11 = new javax.swing.ImageIcon(getClass().getResource("/images/Pucci.png"));
                                    Icontmp = Icontmp11;
                                    x = 35;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Cesear" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp12 = new javax.swing.ImageIcon(getClass().getResource("/images/Cesear.png"));
                                    Icontmp = Icontmp12;
                                    x = 20;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Jean-Pierre" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp13 = new javax.swing.ImageIcon(getClass().getResource("/images/Polnareff.png"));
                                    Icontmp = Icontmp13;
                                    x = 47;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Koichi" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp14 = new javax.swing.ImageIcon(getClass().getResource("/images/Koichi.png"));
                                    Icontmp = Icontmp14;
                                    x = 32;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Bruno" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp15 = new javax.swing.ImageIcon(getClass().getResource("/images/Bucciarati.png"));
                                    Icontmp = Icontmp15;
                                    x = 31;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Ermes" && piontmp.etreLeRoi() == true) {
                                    ImageIcon Icontmp16 = new javax.swing.ImageIcon(getClass().getResource("/images/Ermes.png"));
                                    Icontmp = Icontmp16;
                                    x = 32;
                                    y = 6;
                                }
                                
                                else if (joueurCourant.prenom == "Jonathan" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp17 = new javax.swing.ImageIcon(getClass().getResource("/images/Punch.png"));
                                    Icontmp = Icontmp17;
                                    x = 25;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Joseph" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp18 = new javax.swing.ImageIcon(getClass().getResource("/images/HermitPurple.png"));
                                    Icontmp = Icontmp18;
                                    x = 25;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Jotaro" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp19 = new javax.swing.ImageIcon(getClass().getResource("/images/StarPlatinium.png"));
                                    Icontmp = Icontmp19;
                                    x = 20;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Josuke" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp20 = new javax.swing.ImageIcon(getClass().getResource("/images/CrazyDiamond.png"));
                                    Icontmp = Icontmp20;
                                    x = 35;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Giorno" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp21 = new javax.swing.ImageIcon(getClass().getResource("/images/GoldExperience.png"));
                                    Icontmp = Icontmp21;
                                    x = 27;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Jolyne" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp22 = new javax.swing.ImageIcon(getClass().getResource("/images/StoneFree.png"));
                                    Icontmp = Icontmp22;
                                    x = 35;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Kars" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp23 = new javax.swing.ImageIcon(getClass().getResource("/images/PierreAja.png"));
                                    Icontmp = Icontmp23;
                                    x = 30;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Dio" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp24 = new javax.swing.ImageIcon(getClass().getResource("/images/TheWorld.png"));
                                    Icontmp = Icontmp24;
                                    x = 33;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Yoshikage" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp25 = new javax.swing.ImageIcon(getClass().getResource("/images/KillerQueen.png"));
                                    Icontmp = Icontmp25;
                                    x = 42;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Diavolo" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp26 = new javax.swing.ImageIcon(getClass().getResource("/images/KingCrimson.png"));
                                    Icontmp = Icontmp26;
                                    x = 37;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Enrico" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp27 = new javax.swing.ImageIcon(getClass().getResource("/images/WhiteSnake.png"));
                                    Icontmp = Icontmp27;
                                    x = 40;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Cesear" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp28 = new javax.swing.ImageIcon(getClass().getResource("/images/SavonLauncher.png"));
                                    Icontmp = Icontmp28;
                                    x = 20;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Jean-Pierre" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp29 = new javax.swing.ImageIcon(getClass().getResource("/images/SilverChariot.png"));
                                    Icontmp = Icontmp29;
                                    x = 35;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Koichi" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp30 = new javax.swing.ImageIcon(getClass().getResource("/images/Echoes.png"));
                                    Icontmp = Icontmp30;
                                    x = 25;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Bruno" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp31 = new javax.swing.ImageIcon(getClass().getResource("/images/StickyFingers.png"));
                                    Icontmp = Icontmp31;
                                    x = 42;
                                    y = 6;
                                }
                                else if (joueurCourant.prenom == "Ermes" && piontmp.etreLeRoi() != true) {
                                    ImageIcon Icontmp32 = new javax.swing.ImageIcon(getClass().getResource("/images/Kiss.png"));
                                    Icontmp = Icontmp32;
                                    x = 37;
                                    y = 6;
                                }
                                
                                if (Xtmp == 0) {
                                    Y = 756;
                                }
                                if (Xtmp == 1) {
                                    Y = 592;
                                }
                                if (Xtmp == 2) {
                                    Y = 428;
                                }
                                if (Xtmp == 3) {
                                    Y = 264;
                                }
                                if (Xtmp == 4) {
                                    Y = 100;
                                }
                                
                                if (Ytmp == 0) {
                                    X = 500;
                                }
                                if (Ytmp == 1) {
                                    X = 664;
                                }
                                if (Ytmp == 2) {
                                    X = 828;
                                }
                                if (Ytmp == 3) {
                                    X = 992;
                                }
                                if (Ytmp == 4) {
                                    X = 1156;
                                }
                                
                                Xi = x + X;
                                Yi = y + Y;
                                
                                if (caseGraph.X == 0) {
                                    Y2 = 756;
                                }
                                if (caseGraph.X == 1) {
                                    Y2 = 592;
                                }
                                if (caseGraph.X == 2) {
                                    Y2 = 428;
                                }
                                if (caseGraph.X == 3) {
                                    Y2 = 264;
                                }
                                if (caseGraph.X == 4) {
                                    Y2 = 100;
                                }
                                
                                if (caseGraph.Y == 0) {
                                    X2 = 500;
                                }
                                if (caseGraph.Y == 1) {
                                    X2 = 664;
                                }
                                if (caseGraph.Y == 2) {
                                    X2 = 828;
                                }
                                if (caseGraph.Y == 3) {
                                    X2 = 992;
                                }
                                if (caseGraph.Y == 4) {
                                    X2 = 1156;
                                }
                                
                                Xf = x + X2;
                                Yf = y + Y2;
                                
                                
                                labeltmp = new javax.swing.JLabel();
                                labeltmp.setIcon(Icontmp);
                                labeltmp.setBounds(Xi, Yi, 150, 150);
                                

                                getContentPane().add(labeltmp);
                                getContentPane().setComponentZOrder(labeltmp, 0);
                                Kensoft animate = new Kensoft();
                                
                                if (Xf > Xi && Yf > Yi) {
                                    animate.jLabelXRight(Xi, Xf, 1, 1, labeltmp);
                                    animate.jLabelYDown(Yi, Yf, 1, 1, labeltmp);
                                }
                                
                                if (Xf < Xi && Yf > Yi) {
                                    animate.jLabelXLeft(Xi, Xf, 1, 1, labeltmp);
                                    animate.jLabelYDown(Yi, Yf, 1, 1, labeltmp);
                                }
                                
                                if (Xf < Xi && Yf < Yi) {
                                    animate.jLabelXLeft(Xi, Xf, 1, 1, labeltmp);
                                    animate.jLabelYUp(Yi, Yf, 1, 1, labeltmp);
                                }
                                
                                if (Xf > Xi && Yf < Yi) {
                                    animate.jLabelXRight(Xi, Xf, 1, 1, labeltmp);
                                    animate.jLabelYUp(Yi, Yf, 1, 1, labeltmp);
                                }
                                
                                if (Xf == Xi && Yf > Yi) {
                                    animate.jLabelYDown(Yi, Yf, 1, 1, labeltmp);
                                }
                                
                                if (Xf == Xi && Yf < Yi) {
                                    animate.jLabelYUp(Yi, Yf, 1, 1, labeltmp);
                                }
                                
                                if (Xf > Xi && Yf == Yi) {
                                    animate.jLabelXRight(Xi, Xf, 1, 1, labeltmp);
                                }
                                
                                if (Xf < Xi && Yf == Yi) {
                                    animate.jLabelXLeft(Xi, Xf, 1, 1, labeltmp);
                                }


                                c.affecterPion(piontmp);  
                                Xtmp2 = caseGraph.X;
                                Ytmp2 = caseGraph.Y;
                                
                                Panel_PlateauDeJeu.repaint();
                                deplacer = false;
                                Victoire(reverse);
                                changerJoueurCourant();
                                changerCarte(cartetmp);
                                cartetmp = null;
                                PlateauDeJeu.supprimerCibles();
                                PlateauDeJeu.supprimerViser();
                            }
                            //Victoire(reverse);
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
        BoutonMusique = new javax.swing.JButton();
        LabelTimeJ1 = new javax.swing.JLabel();
        LabelTimeJ2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        Bouton_Arreter.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Bouton_Arreter.setText("Arreter la partie");
        Bouton_Arreter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_ArreterActionPerformed(evt);
            }
        });
        getContentPane().add(Bouton_Arreter);
        Bouton_Arreter.setBounds(130, 860, 230, 60);

        Panel_PlateauDeJeu.setBackground(new java.awt.Color(102, 102, 102));
        Panel_PlateauDeJeu.setPreferredSize(new java.awt.Dimension(820, 820));
        Panel_PlateauDeJeu.setLayout(new java.awt.GridLayout(5, 5));
        getContentPane().add(Panel_PlateauDeJeu);
        Panel_PlateauDeJeu.setBounds(500, 100, 820, 820);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Joueur  1:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 100, 118, 29);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Joueur 2:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1420, 100, 112, 29);

        LabelJ1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LabelJ1.setForeground(new java.awt.Color(255, 255, 255));
        LabelJ1.setText("J1");
        getContentPane().add(LabelJ1);
        LabelJ1.setBounds(180, 100, 320, 29);

        LabelJ2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LabelJ2.setForeground(new java.awt.Color(255, 255, 255));
        LabelJ2.setText("J2");
        getContentPane().add(LabelJ2);
        LabelJ2.setBounds(1550, 100, 250, 29);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("A toi de jouer :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(710, 40, 197, 29);

        LabelJC.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LabelJC.setForeground(new java.awt.Color(255, 255, 255));
        LabelJC.setText("JC");
        getContentPane().add(LabelJC);
        LabelJC.setBounds(910, 40, 350, 29);

        Carte1J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carte1J1ActionPerformed(evt);
            }
        });
        getContentPane().add(Carte1J1);
        Carte1J1.setBounds(50, 160, 390, 225);

        Carte2J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carte2J1ActionPerformed(evt);
            }
        });
        getContentPane().add(Carte2J1);
        Carte2J1.setBounds(50, 430, 390, 225);

        Carte1J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carte1J2ActionPerformed(evt);
            }
        });
        getContentPane().add(Carte1J2);
        Carte1J2.setBounds(1390, 160, 390, 225);

        Carte2J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carte2J2ActionPerformed(evt);
            }
        });
        getContentPane().add(Carte2J2);
        Carte2J2.setBounds(1390, 430, 390, 225);

        CartePioche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartePiocheActionPerformed(evt);
            }
        });
        getContentPane().add(CartePioche);
        CartePioche.setBounds(1400, 720, 374, 211);

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
        Bouton_retournerPlateau.setBounds(130, 700, 230, 60);

        BoutonMusique.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BoutonMusique.setText("Musique");
        BoutonMusique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonMusiqueActionPerformed(evt);
            }
        });
        getContentPane().add(BoutonMusique);
        BoutonMusique.setBounds(130, 780, 230, 60);

        LabelTimeJ1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LabelTimeJ1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(LabelTimeJ1);
        LabelTimeJ1.setBounds(440, 100, 50, 40);

        LabelTimeJ2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LabelTimeJ2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(LabelTimeJ2);
        LabelTimeJ2.setBounds(1330, 100, 50, 40);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bouton_ArreterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_ArreterActionPerformed
        // TODO add your handling code here:
        PlayMusic("TimeStop.wav");
        FenetreDeJeu.super.dispose();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(FenetreDeJeu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Bouton_ArreterActionPerformed

    private void Carte1J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carte1J1ActionPerformed
        // TODO add your handling code here:
        nettoyerPlateau();
        if (joueurCourant.avoirEquipe() == 1) {
            cartetmp = carteJ1nb1;
            Carte1J1.setBackground(Color.CYAN);
            Carte2J1.setBackground(Color.WHITE);
            InfoPartie.setText("");
            PlateauDeJeu.supprimerCibles();
            PlateauDeJeu.supprimerViser();
            Panel_PlateauDeJeu.repaint();
            if (timer != 999) {
                ChronoJ1.start();
            }
        }
    }//GEN-LAST:event_Carte1J1ActionPerformed

    private void Carte2J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carte2J1ActionPerformed
        // TODO add your handling code here:
        nettoyerPlateau();
        if (joueurCourant.avoirEquipe() == 1) {
            cartetmp = carteJ1nb2;
            Carte2J1.setBackground(Color.CYAN);
            Carte1J1.setBackground(Color.WHITE);
            InfoPartie.setText("");
            PlateauDeJeu.supprimerCibles();
            PlateauDeJeu.supprimerViser();
            Panel_PlateauDeJeu.repaint();
            if (timer != 999) {
                ChronoJ1.start();
            }
        }
    }//GEN-LAST:event_Carte2J1ActionPerformed

    private void Carte1J2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carte1J2ActionPerformed
        // TODO add your handling code here:
        nettoyerPlateau();
        if (joueurCourant.avoirEquipe() == 2) {
            cartetmp = carteJ2nb1;
            Carte1J2.setBackground(Color.CYAN);
            Carte2J2.setBackground(Color.WHITE);
            InfoPartie.setText("");
            PlateauDeJeu.supprimerCibles();
            PlateauDeJeu.supprimerViser();
            Panel_PlateauDeJeu.repaint();
            if (timer != 999) {
                ChronoJ2.start();
            }
        }
    }//GEN-LAST:event_Carte1J2ActionPerformed

    private void Carte2J2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carte2J2ActionPerformed
        // TODO add your handling code here:
        nettoyerPlateau();
        if (joueurCourant.avoirEquipe() == 2) {
            cartetmp = carteJ2nb2;
            Carte2J2.setBackground(Color.CYAN);
            Carte1J2.setBackground(Color.WHITE);
            InfoPartie.setText("");
            PlateauDeJeu.supprimerCibles();
            PlateauDeJeu.supprimerViser();
            Panel_PlateauDeJeu.repaint();
            if (timer != 999) {
                ChronoJ2.start();
            }
        }
    }//GEN-LAST:event_Carte2J2ActionPerformed

    private void CartePiocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartePiocheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CartePiocheActionPerformed

    private void Bouton_retournerPlateauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_retournerPlateauActionPerformed
        // TODO add your handling code here:
        nettoyerPlateau();
        retournerPlateau(); 
    }//GEN-LAST:event_Bouton_retournerPlateauActionPerformed

    private void BoutonMusiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonMusiqueActionPerformed
        // TODO add your handling code here:
        FenetreMusique musique = new FenetreMusique();
        musique.setVisible(true);
    }//GEN-LAST:event_BoutonMusiqueActionPerformed

    
    public void nettoyerPlateau() {
        if (labeltmp != null) {
            labeltmp.setVisible(false);
        }
        Panel_PlateauDeJeu.repaint();
    }
    
    
    public void Victoire(boolean reverse) {
        if (PlateauDeJeu.plateauGagnantPourEquipe1(reverse) == true) {
            if (joueurCourant.prenom == "Jonathan") {
                VictoireJonathan fenetre = new VictoireJonathan();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Joseph") {
                VictoireJoseph fenetre = new VictoireJoseph();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Jotaro") {
                VictoireJotaro fenetre = new VictoireJotaro();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Josuke") {
                VictoireJosuke fenetre = new VictoireJosuke();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Giorno") {
                VictoireGiorno fenetre = new VictoireGiorno();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Jolyne") {
                VictoireJolyne fenetre = new VictoireJolyne();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Kars") {
                VictoireKars fenetre = new VictoireKars();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Dio") {
                VictoireDio fenetre = new VictoireDio();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Yoshikage") {
                VictoireKira fenetre = new VictoireKira();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Diavolo") {
                VictoireDiavolo fenetre = new VictoireDiavolo();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Enrico") {
                VictoirePucci fenetre = new VictoirePucci();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Cesear") {
                VictoireCesear fenetre = new VictoireCesear();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Jean-Pierre") {
                VictoirePolnareff fenetre = new VictoirePolnareff();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Koichi") {
                VictoireKoichi fenetre = new VictoireKoichi();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Bruno") {
                VictoireBucciarati fenetre = new VictoireBucciarati();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Ermes") {
                VictoireErmes fenetre = new VictoireErmes();
                fenetre.setVisible(true);
            }
            FenetreDeJeu.super.dispose();
        }
        
        if (PlateauDeJeu.plateauGagnantPourEquipe2(reverse) == true) {
            if (joueurCourant.prenom == "Jonathan") {
                VictoireJonathan fenetre = new VictoireJonathan();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Joseph") {
                VictoireJoseph fenetre = new VictoireJoseph();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Jotaro") {
                VictoireJotaro fenetre = new VictoireJotaro();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Josuke") {
                VictoireJosuke fenetre = new VictoireJosuke();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Giorno") {
                VictoireGiorno fenetre = new VictoireGiorno();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Jolyne") {
                VictoireJolyne fenetre = new VictoireJolyne();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Kars") {
                VictoireKars fenetre = new VictoireKars();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Dio") {
                VictoireDio fenetre = new VictoireDio();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Yoshikage") {
                VictoireKira fenetre = new VictoireKira();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Diavolo") {
                VictoireDiavolo fenetre = new VictoireDiavolo();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Enrico") {
                VictoirePucci fenetre = new VictoirePucci();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Cesear") {
                VictoireCesear fenetre = new VictoireCesear();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Jean-Pierre") {
                VictoirePolnareff fenetre = new VictoirePolnareff();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Koichi") {
                VictoireKoichi fenetre = new VictoireKoichi();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Bruno") {
                VictoireBucciarati fenetre = new VictoireBucciarati();
                fenetre.setVisible(true);
            }
            if (joueurCourant.prenom == "Ermes") {
                VictoireErmes fenetre = new VictoireErmes();
                fenetre.setVisible(true);
            }
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
    
    
    public static void PlayMusic(String location) {
        try {
            File musicPath = new File(location);
            if(musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            }
            else {
                System.out.println("Trouve pas le fichier");
            }
        }catch(Exception e) {
            
        }
    }
    
    
    public void changerJoueurCourant() {
        if (joueurCourant == ListeJoueurs[0]) {
            joueurCourant = ListeJoueurs[1];
            if (timer != 999) {
                ChronoJ1.stop();
                ChronoJ2.start();
            }
        }
        else {
            joueurCourant = ListeJoueurs[0];
            if (timer != 999) {
                ChronoJ2.stop();
                ChronoJ1.start();
            }
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
                new FenetreDeJeu(ListeJoueurs[0], ListeJoueurs[1], timer).setVisible(true);
            }
        });
    }

    private javax.swing.JLabel labeltmp;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonMusique;
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
    private javax.swing.JLabel LabelTimeJ1;
    private javax.swing.JLabel LabelTimeJ2;
    private javax.swing.JPanel Panel_PlateauDeJeu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
