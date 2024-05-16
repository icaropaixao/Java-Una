package exercicios;

public class Exercicio3x3Array {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        int contador = 1;// iniciando o contador
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = contador;
                contador++;
            }
        }

        System.out.println("Matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
