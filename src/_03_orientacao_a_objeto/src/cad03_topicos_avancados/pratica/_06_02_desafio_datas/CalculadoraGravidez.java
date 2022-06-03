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
Dica 1: para somar um número de semanas à uma data, use:
variavelDoTipoCalendar.add(Calendar.WEEK_OF_YEAR, numeroDeSemanas);
Dica 2: Use o método converterDateParaCalendar(), que já está pronto, para converter o tipo Date para Calendar. Você vai
 precisar disso!
Veja que para usar a classe CalculadoraGravidez, deve-se instanciá-la passando como parâmetro do construtor a data do
último período menstrual e depois basta chamar os métodos que calcula as datas desejadas.
 */

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {
    private Date dataUltimoPeriodoMenstrual; // Atributo

    public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) { // Constructor
        this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
    }

    private Calendar converterDateParaCalendar(Date data) { // Método
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(data);
        return calendar;
    }

    public Date calcularDataEstimadaConcepcao() { // Método
        // implementar cálculo de data estimada da concepção
        // 2 semanas após a data do último período menstrual
        Calendar dataEstimadaDaConcepcao = this.converterDateParaCalendar(dataUltimoPeriodoMenstrual);
        dataEstimadaDaConcepcao.add(Calendar.WEEK_OF_YEAR, 2);

        return dataEstimadaDaConcepcao.getTime();
    }

    public Date calcularDataEstimadaParto() { // Método
        // implementar cálculo de data estimada para parto
        // 40 semanas após a data do último período menstrual
        Calendar dataEstimadaParto = this.converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
        dataEstimadaParto.add(Calendar.WEEK_OF_YEAR, 40);

        return dataEstimadaParto.getTime();
    }
}

