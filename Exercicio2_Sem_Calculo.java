package aula3_Sem_calculo;

import java.util.Scanner;

public class Exercicio2_Sem_Calculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu turno (Manhã, Tarde, Noite): ");
        String turno = sc.nextLine();

        if (turno.equalsIgnoreCase("manhã")) {
            System.out.println("Bom dia, " + nome + "!");
        } else if (turno.equalsIgnoreCase("tarde")) {
            System.out.println("Boa tarde, " + nome + "!");
        } else if (turno.equalsIgnoreCase("noite")) {
            System.out.println("Boa noite, " + nome + "!");
        } else {
            System.out.println("Turno inválido.");
        }

        sc.close();
    }
}