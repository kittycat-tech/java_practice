import java.io.*;

public class Exception1 {

        public static void main(String[] args){
        CheckedExceptionExample();
        UncheckedExceptionExample();
        ArithmeticExceptionExample();
        MultipleTryCatchExample();
    }

    public static void CheckedExceptionExample() {
        FileReader file = null;
        try{
            file = new FileReader("nonexistentfile.txt");
        } catch (IOException e) {
            System.out.println("File not found " + e.getMessage());
        } finally {
            if (file != null) {
                try{
                    file.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
        
    }

    public static void UncheckedExceptionExample() {
        int[] array = new int[6];
        try {
            int value = array[20];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Array index out of bounds. Error: " + e.getMessage());
        }
    }
    
    public static void ArithmeticExceptionExample() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }
    }

    public static void MultipleTryCatchExample(){
           try{
               int[] numbers = {1, 2,3,4};
               System.out.println(numbers[6]);
           } catch(ArithmeticException| ArrayIndexOutOfBoundsException e){
               if(e instanceof ArithmeticException){
                   System.out.println("Arithmetic error: " + e.getMessage());
               }else{
                   System.out.println("Error: " + e.getMessage());
               }

        }
    }

}
