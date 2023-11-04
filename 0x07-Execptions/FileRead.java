/*
 * create a method that reads a file and throws 
 * an exception if the file is not found.
 */
import java.io.File;
import java.io.FileNotFoundException;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("test1.txt");
        check(myFile);
    }

    static void check(File file) throws FileNotFoundException {
        if (file.exists()){
            System.out.println("File exists");
        }
        else
            throw new FileNotFoundException(file.getName() + " doesn't exists.");
    }
}