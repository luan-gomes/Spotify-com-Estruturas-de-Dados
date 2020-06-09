/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urtune.model;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author luan
 */
public class Tocador {
    
    Clip clip;
    AudioInputStream audioStream;
    AudioFormat format;
    boolean pause;
    long tempoDaMusica;

    public void tocar(String url) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        audioStream = AudioSystem.getAudioInputStream(new File(url));
        clip = AudioSystem.getClip();
        format = audioStream.getFormat();
        clip.open(audioStream);
        clip.start();
    }

    public void pausar() {
        pause = !pause;
        tempoDaMusica = clip.getMicrosecondPosition();
        clip.stop();
    }

    public void play() {
        pause = !pause;
        clip.setMicrosecondPosition(tempoDaMusica);
        clip.start();
    }

    public double getPorcentagem() {
            double posicao = (clip.getMicrosecondPosition() / 1000000) + 1;
            double duracao = (audioStream.getFrameLength() + 0.0) / format.getFrameRate();
            double porcentagem = posicao * 100 / duracao;
            return porcentagem;
    }

}
