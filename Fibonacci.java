public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        System.out.print("First " + n + " Fibonacci numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + (i < n-1 ? ", " : "\n"));
            int t = a + b;
            a = b;
            b = t;
        }
    }
}
