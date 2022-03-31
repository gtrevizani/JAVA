package estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;

import static java.lang.System.in;

/*
Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.
 */
public class EX18DataValidaOuNao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        System.out.print("Informe a dia (dd): ");
        int dia = scanner.nextInt();
        System.out.print("Informe o mes (m): ");
        int mes = scanner.nextInt();
        System.out.print("Informe o ano (yyyy): ");
        int ano = scanner.nextInt();

        int mesCorreto = mes - 1;
        Calendar c = Calendar.getInstance();
        c.set(ano, mesCorreto, dia);
        Date periodo = c.getTime();

        if(ano<0){
            System.out.println("Ano inválido.");
        } else if (mes<1 || mes>12) {
                System.out.println("Mês inválido");

        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if (dia > 0 && dia <32){
                System.out.println("Data válida.");
            } else {
                System.out.println("Data inválida.");
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            if (dia >0 && dia<31){
                System.out.println("Data válida.");
            } else {
                System.out.println("Data inválida.");
            }
        } else {
            if (ano % 4 == 0){
                if ( dia > 0 && dia < 30){
                    System.out.println("Data válida.");
                } else {
                    System.out.println("Data inválida.");
                }
            } else {
                if(dia > 0 && dia <29){
                    System.out.println("Data válida.");
                } else {
                    System.out.println("Data inválida.");
                }
            }
        }



        //Formata a dia
        DateFormat formataData = DateFormat.getDateInstance();
        System.out.println("Data atual com formatação: "+ formataData.format(periodo));


    }
}
