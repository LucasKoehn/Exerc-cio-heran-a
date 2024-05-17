public class Main {
    public static void main(String[] args) {
        ProgressaoAritmetica pa = new ProgressaoAritmetica(2, 3);
        System.out.println("Progressão Aritmética:");
        for (int i = 0; i < 5; i++) {
            System.out.print(pa.proximoNumero() + " ");
        }
        System.out.println();

        ProgressaoGeometrica pg = new ProgressaoGeometrica(2, 3);
        System.out.println("Progressão Geométrica:");
        for (int i = 0; i < 5; i++) {
            System.out.print(pg.proximoNumero() + " ");
        }
        System.out.println();

        ProgressaoFibonacci pf = new ProgressaoFibonacci();
        System.out.println("Progressão Fibonacci:");
        for (int i = 0; i < 5; i++) {
            System.out.print(pf.proximoNumero() + " ");
        }
        System.out.println();
    }
}