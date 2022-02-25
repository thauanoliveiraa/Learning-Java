import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            /* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (atéque seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito amensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.*/ 

            int tipoCombustivel = 0;
            
            while(tipoCombustivel != 4){
                System.out.println("\n\nTipos de combustivel\n\n");
                System.out.print(" 1 - Álcool\n\n 2 - Gasolina\n\n 3 - Diesel\n\n 4 - Fim\n\n Digite uma opção : ");
                tipoCombustivel = scan.nextInt();
                switch(tipoCombustivel){
                    case 1:
                    System.out.println("ALCOOL\n\n");
                    break;

                    case 2:
                    System.out.println("GASOLINA\n\n");
                    break;        

                    case 3:
                    System.out.println("DIESEL\n\n");
                    break;

                    case 4:
                    System.out.println(" Fim ");
                    break;

                }
            }
            System.out.println(" OBRIGADO !!!");

    }

}
