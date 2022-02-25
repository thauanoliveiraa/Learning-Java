import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        /* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/

        Scanner scan = new Scanner(System.in);

        int a, b, c, d;

        System.out.print("Digite o valor de A : ");
        a = scan.nextInt();
        System.out.print("Digite o valor de B : ");
        b = scan.nextInt();
        System.out.print("Digite o valor de C : ");
        c = scan.nextInt();
        System.out.print("Digite o valor de D : ");
        d = scan.nextInt();

        int diferenca = (a*b)-(c*d);

        System.out.printf("\n\nDe acordo com os valores de A = %d, B = %d, C = %d, D = %d\n\nA diferença do produto de A e B pelo produto de C e D é igual a %d\n\n", a, b, c, d, diferenca);



    }
}
