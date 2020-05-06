package program;

public class MetodoEstatico {

    public static void main(String[] args) {

        //Exercicio 4 EXECUTAVEL
        int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        gerarMatriz(matriz);

        //Exercicio 5 EXECUTAVEL
        System.out.println(desvioPadrao(5, 10, 15));

        //Exercício 6 EXECUTAVEL
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[][] matrR = matr(a, b);
        for (int i = 0; i < 3; i++) {

            System.out.print(matrR[0][i]);

        }
        System.out.println("\n---------------");
        for (int i = 0; i < 3; i++) {

            System.out.print(matrR[1][i]);

        }
    }


    //Exercicio 4 METODO
    public static void gerarMatriz(int matriz[][]) {
        int i, j;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.printf("\n");
        }
    }
    //Exercicio 5 METODO
    public static double desvioPadrao(double... a) {
        double total = 0;
        double contador = 0;
        double media;
        double absoluto = 0;
        double calculo;
        double raiz;

        for (double i : a) {
            total += i;
            contador += 1;
        }
        media = total / contador;
        for (double i : a) {
            absoluto += Math.abs(Math.pow((i - media), 2));
        }
        calculo = absoluto / contador;
        raiz = Math.sqrt(calculo);
        return raiz;
    }

    //EXERCICIO 6 METODO
    public static int[][] matr(int[] a, int[] b) {
        int[][] matr = new int[2][b.length];
        matr[0] = a;
        matr[1] = b;
        return matr;

    }
}
