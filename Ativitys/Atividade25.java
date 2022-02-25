import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        /* Fazer um programa para ler as medidas dos lados de dois triangulos X e Y (suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área
        
        A formula para calcular a area de um triangulo a partir das medidas de seus lados a, b e c é a formula de heron : area = √p(p-a) (p-b) (p-c) onde p = a + b + c / 2 */

        Scanner scan = new Scanner(System.in);

        double a, b, c, x, y;
        double p1, p2;
        double calculo1, calculo2;
        double area1, area2;

        System.out.print("Triangulo X");
        System.out.print("\n\nDigite o valor do lado a : ");
        a = scan.nextDouble();
        System.out.print("\n\nDigite o valor do lado b : ");
        b = scan.nextDouble();
        System.out.print("\n\nDigite o valor do lado c : ");
        c = scan.nextDouble();

        p1 = (a+b+c)/2;

        calculo1 = p1*(p1-a)*(p1-b)*(p1-c);

        area1 = Math.sqrt(calculo1);
        System.out.printf("%.2f", area1);


        System.out.print("\n\n\nTriangulo Y");
        System.out.print("\n\nDigite o valor do lado a : ");
        a = scan.nextDouble();
        System.out.print("\n\nDigite o valor do lado b : ");
        b = scan.nextDouble();
        System.out.print("\n\nDigite o valor do lado c : ");
        c = scan.nextDouble();

        p2 = (a+b+c)/2;

        calculo2 = p2*(p2-a)*(p2-b)*(p2-c);

        area2 = Math.sqrt(calculo2);

        System.out.printf("%.2f", area2);

        if(area1 > area2){
            System.out.printf("\n\nA maior área é a de X com valor %.2f\nA menor área é de Y com valor %.2f\n\n", area1, area2);

        }
        else if(area2 > area1){
            System.out.printf("\n\nA maior área é a de Y com valor %.2f\n\nA menor área é de X com valor %.2f\n\n", area2, area1);
        }
        else{
            System.out.print("\n\nOs valores são iguais\n\n");
        }
        
    }
}
