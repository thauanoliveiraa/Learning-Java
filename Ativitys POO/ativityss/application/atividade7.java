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
        BankAccount BankAccount = new BankAccount();

        System.out.print("Insert the account number : ");
        
        
    }
    
}
