package Exercicios;


import java.util.Scanner;

public class BoletimExercicio {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in); //Scanner

    System.out.println("Digite qual foi a nota 1: ");
    double nota1 = sc.nextDouble();
    System.out.println("Digite qual foi a nota 2: ");
    double nota2 = sc.nextDouble();
    System.out.println("Digite qual foi a nota 3: ");
    double nota3 = sc.nextDouble();
    double media = (nota1 + nota2 + nota3) / 3;


    if(media >= 70 && media < 100){
        System.out.println("ALUNO APROVADO");
    } else if (media >= 40 && media <=69) {
        System.out.println("ALUNO EM RECUPERAÇÃO");
    } else if (media >= 0 && media <= 39) {
        System.out.println("ALUNO REPROVADO :(  '-' :D :( ");
    }

}
}
