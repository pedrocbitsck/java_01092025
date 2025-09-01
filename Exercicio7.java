package aula.pkg3;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da casa: R$ ");
        double valorCasa = sc.nextDouble();

        System.out.print("Digite o salário do comprador: R$ ");
        double salario = sc.nextDouble();

        System.out.print("Digite em quantos anos deseja pagar: ");
        int anos = sc.nextInt();

        int meses = anos * 12;
        double prestacao = valorCasa / meses;

        System.out.println("Prestação mensal: R$ " + prestacao);

        if (prestacao > salario * 0.30) {
            System.out.println("Empréstimo NEGADO.");
        } else {
            System.out.println("Empréstimo APROVADO.");
        }

        sc.close();
    }
}