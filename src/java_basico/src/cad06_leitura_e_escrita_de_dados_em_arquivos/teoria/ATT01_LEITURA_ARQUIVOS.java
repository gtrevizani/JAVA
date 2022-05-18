package cad06_leitura_e_escrita_de_dados_em_arquivos.teoria;


// Código para ler um determinado arquivo.


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ATT01_LEITURA_ARQUIVOS {
    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("C:\\Users\\Administrador\\Desktop\\arquivo.txt");

        List<String> linhas = Files.readAllLines(arquivo);

        for(int i=0; i< linhas.size(); i++){
            String nome = linhas.get(i);

            System.out.println("Jogador " + i + ": " + nome);
        }
    }
}
