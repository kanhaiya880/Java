

/*

In Java, a String is a sequence of characters used to represent text.
It is one of the most commonly used data types and is defined in the java.lang package.

Creating a String:

String str1 = "Hello";                  // String literal (stored in String pool)
String str2 = new String("World");     // Using new keyword (stored in heap)

 */


//package StringInJava;
//
//public class Test {
//
//    public static void main(String[] args) {
//        String str1="kanhaiya";
//        String str2="kanhaiya";
//        String str3=new String("kanhaiya");
//        //str1 and str2 stored in string pool
//        System.out.println("str1:"+System.identityHashCode(str1)+"\n"+"str2:"+System.identityHashCode(str2)+"\n\n\n");
//        //str1 and str2 stored in string pool but not str3 it store in heap
//        System.out.println("str1:"+System.identityHashCode(str1)+"\n"+"str2:"+System.identityHashCode(str2)+"\nnew str3:"+System.identityHashCode(str3));
//    }
//}




package StringInJava;

//public class Test {
//
//    public static void main(String[] args)
//    {
//        int[] arr={1,2,1,3,4,5,88,8,5,5};
//        int k=2;
//        int[] occur=new int[arr.length];
//        for(int i=0;i<arr.length;i++)
//        {   int increment=0;
//            for (int j=0;j< arr.length;j++)
//            {
//
//                if (arr[i]==arr[j])
//                {   increment++;
//
//                }
//                occur[i]=increment;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(occur[i]+" ");
//        }
//
//    }
//}


public class Test {

    public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer("kanhaiya");
//        System.out.println(sb.capacity());
//        System.out.println(sb.length());
//        sb.setCharAt(0,'m');
//        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        String s=new String("ayiahnak");


        System.out.println(s);
        System.out.println();

        System.out.println(s.equals(sb.toString()));

    }
}