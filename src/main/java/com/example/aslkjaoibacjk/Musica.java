package com.example.aslkjaoibacjk;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Musica {
}


public static Clip tocarMusica(String location){ // função para tocar musica
    try{
        File musicaCaminho = new File(location);

        if(musicaCaminho.exists()){
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicaCaminho);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            return clip;
        }
        else{
            System.out.println("Não consegui achar");
        }
    }
    catch(Exception e){

    }
}

public void main() {
    // exemplo do que é botar no no main do arquivo principal

    List<String> musicToPlay = new ArrayList<String>();
    musicToPlay.add("scaa"); //função de remover tbm funciona

    try{
        for(int i = 0; i < musicToPlay.size(); i++){
            // colocar uma função para mudar a label com a musica
            Clip currentClip = tocarMusica(musicToPlay.get(i));
            while(currentClip.getMicrosecondLength() != currentClip.getMicrosecondPosition())(

                    )

        }
    }
    catch(Exception e){

    }
}