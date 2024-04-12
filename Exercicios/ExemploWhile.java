package Exercicios;

import java.util.Scanner; // importando scnner

public class ExemploWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");

        int limite = scanner.nextInt(); // verifica o valor e faz o contador ir ate o numero escolhido

        int contador = 1; // iniciando o contador em 1
        while (contador <= limite){ // rodar enquanto o contador for menor ou igual ao limite
            System.out.println("Contador: " + contador);
            contador++; // adicionando mais um ao contador
        }
        scanner.close(); // fechando o Scanner
    }
}
