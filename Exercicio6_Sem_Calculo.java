package aula3_Sem_calculo;

import java.util.Scanner;

public class Exercicio6_Sem_Calculo {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = sc.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = sc.nextLine();

        if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras são iguais (ignorando maiúsculas/minúsculas).");
        } else {
            System.out.println("As palavras são diferentes.");
        }

        sc.close();
    }
}