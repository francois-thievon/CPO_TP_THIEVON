/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_thievon;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.ImageIcon;
/**
 *
 * @author thiev
 */
public class CelluleGraphique extends JButton{
    CelluleDeGrille celluleAssociee;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/Case_Vide.png"));
    ImageIcon img_stand = new javax.swing.ImageIcon(getClass().getResource("/images/Desintegrateur_Stand.png"));
    ImageIcon img_jetonViolet = new javax.swing.ImageIcon(getClass().getResource("/images/JetonStarPlatinium.png"));
    ImageIcon img_jetonJaune = new javax.swing.ImageIcon(getClass().getResource("/images/JetonTheWorld.png"));
    ImageIcon img_TrouNoir = new javax.swing.ImageIcon(getClass().getResource("/images/Trou_Noir.png"));
    
    public CelluleGraphique(CelluleDeGrille uneCellule) {
        celluleAssociee = uneCellule;
        
    }
    
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        if (celluleAssociee.presenceTrouNoir() == true) {
            setIcon(img_TrouNoir);
        }
        else if (celluleAssociee.presenceDesintegrateur() == true) {
            setIcon(img_stand);
        }
        else {
            String couleur_jeton = celluleAssociee.lireCouleurDuJeton();
            switch (couleur_jeton) {
                case "Rouge":
                    setIcon(img_jetonViolet);
                    break;
                case "Jaune":
                    setIcon(img_jetonJaune);
                    break;
                case "vide":
                    setIcon(img_vide);
                    break;
            }
        }
    }
}
