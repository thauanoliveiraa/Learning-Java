package application;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import entities.AuroraEngine;


public class auroraRegisterSystem{
    public static void main(String[] args) throws IOException, InterruptedException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<AuroraEngine> auroraList = new ArrayList<>(); //Criação da lista para armazenamento dos registros

        //pedir dados como marca do carro, modelo do carro, placa do carro e valor do carro


        System.out.print("Insira a marca do carro : ");

        System.out.println("Teste");
        String texto = scan.next();

        //Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
        
        
    }
}