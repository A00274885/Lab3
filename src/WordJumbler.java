import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordJumbler
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File f = new File("C:\\Users\\caola\\Documents\\Java Projects\\Lab3\\src\\text.txt");

        Scanner sc = new Scanner(f);

        while (sc.hasNext())
        {
            String temp = sc.next();

            System.out.print(wordJumble(temp)+" ");
        }

    }
    private static String wordJumble(String temp)
    {
        //Checking if the word is long enough
     if (temp.length() > 3)
     {
         //creating an empty string but adding the first letter of the word
         String newTemp = "" + temp.charAt(0);
         //creating a loop that runs for the length of the word
         //i starts at 1 so the later code skips a letter
         for (int i = 1; (temp.length() -1 ) > i; i++ )
         {
             //the decider counts backwards
             int decider = temp.length()-1-i;
             //c stores the letter
             char c = temp.charAt(decider);
             //then adds it to the empty string.
             newTemp += c;
         }

         //adding on the last letter
         newTemp += temp.charAt(temp.length()-1);

         return newTemp;
     }
      return temp;
    }
}
