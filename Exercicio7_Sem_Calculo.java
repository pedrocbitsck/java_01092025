package aula3_Sem_calculo;

import java.util.Scanner;

public class Exercicio7_Sem_Calculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um dia da semana: ");
        String dia = sc.nextLine().toLowerCase();

        if (dia.equals("sábado") || dia.equals("sabado") || dia.equals("domingo")) {
            System.out.println("Fim de semana.");
        } else {
            System.out.println("Dia útil.");
        }

        sc.close();
    }
}