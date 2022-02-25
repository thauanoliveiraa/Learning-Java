import java.util.Scanner;

public class Atividade10{
    public static void main(String[] args){
        // a
        /*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/
        Scanner scan = new Scanner(System.in);

        int nmr;

        System.out.print("Digite um número inteiro : ");
        nmr = scan.nextInt();

        if(nmr >= 0){
            System.out.printf("Você digitou %d, que é um número positivo\n\n", nmr);
        }
        else if(nmr < 0){
            System.out.printf("Você digitou %d, que é um número negativo\n\n", nmr);
        }

    }
}