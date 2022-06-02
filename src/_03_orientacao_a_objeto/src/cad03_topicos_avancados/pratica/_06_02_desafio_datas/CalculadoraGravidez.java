package cad03_topicos_avancados.pratica._06_02_desafio_datas;
/*
Uma médica obstetra precisa de um software que calcula algumas datas importantes de suas clientes grávidas.
A médica deseja informar apenas a data do último período menstrual de sua cliente e o software deve calcular e exibir a
data estimada do parto e a data estimada da concepção (isso mesmo que você está pensando... o ato sexual).

Você foi contratado para desenvolver este software, por isso precisa aprender um pouco sobre gravidez:
A data estimada da concepção é igual a data do último período menstrual mais 2 semanas.
A data estimada do parto é igual a data do último período menstrual mais 40 semanas.
A classe ClaculadoraGravidez já foi iniciada, você precisa apenas implementar os métodos calcularDataEstimadaConcepcao() e
calcularDataEstimadaParto().

Dica 1: para somar um número de semanas à uma data, use:
variavelDoTipoCalendar.add(Calendar.WEEK_OF_YEAR, numeroDeSemanas);

Dica 2: Use o método converterDateParaCalendar(), que já está pronto, para converter o tipo Date para Calendar.
Você vai precisar disso!

Veja que para usar a classe CalculadoraGravidez, deve-se instanciá-la passando como parâmetro do construtor a data do
último período menstrual e depois basta chamar os métodos que calcula as datas desejadas.
A classe Principal recebe a entrada do teclado do usuário, converte o texto para o tipo Date, instancia um objeto da
classe CalculadoraGravidez e realiza os cálculos, exibindo os resultados na tela. Essa classe está pronta para você,
com exceção do método converterEmData(), que você deve implementar.

O método converterEmData() recebe um parâmetro do tipo String e deve retornar um tipo Date. Use o que aprendeu na aula sobre datas para converter String em Date no formato "dd/MM/yyyy".
private Date converterEmData(String texto) throws ParseException {
	// implementar conversão de texto para data no formato dd/MM/yyyy
}
 */

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {
    private Date dataUltimoPeriodoMenstrual;

    public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
        this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
    }

    private Calendar converterDateParaCalendar(Date data) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(data);
        return calendar;
    }

    public Date calcularDataEstimadaConcepcao() {
        // implementar cálculo de data estimada da concepção
        // 2 semanas após a data do último período menstrual
    }

    public Date calcularDataEstimadaParto() {
        // implementar cálculo de data estimada para parto
        // 40 semanas após a data do último período menstrual
    }
}

