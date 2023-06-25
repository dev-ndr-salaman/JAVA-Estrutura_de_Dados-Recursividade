public class Fibonacci {
    public static int fibonacciInterativo(int n) {
        int antepenultimo = 0;
        int ultimo = 1;
        int fib = 0;
        if ((n == 0) || (n == 1)) {
            System.out.println(antepenultimo);
        } else if (n == 2) {
            System.out.println(antepenultimo + "," + ultimo);
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print(fib + " ");
                /*if (i == n) {
                    continue;
                } else {
                    System.out.print(", ");
                }*/
                fib = antepenultimo + ultimo;
                ultimo = antepenultimo;
                antepenultimo = fib;
            }
        }
        return fib - 1;
    }
    public static int fibonacciRecursivo(int n) {
        /* Se x for igual a 0 (zero) ou 1, então o valor de fibonacci é
        o proprio valor x. */
        if ((n==0)||(n==1)){
            return 0;
        }
        if (n==2){
            return 1;
        }
        /* Se o valor de x for maior que 1, então precisa calcular o valor
        do fibonacci. */
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
}


