package exercicios;

import java.util.Scanner; // importando a função Scanner

public class ExemploIfElse { // criando o metodo
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");

        int numero = scanner.nextInt(); // verificando o numero

        if (numero > 0) { // se o numero for maior doque zero
            System.out.println("O número é positivo.");
        } else if (numero < 0) { // se o numero for menor doque zero
            System.out.println("O número é negativo.");
        } else { // se nao for nenhuma das opções é porque ele é o zero
            System.out.println("O número é zero.");
        } // printando resultado

        scanner.close(); // fechando o Scnaner
    }
}
