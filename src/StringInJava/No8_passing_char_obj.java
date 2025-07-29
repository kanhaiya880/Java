package StringInJava;

public class No8_passing_char_obj {
    public static  void main(String[] args)
    {
        char[] c={'a','b','c','d'};
        String s1=new String(c);
        System.out.println(s1);

        byte[] b={ 97,98,99,100};
        String s2=new String(b);
        System.out.println(s2);
    }
}
