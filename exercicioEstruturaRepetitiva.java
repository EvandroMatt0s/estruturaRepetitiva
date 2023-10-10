package estruturaRepetitiva;

import java.util.Scanner;

public class exercicioEstruturaRepetitiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 2002;
        int tentativa = sc.nextInt();
        while (tentativa != senha) {
            tentativa = sc.nextInt();
            if (tentativa != senha) {
                System.out.println("senha invalida");
            } else if (tentativa > 2002 || tentativa < 2002){
                System.out.println("Senha  invalida");
            }
            else {
                System.out.println("acesso permitido");
            }
        }

        sc.close();
    }
}
