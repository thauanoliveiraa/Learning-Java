package application;
import java.util.Scanner;
import java.util.Locale;
import entities.RoomPension;

public class atividade8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         Locale.setDefault(Locale.US);

         /* A dona de um pensionato possui 10 quartos para alugar para estudantes, sendo esses quartos identificados pelos números 0 a 9
         
         Fazer um programa que inicie com todos os 10 quartos vazios, e depois leia uma quantidade N representando o número de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relatório de todas ocupações do pensionato, por ordem de quarto, conforme exemplo */
        
         System.out.print("How many people will rent rooms ? ");
         int n = scan.nextInt();

         for(int i = 0; i < n; i++){
             // OS DADOS DE CADASTRO PRECISAM FICAR AQUI DENTRO
            System.out.printf("\n\n\nDATA %d REGISTRATION", i);
            System.out.print("\nWhats the name of people ? ");
            String name = scan.nextLine();
            name = scan.nextLine(); 
            System.out.print("\nWhats the email of people ? ");
            String email = scan.nextLine();
            System.out.print("\nWhats the bedroom of people ? ");
            int bedroom = scan.nextInt();
            RoomPension roompension = new RoomPension(name, email, bedroom);
         }
         
    }
}
