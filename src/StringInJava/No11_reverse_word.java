package StringInJava;

public class No11_reverse_word {
    public static void main(String[] args)
    {
        String s1="Good Morning to Everyone";
        String s2="";
        System.out.println(s1);
        for (int i = s1.length()-1; i>=0 ; i--) {
            s2=s2+String.valueOf(s1.charAt(i));
        }
        String[] s3=s2.split(" ");
        for (int i = s3.length-1; i>=0 ; i--) {
            System.out.print(s3[i]+" ");
        }

    }
}
