package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Rectangle;

public class atividade3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        /* Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de
        uma área, perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado */
    
        Rectangle rectangle = new Rectangle();
        System.out.print("Insert the width rectangle : ");
        rectangle.width = scan.nextDouble();
        System.out.print("Insert the height rectangle : ");
        rectangle.height = scan.nextDouble();
        System.out.println();
        System.out.printf("Rectangle area = %.2f", +rectangle.area());
        System.out.println();

        System.out.printf("Rectangle perimeter = %.2f", +rectangle.perimeter());
        System.out.println();

        System.out.printf("Rectangle diagonal = %.2f", +rectangle.diagonal());
        System.out.println();
        
        scan.close();
        
    }
}
