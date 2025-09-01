package aula.pkg3;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Digite o salário atual: R$ ");
        double salario = sc.nextDouble();

        System.out.print("Digite quantos anos trabalha na empresa: ");
        int anos = sc.nextInt();

        double aumento;
        if (anos < 3) {
            aumento = 0.03;
        } else if (anos < 10) {
            aumento = 0.125;
        } else {
            aumento = 0.20;
        }

        double novoSalario = salario + (salario * aumento);

        System.out.println("Funcionário: " + nome);
        System.out.println("Novo salário: R$ " + novoSalario);

        sc.close();
    }
}