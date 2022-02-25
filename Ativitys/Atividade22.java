import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        
        /*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5 */

        Scanner scan = new Scanner(System.in);

        int n, i;
        double valor1, valor2, valor3;

        System.out.print("Digite a quantidade de casos : ");
        n = scan.nextInt();

        for(i=0; i<n; i++){
            
            System.out.print("\n\nDigite o primeiro valor real : ");
            valor1 = scan.nextDouble();
            System.out.print("Digite o segundo valor real : ");
            valor2 = scan.nextDouble();
            System.out.print("Digite o terceorp valor real : ");
            valor3 = scan.nextDouble();
            double mediaPonderada = (2*valor1) + (3*valor2) + (5*valor3 ) / (2+3+5);

            System.out.printf("A media ponderada de acordo com os valores\n\n1 - %.2f\n\n2 - %.2f\n\n3 - %.2f\n\nÉ igual a %.2f", valor1, valor2, valor3, mediaPonderada);
        }
    }
}
