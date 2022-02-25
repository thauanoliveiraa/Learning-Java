package entities;

public class CurrencyConverter {
    public static double dolarPrice;
    public static double dolarQuantity;
    
    public static double convertion(){
        double dolarToReal = (dolarQuantity * dolarPrice);
        double totalReal = dolarToReal + (dolarToReal * 0.06);
        return totalReal;
    }
}
