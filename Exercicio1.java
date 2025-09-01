package aula.pkg3;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("Digite o sexo (M/F): ");
        String sexo = sc.nextLine().toUpperCase();

        System.out.print("Digite o valor das compras: R$ ");
        double valor = sc.nextDouble();

        double desconto;
        if (sexo.equals("M")) {
            desconto = 0.05;
        } else if (sexo.equals("F")) {
            desconto = 0.13;
        } else {
            desconto = 0;
        }

        double valorFinal = valor - (valor * desconto);

        System.out.println("Cliente: " + nome);
        System.out.println("Valor final com desconto: R$ " + valorFinal);

        sc.close();
    }
}

