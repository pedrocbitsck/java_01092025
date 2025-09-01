package aula3_Sem_calculo;

import java.util.Scanner;

public class Exercicio4_Sem_Calculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();

        if (palavra.contains("a") || palavra.contains("e") || palavra.contains("i") || 
            palavra.contains("o") || palavra.contains("u")) {
            System.out.println("A palavra contém pelo menos uma vogal.");
        } else {
            System.out.println("A palavra não contém vogais.");
        }

        sc.close();
    }
}