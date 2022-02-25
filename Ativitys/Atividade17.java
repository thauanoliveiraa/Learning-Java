import java.util.Scanner;

public class Atividade17{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/

        // String correctPassword = "admin3323";

        System.out.print("Username : ");
        String username = scan.next();
        System.out.print("Password : ");
        int password = scan.nextInt();

        while(password != 2002){
            System.out.println("Error, password is not correct, try again");
            System.out.print("Password : ");
            password = scan.nextInt();
        }
        System.out.print("Welcome, you are logged");
    }
}