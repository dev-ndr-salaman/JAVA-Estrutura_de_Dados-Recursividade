

public class Main {
    public static void main(String[] args) {
        //Fatorial
        System.out.println("-- FATORIAL --\n");
        int n = 5;
        int i = Fatorial.fatorialInterativo(n);
        System.out.println("[Interativo] - O fatorial de " + n + " é igual a: " + i +"\n");
        int m = 6;
        int j = Fatorial.fatorialRecursivo(m);
        System.out.println("[Recursivo] - O fatorial de " + m + " é igual a: " + j + "\n\n");

        //Fibonacci
        System.out.println("-- FIBONACCI --\n");
        int o = 5;
        System.out.print("[Interativo] - A sequência de Fibonacci com  " + o + " elementos é igual a: ");
        Fibonacci.fibonacciInterativo(o);
        System.out.println("\n");

        int p = 10;
        System.out.print("[Recursivo] - A sequência de Fibonacci com " + p + " elementos é igual a : ");
        for(int l = 1;l<=p;l++){
            System.out.print(Fibonacci.fibonacciRecursivo(l) + " ");
        }
    }
}
