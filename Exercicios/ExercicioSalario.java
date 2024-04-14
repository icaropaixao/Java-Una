package Exercicios;

import java.util.Scanner;

public class ExercicioSalario {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um valor
        System.out.println("Digite o valor do seu salário por Hora: ");
        double salarioHora = scanner.nextDouble();

        System.out.print("Digite o número de horas que trabalhou esse mês");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = salarioHora * horasTrabalhadas;

        if(salarioBruto <= 1412.00){


            double percentual = (7.50 * salarioBruto) / 100; // valores da % real que o inss desconta do salario
            double salarioLiquido = salarioBruto - percentual;
            System.out.println("Seu salario Bruto é " + salarioBruto);
            System.out.println("Seu salario Liquido é" + salarioLiquido);

        } else if (salarioBruto >= 1412.01 && salarioBruto <= 2666.68 ) {


            double percentual = (9 * salarioBruto)/100;
            double salarioLiquido = salarioBruto - percentual;
            System.out.println("Seu salario Bruto é " + salarioBruto);
            System.out.println("Seu salario Liquido é" + salarioLiquido);

        } else if (salarioBruto >=2666.69 && salarioBruto <= 4003.03 ) {

            double percentual = (12 * salarioBruto)/100;
            double salarioLiquido = salarioBruto - percentual;
            System.out.println("Seu salario Bruto é " + salarioBruto);
            System.out.println("Seu salario Liquido é" + salarioLiquido);

        } else if (salarioBruto >= 4003.04 && salarioBruto <= 7768.02) {

            double percentual = (14 * salarioBruto) /100;
            double salarioLiquido = salarioBruto - percentual;
            System.out.println("Seu salario Bruto é " + salarioBruto);
            System.out.println("Seu salario Liquido é" + salarioLiquido);
        }

        scanner.close();
    }
}
