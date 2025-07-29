package StringInJava;

public class No6_direction_treasury {
    public static void main(String[] args) {
        String str="NNNNWWNE";
        int N=0,W=0,E=0,S=0;
        for (int i = 0; i < str.length(); i++) {
            if ('N'==str.charAt(i))
            {
             N++;
            }
            if ('W'==str.charAt(i))
            {
                W++;
            }
            if('E'==str.charAt(i))
            {
                E++;
            }
            if ('S' == str.charAt(i)) {
                S++;
            }


        }
    }
}
