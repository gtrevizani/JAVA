package cad04_mais_detalhes_e_frameworks._8_5_JOptionPane;

import javax.swing.*;

public class ExemploJOptionPanel {
    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        JOptionPane.showMessageDialog(null,"Seu cadastro foi realizado com sucesso!");
    }
}
