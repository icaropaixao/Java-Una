package provas.provaMaio2024;

import java.util.Arrays;
import java.util.Scanner;

public class ProvaMaio2024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedindo ao usuário para inserir os 3 números
        System.out.println("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = input.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = input.nextInt();

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Ordem crescente");
        System.out.println("2 - Ordem decrescente");
        System.out.println("3 - Maior número entre os outros dois");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                exibirOrdemCrescente(num1, num2, num3);
                break;
            case 2:
                exibirOrdemDecrescente(num1, num2, num3);
                break;
            case 3:
                exibirMaiorNoMeio(num1, num2, num3);
                break;
            default:
                System.out.println("Opção inválida!");
        }
        input.close();
    }

    public static void exibirOrdemCrescente(int num1, int num2, int num3) {
        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);
        System.out.println("Números em ordem crescente: " + Arrays.toString(numeros));
    }

    public static void exibirOrdemDecrescente(int num1, int num2, int num3) {
        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);
        System.out.print("Números em ordem decrescente: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    public static void exibirMaiorNoMeio(int num1, int num2, int num3) {
        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);
        System.out.println("Maior número entre os outros dois: " + numeros[0] + ", " + numeros[2] + ", " + numeros[1]);
    }
}

