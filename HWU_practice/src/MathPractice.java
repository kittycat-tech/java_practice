import java.util.Scanner;
import java.lang.Math;

public class MathPractice {

    //Calculating the hypotenuse:


    public  double Hypotenuse(double legA, double legB) {

        return Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
    }



    public void main(String[] args) {
        System.out.println("Hypotenuse is " + Hypotenuse(3, 4));

        System.out.println("The Pi value is : "+ Math.PI);
        System.out.println("Euler's number is: "+Math.E);

        double result;
        result = Math.pow(2,4);
        System.out.println("Two raised to the power of 4 is: " + result);

        double absoluteValue;
        absoluteValue = Math.abs(-5);
        System.out.println("The absolute value of 5 is : " + absoluteValue);

        double squareRootMethod;
        squareRootMethod = Math.sqrt(9);
        System.out.println("Square root of 9 is : " + squareRootMethod);

        double roundMethod;
        roundMethod = Math.round(Math.PI);
        System.out.println("PI value is: "+ Math.PI);
        System.out.println("The rounded value of Pi is: " + roundMethod) ;

        double ceilMethod;
        ceilMethod = Math.ceil(Math.PI);
        System.out.println("The ceiling value of Pi is : " + ceilMethod);

        double floorMethod;
        floorMethod = Math.floor(Math.PI);
        System.out.println("The floor value of PI is: " + floorMethod);

        int maxMethod;
        maxMethod = Math.max(10,20);
        System.out.println("The maximum value from 10 to 20  is: " + maxMethod);

        int x = 10;
        x += (x++) + (++x);
        System.out.println( "The sum is: "+ x);


        String string1 = "Hello";
        String string2 = new String("HEllo");

        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));
        System.out.println(string1.equalsIgnoreCase(string2));

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = 0 ;
        while (num > 0) {
            a += num % 10;
        }
        scanner.close();

    }
}