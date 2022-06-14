package cad03_topicos_avancados.teoria.ATT08_MAIS_DETALHES_E_FRAMEWORKS._8_5_JOptionPane;

import javax.swing.*;

public class ExemploJOptionPanel {
    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        JOptionPane.showMessageDialog(null,"Seu cadastro foi realizado com sucesso!");
    }
}
