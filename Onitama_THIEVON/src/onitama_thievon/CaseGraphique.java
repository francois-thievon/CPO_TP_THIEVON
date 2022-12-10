/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onitama_thievon;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.ImageIcon;

/**
 *
 * @author thiev
 */
public class CaseGraphique extends JButton{
    CaseDePlateau caseAssociee;
    ImageIcon Case_vide           = new javax.swing.ImageIcon(getClass().getResource("/images/Case.jpg"));
    ImageIcon Temple_vide         = new javax.swing.ImageIcon(getClass().getResource("/images/Temple.jpg"));
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

    
    public CaseGraphique(CaseDePlateau uneCase){
        caseAssociee = uneCase;
    }
    
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        
        if (caseAssociee.avoirPion() == true) {
            if (caseAssociee.avoirTemple() == true) {
                if (caseAssociee.renvoyerPion().etreLeRoi() == true) {
                    
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Jonathan") {
                    setIcon(TempleRoiJonathan);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Joseph") {
                        setIcon(TempleRoiJoseph);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Jotaro") {
                        setIcon(TempleRoiJotaro);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Josuke") {
                        setIcon(TempleRoiJosuke);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Giorno") {
                        setIcon(TempleRoiGiorno);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom== "Jolyne") {
                        setIcon(TempleRoiJolyne);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Dio") {
                        setIcon(TempleRoiDio);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Kars") {
                        setIcon(TempleRoiKars);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Yoshikage") {
                        setIcon(TempleRoiKira);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Diavolo") {
                        setIcon(TempleRoiDiavolo);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Enrico") {
                        setIcon(TempleRoiPucci);
                    }
                }
                if (caseAssociee.renvoyerPion().etreLeRoi() == false) {
                    
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Jonathan") {
                    setIcon(TempleJonathan);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Joseph") {
                        setIcon(TempleJoseph);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Jotaro") {
                        setIcon(TempleJotaro);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Josuke") {
                        setIcon(TempleJosuke);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Giorno") {
                        setIcon(TempleGiorno);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom== "Jolyne") {
                        setIcon(TempleJolyne);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Dio") {
                        setIcon(TempleDio);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Kars") {
                        setIcon(TempleKars);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Yoshikage") {
                        setIcon(TempleKira);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Diavolo") {
                        setIcon(TempleDiavolo);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Enrico") {
                        setIcon(TemplePucci);
                    }
                }
            }
            if (caseAssociee.avoirTemple() == false) {
                if (caseAssociee.renvoyerPion().etreLeRoi() == true) {
                    
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Jonathan") {
                    setIcon(CaseRoiJonathan);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Joseph") {
                        setIcon(CaseRoiJoseph);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Jotaro") {
                        setIcon(CaseRoiJotaro);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Josuke") {
                        setIcon(CaseRoiJosuke);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Giorno") {
                        setIcon(CaseRoiGiorno);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom== "Jolyne") {
                        setIcon(CaseRoiJolyne);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Dio") {
                        setIcon(CaseRoiDio);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Kars") {
                        setIcon(CaseRoiKars);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Yoshikage") {
                        setIcon(CaseRoiKira);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Diavolo") {
                        setIcon(CaseRoiDiavolo);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Enrico") {
                        setIcon(CaseRoiPucci);
                    }
                }
                if (caseAssociee.renvoyerPion().etreLeRoi() == false) {
                    
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Jonathan") {
                    setIcon(CaseJonathan);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Joseph") {
                        setIcon(CaseJoseph);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Jotaro") {
                        setIcon(CaseJotaro);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Josuke") {
                        setIcon(CaseJosuke);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Giorno") {
                        setIcon(CaseGiorno);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom== "Jolyne") {
                        setIcon(CaseJolyne);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Dio") {
                        setIcon(CaseDio);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Kars") {
                        setIcon(CaseKars);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Yoshikage") {
                        setIcon(CaseKira);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Diavolo") {
                        setIcon(CaseDiavolo);
                    }
                    if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Enrico") {
                        setIcon(CasePucci);
                    }
                }
            }
        }
        else {
            if (caseAssociee.avoirTemple() == true) {
                setIcon(Temple_vide);
            }
            if (caseAssociee.avoirTemple() == false) {
                setIcon(Case_vide);
            }
        }
    }         
}
