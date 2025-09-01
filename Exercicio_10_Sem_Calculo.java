package aula3_Sem_calculo;

import java.util.Scanner;

public class Exercicio_10_Sem_Calculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um e-mail: ");
        String email = sc.nextLine();

        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("E-mail válido.");
        } else {
            System.out.println("E-mail inválido.");
        }

        sc.close();
    }
}