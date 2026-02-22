import java.util.Arrays;

public class AnagramCheck {
    public static boolean isAnagram(String a, String b) {
        a = a.replaceAll("\\s+", "").toLowerCase();
        b = b.replaceAll("\\s+", "").toLowerCase();
        if (a.length() != b.length()) return false;
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        Arrays.sort(x); Arrays.sort(y);
        return Arrays.equals(x, y);
    }

    public static void main(String[] args) {
        String s1 = "Listen", s2 = "Silent";
        System.out.println(isAnagram(s1, s2) ? "Anagram" : "Not anagram");
    }
}
