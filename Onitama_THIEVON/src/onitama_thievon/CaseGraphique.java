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
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/CaseVideOnitama_bt.jpg"));
    
    public CaseGraphique(CaseDePlateau uneCase){
        caseAssociee = uneCase;
    }
    
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        setIcon(img_vide);
    }
}
