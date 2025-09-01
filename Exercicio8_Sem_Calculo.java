package aula3_Sem_calculo;

import java.util.Scanner;

public class Exercicio8_Sem_Calculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String novaFrase = frase.replace("Java", "Programação");

        System.out.println("Frase modificada: " + novaFrase);

        sc.close();
    }
}
