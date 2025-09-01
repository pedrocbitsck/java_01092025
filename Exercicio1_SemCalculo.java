package aula3_Sem_calculo;


import java.util.Scanner;
public class Exercicio1_SemCalculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        if (nome.length() > 5) {
            System.out.println("O nome contém mais de 5 caracteres.");
        } else {
            System.out.println("O nome contém 5 caracteres ou menos.");
        }

        sc.close();
    }
}