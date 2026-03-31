package main;

import javax.swing.JOptionPane;
import model.CalcularMedia;

public class Main {

    public static void main(String[] args) {

        CalcularMedia media = new CalcularMedia();

        media.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: ")));
        media.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: ")));
        media.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: ")));
        
        JOptionPane.showMessageDialog(null, "A sua média é: " + media.getMedia());

    }
}
