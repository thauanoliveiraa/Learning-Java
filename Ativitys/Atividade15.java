import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/

        int valor;

        System.out.print("Digite um número : ");
        valor = scan.nextInt();
        
        if(valor >= 0 && valor <= 25){
            System.out.printf("Voce digitou %d, que está entre 0 e 25\n\n", valor);
        }
        else if(valor >= 25 && valor <=50){
            System.out.printf("Voce digitou %d, que está entre 25 e 50\n\n", valor);
        }
        else if(valor >= 50  && valor <= 75){
            System.out.printf("Voce digitou %d, que está entre 50 e 75\n\n", valor);
        }
        else if(valor >= 75 && valor <= 100){
            System.out.printf("Vode digitou %d, que está entre 75 e 100\n\n", valor);
        }
        else{
            System.out.printf("Voce digitou %d, que não está em nenhum intervalo\n\n", valor);
        }
        




    }
}
