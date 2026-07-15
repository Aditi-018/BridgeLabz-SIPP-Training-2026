package recursion;

public class ReverseStringRecursion {
    public class ReverseStringRecursion {

        public static String reverse(String text) {
            if (text.isEmpty()) {
                return "";
            }

            return reverse(text.substring(1)) + text.charAt(0);
        }

        public static void main(String[] args) {
            String text = "hello";

            String reversedString = reverse(text);

            System.out.println(reversedString);
        }
    }
}
