public class GcdLcm {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b; a = b; b = t;
        }
        return Math.abs(a);
    }

    public static int lcm(int a, int b) {
        return Math.abs(a / gcd(a,b) * b);
    }

    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.println("GCD("+a+","+b+") = " + gcd(a,b));
        System.out.println("LCM("+a+","+b+") = " + lcm(a,b));
    }
}
