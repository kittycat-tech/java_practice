import java.io.*;

public class Exception1 {

        public static void main(String[] args){
        CheckedExceptionExample();
        UncheckedExceptionExample();
        ArithmeticExceptionExample();
        MultipleTryCatchExample();
        NestedTryCatchExample();
        MyOtherThrowExample();
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

    public static void MultipleTryCatchExample() {
        try {
            int[] numbers = {1, 2, 3, 4};
            System.out.println(numbers[6]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            String errorMessage = e.getMessage();
            System.out.println("=========================");
            System.out.println("Multiple Catch Block error: "+ errorMessage);

            if (e instanceof ArithmeticException) {
                System.out.println("Arithmetic error: " + e.getMessage());
            } else {
                System.out.println("Error: " + errorMessage);
            }
        }
    }
    public static void NestedTryCatchExample() {
        try {
            int[] numbers = { 1, 2, 3, 4 };
            System.out.println(numbers[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("=========================");
            System.out.println("Array index out of bounds. Error: " + e.getMessage());
            try {
                int result = 10 / 0;
            } catch (ArithmeticException ex) {
                System.out.println("=========================");
                System.out.println("Arithmetic error: " + e.getMessage());
            }
        }finally{
            System.out.println("=========================");
        }
    }

    /** This is complicated, throws should be handled either in main method (problematic)
     * or should be better just use try-catch block
    public static void MyThrowExample() throws Exception {
        throw new Exception("This is a thrown exception");
    } */
        
    public static void MyOtherThrowExample() {
    try {
        throw new Exception("This is a thrown exception");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
 








}
