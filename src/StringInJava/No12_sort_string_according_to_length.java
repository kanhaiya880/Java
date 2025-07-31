package StringInJava;

/*
take a sentence as input, sort it's word using any sorting technique
and print it in sorted order sorting should be done using the length of string

input: printing and sort in acending order
output: in and sort order pring ascending order
 */

public class No12_sort_string_according_to_length {

    public static void main(String[] args) {
//        String str1="HARDWORK IS THE KEY TO SUCCESS";
        String str1="aaa bbbb ccccc dddd eeee aa a";
        String[] str1array=str1.split(" ");
        int large,small;
        String temp="";
        int length = str1array.length;
        for (int i = 0; i < length; i++) {

            for (int j=i+1;j<str1array.length;j++)
            {
                if (str1array[i].length()>str1array[j].length())
                {
                    temp=str1array[j];
                    str1array[j]=str1array[i];
                    str1array[i]=temp;

                }
            }
        }

        str1=String.join(" ",str1array);
        System.out.println(str1);

    }
}
