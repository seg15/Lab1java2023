import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Create();
        Write();
        Read();
    }
    private static void Create(){
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void Write(){
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

       private static void Read()
       {
           try {
               File myObj = new File("filename.txt");
               Scanner myReader = new Scanner(myObj);
               while (myReader.hasNextLine()) {
                   String data = myReader.nextLine();
                   System.out.println(data);
               }
               myReader.close();
           } catch (FileNotFoundException e) {
               System.out.println("An error occurred.");
               e.printStackTrace();
           }
       }

}

