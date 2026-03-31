package main;

import javax.swing.JOptionPane;
import model.CalcularMedia;

public class Main {

    public static void main(String[] args) {

        CalcularMedia media = new CalcularMedia();
        
        media.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        media.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: ")));
        media.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: ")));
        media.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3: ")));
        
        JOptionPane.showMessageDialog(null, media.getNome() + ", a sua média é: " + media.getMedia());

    }
}
