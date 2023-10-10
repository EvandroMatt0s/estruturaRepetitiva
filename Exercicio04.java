package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int QtdPar = 0, QtdImpar = 0;

        System.out.println("Quantidade numeros: ");
        quantidadeNumeros = sc.nextInt();

        int count = 0;

        do {
            System.out.println("Numero: ");
            numero = sc.nextInt();

            if (numero % 2 == 0) {
                QtdPar = QtdPar + 1;
            } else {
                QtdImpar = QtdImpar + 1;
            }

            count++;
        } while (count < quantidadeNumeros);

        System.out.println("Numero Par: " + QtdPar);
        System.out.println("Numero Impar: " + QtdImpar);
    }
}
