package StringInJava;
/*
unicode value:
A-Z =65 to 90
a-z =97 to 122
space =32;

 */
public class No2_Example {
    public static void main(String[] args) {
        String str="Kanhaiya";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            System.out.println(ch);
        }


    }
}
