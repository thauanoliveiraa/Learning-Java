package application;
import java.util.Scanner;
import java.util.Locale;
import entities.EmployeeData;
import java.util.List;
import java.util.ArrayList;

public class atividade9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<EmployeeData> dataList = new ArrayList<>();

        /* Fazer um programa para ler um numero inteiro N e depois os dados (id, nome e salario) de N funcionarios. Nao deve haver repetição de id
        
        Em seguida, efetuar o aumento de X% no salario de um determinado funcionario. Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionarios, conforme os exemplos.
        
        Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salario pode aumentado com base em uma operação de aumento por uma porcentagem */

        System.out.print("How many employees wil be registered ? ");
        int employeeRegister = scan.nextInt();

        for(int i =0; i<employeeRegister; i++){
            System.out.print("\n\nInsert your ID : ");
            int employeeID = scan.nextInt();

            System.out.print("Insert your name : ");
            String employeeName = scan.nextLine();
            employeeName = scan.nextLine();

            System.out.print("Insert your actual wage : ");
            double employeeWage = scan.nextDouble();
            List<EmployeeData> dataList = new ArrayList<>();

            List.add();

        }

        System.out.print("\n\nRegister sucessfuly !!!");



        scan.close();
    }
}