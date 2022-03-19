package application;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import entities.EmployeeDataREMAKE;

public class atividade9REMAKE {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<EmployeeDataREMAKE> dataList = new ArrayList<>();
        int choice = 0;

        /* Fazer um programa para ler um numero inteiro N e depois os dados (id, nome e salario) de N funcionarios. Nao deve haver repetição de id
        
        Em seguida, efetuar o aumento de X% no salario de um determinado funcionario. Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionarios, conforme os exemplos.
        
        Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salario pode aumentado com base em uma operação de aumento por uma porcentagem */

        System.out.print("How many employees will be registered ? ");
        int employeeRegister = scan.nextInt();

        for(int i = 0; i<employeeRegister; i++){
            System.out.println("\n\n");
            System.out.printf("-- %d REGISTER --\n", i+1);
            System.out.print("\nInsert the ID : ");
            int employeeID = scan.nextInt();
            while(checkID(dataList, employeeID)){
                System.out.print("This ID already exist, try again\n\n");
                System.out.print("Insert the ID : ");
                employeeID = scan.nextInt(); 
            }
            System.out.print("\nInsert the name : ");
            String employeeName = scan.nextLine();
            employeeName = scan.nextLine();
            System.out.print("\nInsert the actual salary R$ ");
            double employeeSalary = scan.nextDouble();

            EmployeeDataREMAKE employee = new EmployeeDataREMAKE(employeeID, employeeName, employeeSalary);

            dataList.add(employee);
        }     
        System.out.print("Resgister sucessfully !!!\n\n\n");

        do{
            System.out.print("\n\n\nWhat would you like to do now ?\n");
            System.out.println("1 - View registry\n\n2 - Remove registry\n\n3 - Add percentage salary\n\n4 - Change name\n\n5 - Exit\n\n\nInsert your choice : ");
            choice = scan.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("\n\n");
                    System.out.print(dataList);
                    break;

                case 2:
                    System.out.print("Insert the position of registry to remove all data : ");
                    int positionRemove = scan.nextInt();
                    int convertPosition = (positionRemove-1);
                    dataList.remove(convertPosition);
                    break;
                
                case 3: 
                    System.out.print("Insert the ID : ");
                    int findID = scan.nextInt();

                    EmployeeDataREMAKE employee = dataList.stream().filter(x -> x.getEmployeeID() == findID).findFirst().orElse(null);

                    if(employee == null){
                        System.out.print("The ID doesnt exist, try again");
                    }
                    else{
                        System.out.print("Insert the percentage % ");
                        int salaryPercentage = scan.nextInt(); 
                        employee.chooseSalary(salaryPercentage);
                    }
                    break;
                
                case 4:
                    break;
                
                case 5:
                    break;
            }
        }while(choice !=5);

        scan.close();
    }

    public static boolean checkID(List<EmployeeDataREMAKE> dataList, int employeeID) {
        EmployeeDataREMAKE employee = dataList.stream().filter(x -> x.getEmployeeID() == employeeID).findFirst().orElse(null);
        return employee != null;
    }
}
