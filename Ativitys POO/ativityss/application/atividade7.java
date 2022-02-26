package application;
import java.util.Scanner;
import java.util.Locale;
import entities.BankAccount;

public class atividade7 {
    public static void main(String[] args) {
        /*Em um banco, para se cadastrar uma conta bancária, é necessario informar O NUMERO DA CONTA, O NOME DO TITULAR DA CONTA e o VALOR DE DEPOSITO INICIAL que o titular depositou ao abrir a conta.
        
        Esse valor de deposito inicial, é opcional, ou seja, se o titular não tiver dinheiro a depositar no momento de abrir sua conta, o deposito inicial nao será feito e o saldo inicial será 0
        
        IMPORTANTE : UMA VEZ QUE UMA CONTA BANCARIA FOI ABERTA, O NUMERO DA CONTA NUNCA PODERÁ SER ALTERADO 
        
        MÁS, O NOME DO TITULAR PODE SER ALTERADO (A PESSOA PODE MUDAR DE NOME POR OCASIAO DE CASAMENTO E ENTRE OUTRAS COISAS)
        
        Por fim, o saldo de uma conta nao pode ser alterado livremente. É PRECISO HAVER UM MECANISMO PARA PROTEGER ISSO. O saldo so aumenta por meio de depositos e so diminui por meio de saques
        
        Para cada saque realizado, o banco cobra uma taxa de R$ 5,00 (A CONTA PODE FICAR COM UM SALDO NEGATIVO SE O SALDO NAO FOR SUFICIENTE PARA REALIZAR O SAQUE OU PAGAR A TAXA / OU SEJA, SE A CONTA NAO TIVER O MINIMO PARA SACAR OU PAGAR A TAXA, O SALDO VAI SER NEGATIVO)
        
        Voce deve fazer um PROGRAMA QUE REALIZE O CADASTRO DE UMA CONTA, DANDO OPÇAO PARA QUE SEJA OU NAO INFORMADO O VALOR DO DEPOSITO INICIAL. EM SEGUIDA, REALIZAR UM DEPOISTO E DEPOIS UM SAQUE (SEMPRE MOSTRANDO OS DADOS DA CONTA APOS CADA ALTERAÇÃO)*/
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int choice;
        double initialDeposit;
        
        System.out.print("Insert the account number : ");
        int accountNumber = scan.nextInt();

        System.out.print("Insert the account name : ");
        String accountName = scan.nextLine();
        accountName = scan.nextLine();
        BankAccount bankaccount = new BankAccount(accountNumber, accountName);

        System.out.print("Would you like make a initial deposit ? ");
        String choiceDeposit = scan.nextLine();
        switch(choiceDeposit){
            case "y":
                System.out.print("Insert initial value R$ ");
                initialDeposit = scan.nextDouble();
                double moneyValue = scan.nextDouble();
                bankaccount.setMoneyDeposit(moneyValue);
                System.out.printf("New account balance R$ %.2f", bankaccount.getAccountBalance());
                break;

            case "n":
                System.out.print("Ok, understand");    
                break;
        }
        System.out.println("Account number : " +accountNumber);
        System.out.println("Account titular name : " +accountName);
        System.out.printf("Account initial deposit value R$ %.2f", bankaccount.getInitialDepositValue());

        do{
            System.out.print("\n\n\n\nWhat would you like to do ? \n\n1 - View account number\n\n2 - View titular account name \n\n3 - Change titular account name\n\n4 - View account balance\n\n5 - Money deposit\n\n6 - Money withdraw\n\n7 - Exit\n\nInsert your choice : ");
            choice = scan.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Account number : " +bankaccount.getAccountNumber());
                    break;
                case 2:
                    System.out.print("Titular account name : " +bankaccount.getAccountName());
                    break;
                
                case 3:
                    System.out.print("Insert a new name : ");
                    String newName = scan.nextLine();
                    newName = scan.nextLine();

                    bankaccount.setAccountName(newName);
                    System.out.print("New name : " +bankaccount.getAccountName());
                    // NOVO VALOR VAI ESTAR DENTRO (NO LUGAR DO accountName)
                    break;

                case 4:
                    System.out.printf("Account balance R$ %.2f", bankaccount.getAccountBalance());
                    break;
                    
                case 5:
                    System.out.print("Insert a money quantity R$ ");
                    double moneyValue = scan.nextDouble();
                    bankaccount.setMoneyDeposit(moneyValue);
                    System.out.printf("New account balance R$ %.2f", bankaccount.getAccountBalance());
                    break;

                case 6:
                    System.out.print("Insert a withdraw quantity R$ ");
                    double moneyQuantityWithDraw = scan.nextDouble();
                    bankaccount.setMoneyWithdraw(moneyQuantityWithDraw);
                    System.out.printf("New account balance R$ %.2f", bankaccount.getAccountBalance());     
                    break;

                case 7:
                    System.out.println("Thanks for using");
                    System.out.println("Made by AURORA");   
                    break;

                default:
                    System.out.print("Insert a correct number and try again !!!");
                    break;
            }

        }while(choice!=7);

        scan.close();
    }
    
}
