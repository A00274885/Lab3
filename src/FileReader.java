import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader
{
    public static void main(String[] args)
    {
        File f = new File("C:\\Users\\caola\\Documents\\Java Projects\\Lab3\\src\\text.txt");
        int wordCount = 0;
        try
        {
            //Creates a scanner that reads the file
            Scanner sc = new Scanner(f);


        while (sc.hasNext())
        {
            //prints out each word from the text file along with the space and then adds to the word count
            System.out.println(sc.next() + " ");
            wordCount++;
        }
        System.out.println("There are "+wordCount+" words.");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not Found");
        }
        finally
        {
            System.out.println("Always done");
        }
    }
}
