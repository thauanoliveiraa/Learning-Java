package application;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.Instant;
import entities.AuroraEngine;


public class auroraRegisterSystem{
    public static void main(String[] args) throws IOException, InterruptedException{
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<AuroraEngine> auroraList = new ArrayList<>(); //Criação da lista para armazenamento dos registros

        SimpleDateFormat auroraSystemDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date auroraDate = auroraSystemDate.parse("dd/MM/yyyy HH:mm:ss");

        //pedir dados como marca do carro, modelo do carro, placa do carro e valor do carro

        System.out.print("Name : ");
        String loginName = scan.nextLine();
        System.out.print("Password : ");
        String loginPassword = scan.nextLine();

        if(loginPassword.equals("auroraSystem3323")){
            if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
        }
                    
        Thread.sleep(3000);
        System.out.print("Welcome "+loginName);
        System.out.print("access in "+auroraSystemDate.format(auroraDate));
        
        else{
            System.out.print("Errado");
        }


        //Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
        
        
    }
}