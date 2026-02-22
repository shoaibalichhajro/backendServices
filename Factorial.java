public class Factorial {
    public static long factorial(int n) {
        long res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Factorial of " + n + " = " + factorial(n));
    }
}
