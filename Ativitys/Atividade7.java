import java.util.Scanner;

public class Atividade7{
    public static void main(String[] args) {
     
        /*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/

        Scanner scan = new Scanner(System.in);

        int nmrFuncionario;
        int hrsTrabalhadas;
        double valorHora;
        

        System.out.print("Digite o número do funcionario : ");
        nmrFuncionario = scan.nextInt();
        System.out.print("Digite o número de horas trabalhadas (ARREDONDE EM CASO DE HORA QUEBRADA) : ");
        hrsTrabalhadas = scan.nextInt();
        System.out.print("Digite o valor que você recebe por hora R$ ");
        valorHora = scan.nextDouble();

        double valorSalario = (hrsTrabalhadas*valorHora);

        System.out.printf("\n\nOlá funcionario número %d, de acordo com o valor de horas trabalhadas %d\nE de acordo com o valor que você recebe por hora R$ %.2f\nO seu salário será igual a R$ %.2fn\n\n", nmrFuncionario, hrsTrabalhadas, valorHora, valorSalario);

    }
}
