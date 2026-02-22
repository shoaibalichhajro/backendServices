public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "racecar";
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println("Input: " + s);
        System.out.println(rev.equals(s) ? "Palindrome" : "Not palindrome");
    }
}
