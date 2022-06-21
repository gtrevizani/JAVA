package cad05_serializacao_de_objetos._9_1_salvando_e_lendo_objetos_em_arquivo;

import cad05_serializacao_de_objetos._9_1_salvando_e_lendo_objetos_em_arquivo.modelo.Pessoa;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserializandoObjeto {
    public static void main(String[] args) {
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("joao.obj"))){
            Pessoa p = (Pessoa) in.readObject();
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("Profissão: " + p.getProfissao());
        } catch (IOException e){
            throw new RuntimeException();
        } catch (ClassNotFoundException e){
            System.out.println("Erro convertendo para a classe Pessoa");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
