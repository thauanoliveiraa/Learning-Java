package application;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.Instant;
import java.util.Calendar;
import entities.AuroraEngine;


public class auroraRegisterSystem{
    public static void main(String[] args) throws IOException, InterruptedException{
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        AuroraEngine aurora = new AuroraEngine();

        // , ParseException

        List<AuroraEngine> auroraList = new ArrayList<>(); //Criação da lista para armazenamento dos registros

        /* SimpleDateFormat auroraSystemDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date auroraDate = auroraSystemDate.parse("dd/MM/yyyy HH:mm:ss"); */

        //Date auroraSystemDate = new Date();

        Calendar c = Calendar.getInstance();

        Date dataHoraAtual = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        String horaa = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

         int hora = 0;

         int month = 0;

        //pedir dados como marca do carro, modelo do carro, placa do carro e valor do carro

System.out.print(horaa);

        System.out.print("Name : ");
        String loginName = scan.nextLine();
        System.out.print("Password : ");
        String loginPassword = scan.nextLine();

        if(loginPassword.equals("auroraSystem3323")){
            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            
            else
                Runtime.getRuntime().exec("clear");

            Thread.sleep(3000);
            
            hora = c.get(Calendar.HOUR_OF_DAY);

            month = c.get(Calendar.MONTH)+1;

            if(hora > 6 && hora < 12){
                    System.out.println("Good Morning, welcome "+loginName);
                    //System.out.print("Welcome "+loginName);
             } else if(hora > 12 && hora < 18){
                    System.out.println("Good Afternoon, welcome "+loginName);
                } else{
                    System.out.println("Good Night, welcome "+loginName);
                }
  
            if(month == 1){ 
                System.out.println("Access in January");
            }else if(month == 2){ 
                System.out.println("Access in February");
            }else if(month == 3){ 
                System.out.println("Access in March");
            }else if(month == 4){ 
                System.out.println("Access in April");
            }else if(month == 5){ 
                System.out.println("Access in May");
            }else if(month == 6){ 
                System.out.println("Access in June");
            }else if(month == 7){ 
                System.out.println("Access in July");
            }else if(month == 8){ 
                System.out.println("Access in August");
            }else if(month == 9){ 
                System.out.println("Access in September");
            }else if(month == 10){ 
                System.out.println("Access in October");
            }else if(month == 11){ 
                System.out.println("Access in November");
            }else if(month == 12){ 
                System.out.println("Access in December");
            }else{
                System.out.println("Don´t identify the access");
            }

        } else {
            System.out.print("Password is not correct, try again"); // VER COMO RETORNAR PARA O INICIO
            //return; TESTAR COMO RETORNAR PARA O INICIO
        }
    

            /* Thread.sleep(3000);
            int hora = c.get(Calendar.HOUR_OF_DAY);

            int month = c.get(Calendar.MONTH)+1; */

        
            //System.out.println("Mês: "+c.get(Calendar.MONTH));
           
            //System.out.println(auroraSystemDate);

            /* System.out.println("Data/Hora atual: "+c.getTime());

            
            System.out.println("Ano: "+c.get(Calendar.YEAR));
            System.out.println("Mês: "+c.get(Calendar.MONTH));
            System.out.println("Dia do Mês: "+c.get(Calendar.DAY_OF_MONTH));  */     

        /* System.out.print("How many employees will be registered ? ");
        int auroraCarRegister = scan.nextInt();

        for(int i = 0; i<auroraCarRegister; i++){
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
                        double salaryPercentage = scan.nextInt();
                        employee.salaryChoosePercentage(salaryPercentage);
                        System.out.print("Percentage added was sucessfully");
                    }
                    break;
                
                case 4:
                    System.out.print("Insert the id want to change name : ");
                    int findPosition = scan.nextInt();
                    EmployeeDataREMAKE employeeChangeName = dataList.stream().filter(x -> x.getEmployeeID() == findPosition).findFirst().orElse(null); 

                    if(employeeChangeName == null){
                        System.out.print("The name doesnt exist in register");
                    }
                    else{
                        System.out.print("Insert the new name : ");
                        String newName = scan.nextLine();
                        newName = scan.nextLine();
                        employeeChangeName.setEmployeeName(newName);
                        System.out.print("Changed name sucessfully");
                    }
                    break;
                
                case 5:
                    System.out.print("Thanks for using !!!");
                    break;
            }
        }while(choice !=5);

        scan.close(); */
    }
}

/* public static boolean checkID(List<EmployeeDataREMAKE> dataList, int employeeID) {
    EmployeeDataREMAKE employee = dataList.stream().filter(x -> x.getEmployeeID() == employeeID).findFirst().orElse(null);
    return employee != null;
} */


/* public static void identifyMonth(List<EmployeeDataREMAKE> dataList, int employeeID) {
    EmployeeDataREMAKE employee = dataList.stream().filter(x -> x.getEmployeeID() == employeeID).findFirst().orElse(null);
    return employee != null;
} */