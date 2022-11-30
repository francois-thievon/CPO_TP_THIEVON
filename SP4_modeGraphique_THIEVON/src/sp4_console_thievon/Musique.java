/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_thievon;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


/**
 *
 * @author thiev
 */
public class Musique {
    
    void JouerMusique(String lien) {
        
        try
        {
            File musicPath = new File(lien);
            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                
                JOptionPane.showMessageDialog(null, "Arreter la musique");
            }
        }
        catch (Exception ex) {  
            ex.printStackTrace();
        }
    }
    
}
