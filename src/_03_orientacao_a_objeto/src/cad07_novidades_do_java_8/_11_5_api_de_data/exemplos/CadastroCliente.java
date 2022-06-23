package cad07_novidades_do_java_8._11_5_api_de_data.exemplos;

import cad07_novidades_do_java_8._11_5_api_de_data.model.Cliente;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CadastroCliente {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Filipe Vaz", LocalDate.of(1988, Month.AUGUST, 13));

        int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();

        if (idade >= 18) {
            System.out.printf("OK, pode ser cadastrado. Sua idade é: %d", idade);
        } else {
            System.out.printf("Sua idade é: %d. Então não pode ter carteira.", idade);
        }
    }
}
