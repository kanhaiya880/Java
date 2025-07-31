package StringInJava;
//write a code to take a sentence as an input and count the frequency of word "and" and "an" in it
public class No10_frequency_of_words_in_sentence {
    public static void main(String[] args) {
//        String s1="An elephant and an ant are friends.";
//        String[] s2=s1.split(" ");
//        int AndCount=0;
//        int AnCount=0;
//      for (String c : s2) {
//          if (c.equalsIgnoreCase("and"))
//          {
//              AndCount++;
//
//          }
//          else if (c.equalsIgnoreCase("an"))
//          {
//              AnCount++;
//          }
//
//        }
//
//        System.out.println("total and is "+AndCount+"\nTotal an is :"+AnCount);


        System.out.println("Sir's logic without using split");

        String sentence="An elephant and an ant are friends.";

        int AndCount1=0;
        int AnCount1=0;
        int j=0,i=0;
        int len=sentence.length();


        for (i = 0; i < len; i=j+1) {
            String word="";
            for (j =i; j < len && sentence.charAt(j) !=' '; j++) {
                word=word+sentence.charAt(j);
            }
            if (word.equalsIgnoreCase("and"))
            {
                AndCount1++;
            }
            if (word.equalsIgnoreCase("an"))
            {
                AnCount1++;
            }
        }

        System.out.printf("AndCount: %d AnCount: %d",AndCount1,AnCount1);

    }
}
