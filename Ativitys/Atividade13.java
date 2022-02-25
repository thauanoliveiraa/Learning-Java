import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

        double horaInicial;
        double horaFinal;

        System.out.print("Digite a hora inicial (EM CASO DE HORAS NÃO EXATAS, UTILIZE VIRGULA) : ");
        horaInicial = scan.nextDouble();
        System.out.print("Digite a hora final (EM CASO DE HORAS NÃO EXATAS, UTILIZE VIRGULA) : ");
        horaFinal = scan.nextDouble();

        double calculo;

        if(horaInicial < horaFinal){
            
             calculo = (horaFinal - horaInicial);

        }
        else{

            calculo = 24 - (horaInicial - horaFinal);
        }

        System.out.printf("A duração do jogo foi de %.2f horas\n\n", calculo);
        
    }
}
