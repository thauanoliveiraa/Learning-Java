package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class atividade4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);        
        /* Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
        seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
        salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
        afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
        projetada abaixo. */
        
        Employee employee = new Employee();
        System.out.print("Name : ");
        employee.name = scan.nextLine();
        System.out.print("Gross salary : ");
        employee.grossSalary = scan.nextDouble();
        System.out.print("Tax : ");
        employee.tax = scan.nextDouble();

        System.out.printf("Employee : %s, R$ %.2f", employee.name, employee.netSalary());
        System.out.println();

        System.out.print("Which percentage to increase salary ? ");
        employee.percentage = scan.nextDouble();

        System.out.printf("Updated data : %s\nR$ %.2f\n\n", employee.name, employee.increaseSalary());


        scan.close();
    }
}
