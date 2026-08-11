import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarPractice{
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        System.out.println(
                "Today's date is: " + day +
                 " of month " + month +
                 ", year " + year +
                 ". The time now is: " +hour + "o'clock"
        );

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(new Date());
        System.out.println("Current date is: " + gregorianCalendar.get(Calendar.YEAR));

        GregorianCalendar checkIfLeapYear = new GregorianCalendar(2024, Calendar.FEBRUARY , 7);
        int yearToCheck = checkIfLeapYear.get(Calendar.YEAR);

        if (checkIfLeapYear.isLeapYear(yearToCheck)) {
            System.out.println(yearToCheck + " is a leap year.");
        } else {
            System.out.println(yearToCheck + " is not a leap year.");
        }
        }
    }

