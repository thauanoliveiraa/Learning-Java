import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        /* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago */

        int codigoPeca1, quantidadePeca1;
        double valorPeca1;
        int codigoPeca2, quantidadePeca2;
        double valorPeca2;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o código da primeira peça : ");
        codigoPeca1 = scan.nextInt();
        System.out.print("Digite a quantidade de peças : ");
        quantidadePeca1 = scan.nextInt();
        System.out.print("Digite o valor da peça 1 R$ ");
        valorPeca1 = scan.nextDouble();

        System.out.println("\n\n\n");

        System.out.print("Digite o código da segunda peça : ");
        codigoPeca2 = scan.nextInt();
        System.out.print("Digite a quantidade de peças : ");
        quantidadePeca2 = scan.nextInt();
        System.out.print("Digite o valor da peça R$ ");
        valorPeca2 = scan.nextDouble();

        System.out.println("\n\n\n");

        double calculo = (quantidadePeca1*valorPeca1) + (quantidadePeca2*valorPeca2);

        System.out.printf("De acordo com o numero de peças 1 ( %d ) e de acordo com o numero de peças 2 ( %d )\nE os valores de cada uma respectivamente R$ %.2f e R$ %.2f\nO valor total a ser pago é igual a R$ %.2f\n\n\n", quantidadePeca1, quantidadePeca2, valorPeca1, valorPeca2, calculo);



    }
}
