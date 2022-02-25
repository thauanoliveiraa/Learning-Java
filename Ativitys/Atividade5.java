import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
    /* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos. Fórmula da área: area = π . raio. Considere o valor de π = 3.14159*/

    double raio;
    double pi = 3.14159;

    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o valor do raio do circulo : ");
    raio = scan.nextDouble();
    scan.close();
    double area = pi *(raio*raio);

    System.out.printf("De acordo com o valor do raio %.2f\n\nO valor da área é igual a %.4f\n\n", raio, area);

    }
}
