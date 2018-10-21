/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 *
 * @author thang
 */
public class speak {

/**
 *
 * @author thang
 */
   private VoiceManager vm;
   private Voice voice;
    
    public void voiceSp(String speechST){
         System.setProperty("mbrola.base","mbrola");
         vm=VoiceManager.getInstance();
         voice=vm.getVoice("mbrola_us2");
         voice.allocate();
         voice.speak(speechST);
    
    }
   
    
 
    
}

    

