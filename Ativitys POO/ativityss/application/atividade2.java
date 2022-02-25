package application;
import java.util.Scanner;
import entities.Product;
import java.util.Locale;

public class atividade2{
 public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner scan = new Scanner(System.in);
     /* Fazer um programa para ler os dados de um produto em estoque (NOME, PREÇO E QUANTIDADE NO ESTOQUE) em seguida : 
     
     Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
     
     Realizar uma entrada no estoque e mostrar novamente os dados do produto
     
     Realizar uma saida no estoque e mostrar novamente os dados do produto*/

    Product product = new Product();
    System.out.println("Product Data\n\n");
    System.out.print("Name : ");
    product.name = scan.nextLine();
    System.out.print("Price : ");
    product.price = scan.nextDouble();
    System.out.print("Quantity in stock : ");
    product.quantity = scan.nextInt();

    System.out.printf("Product name :" +product.name);
    System.out.println();
    System.out.printf("Product price :" +product.price);
    System.out.println();
    System.out.printf("Product quantity : " +product.quantity);
    System.out.println();
    System.out.printf("Product price in stock : " +product.totaValueInStock());
    System.out.println();

    System.out.print("Enter the number of products to be added in stock : ");
    int quantity = scan.nextInt();
    product.addProductQuantity(quantity);

    System.out.printf("Updated name : " +product.name);
    System.out.printf("Updated quantitiy : " +product.quantity);
    System.out.printf("Updated price in stock : " +product.totaValueInStock());

    System.out.print("Enter the number of products to deleted the stock : ");
    int quantityy = scan.nextInt();
    product.removeProducts(quantityy);

    System.out.printf("Updated name : " +product.name);
    System.out.printf("Updated quantitiy : " +product.quantity);
    System.out.printf("Updated price in stock : " +product.totaValueInStock());
 }
}
