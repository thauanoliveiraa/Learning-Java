import java.util.Scanner;

public class Atividade3{
    public static void main(String[] args) {
        //Recebendo dados do teclado e utilizando estrutura condicional
        Scanner scan = new Scanner(System.in);

        int n;
        
        System.out.print("Digite um número inteiro : ");
        n = scan.nextInt();  
        if(n == 50){
            System.out.print("Voce digitou 50, parabens acertou\n\n");
        }
        else{
            System.out.print("Infelizmente você errou !!!\n\n");
        }
    }
}