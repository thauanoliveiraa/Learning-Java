import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/
        
        Scanner scan = new Scanner(System.in);

        int n, i;
        double valor1, valor2;

        System.out.print("Digite a quantidade de vezes : ");
        n = scan.nextInt();

        for(i=0; i<n; i++){
            System.out.print("\n\nDigite o valor 1 : ");
            valor1 = scan.nextDouble();
            System.out.print("Digite o valor 2 : ");
            valor2 = scan.nextDouble();
            
            double calculo = (valor1 / valor2);
            if(valor1 >= 0 && valor2 > 0){
                System.out.printf("\n\nO valor %.0f dividido por %.0f\nÉ igual a %.0f\n\n", valor1, valor2, calculo);
            }
            else if(valor2 <= 0){
                System.out.println("\n\nDivisão impossível\n\n");
            }

        }

    }
}
