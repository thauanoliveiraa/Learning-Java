package application;
import java.util.Scanner;

public class atividade10 {
    public static void main(String[] args) {
        /* faça um programa que preencha uma matriz 5x3 com numeros inteiros, e some cada uma das colunas, armazenando o resultado da soma em um vetor. A seguir o programa devera multiplicar cada elemento da matriz pela soma da coluna e mostrar a matriz resultante. */

        Scanner scan = new Scanner(System.in);

        int[][] array = new int[5][3];

        for(int i=0; i <array.length; i++){
            for(int j=0; j <array[i].length; j++){
                System.out.print("\n\n");
                System.out.printf("Insert %d number : ", j+1);
                array[i][j] = scan.nextInt();
            }
        }

        scan.close();
    }
}
