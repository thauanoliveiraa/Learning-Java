package application;
import java.util.Scanner;
import java.util.Locale;
import entities.ArrayVerification;


public class atividade10 {
    public static void main(String[] args) {
        /* Fazer um programa para ler dois numeros inteiros M e N, e depois ler uma matriz de M linhas por N colunas contendo numeros inteiros, podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo */
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int j = 0;

        System.out.print("Insert quantity : ");
        int n = scan.nextInt();

        int[][] array = new int[n][n];


        try{
            for(i=0; i<n; i++){
                for(j=0; i<n;  j++){
                    System.out.print("Insert value : ");
                    array[i][j] = scan.nextInt();
        
                }
            }
        }

        catch(ArrayIndexOutOfBoundsException ae[]){
            System.out.println("Também nao entendi" +ae.getMessage());	
        }

        finally{

        }

        //ArrayVerification arrayVerification = new ArrayVerification(lineValue, columValue);

        scan.close();
    }
}