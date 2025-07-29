package StringInJava;

public class No1_Example {


    public static void main(String[] args) {
//        String str= "kanhaiya";
//        char ch=str.charAt(2);
//        System.out.println(ch); ///output: b

//        String str="Cyber";
//        str=str.concat(" chaudhari");
//        System.out.println(str);

        String movie="saiyaara";
        String torture="saiyaara";
        String bekar=new String("saiyaara");
        String khatam =new String("saiyaara");
        System.out.println(movie==torture);
        System.out.println(bekar==khatam);
        int a=1;
        int b=1;
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));


    }
}
