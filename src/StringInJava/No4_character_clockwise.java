package StringInJava;

public class No4_character_clockwise {

    public static void main(String[] args) {
        String input = "abcde*";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // For uppercase A-Z
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ('A' + (ch - 'A' + 2) % 26);
                System.out.print(ch);
            }
            // For lowercase a-z
            else if (ch >= 'a' && ch <= 'z') {
                ch = (char) ('a' + (ch - 'a' + 2) % 26);
                System.out.print(ch);
            }
            // For others
            else {
                System.out.print(ch);
            }
        }

        System.out.println();
    }
}
