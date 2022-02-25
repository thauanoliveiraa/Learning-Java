package application;
import java.util.Scanner;
import java.util.Locale;
import entities.CurrencyConverter;

public class atividade6 {
    public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner scan = new Scanner(System.in);
     /*Faça um programa para ler a cotação do dolar, e depois um valor em dolares a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.*/

    CurrencyConverter dolar = new CurrencyConverter();

    System.out.print("What os the dollar price ? $ ");
    dolar.dolarPrice = scan.nextDouble();
    System.out.print("How many dollars will be bought ? $ ");
    dolar.dolarQuantity = scan.nextDouble();

    System.out.printf("Amount to be paid in reais = R$ %.2f\n\n", CurrencyConverter.convertion());

    scan.close();        
    }
}
