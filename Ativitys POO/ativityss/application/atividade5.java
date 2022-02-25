package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class atividade5{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        /* Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
        (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
        ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
        para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
        resolver este problema.*/
        
        Student student = new Student();

        System.out.print("Insert your name : ");
        student.name = scan.nextLine();
        System.out.println("\n\n");
        System.out.print("Insert your first note\n(UP TO 30) : ");
        student.note1 = scan.nextDouble();
        System.out.print("Insert your second note\n(UP TO 35) : ");
        student.note2 = scan.nextDouble();
        System.out.print("Insert your third note\n(UP TO 35) : ");
        student.note3 = scan.nextDouble();

        System.out.println();
        System.out.printf("Hello %s,\nThe some of notes : %.2f\n\n", student.name(), student.some());
        if(student.verification() >= 0.6){
            System.out.print("CONGRATULATIONS, YOU PASS \n\n");
        }
        else if(student.verification() < 0.6){
            System.out.printf("OH NO :( YOU FAILED\nMISSING %.2f points \n\n", student.missingPoints());
        }
        else{
            System.out.println("ERROR");
        }

        scan.close();
    }   
}
