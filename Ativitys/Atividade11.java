import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar*/

        int nmr;

        System.out.print("Digite um número inteiro : ");
        nmr = scan.nextInt();
        
        int calculo = (nmr%2);

        if(calculo == 0){
            System.out.printf("Você digitou %d, que é um número PAR\n\n", nmr);

        }
        else{
            System.out.printf("Você digitou %d, que é um numero IMPAR\n\n", nmr);
        }


        
    }
}
