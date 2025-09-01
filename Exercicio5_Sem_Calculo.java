package aula3_Sem_calculo;

import java.util.Scanner;

public class Exercicio5_Sem_Calculo {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu login: ");
        String login = sc.nextLine();

        if (login.length() >= 6 && !login.contains(" ")) {
            System.out.println("Login válido.");
        } else {
            System.out.println("Login inválido.");
        }

        sc.close();
    }
}