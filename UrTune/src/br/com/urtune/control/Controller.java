/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urtune.control;

import br.com.urtune.model.Tocador;
import java.awt.BorderLayout;
import java.awt.Container;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.border.Border;
/**
 *
 * @author luan
 */
public class Controller {
  Tocador tocador;

    public Controller() {

        tocador = new Tocador();
    }

    public void tocar(String url) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        tocador.tocar(url);
    }

    public void play() {
        tocador.play();
    }

    public void pausar() {
        tocador.pausar();
    }

    public double getPorcentagem() {
        return tocador.getPorcentagem();
    }

}
