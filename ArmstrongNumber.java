public class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int tmp = n, sum = 0;
        int digits = String.valueOf(n).length();
        while (tmp > 0) {
            int d = tmp % 10;
            sum += Math.pow(d, digits);
            tmp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(n + (isArmstrong(n) ? " is an Armstrong number" : " is not an Armstrong number"));
    }
}
