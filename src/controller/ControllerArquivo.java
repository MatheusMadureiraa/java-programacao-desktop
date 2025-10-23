/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import javax.swing.JFileChooser;
/**
 *
 * @author mathe
 */
public abstract class ControllerArquivo {
    protected File arquivo = null;

    public abstract boolean ler();
    public abstract boolean escrever(boolean append);

    public File getArquivo() {
        return arquivo;
    }

    public void setArquivo(String textoBotao) {
        arquivo = null;
        String pastaInicial = System.getProperty("user.dir");
        JFileChooser chooser = new JFileChooser(pastaInicial);
        if (chooser.showDialog(null, textoBotao) == JFileChooser.APPROVE_OPTION) {
            arquivo = chooser.getSelectedFile();
        }
    }
}
