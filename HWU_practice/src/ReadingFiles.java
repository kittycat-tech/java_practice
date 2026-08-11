import java.io.*;

public class ReadingFiles {
    public static void main(String[] args){
        CheckedExceptionExample();
        UncheckedExceptionExample();
    }

    public static void CheckedExceptionExample(){
        try{
            FileReader file = new FileReader("nonexistentfile.txt");
        } catch (IOException e){
            System.out.println("File not found " + e.getMessage());
        }
    }

    public static void UncheckedExceptionExample(){
        int[] array = new int[6];
        try{
            int value = array[20];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" Array index out of bounds. Error: " + e.getMessage());
        }
    }




}

