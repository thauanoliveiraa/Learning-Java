import java.util.Scanner;

public class Atividade4{
    public static void main(String[] args) {
        // Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos
        
        int nmr1;
        int nmr2;
        int soma;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro : ");
        nmr1 = scan.nextInt();
        System.out.print("Digite o segundo número inteiro : ");
        nmr2 = scan.nextInt();
        soma = (nmr1+nmr2);
        System.out.printf("\n\nOs números digitados foram %d e %d\n\nA soma deles é igual a %d\n\n", nmr1, nmr2, soma);




    }
}