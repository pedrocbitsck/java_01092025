package aula.pkg3;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        double media = (n1 + n2) / 2;

        if (media <= 4.9) {
            System.out.println("Média: " + media + " - REPROVADO");
        } else if (media <= 6.9) {
            System.out.println("Média: " + media + " - RECUPERAÇÃO");
        } else {
            System.out.println("Média: " + media + " - APROVADO");
        }

        sc.close();
    }
}
