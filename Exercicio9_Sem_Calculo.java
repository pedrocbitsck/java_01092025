package aula3_Sem_calculo;

import java.util.Scanner;

public class Exercicio9_Sem_Calculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String[] palavras = frase.trim().split("\\s+");
        System.out.println("A frase contém " + palavras.length + " palavras.");

        sc.close();
    }
}