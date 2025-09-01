package aula3_Sem_calculo;

import java.util.Scanner;

public class Exercicio3_Sem_Calculo {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        String invertida = new StringBuilder(palavra).reverse().toString();

        System.out.println("Palavra invertida: " + invertida);

        sc.close();
    }
}