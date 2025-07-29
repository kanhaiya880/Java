package StringInJava;

public class StringMethods {
    public static void main(String[] args)
    {
        ///## public boolean isEmpty()
        String s1="";
        System.out.println(s1.isEmpty());
        /// output: true
        ///##  public int length()
        /// don't use length keyword of array only use length() method
        String s2="kanhaiya";
        System.out.println(s2.length());
        /// # ouput: 8

        /// # public String replace(char old,char new);
        String s3="ababab";
        System.out.println(s3.replace('a','b'));
        /// output: bbbbbb

        /// # public string substring(int begin) and substring(2,6)
        String s4="abcdefg";
        System.out.println(s4.substring(2));
        System.out.println(s4.substring(2,6));

        /// public int indexof(char a)
        String s5="kanhaiya";
        /// return first occured character
        System.out.println(s5.indexOf('a'));
        /// output:1

        /// returns last ocuured charcter
        System.out.println(s5.lastIndexOf('a'));
        /// output: 7

        /// # public String toLowerCase();
        String s6="KANHAIYA";
        String string=s6.toLowerCase();
        System.out.println(string);

        /// # public String toUpperCase();

        String s7="kanhaiya";
        System.out.println(s7.toUpperCase());

        /// # public String trim()
        /// used to remove starting spaces and ending space of string
        String s8=" kanhaiya  ";
        System.out.println(s8.trim());

        ///startWith()
        /// it checks if the specified string starts with a particular string or character
        String s9="red alert in pune";
        System.out.println(s9.startsWith("red"));
        /// endwith()
        /// checks if the specified string ends with particular string or charcater.
        System.out.println((s9.endsWith("pune")));  /// always pass String in "" not in ''
        /// contains()
        /// it is used to check if a string contains a small part of characaters or string in it.
        System.out.println(s9.contains("k"));
        /// output: false
        String s10="Hardwork is the key to success";
        System.out.println(s10.contains("key"));
        ///  output: true

        /// equals()
        /// it just compares if two string values are same or not.

        String s11="Kanhaiya";
        String s12=new String("Kanhaiya");
        System.out.println(s11==s12);
        ///  output : false
        String s13="kaNHaiyA";
        System.out.println(s11.equalsIgnoreCase(s13));
        ///  output : true
        String s14="Kanhaiya";
        String s15=new String("Kanhaiya").intern();
        /// .intern() find in string internal pool
        System.out.println(s14==s15);
        /// output : true


    }

}
