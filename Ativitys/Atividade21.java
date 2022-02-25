import java.util.Scanner;

public class Atividade21{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo). */

        int n, i, n2;
        int in = 0;
        int out = 0;

        System.out.print("Digite a quantidade de valores : ");
        n = scan.nextInt();
        for(i=0; i<n; i++){
            System.out.printf("\n\nDigite o %d numero inteiro : ", i+1);
            n2 = scan.nextInt();
            if(n2 >= 10 && n2 <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
        System.out.printf("in :\n" + in);
        System.out.printf("out :\n" + out);    

        }
    }
}
