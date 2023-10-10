package estruturaRepetitiva;

import java.util.Scanner;

public class ExercicioDio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = sc.next();
            System.out.print("Idade: ");
            idade = sc.nextInt();
            if (idade ==0){
                break;
            }
            System.out.println("Continua");
        }
    }
}
