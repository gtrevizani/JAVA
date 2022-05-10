package exercicio03;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    ArrayList<String> produtos = new ArrayList<>();

    Path arquivo = Paths.get("C:\\Users\\Administrador\\Desktop\\tarefa.txt");

    List<String> produtos = Files.readAllLines(arquivo);

}
