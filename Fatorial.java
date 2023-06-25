public class Fatorial {
    public static int fatorialInterativo(int n) {
        int fat = 1;
        for (int i = 2; i <= n; i++)
            fat = fat * i;
        return fat;
    }

    public static int fatorialRecursivo (int n){
        if(n==0)
            return 1;
        return n * fatorialRecursivo(n-1);
    }
}
