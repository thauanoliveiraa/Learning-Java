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

        //pedir dados como marca do carro, modelo do carro, placa do carro e valor do carro

        System.out.print("Name : ");
        String loginName = scan.nextLine();
        System.out.print("Password : ");
        String loginPassword = scan.nextLine();

        if(loginPassword.equals("auroraSystem3323")){
            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            
            else
                Runtime.getRuntime().exec("clear");
        }                        
            Thread.sleep(3000);
            int hora = c.get(Calendar.HOUR_OF_DAY);

            int month = c.get(Calendar.MONTH);

            

            System.out.println("Mês: "+c.get(Calendar.MONTH));

            if(hora > 6 && hora < 12){
                System.out.println("Good Morning, welcome "+loginName);
                //System.out.print("Welcome "+loginName);
            }
            else if(hora > 12 && hora < 18){
                System.out.println("Good Afternoon, welcome "+loginName);
            }
            else{
                System.out.println("Good Night, welcome "+loginName);
            }
            System.out.println("Access in "+aurora.getMonth());
           
            //System.out.println(auroraSystemDate);

            /* System.out.println("Data/Hora atual: "+c.getTime());
            System.out.println("Ano: "+c.get(Calendar.YEAR));
            System.out.println("Mês: "+c.get(Calendar.MONTH));
            System.out.println("Dia do Mês: "+c.get(Calendar.DAY_OF_MONTH));  */ 
        }
    }
}