package application;
import java.util.Scanner;
import java.util.Locale;
import entities.ArrayVerification;


public class atividade10 {
    public static void main(String[] args) {
        /* Fazer um programa para ler dois numeros inteiros M e N, e depois ler uma matriz de M linhas por N colunas contendo numeros inteiros, podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo */
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int lineValue = 0;
        int columValue = 0;
    
        ArrayVerification[][] array = new ArrayVerification[lineValue][columValue];

        System.out.print("Insert line quantity: ");
        int lineQuantity = scan.nextInt();

        System.out.print("Insert colum quantity : ");
        int columQuantity = scan.nextInt();

        for(int i=0; i<lineQuantity; i++){
            for(int j=0; i<columQuantity; i++){
                System.out.printf("\n\n-- %d ARRAY --", i+1);
                System.out.print("\nInsert line value : ");
                lineValue= scan.nextInt();
        
                System.out.print("\nInsert colum value : ");
                columValue = scan.nextInt();
            }
        }

        System.out.print(array[lineValue][columValue] + " ");

        scan.close();
    }
}