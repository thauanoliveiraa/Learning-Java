package application;

import java.util.Scanner;

import entities.Triangle;

public class atividade1 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.print("Triangulo X");
        System.out.print("\n\nDigite o valor do lado a : ");
        x.a = scan.nextDouble();
        System.out.print("\n\nDigite o valor do lado b : ");
        x.b = scan.nextDouble();
        System.out.print("\n\nDigite o valor do lado c : ");
        x.c = scan.nextDouble();

        System.out.print("\n\n\nTriangulo Y");
        System.out.print("\n\nDigite o valor do lado a : ");
        y.a = scan.nextDouble();
        System.out.print("\n\nDigite o valor do lado b : ");
        y.b = scan.nextDouble();
        System.out.print("\n\nDigite o valor do lado c : ");
        y.c = scan.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        if(areaX > areaY){
            System.out.printf("\n\nA maior área é a de X com valor %.2f\nA menor área é de Y com valor %.2f\n\n", areaX, areaY);

        }
        else if(areaY > areaX){
            System.out.printf("\n\nA maior área é a de Y com valor %.2f\n\nA menor área é de X com valor %.2f\n\n", areaY, areaX);
        }
        else{
            System.out.print("\n\nOs valores são iguais\n\n");
        }
    }    
}
