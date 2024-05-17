package exercicios;

public class ExercicioVetores_AB {
    public static void main(String[] args) {
        // Criando o vetor A com 5 elementos inteiros
        int[] A = {10, 20, 30, 40, 50};

        // Criando o vetor B com o mesmo tamanho que A
        int[] B = new int[A.length];

        // Copiando os elementos de A para B
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        // Exibindo os elementos de B
        System.out.println("Vetor B (mesmos elementos de A):");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }

        // exibindo vetor A
        System.out.println("\nVetor A");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + "  ");
        }
        System.out.println();

        VetoresMultiplicados();

    }

    static void VetoresMultiplicados(){

        System.out.println("Vetores Multiplicados");
        int[] A = {1,2,3,4,5,6,7,8};
        int[] B = new int[A.length]; // passando o mesmo tamanho para B

        for(int i = 0; i < A.length; i++){
            B[i] = A[i] * 2;
            System.out.print("Vetor A: " + A[i] + " ");

            System.out.println("Vetor B: " + B[i]);
        }
    }
}



