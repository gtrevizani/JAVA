package cad07_novidades_do_java_8._11_1_introducao_ao_lambda.exemplo;

import cad07_novidades_do_java_8._11_1_introducao_ao_lambda.dao.FaturaDAO;
import cad07_novidades_do_java_8._11_1_introducao_ao_lambda.modelo.Fatura;
import cad07_novidades_do_java_8._11_1_introducao_ao_lambda.util.EnviadorEmail;

import java.util.List;

public class ExemploLambda {

    public static void main(String[] args) {
        List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();

        EnviadorEmail enviadorEmail = new EnviadorEmail();

        /*for (Fatura f : faturasVencidas) {
            enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
        }*/

        faturasVencidas.forEach(f -> {
            enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
            f.setEmailEnviado(true);
        });
    }
}
