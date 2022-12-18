/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onitama_thievon;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.ImageIcon;

/**
 *
 * @author thiev
 */
public class CaseGraphique extends JButton{
    
    int X;
    int Y;
    
    CaseDePlateau caseAssociee;
    ImageIcon Case           = new javax.swing.ImageIcon(getClass().getResource("/images/Casev2.JPG"));
    ImageIcon Temple         = new javax.swing.ImageIcon(getClass().getResource("/images/Templev2.JPG"));
    

    
    public CaseGraphique(CaseDePlateau uneCase, int px, int py){
        
        X = px;
        Y = py;
        
        caseAssociee = uneCase;
    }
    
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        
        if (caseAssociee.avoirTemple() == true) {
            setIcon(Temple);
        }
        
        if (caseAssociee.avoirTemple() == false) {
            setIcon(Case);
        }
        
        if (caseAssociee.avoirPion() == true) {
        
            if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Jonathan") {
                if (caseAssociee.renvoyerPion().etreLeRoi() == true) {
                    try {
                    Image img = ImageIO.read(new File("Jonathan.png"));
                    G.drawImage(img, 20, 6, this);
                    }catch(Exception e){ 
                    }
                }
                else {
                    try {
                    Image img = ImageIO.read(new File("Punch.png"));
                    G.drawImage(img, 25, 6, this);
                    }catch(Exception e){ 
                    }
                }
            }
            
            if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Joseph") {
                if (caseAssociee.renvoyerPion().etreLeRoi() == true) {
                    try {
                    Image img = ImageIO.read(new File("Joseph.png"));
                    G.drawImage(img, 25, 6, this);
                    }catch(Exception e){ 
                    }
                }
                else {
                    try {
                    Image img = ImageIO.read(new File("HermitPurple.png"));
                    G.drawImage(img, 25, 6, this);
                    }catch(Exception e){ 
                    }
                }
            }
            if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Jotaro") {
                if (caseAssociee.renvoyerPion().etreLeRoi() == true) {
                    try {
                    Image img = ImageIO.read(new File("Jotaro.png"));
                    G.drawImage(img, 30, 6, this);
                    }catch(Exception e){ 
                    }
                }
                else {
                    try {
                    Image img = ImageIO.read(new File("StarPlatinium.png"));
                    G.drawImage(img, 20, 6, this);
                    }catch(Exception e){ 
                    }
                }
            }
            if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Josuke") {
                if (caseAssociee.renvoyerPion().etreLeRoi() == true) {
                    try {
                    Image img = ImageIO.read(new File("Josuke.png"));
                    G.drawImage(img, 30, 6, this);
                    }catch(Exception e){ 
                    }
                }
                else {
                    try {
                    Image img = ImageIO.read(new File("CrazyDiamond.png"));
                    G.drawImage(img, 35, 6, this);
                    }catch(Exception e){ 
                    }
                }
            }
            if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Giorno") {
                if (caseAssociee.renvoyerPion().etreLeRoi() == true) {
                    try {
                    Image img = ImageIO.read(new File("Giorno.png"));
                    G.drawImage(img, 13, 6, this);
                    }catch(Exception e){ 
                    }
                }
                else {
                    try {
                    Image img = ImageIO.read(new File("GoldExperience.png"));
                    G.drawImage(img, 27, 6, this);
                    }catch(Exception e){ 
                    }
                }
            }
            if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Jolyne") {
                if (caseAssociee.renvoyerPion().etreLeRoi() == true) {
                    try {
                    Image img = ImageIO.read(new File("Jolyne.png"));
                    G.drawImage(img, 18, 6, this);
                    }catch(Exception e){ 
                    }
                }
                else {
                    try {
                    Image img = ImageIO.read(new File("StoneFree.png"));
                    G.drawImage(img, 35, 6, this);
                    }catch(Exception e){ 
                    }
                }
            }
            if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Kars") {
                if (caseAssociee.renvoyerPion().etreLeRoi() == true) {
                    try {
                    Image img = ImageIO.read(new File("Kars.png"));
                    G.drawImage(img, 17, 6, this);
                    }catch(Exception e){ 
                    }
                }
                else {
                    try {
                    Image img = ImageIO.read(new File("PierreAja.png"));
                    G.drawImage(img, 30, 6, this);
                    }catch(Exception e){ 
                    }
                }
            }
            if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Dio") {
                if (caseAssociee.renvoyerPion().etreLeRoi() == true) {
                    try {
                    Image img = ImageIO.read(new File("Dio.png"));
                    G.drawImage(img, 25, 6, this);
                    }catch(Exception e){ 
                    }
                }
                else {
                    try {
                    Image img = ImageIO.read(new File("TheWorld.png"));
                    G.drawImage(img, 33, 6, this);
                    }catch(Exception e){ 
                    }
                }
            }
            if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Yoshikage") {
                if (caseAssociee.renvoyerPion().etreLeRoi() == true) {
                    try {
                    Image img = ImageIO.read(new File("Kira.png"));
                    G.drawImage(img, 20, 6, this);
                    }catch(Exception e){ 
                    }
                }
                else {
                    try {
                    Image img = ImageIO.read(new File("KillerQueen.png"));
                    G.drawImage(img, 42, 6, this);
                    }catch(Exception e){ 
                    }
                }
            }
            if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Diavolo") {
                if (caseAssociee.renvoyerPion().etreLeRoi() == true) {
                    try {
                    Image img = ImageIO.read(new File("Diavolo.png"));
                    G.drawImage(img, 25, 6, this);
                    }catch(Exception e){ 
                    }
                }
                else {
                    try {
                    Image img = ImageIO.read(new File("KingCrimson.png"));
                    G.drawImage(img, 37, 6, this);
                    }catch(Exception e){ 
                    }
                }
            }
            if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Enrico") {
                if (caseAssociee.renvoyerPion().etreLeRoi() == true) {
                    try {
                    Image img = ImageIO.read(new File("Pucci.png"));
                    G.drawImage(img, 35, 6, this);
                    }catch(Exception e){ 
                    }
                }
                else {
                    try {
                    Image img = ImageIO.read(new File("WhiteSnake.png"));
                    G.drawImage(img, 40, 6, this);
                    }catch(Exception e){ 
                    }
                }
            }
            if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Cesear") {
                if (caseAssociee.renvoyerPion().etreLeRoi() == true) {
                    try {
                    Image img = ImageIO.read(new File("Cesear.png"));
                    G.drawImage(img, 20, 6, this);
                    }catch(Exception e){ 
                    }
                }
                else {
                    try {
                    Image img = ImageIO.read(new File("SavonLauncher.png"));
                    G.drawImage(img, 20, 6, this);
                    }catch(Exception e){ 
                    }
                }
            }
            if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Jean-Pierre") {
                if (caseAssociee.renvoyerPion().etreLeRoi() == true) {
                    try {
                    Image img = ImageIO.read(new File("Polnareff.png"));
                    G.drawImage(img, 47, 6, this);
                    }catch(Exception e){ 
                    }
                }
                else {
                    try {
                    Image img = ImageIO.read(new File("SilverChariot.png"));
                    G.drawImage(img, 35, 6, this);
                    }catch(Exception e){ 
                    }
                }
            }
            if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Koichi") {
                if (caseAssociee.renvoyerPion().etreLeRoi() == true) {
                    try {
                    Image img = ImageIO.read(new File("Koichi.png"));
                    G.drawImage(img, 32, 6, this);
                    }catch(Exception e){ 
                    }
                }
                else {
                    try {
                    Image img = ImageIO.read(new File("Echoes.png"));
                    G.drawImage(img, 25, 6, this);
                    }catch(Exception e){ 
                    }
                }
            }
            if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Bruno") {
                if (caseAssociee.renvoyerPion().etreLeRoi() == true) {
                    try {
                    Image img = ImageIO.read(new File("Bucciarati.png"));
                    G.drawImage(img, 31, 6, this);
                    }catch(Exception e){ 
                    }
                }
                else {
                    try {
                    Image img = ImageIO.read(new File("StickyFingers.png"));
                    G.drawImage(img, 42, 6, this);
                    }catch(Exception e){ 
                    }
                }
            }
            if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Ermes") {
                if (caseAssociee.renvoyerPion().etreLeRoi() == true) {
                    try {
                    Image img = ImageIO.read(new File("Ermes.png"));
                    G.drawImage(img, 32, 6, this);
                    }catch(Exception e){ 
                    }
                }
                else {
                    try {
                    Image img = ImageIO.read(new File("Kiss.png"));
                    G.drawImage(img, 37, 6, this);
                    }catch(Exception e){ 
                    }
                }
            }

        }

        
        if (caseAssociee.cible == true) {
            try {
                Image img = ImageIO.read(new File("Cercle_Bleu.png"));
                G.drawImage(img, 8, 8, this);
            }catch(Exception e){ 
            }
        }
        
        if (caseAssociee.viser == true) {
            try {
                Image img = ImageIO.read(new File("Cible_bug.png"));
                G.drawImage(img, 10, 10, this);
            }catch(Exception e){ 
            }
        }
    }
    
    
}
