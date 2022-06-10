package cad03_topicos_avancados.teoria.ATT09_SERIALIZACAO_DE_OBJETOS._9_1_salvando_e_lendo_objetos_em_arquivo;

import cad03_topicos_avancados.teoria.ATT09_SERIALIZACAO_DE_OBJETOS._9_1_salvando_e_lendo_objetos_em_arquivo.model.Pessoa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializandoObjeto {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("João Silva");
        p.setIdade(25);
        p.setProfissao("Motorista");

        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("joao.obj"))){
            out.writeObject(p);
            System.out.println("Objeto salvo com sucesso.");
        } catch (IOException e){
            System.out.println("Erro salvando o objeto. " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
