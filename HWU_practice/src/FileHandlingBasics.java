import java.io.*;

public class FileHandlingBasics {

    public static void main(String[] args){
            CheckingFileExistenceExample();
    }

    public static void CheckingFileExistenceExample(){
            File file = new File("example.txt");

            if (file.exists()) {
                System.out.println("File exists!");
            } else {
                System.out.println("File does not exist!");
            }

    }









}
