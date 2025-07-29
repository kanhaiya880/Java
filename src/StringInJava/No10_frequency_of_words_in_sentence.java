package StringInJava;
//write a code to take a sentence as an input and count the frequency of word "and" and "an" in it
public class No10_frequency_of_words_in_sentence {
    public static void main(String[] args) {
        String s1="An elephant and an ant are friends.";
        String[] s2=s1.split(" ");
        int AndCount=0;
        int AnCount=0;
      for (String c : s2) {
          if (c.equalsIgnoreCase("and"))
          {
              AndCount++;

          }
          else if (c.equalsIgnoreCase("an"))
          {
              AnCount++;
          }

        }

        System.out.println("total and is "+AndCount+"\nTotal an is :"+AnCount);


        System.out.println("Sir's logic");

        String sentence="An elephant and an ant are friends.";
        String[] string_array=s1.split(" ");
        int AndCount1=0;
        int AnCount1=0;
        int j=0,i=0;
        int len=sentence.length();










    }
}
