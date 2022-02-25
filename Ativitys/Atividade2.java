public class Atividade2 {
    public static void main(String[] args){
        //Escreva um programa que produza dados como saida

        String produto1 = "Computer";
        String produto2 =  "Office.desk";
        int idade = 30;
        int codigo = 5290;
        char gender = 'F';
        double preco1 = 2100.0;
        double preco2 = 650.50;
        double measure = 53.234567;

        System.out.printf(" Products : \n Computer which price is $ %.2f\n Office desk, price is $ %.2f\n\n Record : %d years old, code %d and gender : %s\n", preco1, preco2, idade, codigo, gender);
        System.out.println("\n");
        System.out.printf(" Measue with eight decimal places : %.2f\n Round (three decimal places) : %f \n US decimal point : %.2f\n\n", measure, measure, measure);


    }
}
