import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.*/

        int nmr1, nmr2;

        System.out.print("Digite o primeiro número inteiro : ");
        nmr1 = scan.nextInt();
        System.out.print("Digite o segundo número inteiro : ");
        nmr2 = scan.nextInt();

        if(nmr1 % nmr2 == 0 || nmr2 % nmr1 == 0){
            System.out.printf("Você digitou %d e %d, que são multiplos um do outro \n\n", nmr1, nmr2);
        }
        else{
            System.out.printf("Você digitou %d e %d, que não são multiplos um do outro \n\n", nmr1, nmr2);
        }



    }
}
