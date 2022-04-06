package application;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x[][] = new int[7][3];

        for(int i=0; i<7; i++){
            for(int j=0; j<3; j++){ 
                System.out.print("Insert : ");
                x[i][j] = scan.nextInt(); 
            }
        }
        System.out.print(x);
    }
}
