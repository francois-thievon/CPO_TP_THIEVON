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
    ImageIcon Case_vide           = new javax.swing.ImageIcon(getClass().getResource("/images/Case.png"));
    ImageIcon Temple_vide         = new javax.swing.ImageIcon(getClass().getResource("/images/Temple.png"));
    ImageIcon CaseJonathan        = new javax.swing.ImageIcon(getClass().getResource("/images/CaseJonathan.jpg"));
    ImageIcon CaseRoiJonathan     = new javax.swing.ImageIcon(getClass().getResource("/images/CaseRoiJonathan.jpg"));
    ImageIcon TempleJonathan      = new javax.swing.ImageIcon(getClass().getResource("/images/TempleJonathan.jpg"));
    ImageIcon TempleRoiJonathan   = new javax.swing.ImageIcon(getClass().getResource("/images/TempleRoiJonathan.jpg"));
    ImageIcon CaseJoseph          = new javax.swing.ImageIcon(getClass().getResource("/images/CaseJoseph.jpg"));
    ImageIcon CaseRoiJoseph       = new javax.swing.ImageIcon(getClass().getResource("/images/CaseRoiJoseph.jpg"));
    ImageIcon TempleJoseph        = new javax.swing.ImageIcon(getClass().getResource("/images/TempleJoseph.jpg"));
    ImageIcon TempleRoiJoseph     = new javax.swing.ImageIcon(getClass().getResource("/images/TempleRoiJoseph.jpg"));
    ImageIcon CaseJotaro          = new javax.swing.ImageIcon(getClass().getResource("/images/CaseJotaro.jpg"));
    ImageIcon CaseRoiJotaro       = new javax.swing.ImageIcon(getClass().getResource("/images/CaseRoiJotaro.jpg"));
    ImageIcon TempleJotaro        = new javax.swing.ImageIcon(getClass().getResource("/images/TempleJotaro.jpg"));
    ImageIcon TempleRoiJotaro     = new javax.swing.ImageIcon(getClass().getResource("/images/TempleRoiJotaro.jpg"));
    ImageIcon CaseJosuke          = new javax.swing.ImageIcon(getClass().getResource("/images/CaseJosuke.jpg"));
    ImageIcon CaseRoiJosuke       = new javax.swing.ImageIcon(getClass().getResource("/images/CaseRoiJosuke.jpg"));
    ImageIcon TempleJosuke        = new javax.swing.ImageIcon(getClass().getResource("/images/TempleJosuke.jpg"));
    ImageIcon TempleRoiJosuke     = new javax.swing.ImageIcon(getClass().getResource("/images/TempleRoiJosuke.jpg"));
    ImageIcon CaseGiorno          = new javax.swing.ImageIcon(getClass().getResource("/images/CaseGiorno.jpg"));
    ImageIcon CaseRoiGiorno       = new javax.swing.ImageIcon(getClass().getResource("/images/CaseRoiGiorno.jpg"));
    ImageIcon TempleGiorno        = new javax.swing.ImageIcon(getClass().getResource("/images/TempleGiorno.jpg"));
    ImageIcon TempleRoiGiorno     = new javax.swing.ImageIcon(getClass().getResource("/images/TempleRoiGiorno.jpg"));
    ImageIcon CaseJolyne          = new javax.swing.ImageIcon(getClass().getResource("/images/CaseJolyne.jpg"));
    ImageIcon CaseRoiJolyne       = new javax.swing.ImageIcon(getClass().getResource("/images/CaseRoiJolyne.jpg"));
    ImageIcon TempleJolyne        = new javax.swing.ImageIcon(getClass().getResource("/images/TempleJolyne.jpg"));
    ImageIcon TempleRoiJolyne     = new javax.swing.ImageIcon(getClass().getResource("/images/TempleRoiJolyne.jpg"));
    ImageIcon CaseDio             = new javax.swing.ImageIcon(getClass().getResource("/images/CaseDio.jpg"));
    ImageIcon CaseRoiDio          = new javax.swing.ImageIcon(getClass().getResource("/images/CaseRoiDio.jpg"));
    ImageIcon TempleDio           = new javax.swing.ImageIcon(getClass().getResource("/images/TempleDio.jpg"));
    ImageIcon TempleRoiDio        = new javax.swing.ImageIcon(getClass().getResource("/images/TempleRoiDio.jpg"));
    ImageIcon CaseKars            = new javax.swing.ImageIcon(getClass().getResource("/images/CaseKars.jpg"));
    ImageIcon CaseRoiKars         = new javax.swing.ImageIcon(getClass().getResource("/images/CaseRoiKars.jpg"));
    ImageIcon TempleKars          = new javax.swing.ImageIcon(getClass().getResource("/images/TempleKars.jpg"));
    ImageIcon TempleRoiKars       = new javax.swing.ImageIcon(getClass().getResource("/images/TempleRoiKars.jpg"));
    ImageIcon CaseKira            = new javax.swing.ImageIcon(getClass().getResource("/images/CaseKira.jpg"));
    ImageIcon CaseRoiKira         = new javax.swing.ImageIcon(getClass().getResource("/images/CaseRoiKira.jpg"));
    ImageIcon TempleKira          = new javax.swing.ImageIcon(getClass().getResource("/images/TempleKira.jpg"));
    ImageIcon TempleRoiKira       = new javax.swing.ImageIcon(getClass().getResource("/images/TempleRoiKira.jpg"));
    ImageIcon CaseDiavolo         = new javax.swing.ImageIcon(getClass().getResource("/images/CaseDiavolo.jpg"));
    ImageIcon CaseRoiDiavolo      = new javax.swing.ImageIcon(getClass().getResource("/images/CaseRoiDiavolo.jpg"));
    ImageIcon TempleDiavolo       = new javax.swing.ImageIcon(getClass().getResource("/images/TempleDiavolo.jpg"));
    ImageIcon TempleRoiDiavolo    = new javax.swing.ImageIcon(getClass().getResource("/images/TempleRoiDiavolo.jpg"));
    ImageIcon CasePucci           = new javax.swing.ImageIcon(getClass().getResource("/images/CasePucci.jpg"));
    ImageIcon CaseRoiPucci        = new javax.swing.ImageIcon(getClass().getResource("/images/CaseRoiPucci.jpg"));
    ImageIcon TemplePucci         = new javax.swing.ImageIcon(getClass().getResource("/images/TemplePucci.jpg"));
    ImageIcon TempleRoiPucci      = new javax.swing.ImageIcon(getClass().getResource("/images/TempleRoiPucci.jpg"));
    ImageIcon CaseCesear          = new javax.swing.ImageIcon(getClass().getResource("/images/CaseCesear.jpg"));
    ImageIcon CaseRoiCesear       = new javax.swing.ImageIcon(getClass().getResource("/images/CaseRoiCesear.jpg"));
    ImageIcon TempleCesear        = new javax.swing.ImageIcon(getClass().getResource("/images/TempleCesear.jpg"));
    ImageIcon TempleRoiCesear     = new javax.swing.ImageIcon(getClass().getResource("/images/TempleRoiCesear.jpg"));
    ImageIcon CasePolnareff       = new javax.swing.ImageIcon(getClass().getResource("/images/CasePolnareff.jpg"));
    ImageIcon CaseRoiPolnareff    = new javax.swing.ImageIcon(getClass().getResource("/images/CaseRoiPolnareff.jpg"));
    ImageIcon TemplePolnareff     = new javax.swing.ImageIcon(getClass().getResource("/images/TemplePolnareff.jpg"));
    ImageIcon TempleRoiPolnareff  = new javax.swing.ImageIcon(getClass().getResource("/images/TempleRoiPolnareff.jpg"));
    ImageIcon CaseKoichi          = new javax.swing.ImageIcon(getClass().getResource("/images/CaseKoichi.jpg"));
    ImageIcon CaseRoiKoichi       = new javax.swing.ImageIcon(getClass().getResource("/images/CaseRoiKoichi.jpg"));
    ImageIcon TempleKoichi        = new javax.swing.ImageIcon(getClass().getResource("/images/TempleKoichi.jpg"));
    ImageIcon TempleRoiKoichi     = new javax.swing.ImageIcon(getClass().getResource("/images/TempleRoiKoichi.jpg"));
    ImageIcon CaseBucciarati      = new javax.swing.ImageIcon(getClass().getResource("/images/CaseBruno.jpg"));
    ImageIcon CaseRoiBucciarati   = new javax.swing.ImageIcon(getClass().getResource("/images/CaseRoiBruno.jpg"));
    ImageIcon TempleBucciarati    = new javax.swing.ImageIcon(getClass().getResource("/images/TempleBruno.jpg"));
    ImageIcon TempleRoiBucciarati = new javax.swing.ImageIcon(getClass().getResource("/images/TempleRoiBruno.jpg"));
    ImageIcon CaseErmes           = new javax.swing.ImageIcon(getClass().getResource("/images/CaseErmes.jpg"));
    ImageIcon CaseRoiErmes        = new javax.swing.ImageIcon(getClass().getResource("/images/CaseRoiErmes.jpg"));
    ImageIcon TempleErmes         = new javax.swing.ImageIcon(getClass().getResource("/images/TempleErmes.jpg"));
    ImageIcon TempleRoiErmes      = new javax.swing.ImageIcon(getClass().getResource("/images/TempleRoiErmes.jpg"));

    

    
    public CaseGraphique(CaseDePlateau uneCase, int px, int py){
        
        X = px;
        Y = py;
        
        caseAssociee = uneCase;
    }
    
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        
        if (caseAssociee.avoirTemple() == true) {
            setIcon(Temple_vide);
        }
        
        if (caseAssociee.avoirTemple() == false) {
            setIcon(Case_vide);
        }
        
        if (caseAssociee.avoirPion() == true) {
        
            if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Jonathan") {
                if (caseAssociee.avoirTemple() == true) {
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
                if (caseAssociee.avoirTemple() == true) {
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
                if (caseAssociee.avoirTemple() == true) {
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
                if (caseAssociee.avoirTemple() == true) {
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
                if (caseAssociee.avoirTemple() == true) {
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
                if (caseAssociee.avoirTemple() == true) {
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
                if (caseAssociee.avoirTemple() == true) {
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
                if (caseAssociee.avoirTemple() == true) {
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
                if (caseAssociee.avoirTemple() == true) {
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
                if (caseAssociee.avoirTemple() == true) {
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
                if (caseAssociee.avoirTemple() == true) {
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
                if (caseAssociee.avoirTemple() == true) {
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
                if (caseAssociee.avoirTemple() == true) {
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
                if (caseAssociee.avoirTemple() == true) {
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
                if (caseAssociee.avoirTemple() == true) {
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
                if (caseAssociee.avoirTemple() == true) {
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
                G.drawImage(img, 0, 0, this);
            }catch(Exception e){ 
            }
        }
        
        if (caseAssociee.viser == true) {
            try {
                Image img = ImageIO.read(new File("Cible_bug.png"));
                G.drawImage(img, 0, 0, this);
            }catch(Exception e){ 
            }
        }
    }
    
    
}
