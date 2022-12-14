/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package onitama_thievon;

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
    Pion p = null;
            
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
        

        carteJ1nb1 = listeCartes[12];
        carteJ1nb2 = listeCartes[rdm2];
        carteJ2nb1 = listeCartes[rdm3];
        carteJ2nb2 = listeCartes[rdm4];
        carteFlottante = listeCartes[rdm5];
        
        /*
        ImageIcon Carte_EP  = new javax.swing.ImageIcon(getClass().getResource("/images/Carte_EP.JPG"));
        ImageIcon Carte_HP  = new javax.swing.ImageIcon(getClass().getResource("/images/Carte_HP.JPG"));
        ImageIcon Carte_SL  = new javax.swing.ImageIcon(getClass().getResource("/images/CarteSC.JPG"));
        ImageIcon Carte_SP  = new javax.swing.ImageIcon(getClass().getResource("/images/Carte_SP.JPG"));
        ImageIcon Carte_SC  = new javax.swing.ImageIcon(getClass().getResource("/images/Carte_SC.JPG"));
        ImageIcon Carte_CD  = new javax.swing.ImageIcon(getClass().getResource("/images/Carte_CD.JPG"));
        ImageIcon Carte_A3  = new javax.swing.ImageIcon(getClass().getResource("/images/Carte_A3.JPG"));
        ImageIcon Carte_GE  = new javax.swing.ImageIcon(getClass().getResource("/images/Carte_GE.JPG"));
        ImageIcon Carte_StF = new javax.swing.ImageIcon(getClass().getResource("/images/Carte_StF.JPG"));
        ImageIcon Carte_SF  = new javax.swing.ImageIcon(getClass().getResource("/images/Carte_SF.JPG"));
        ImageIcon Carte_K   = new javax.swing.ImageIcon(getClass().getResource("/images/Carte_K.JPG"));
        ImageIcon Carte_MP  = new javax.swing.ImageIcon(getClass().getResource("/images/Carte_MP.JPG"));
        ImageIcon Carte_TW  = new javax.swing.ImageIcon(getClass().getResource("/images/Carte_TW.JPG"));
        ImageIcon Carte_KQ  = new javax.swing.ImageIcon(getClass().getResource("/images/Carte_KQ.JPG"));
        ImageIcon Carte_KC  = new javax.swing.ImageIcon(getClass().getResource("/images/Carte_KC.JPG"));
        ImageIcon Carte_WS  = new javax.swing.ImageIcon(getClass().getResource("/images/Carte_WS.jpg"));
        */

        
       
        
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
                        if (c.avoirPion() == true){
                            if (p == null) {
                                if (joueurCourant.avoirEquipe() == c.renvoyerPion().avoirEquipe()) {
                                    p = c.renvoyerEtSupprimerPion();
                                    Panel_PlateauDeJeu.repaint();
                                }
                            }
                            else if (p != null) {
                                if (joueurCourant.avoirEquipe() != c.renvoyerPion().avoirEquipe()) {
                                    c.supprimerPion();
                                    c.affecterPion(p);
                                    p = null;
                                    Panel_PlateauDeJeu.repaint();
                                    changerJoueurCourant();
                                    if (PlateauDeJeu.plateauGagnantPourEquipe1() == true) {
                                        System.out.println("Victoire J1");
                                        FenetreDeJeu.super.dispose();
                                    }
                                    if (PlateauDeJeu.plateauGagnantPourEquipe2() == true) {
                                        System.out.println("Victoire J2");
                                        FenetreDeJeu.super.dispose();
                                    }
                                }
                            }
                        }
                        else {
                            if (p != null) {
                                c.affecterPion(p);
                                p = null;
                                Panel_PlateauDeJeu.repaint();
                                changerJoueurCourant();
                                if (PlateauDeJeu.plateauGagnantPourEquipe1() == true) {
                                    System.out.println("Victoire J1");
                                    FenetreDeJeu.super.dispose();
                                }
                                if (PlateauDeJeu.plateauGagnantPourEquipe2() == true) {
                                    System.out.println("Victoire J2");
                                    FenetreDeJeu.super.dispose();
                                }
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
        Carte1J1 = new javax.swing.JLabel();
        Carte2J1 = new javax.swing.JLabel();
        Carte1J2 = new javax.swing.JLabel();
        Carte2J2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bouton_Arreter.setText("Arreter la partie");
        Bouton_Arreter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_ArreterActionPerformed(evt);
            }
        });
        getContentPane().add(Bouton_Arreter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1680, 820, -1, -1));

        Panel_PlateauDeJeu.setBackground(new java.awt.Color(102, 102, 102));
        Panel_PlateauDeJeu.setPreferredSize(new java.awt.Dimension(900, 900));
        Panel_PlateauDeJeu.setLayout(new java.awt.GridLayout(5, 5));
        getContentPane().add(Panel_PlateauDeJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setText("Joueur  1:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setText("Joueur 2:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        LabelJ1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LabelJ1.setText("jLabel3");
        getContentPane().add(LabelJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        LabelJ2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LabelJ2.setText("jLabel4");
        getContentPane().add(LabelJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel5.setText("Joueur courant :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        LabelJC.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LabelJC.setText("jLabel3");
        getContentPane().add(LabelJC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        Carte1J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CarteStF.JPG"))); // NOI18N
        getContentPane().add(Carte1J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));
        getContentPane().add(Carte2J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 690, -1, -1));
        getContentPane().add(Carte1J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 220, -1, -1));
        getContentPane().add(Carte2J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 550, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bouton_ArreterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_ArreterActionPerformed
        // TODO add your handling code here:
        FenetreDeJeu.super.dispose();
    }//GEN-LAST:event_Bouton_ArreterActionPerformed

    
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
    private javax.swing.JLabel Carte1J1;
    private javax.swing.JLabel Carte1J2;
    private javax.swing.JLabel Carte2J1;
    private javax.swing.JLabel Carte2J2;
    private javax.swing.JLabel LabelJ1;
    private javax.swing.JLabel LabelJ2;
    private javax.swing.JLabel LabelJC;
    private javax.swing.JPanel Panel_PlateauDeJeu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
