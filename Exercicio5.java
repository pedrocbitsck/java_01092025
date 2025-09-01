package aula.pkg3;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do terreno (m): ");
        double largura = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno (m): ");
        double comprimento = sc.nextDouble();

        double area = largura * comprimento;

        System.out.println("Área do terreno: " + area + " m²");

        if (area < 100) {
            System.out.println("Classificação: TERRENO POPULAR");
        } else if (area <= 500) {
            System.out.println("Classificação: TERRENO MASTER");
        } else {
            System.out.println("Classificação: TERRENO VIP");
        }

        sc.close();
    }
}
