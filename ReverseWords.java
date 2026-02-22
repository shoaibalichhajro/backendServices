public class ReverseWords {
    public static String reverseWords(String s) {
        String[] parts = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = parts.length - 1; i >= 0; i--) {
            sb.append(parts[i]);
            if (i > 0) sb.append(' ');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "The quick brown fox";
        System.out.println("Input: " + s);
        System.out.println("Reversed words: " + reverseWords(s));
    }
}
