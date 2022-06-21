package cad06_novidades_do_java_7._10_4_try_with_resources_e_multi_cast;

public class SalvarAluno {
    public static void salvar(String nome, String idade){
        if(nome == null || nome.trim().equals("")){
            throw new NegocioException("Impossível salvar aluno sem nome!");
        }

        int i = Integer.parseInt(idade);
        System.out.println("Salvando...");
    }
}
