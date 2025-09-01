package aula.pkg3;
import java.util.Scanner;
public class Exercicio2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distância da viagem (Km): ");
        double distancia = sc.nextDouble();

        double preco;
        if (distancia <= 200) {
            preco = distancia * 0.50;
        } else {
            preco = distancia * 0.45;
        }

        System.out.println("Preço da passagem: R$ " + preco);

        sc.close();
    }
}
