import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VowelReader
{

    public static void main(String[] args) throws FileNotFoundException
    {
        File f = new File("C:\\Users\\caola\\Documents\\Java Projects\\Lab3\\src\\text.txt");

        Scanner sc = new Scanner(f);

        double countWords = 0;
        double numVowels = 0;
        while(sc.hasNext())
        {
            //turning every word into a string
            String temp = sc.next();
            //sending the words to the method one at a time
            numVowels = numVowels + numVowels(temp);

            countWords++;
        }
        System.out.println("Number of vowels per word is: " + (numVowels/countWords));

    }

    public static int numVowels(String s)
    {
        int count = 0;
        //changes the words to lowercase
        s = s.toLowerCase();

        for(char c : s.toCharArray())
        {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                count ++;
            }
        }
        return count;
    }
}
