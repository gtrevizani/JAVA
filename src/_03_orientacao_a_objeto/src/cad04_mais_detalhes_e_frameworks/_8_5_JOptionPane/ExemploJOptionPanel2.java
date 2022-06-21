package cad04_mais_detalhes_e_frameworks._8_5_JOptionPane;

import javax.swing.*;
import java.net.URL;

public class ExemploJOptionPanel2 {
    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        JOptionPane.showMessageDialog(null,"Seu cadastro foi realizado com sucesso!");

        JOptionPane.showMessageDialog(null,"Atenção - e-mail não informado.", "Atenção",
                JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null, "Favor informar o CPF", "Erro",
                JOptionPane.ERROR_MESSAGE);

        JOptionPane.showMessageDialog(null, "Obrigado", "Obrigado",
                JOptionPane.PLAIN_MESSAGE);

        URL url = ExemploJOptionPanel2.class.getResource("download (1).png");

        Icon icone = new ImageIcon(url);

        JOptionPane.showMessageDialog(null,"Obrigado por escolher o SENAI", "SENAI",
                JOptionPane.INFORMATION_MESSAGE, icone);
    }
}
