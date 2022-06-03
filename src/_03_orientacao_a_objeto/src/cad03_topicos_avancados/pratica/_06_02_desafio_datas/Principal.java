package cad03_topicos_avancados.pratica._06_02_desafio_datas;
/*
A classe Principal recebe a entrada do teclado do usuário, converte o texto para o tipo Date, instancia um objeto da
classe CalculadoraGravidez e realiza os cálculos, exibindo os resultados na tela. Essa classe está pronta para você,
com exceção do método converterEmData(), que você deve implementar.

O método converterEmData() recebe um parâmetro do tipo String e deve retornar um tipo Date. Use o que aprendeu na aula
sobre datas para converter String em Date no formato "dd/MM/yyyy".
private Date converterEmData(String texto) throws ParseException {
	// implementar conversão de texto para data no formato dd/MM/yyyy
}

 */
import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Locale;

public class Principal {
    public static void main(String args[]) {
        new Principal();
    }
    public Principal() {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println("Data do último período menstrual (dd/mm/aaaa):"); // Inserção
            String ultimoPeriodoMenstrual = entrada.nextLine();

            Date dataUltimoPeriodoMenstrual = this.converterEmData(ultimoPeriodoMenstrual); // Variável recebe a conversão do String para Date;

            CalculadoraGravidez calculadora = new CalculadoraGravidez(dataUltimoPeriodoMenstrual); // Constructor recebe o Date;

            Date dataEstimadaConcepcao = calculadora.calcularDataEstimadaConcepcao(); // Variável recebe o calculo estimado de Concepção;
            System.out.println("Data estimada da concepção: "
                    + this.formatarData(dataEstimadaConcepcao));
            Date dataEstimadaParto = calculadora.calcularDataEstimadaParto(); // Variável recebe o cálculo estimado de Partor;
            System.out.println("Data estimada para parto: "
                    + this.formatarData(dataEstimadaParto));
        } catch (ParseException pe) {
            System.out.println("Informe uma data no padrão dd/mm/aaaa.");
        }
    }
    private String formatarData(Date data) {
        // Padrão de formatação de data por extenso
        // A classe Locale representa uma região no planeta, sendo neste caso
        // o Brasil (br), onde falamos Português (pt)
        // O Locale é usado aqui para formatar a data em português brasileiro
        DateFormat formatador = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy", // Formata para br ou pt;
                new Locale("pt", "br"));
        return formatador.format(data);
    }
    private Date converterEmData(String texto) throws ParseException { // Método conversor de String para Date;
        // implementar conversão de texto para data no formato dd/MM/yyyy
        DateFormat conversor = new SimpleDateFormat("dd/MM/yyyy"); // Formato requisitado;
        return conversor.parse(texto);
    }
}