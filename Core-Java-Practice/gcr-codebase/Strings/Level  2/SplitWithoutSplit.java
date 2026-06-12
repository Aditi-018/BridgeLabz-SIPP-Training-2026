import java.util.Scanner;

public class SplitWithoutSplit {

    static String[] splitWords(String text) {

        int words = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                words++;
        }

        String[] result = new String[words];

        String temp = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
            } else {
                result[index++] = temp;
                temp = "";
            }
        }

        result[index] = temp;

        return result;
    }

    static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] manual = splitWords(text);
        String[] builtin = text.split(" ");

        System.out.println("Same Result: " +
                compareArrays(manual, builtin));
    }
}