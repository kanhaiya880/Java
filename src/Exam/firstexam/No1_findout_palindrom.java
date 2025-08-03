package Exam.firstexam;

import java.util.Scanner;

public class No1_findout_palindrom {

    public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter the sentence");
//         String sentence=sc.nextLine();
       String sentence="Madam I'm Adam and want the racecar by noon";
       String[] words=sentence.split(" ");
        for(int i=0;i<words.length;i++)
        {   StringBuffer sbWord=new StringBuffer(words[i]);
            sbWord.reverse();
            if(words[i].equalsIgnoreCase(sbWord.toString()))
            {
                System.out.print(words[i]+" ");
            }

        }

    }
}
