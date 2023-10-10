package estruturaRepetitiva;

import java.util.Scanner;

public class ExercicioDio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite sua nota: ");
        int nota = sc.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("nota invalida digite novamente: ");
            nota = sc.nextInt();
        }



    }
}
