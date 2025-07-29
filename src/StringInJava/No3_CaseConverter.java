package StringInJava;

public class No3_CaseConverter {
    public static void main(String[] args) {
        String str = "KanHaIya76@";
        String s = ""; // To store the converted result

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase to lowercase
                char a = (char) (ch + 32);
                s = s + a;
            } else if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase
                char a = (char) (ch - 32);
                s = s + a;
            } else {
                // Keep other characters unchanged
                s = s + ch;
            }
        }

        System.out.println("Original: " + str);
        System.out.println("Converted: " + s);
    }
}
