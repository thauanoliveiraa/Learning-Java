package application;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import entities.EmployeeDataREMAKE2;

public class atividade9REMAKE2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        /* Fazer um programa para ler um numero inteiro N e depois os dados (id, nome e salario) de N funcionarios. Nao deve haver repetição de id
        
        Em seguida, efetuar o aumento de X% no salario de um determinado funcionario. Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionarios, conforme os exemplos.
        
        Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salario pode aumentado com base em uma operação de aumento por uma porcentagem */
        
        List<EmployeeDataREMAKE2> dataList = new ArrayList<>();

        int choice = 0;
        System.out.print("How many employees will be registered ? ");
        int employeeRegister = scan.nextInt();

        for(int i=0; i<employeeRegister; i++){
            System.out.printf("\n\n\n-- %d REGISTER --", i+1);
            System.out.print("\nInsert employee ID : ");
            int employeeID = scan.nextInt();
            while(checkID(dataList, employeeID)){
                System.out.print("\n\nError, this id already exist, try again");
                System.out.print("Insert employee ID : ");
                employeeID = scan.nextInt();
            }
            System.out.print("\nInsert employee name : ");
            scan.nextLine();
            String employeeName = scan.nextLine();
            System.out.print("\nInsert employee salary : ");
            double employeeSalary = scan.nextDouble();
            EmployeeDataREMAKE2 employee = new EmployeeDataREMAKE2(employeeID, employeeName, employeeSalary);
            dataList.add(employee);
        }
        do{
            System.out.print("\n\nWhat would you like to do now ? ");
            System.out.print("1 - VIEW REGISTER\n2 - REMOVE REGISTER\n3 - CHANGE EMPLOYEE NAME\n4 - ADD SALARY PERCENTAGE\n5 - EXIT\n\nInsert your choice : ");
            choice = scan.nextInt();
            switch(choice){
                case 1:
                    System.out.print("\n\nVIEW REGISTER");
                    System.out.print(dataList);
                    System.out.print("View was sucessfully !!!");
                    break;
                
                case 2:
                    System.out.println("\n\nREMOVE REGISTER");
                    System.out.print("Insert the position to remove all data : ");
                    int registerPosition = scan.nextInt();
                    int convertPosition = (registerPosition-1);
                    dataList.remove(convertPosition);
                    System.out.print("\nRemoved was sucessfully !!!");
                    break;
                
                case 3:
                    System.out.print("\n\nCHANGE EMPLOYEE NAME");
                    System.out.print("Insert employee ID to change name : ");
                    int employeeIDchangeName = scan.nextInt();
                    EmployeeDataREMAKE2 employeeChangeName = dataList.stream().filter(x -> x.getEmployeeID() == employeeIDchangeName).findFirst().orElse(null);
                    if(employeeChangeName== null){
                        System.out.print("\nEmployee ID inserted doesnt exist, try again");
                    }
                    else{
                        System.out.print("Insert new employee name : ");
                        scan.nextLine();
                        String newName = scan.nextLine();
                        employeeChangeName.setEmployeeName(newName);
                        System.out.print("\nName changed was sucessfully !!!");
                    }
                    break;

                case 4:
                    System.out.print("\n\nADD SALARY PERCENTAGE");    
                    System.out.print("Insert the emmployee ID to add salary percentage : "); 
                    int findID = scan.nextInt();
                    EmployeeDataREMAKE2 addSalaryPercentage = dataList.stream().filter(x -> x.getEmployeeID() == findID).findFirst().orElse(null);
                    if(addSalaryPercentage == null){
                        System.out.print("\nError, the employee ID inserted doesnt exist");
                    }                
                    else{
                        System.out.print("Insert the salary percentage : ");
                        double salaryPercentage = scan.nextDouble();
                        addSalaryPercentage.percentageSalaryCalc(salaryPercentage);
                        System.out.printf("Percentage inserted was sucessfully to ID %d", findID);
                    }
                    break;
                
                case 5:
                    System.out.print("\n\nThanks for using any services !!! Back later : )");    
                    break;
                }

        }while(choice != 5);

        scan.close();
    }

    public static boolean checkID(List<EmployeeDataREMAKE2> dataList, int employeeID){
        EmployeeDataREMAKE2 employeeCheckID = dataList.stream().filter(x -> x.getEmployeeID() == employeeID).findFirst().orElse(null);
        return employeeCheckID != null;
    }
}
