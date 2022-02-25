import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.*/

        int codigo;
        int quantidade;
        double calculo;

        System.out.print("Digite o código do produto : ");
        codigo = scan.nextInt();
        switch(codigo){
            case 1:
                System.out.println("Voce escolheu cachorro-quente\n\n");
                System.out.print("Digite a quantidade que voce deseja : ");
                quantidade = scan.nextInt();
                calculo = (quantidade*4.00);
                System.out.printf("De acordo com a quantidade %d\nO valor total a ser pago é de R$ %.2f\n\n", quantidade, calculo);
                break;

            case 2:
                System.out.println("Voce escolheu x-salada\n\n");
                System.out.print("Digite a quantidade que voce deseja : ");
                quantidade = scan.nextInt();
                calculo = (quantidade*4.50);
                System.out.printf("De acordo com a quantidade %d\nO valor total a ser pago é de R$ %.2f\n\n", quantidade, calculo);
                break;

            case 3:
                System.out.println("Voce escolheu x-bacon\n\n");
                System.out.print("Digite a quantidade que voce deseja : ");
                quantidade = scan.nextInt();
                calculo = (quantidade*5.00);
                System.out.printf("De acordo com a quantidade %d\nO valor total a ser pago é de R$ %.2f\n\n", quantidade, calculo);
                break;

            case 4:
                System.out.println("Voce escolheu torrada simples\n\n");
                System.out.print("Digite a quantidade que voce deseja : ");
                quantidade = scan.nextInt();
                calculo = (quantidade*2.00);
                System.out.printf("De acordo com a quantidade %d\nO valor total a ser pago é de R$ %.2f\n\n", quantidade, calculo);
                break;

            case 5:
                System.out.println("Voce escolheu refrigerante\n\n");
                System.out.printf("Digite a quantidade que voce deseja : ");
                quantidade = scan.nextInt();
                calculo = (quantidade*1.50);
                System.out.printf("De acordo com a quantidade %d\nO valor total a ser pago é de R$ %.2f\n\n", quantidade, calculo);
                break;

            default:
                System.out.println("Por favor, certifique-se que digitou o código do produto corretamente\n\n");
        }

    }
}
