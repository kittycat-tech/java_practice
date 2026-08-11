import java.io.*;

public class WritingFiles {
    public static void main(String[] args){
        FileWriterExample();
        BufferedWriterExample();
    }

    public static void FileWriterExample(){
        try{
            //This creates a FileWriter object to write to "example.txt"
            FileWriter writer = new FileWriter("example.txt");

            //Write some text to the file
            writer.write("Hello, FileWriter!\n");
            writer.write("Writing to a file in Java.");

            //Important: should always close the writer to flush the data and save the file
            //Also close the writer to avoid resource leaks:
            writer.close();
            //This prints confirmation to our console:
            System.out.println("File writing completed successfully.");
        } catch (IOException e) {
            System.out.println("FileWriter throws an error of: " + e.getMessage());
        } finally{
            System.out.println("========================");
        }
    }

    public static void BufferedWriterExample(){
        try{
            // This creates a FileWriter instance for writing to "buffered_example.txt)
            FileWriter myBufferedFile = new FileWriter("buffered_example.txt");

            // This wraps myBufferedFile with BufferedWriter for better performance
            BufferedWriter bw = new BufferedWriter(myBufferedFile);

            //Then we write data to the file:
            bw.write("Hello, this is BufferedWriter!\n");
            bw.newLine();
            bw.write("This is an example of writing text to a file.");

            //Close the BufferedWriter to avoid drama
            bw.close();

            //Then we print confirmation to the console if successful
            System.out.println("Data has been written to the file successfully.");

        }catch(IOException e){
            System.out.println("BufferedWriter throws an error of: " + e.getMessage());
        }finally {
            System.out.println("===========================");
        }
    }












}
