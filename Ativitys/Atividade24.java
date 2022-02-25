import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial de 0 é 1. */

        int n, i;

        int fatorial = 1;

        System.out.print("Digite um número para ver o seu respectivo fatorial : ");
        n = scan.nextInt();

		for (i=1; i<=n; i++) {
			fatorial = fatorial * i;
		}
		
		System.out.println(fatorial);  

    }
}
