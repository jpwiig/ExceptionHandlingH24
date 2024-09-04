package org.example.Methods;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import static javax.swing.JOptionPane.showMessageDialog;

public class Methods {

    static String link = "src/main/java/org/example/Methods/gif.gif";
static String message = "Tradisjon: Rickroll! Husk å trolle førstisene neste år! :)";
   public static void play(){
  try {
        File audioFile = new File("src/main/java/org/example/Methods/up.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
        Clip audioClip = AudioSystem.getClip();
        audioClip.open(audioStream);
        audioClip.start();
        final ImageIcon icon = new ImageIcon(Methods.link);
        showMessageDialog(null, "", Methods.message, JOptionPane.INFORMATION_MESSAGE, icon);
    }
  catch (Exception e ) {
        e.printStackTrace();
    }
}
}
