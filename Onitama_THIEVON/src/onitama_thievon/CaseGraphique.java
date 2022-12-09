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
    ImageIcon case_vide           = new javax.swing.ImageIcon(getClass().getResource("/images/CaseOnitamMarbrea_bt.jpg"));
    ImageIcon case_temple         = new javax.swing.ImageIcon(getClass().getResource("/images/CaseOnitamaTemple_bt.jpg"));
    ImageIcon PionJonathan        = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionJH_bt.jpg"));
    ImageIcon PionJonathanTemple  = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionJHT_bt.jpg"));
    ImageIcon PionJoseph          = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionHP_bt.jpg"));
    ImageIcon PionJosephTemple    = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionHPT_bt.jpg"));
    ImageIcon PionJotaro          = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionSP_bt.jpg"));
    ImageIcon PionJotaroTemple    = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionSPT_bt.jpg"));
    ImageIcon PionJosuke          = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionCD_bt.jpg"));
    ImageIcon PionJosukeTemple    = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionCDT_bt.jpg"));
    ImageIcon PionGiorno          = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionGE_bt.jpg"));
    ImageIcon PionGiornoTemple    = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionGET_bt.jpg"));
    ImageIcon PionJolyne          = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionSF_bt.jpg"));
    ImageIcon PionJolyneTemple    = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionSFT_bt.jpg"));
    ImageIcon PionDio             = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionTW_bt.jpg"));
    ImageIcon PionDioTemple       = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionTWT_bt.jpg"));
    ImageIcon PionKars            = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionPA_bt.jpg"));
    ImageIcon PionKarsTemple      = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionPAT_bt.jpg"));
    ImageIcon PionKira            = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionKQ_bt.jpg"));
    ImageIcon PionKiraTemple      = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionKQT_bt.jpg"));
    ImageIcon PionDiavolo         = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionKC_bt.jpg"));
    ImageIcon PionDiavoloTemple   = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionKCT_bt.jpg"));
    ImageIcon PionPucci           = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionWS_bt.jpg"));
    ImageIcon PionPucciTemple     = new javax.swing.ImageIcon(getClass().getResource("/images/CasePionWST_bt.jpg"));
    
    public CaseGraphique(CaseDePlateau uneCase){
        caseAssociee = uneCase;
    }
    
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        if (caseAssociee.avoirPion() == true) {
            if (caseAssociee.avoirTemple() == true) {
                
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Jonathan") {
                    setIcon(PionJonathanTemple);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Joseph") {
                    setIcon(PionJosephTemple);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Jotaro") {
                    setIcon(PionJotaroTemple);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Josuke") {
                    setIcon(PionJosukeTemple);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Giorno") {
                    setIcon(PionGiornoTemple);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom== "Jolyne") {
                    setIcon(PionJolyneTemple);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Dio") {
                    setIcon(PionDioTemple);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Kars") {
                    setIcon(PionKarsTemple);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Yoshikage") {
                    setIcon(PionKiraTemple);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Diavolo") {
                    setIcon(PionDiavoloTemple);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Enrico") {
                    setIcon(PionPucciTemple);
                }
            }
            if (caseAssociee.avoirTemple() == false) {
                
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Jonathan") {
                    setIcon(PionJonathan);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Joseph") {
                    setIcon(PionJoseph);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Jotaro") {
                    setIcon(PionJotaro);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Josuke") {
                    setIcon(PionJosuke);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Giorno") {
                    setIcon(PionGiorno);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Jolyne") {
                    setIcon(PionJolyne);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Dio") {
                    setIcon(PionDio);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Kars") {
                    setIcon(PionKars);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Yoshikage") {
                    setIcon(PionKira);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Diavolo") {
                    setIcon(PionDiavolo);
                }
                if (caseAssociee.renvoyerPion().renvoyerJoueur().prenom == "Enrico") {
                    setIcon(PionPucci);
                }
            }
        }
        else {
            if (caseAssociee.avoirTemple() == true) {
                setIcon(case_temple);
            }
            else {
                setIcon(case_vide);
            }
        }
    }
}
