import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação*/
        
        double x, y;

        System.out.print("Digite o valor de X : ");
        x = scan.nextDouble();
        System.out.print("Digite o valor de Y : ");
        y = scan.nextDouble();
        
        /* quadrante 1 se x e y forem positivos 
           quadrante 2 se x for negativo e y for positivo
           quadrante 3 se x e y forem negativos
           quadrante 4 se y for negativo e x for positivo
           origem se x e y forem iguais a 0 */

        if(x > 0 && y > 0){
            System.out.printf("X = %.2f e Y = %.2f\n\nQUADRANTE \n\n", x, y);
        }
        else if(x < 0 && y > 0){
            System.out.printf("X = %.2f e Y = %.2f\n\nQUADRANTE 2\n\n", x, y);
        }
        else if(x < 0 && y < 0){
            System.out.printf("X = %.2f e Y = %.2f\n\nQUADRANTE 3\n\n", x, y);
        }
        else if(x > 0 && y < 0){
            System.out.printf("X = %.2f e Y = %.2f\n\nQUADRANTE 4\n\n", x, y);
        }
        else if(x == 0 && y ==0){
            System.out.println("X = %.2f e Y = %.2f\n\nORIGEM\n\n");
        }
        else{
            System.out.println("Tente novamente\n\n");

        }

        







    }
}
