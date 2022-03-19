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

        int choice = 0;
        int searchID = 0;
        Integer employeeID;
        String employeeName;
        Double employeeWage = 0.00;

        /* Fazer um programa para ler um numero inteiro N e depois os dados (id, nome e salario) de N funcionarios. Nao deve haver repetição de id
        
        Em seguida, efetuar o aumento de X% no salario de um determinado funcionario. Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionarios, conforme os exemplos.
        
        Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salario pode aumentado com base em uma operação de aumento por uma porcentagem */

        System.out.print("How many employees will be registered ? ");
        int employeeRegister = scan.nextInt();

        for(int i =0; i<employeeRegister; i++){
            System.out.printf("\n\n--%d REGISTER--", i+1);
            System.out.print("\n\nInsert the ID : ");
            employeeID = scan.nextInt();
            while(checkID(dataList, employeeID)){
                System.out.print("This ID already exists, try again");
                System.out.print("\n\nInsert the ID : ");
                employeeID = scan.nextInt();
            }
            System.out.print("Insert the name : ");
            employeeName = scan.nextLine();
            employeeName = scan.nextLine();
            System.out.print("Insert the actual wage R$ ");
            employeeWage = scan.nextDouble();
            EmployeeData employee = new EmployeeData(employeeID, employeeName, employeeWage);

			dataList.add(employee);
        }

        System.out.print("\n\nRegister sucessfully !!!\n\n");
        System.out.println(dataList.size());
        
        do{
            System.out.print("\n\nChoose what to do now :\n\n1 - View registry\n\n2 - Remove registry\n\n3 - Add salary porcentage\n\n4 - Exit\n\nChoice : ");
            int choose = scan.nextInt();

            switch(choose){
                case 1:
                    System.out.print("VIEW REGISTERS\n\n");
                    System.out.print(dataList);
                    break;

                case 2:
                    System.out.print("REMOVE REGISTRY\nObservation, insert the position to remove all elements of this (Remember, lists starting zero [0])\n\n");
                    System.out.print("Insert the position to remove all elements : ");
                    int position = scan.nextInt();
                    int configuratePosition = (position-1);
                    if(configuratePosition <= employeeRegister){
                        dataList.remove(configuratePosition);
                        System.out.print("Remove sucessfully\n\n");
                    }
                    else{
                        System.out.print("Error, the position doesnt exist !!! Try again");
                    }
                    break;

                case 3:
                    System.out.print("ADD SALARY PORCENTAGE\n\n");
                    System.out.println("Insert the employee ID : ");
                    int findID = scan.nextInt();

                    EmployeeData employee = dataList.stream().filter(x -> x.getEmployeeID() == findID).findFirst().orElse(null);
                    
                    if(employee == null){
                        System.out.print("Error, the inserted ID doesnt exist, try again");
                    }
                    else{
                        System.out.print("Insert the porcentage do add at salary % ");
                        int wagePorcentage = scan.nextInt();
                        employee.porcentageEmployeeWage(wagePorcentage);
                    }
                    break;

                case 4:
                    System.out.print("Thanks for using : ) ");

                    
                    //colocar indexof e ver o que fazer

                    // porcentagem = porcentagem dada / 100
                    //salario + (salario * porcentagem )


            }

        }while(choice != 4);

        scan.close();
    }

    public static boolean checkID(List<EmployeeData> dataList, int employeeID){
        EmployeeData employee = dataList.stream().filter(x -> x.getEmployeeID() == employeeID).findFirst().orElse(null);
        return employee != null;
    }
}
