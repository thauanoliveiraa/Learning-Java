import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma)*/

        /* quadrante 1 se x e y forem positivos 
           quadrante 2 se x for negativo e y for positivo
           quadrante 3 se x e y forem negativos
           quadrante 4 se y for negativo e x for positivo
           origem se x e y forem iguais a 0 */
        int x = 1;
        int y = 1;

        while(x != 0 && y != 0){

            System.out.print("Digite o valor de X : ");   
            x = scan.nextInt();
            System.out.print("Digite o valor de Y : ");
            y = scan.nextInt();
            if(x > 0 && y > 0){
                System.out.printf("X = %d e Y = %d\n\nQUADRANTE 1 \n\n", x, y);
            }
            else if(x < 0 && y > 0){
                System.out.printf("X = %d e Y = %d\n\nQUADRANTE 2\n\n", x, y);
            }
            else if(x < 0 && y < 0){
                System.out.printf("X = %d e Y = %d\n\nQUADRANTE 3\n\n", x, y);
            }
            else if(x > 0 && y < 0){
                System.out.printf("X = %d e Y = %d\n\nQUADRANTE 4\n\n", x, y);
            }
            else if(x == 0 && y ==0){
                System.out.println("X = %d e Y = %d\n\nORIGEM\n\n");
            }
        }
        if(x == 0){
            System.out.println("X É NULO !!!\n\n");  
        }
        else{
            System.out.println("Y É NULO !!!\n\n");   
        }




    }
}
