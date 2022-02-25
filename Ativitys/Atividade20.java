import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*  Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso. */

        int i;

        System.out.print("Digite um número inteiro : ");
        int x = scan.nextInt();

        for(i=0; i<x; i++){
            int calculo = (i+1)%2; /* Aqui, criamos essa variavel calculo que recebe a soma i +1 e depois o resto da divisao por 2, a logica aqui, é de pegar o valor de i+1, que esta de acordo com o i++, esse valor de i+1 vau assumir de uma certa forma, o valor de x, e depois o resto da divisao por 2 é tirado, que a depender do numero, se for igual a 0 vai ser par e vai entrar no else, se for impar vai ser 1 e vai entra no if, printando os numeros impares*/

            if(calculo == 1){
                System.out.printf("%d\n\n", i+1);
            }
        }
        
    }
}
