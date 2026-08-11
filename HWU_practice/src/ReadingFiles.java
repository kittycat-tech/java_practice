import java.io.*;

public class ReadingFiles {
    public static void main(String[] args){
        FileReaderExample();
        BufferedReaderExample();
    }

    public static void FileReaderExample(){
       // this specifies the file name
        String fileName = "example.txt";

        //This is Try-with-resources to automatically close the FileReader
        try(FileReader reader = new FileReader(fileName)){
            int character;
            System.out.println("Reading file contents: ");

            while((character = reader.read()) != -1){
                System.out.println((char) character);
            }
            System.out.println("\nFile reading completed successfully.");
        }catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }finally{
            System.out.println("================next is buffered reader=========");
        }
    }

    public static void BufferedReaderExample(){
        String fileName =" example.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while( (line = reader.readLine()) != null ) {
                System.out.println(line);
            }
            System.out.println("File reading completed successfully.");
        }catch(IOException e){
            System.out.println("Buffered Reader Error reading file: " + e.getMessage());
        }finally{
            System.out.println("=========================");
        }
    }












}

