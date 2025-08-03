package StringInJava.StringBufferInJava;

import java.util.Scanner;

public class StringBufferMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence:");
//        StringBuffer sb= new StringBuffer("Kal ");
//        sb.append("Test Hai !");
//        System.out.println(sb);
//        sb.reverse();
//        System.out.println(sb);

//        StringBuilder s= new StringBuilder("All The");
//        s.append("Best!").reverse();
//        System.out.println(s);


//        String str="trouble";
//        StringBuffer sb= new StringBuffer(str);
//        sb.reverse();
//        System.out.println(sb);
//        String s=sb.toString();
//        System.out.println(s);

//        StringBuffer sb=new StringBuffer("gold");
//        System.out.println(sb.length());

//        StringBuffer sb = new StringBuffer("gold");
//        sb.setLength(10);
//        System.out.println(sb.length());

//        StringBuffer sb= new StringBuffer("computer");
//        sb.setCharAt(3,'P');
//        System.out.println(sb);

        //delete method

//        StringBuffer sb=new StringBuffer("facebook");
//        sb.delete(0,4);
//        System.out.println(sb);

//        StringBuffer sb=new StringBuffer("instagram");
//        sb.replace(2,5,"hello");
//        System.out.println(sb);

        //write a code to reverse only the words from a sentence and
        // not the order using StringBuffer or StringBuilder
        String sentence=sc.nextLine();
        String words[]=sentence.split(" ");
        for (int i=0;i<words.length;i++)
        {
            StringBuffer sb = new StringBuffer(words[i]);
            sb.reverse();
            System.out.print(sb+" ");
        }

    }
}
