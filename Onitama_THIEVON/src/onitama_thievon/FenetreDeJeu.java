/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package onitama_thievon;

import java.awt.Color;



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
    Carte carteStoneFree         = new Carte("Stone Free"      , 0,  1,  -1, 0,  0,  -1, 0,  0);
    Carte carteTheWorld          = new Carte("The World"       , 1,  1,  1,  -1, -1, -1, -1, 1);
    Carte carteKillerQueen       = new Carte("Killer Queen"    , 1,  1,  -1, 1,  0,  -1, 0,  0);
    Carte carteKingCrimson       = new Carte("King Crimson"    , 1,  1,  1,  0,  -1, 1,  -1, 0);
    Carte carteWhiteSnake        = new Carte("White Snake"     , 1,  0,  -1, 1,  -1, -1, 0,  0);
    Carte carteSilverChariot     = new Carte("Silver Chariot"  , 1,  -1, -1, 1,  -2, 0,  0,  0);
    Carte carteEchoesAct3        = new Carte("Echoes Act3"     , 1,  0,  0,  1,  0,  -1, 0,  0);
    Carte carteStickyFingers     = new Carte("Sticky Fingers"  , 1,  1,  2,  0,  -1, -1, 0,  0);
    Carte carteKiss              = new Carte("Kiss"            , 1,  1,  1,  -1, -1, 0,  0,  0);
    Carte carteEpeePluck         = new Carte("Epée pluck"      , 0,  1,  1,  -1, -1, -1, 0,  0);
    Carte carteHermitPurple      = new Carte("Hermit purple"   , 0,  1,  2,  0,  -2, 0,  0,  0);
    Carte carteSavonLauncher     = new Carte("Savon Launcher"  , 0,  -1, 0,  2,  0,  0,  0,  0);
    Carte carteMasquePierre      = new Carte("Masque de pierre", 0,  1,  1,  0,  -1, 0,  0,  0);
    
    Carte[] listeCartes = new Carte[16];
    
  
    
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
                                                
                        if (deplacer == false) {
                            if (c.avoirPion() == true) {
                                if (c.renvoyerPion().renvoyerJoueur() == J1) {
                                    if (cartetmp != null) {
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
                                        piontmp = c.renvoyerPion();
                                        Panel_PlateauDeJeu.repaint();
                                        deplacer = true;
                                        
                                    }
                                    else {
                                        System.out.println("saisissez d'abord une carte");
                                    }
                                    
                                }
                                else if (c.renvoyerPion().renvoyerJoueur() == J2) {
                                    if (cartetmp != null) {
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
                                        piontmp = c.renvoyerPion();
                                        Panel_PlateauDeJeu.repaint();
                                        deplacer = true;
                                        
                                    }
                                    else {
                                        System.out.println("saisissez d'abord une carte");
                                    }
                                }
                                
                            }
                        }
                        else {
                            if (caseGraph.X == (Xtmp + y1) && caseGraph.Y == (Ytmp + x1)) {
                                c.affecterPion(piontmp);
                                PlateauDeJeu.Plateau[Xtmp][Ytmp].supprimerPion();
                                Panel_PlateauDeJeu.repaint();
                                deplacer = false;
                                changerJoueurCourant();
                                changerCarte(cartetmp);
                                cartetmp = null;

                            }
                            if (caseGraph.X == (Xtmp + y2) && caseGraph.Y == (Ytmp + x2)) {
                                c.affecterPion(piontmp);
                                PlateauDeJeu.Plateau[Xtmp][Ytmp].supprimerPion();
                                Panel_PlateauDeJeu.repaint();
                                deplacer = false;
                                changerJoueurCourant();
                                changerCarte(cartetmp);
                                cartetmp = null;

                            }
                            if (caseGraph.X == (Xtmp + y3) && caseGraph.Y == (Ytmp + x3)) {
                                c.affecterPion(piontmp);
                                PlateauDeJeu.Plateau[Xtmp][Ytmp].supprimerPion();
                                Panel_PlateauDeJeu.repaint();
                                deplacer = false;
                                changerJoueurCourant();
                                changerCarte(cartetmp);
                                cartetmp = null;

                            }
                            if (caseGraph.X == (Xtmp + y4) && caseGraph.Y == (Ytmp + x4)) {
                                c.affecterPion(piontmp);
                                PlateauDeJeu.Plateau[Xtmp][Ytmp].supprimerPion();
                                Panel_PlateauDeJeu.repaint();
                                deplacer = false;
                                changerJoueurCourant();
                                changerCarte(cartetmp);
                                cartetmp = null;

                            }
                            if (PlateauDeJeu.plateauGagnantPourEquipe1() == true) {
                                FenetreDeJeu.super.dispose();
                            }
                            if (PlateauDeJeu.plateauGagnantPourEquipe2() == true) {
                                FenetreDeJeu.super.dispose();
                            }
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bouton_Arreter.setText("Arreter la partie");
        Bouton_Arreter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_ArreterActionPerformed(evt);
            }
        });
        getContentPane().add(Bouton_Arreter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1700, 1010, -1, -1));

        Panel_PlateauDeJeu.setBackground(new java.awt.Color(102, 102, 102));
        Panel_PlateauDeJeu.setPreferredSize(new java.awt.Dimension(900, 900));
        Panel_PlateauDeJeu.setLayout(new java.awt.GridLayout(5, 5));
        getContentPane().add(Panel_PlateauDeJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setText("Joueur  1:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setText("Joueur 2:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1730, 80, -1, -1));

        LabelJ1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LabelJ1.setText("jLabel3");
        getContentPane().add(LabelJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 140, -1, -1));

        LabelJ2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LabelJ2.setText("jLabel4");
        getContentPane().add(LabelJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1730, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel5.setText("Joueur courant :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 50, -1, -1));

        LabelJC.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LabelJC.setText("jLabel3");
        getContentPane().add(LabelJC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 100, -1, -1));

        Carte1J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carte1J1ActionPerformed(evt);
            }
        });
        getContentPane().add(Carte1J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 190, 435, 250));

        Carte2J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carte2J1ActionPerformed(evt);
            }
        });
        getContentPane().add(Carte2J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 450, 435, 250));

        Carte1J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carte1J2ActionPerformed(evt);
            }
        });
        getContentPane().add(Carte1J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 190, 435, 250));

        Carte2J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carte2J2ActionPerformed(evt);
            }
        });
        getContentPane().add(Carte2J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 450, 435, 250));

        CartePioche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartePiocheActionPerformed(evt);
            }
        });
        getContentPane().add(CartePioche, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 720, 416, 234));

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
            
        }
    }//GEN-LAST:event_Carte1J1ActionPerformed

    private void Carte2J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carte2J1ActionPerformed
        // TODO add your handling code here:
        if (joueurCourant.avoirEquipe() == 1) {
            cartetmp = carteJ1nb2;
            Carte2J1.setBackground(Color.CYAN);
            Carte1J1.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_Carte2J1ActionPerformed

    private void Carte1J2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carte1J2ActionPerformed
        // TODO add your handling code here:
        if (joueurCourant.avoirEquipe() == 2) {
            cartetmp = carteJ2nb1;
            Carte1J2.setBackground(Color.CYAN);
            Carte2J2.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_Carte1J2ActionPerformed

    private void Carte2J2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carte2J2ActionPerformed
        // TODO add your handling code here:
        if (joueurCourant.avoirEquipe() == 2) {
            cartetmp = carteJ2nb2;
            Carte2J2.setBackground(Color.CYAN);
            Carte1J2.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_Carte2J2ActionPerformed

    private void CartePiocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartePiocheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CartePiocheActionPerformed

    
    public void retournerPlateau() {

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
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_SP.JPG")));
        }
        if (carteJ1nb1 == carteCrazyDiamond) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_CD.JPG")));
        }
        if (carteJ1nb1 == carteGoldExperience) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_GE.JPG")));
        }
        if (carteJ1nb1 == carteStoneFree) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_SF.JPG")));
        }
        if (carteJ1nb1 == carteTheWorld) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_TW.JPG")));
        }
        if (carteJ1nb1 == carteKillerQueen) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_KQ.JPG")));
        }
        if (carteJ1nb1 == carteKingCrimson) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_KC.JPG")));
        }
        if (carteJ1nb1 == carteWhiteSnake) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_WS.jpg")));
        }
        if (carteJ1nb1 == carteSilverChariot) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_SC.JPG")));
        }
        if (carteJ1nb1 == carteEchoesAct3) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_A3.JPG")));
        }
        if (carteJ1nb1 == carteStickyFingers) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CarteStF.JPG")));
        }
        if (carteJ1nb1 == carteKiss) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_K.JPG")));
        }
        if (carteJ1nb1 == carteEpeePluck) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_EP.JPG")));
        }
        if (carteJ1nb1 == carteHermitPurple) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_HP.JPG")));
        }
        if (carteJ1nb1 == carteSavonLauncher) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CarteSC.JPG")));
        }
        if (carteJ1nb1 == carteMasquePierre) {
            Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_MP.JPG")));
        }
        
        
        
        if (carteJ1nb2 == carteStarPlatinium) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_SP.JPG")));
        }
        if (carteJ1nb2 == carteCrazyDiamond) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_CD.JPG")));
        }
        if (carteJ1nb2 == carteGoldExperience) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_GE.JPG")));
        }
        if (carteJ1nb2 == carteStoneFree) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_SF.JPG")));
        }
        if (carteJ1nb2 == carteTheWorld) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_TW.JPG")));
        }
        if (carteJ1nb2 == carteKillerQueen) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_KQ.JPG")));
        }
        if (carteJ1nb2 == carteKingCrimson) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_KC.JPG")));
        }
        if (carteJ1nb2 == carteWhiteSnake) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_WS.jpg")));
        }
        if (carteJ1nb2 == carteSilverChariot) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_SC.JPG")));
        }
        if (carteJ1nb2 == carteEchoesAct3) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_A3.JPG")));
        }
        if (carteJ1nb2 == carteStickyFingers) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CarteStF.JPG")));
        }
        if (carteJ1nb2 == carteKiss) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_K.JPG")));
        }
        if (carteJ1nb2 == carteEpeePluck) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_EP.JPG")));
        }
        if (carteJ1nb2 == carteHermitPurple) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_HP.JPG")));
        }
        if (carteJ1nb2 == carteSavonLauncher) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CarteSC.JPG")));
        }
        if (carteJ1nb2 == carteMasquePierre) {
            Carte2J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_MP.JPG")));
        }
        
        
        
        if (carteJ2nb1 == carteStarPlatinium) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_SP.JPG")));
        }
        if (carteJ2nb1 == carteCrazyDiamond) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_CD.JPG")));
        }
        if (carteJ2nb1 == carteGoldExperience) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_GE.JPG")));
        }
        if (carteJ2nb1 == carteStoneFree) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_SF.JPG")));
        }
        if (carteJ2nb1 == carteTheWorld) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_TW.JPG")));
        }
        if (carteJ2nb1 == carteKillerQueen) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_KQ.JPG")));
        }
        if (carteJ2nb1 == carteKingCrimson) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_KC.JPG")));
        }
        if (carteJ2nb1 == carteWhiteSnake) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_WS.jpg")));
        }
        if (carteJ2nb1 == carteSilverChariot) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_SC.JPG")));
        }
        if (carteJ2nb1 == carteEchoesAct3) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_A3.JPG")));
        }
        if (carteJ2nb1 == carteStickyFingers) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CarteStF.JPG")));
        }
        if (carteJ2nb1 == carteKiss) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_K.JPG")));
        }
        if (carteJ2nb1 == carteEpeePluck) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_EP.JPG")));
        }
        if (carteJ2nb1 == carteHermitPurple) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_HP.JPG")));
        }
        if (carteJ2nb1 == carteSavonLauncher) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CarteSC.JPG")));
        }
        if (carteJ2nb1 == carteMasquePierre) {
            Carte1J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_MP.JPG")));
        }
        
        
        
        if (carteJ2nb2 == carteStarPlatinium) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_SP.JPG")));
        }
        if (carteJ2nb2 == carteCrazyDiamond) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_CD.JPG")));
        }
        if (carteJ2nb2 == carteGoldExperience) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_GE.JPG")));
        }
        if (carteJ2nb2 == carteStoneFree) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_SF.JPG")));
        }
        if (carteJ2nb2 == carteTheWorld) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_TW.JPG")));
        }
        if (carteJ2nb2 == carteKillerQueen) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_KQ.JPG")));
        }
        if (carteJ2nb2 == carteKingCrimson) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_KC.JPG")));
        }
        if (carteJ2nb2 == carteWhiteSnake) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_WS.jpg")));
        }
        if (carteJ2nb2 == carteSilverChariot) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_SC.JPG")));
        }
        if (carteJ2nb2 == carteEchoesAct3) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_A3.JPG")));
        }
        if (carteJ2nb2 == carteStickyFingers) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CarteStF.JPG")));
        }
        if (carteJ2nb2 == carteKiss) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_K.JPG")));
        }
        if (carteJ2nb2 == carteEpeePluck) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_EP.JPG")));
        }
        if (carteJ2nb2 == carteHermitPurple) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_HP.JPG")));
        }
        if (carteJ2nb2 == carteSavonLauncher) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CarteSC.JPG")));
        }
        if (carteJ2nb2 == carteMasquePierre) {
            Carte2J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_MP.JPG")));
        }
        
        
        
        if (carteFlottante == carteStarPlatinium) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_SP.JPG")));
        }
        if (carteFlottante == carteCrazyDiamond) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_CD.JPG")));
        }
        if (carteFlottante == carteGoldExperience) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_GE.JPG")));
        }
        if (carteFlottante == carteStoneFree) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_SF.JPG")));
        }
        if (carteFlottante == carteTheWorld) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_TW.JPG")));
        }
        if (carteFlottante == carteKillerQueen) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_KQ.JPG")));
        }
        if (carteFlottante == carteKingCrimson) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_KC.JPG")));
        }
        if (carteFlottante == carteWhiteSnake) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_WS.jpg")));
        }
        if (carteFlottante == carteSilverChariot) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_SC.JPG")));
        }
        if (carteFlottante == carteEchoesAct3) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_A3.JPG")));
        }
        if (carteFlottante == carteStickyFingers) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CarteStF.JPG")));
        }
        if (carteFlottante == carteKiss) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_K.JPG")));
        }
        if (carteFlottante == carteEpeePluck) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_EP.JPG")));
        }
        if (carteFlottante == carteHermitPurple) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_HP.JPG")));
        }
        if (carteFlottante == carteSavonLauncher) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CarteSC.JPG")));
        }
        if (carteFlottante == carteMasquePierre) {
            CartePioche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Carte_MP.JPG")));
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bouton_Arreter;
    private javax.swing.JButton Carte1J1;
    private javax.swing.JButton Carte1J2;
    private javax.swing.JButton Carte2J1;
    private javax.swing.JButton Carte2J2;
    private javax.swing.JButton CartePioche;
    private javax.swing.JLabel LabelJ1;
    private javax.swing.JLabel LabelJ2;
    private javax.swing.JLabel LabelJC;
    private javax.swing.JPanel Panel_PlateauDeJeu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
