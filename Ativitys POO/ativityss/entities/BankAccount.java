package entities;

public class BankAccount {
    private int accountNumber;
    private String accountName;
    private double initialDeposit;
    private double moneyQuantityValue = 0.00;

    /* Deposito (inicial tambem) , saque (incluir taxa de R$ 5,00),  ver numero da conta, ver nome da conta, ver saldo  SÃO MÉTODOS */

    public BankAccount(int accountNumber, String accountName){ // CONSTRUTOR PARA TORNAR OBRIGATORIO A ENTRADA DESSES DADOS
        this.accountNumber = accountNumber;
        this.accountName = accountName;

    }
    
    public BankAccount(double initialDeposit){
        setMoneyQuantityValue(initialDeposit);
    }

    public int getAccountNumber(){ // VER NUMERO DA CONTA
        return accountNumber;
    }
    
    public String getAccountName(){ // VER NOME DA CONTA
        return accountName;
    }

    public void setAccountName(String accountName){ // ALTERAR NOME DA CONTA
        this.accountName = accountName; 
    }

    public double getAccountBalance(){ // VER SALDO DA CONTA
        return moneyQuantityValue;
    }

    public void setInitialDepositValue(double ){
        return moneyQuantityValue; 
    }

    public void setMoneyDeposit(double moneyQuantityValue){ // FAZER DEPOSITO
        this.moneyQuantityValue += moneyQuantityValue;
    }
 
    public void setMoneyWithdraw(double moneyQuantityValue){ // FAZER SAQUE 
        this.moneyQuantityValue -= moneyQuantityValue + 5.00;
    }
}
