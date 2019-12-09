import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner; 

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt() - 1;
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        Date date = calendar.getTime();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println("The date is : " + sdf.format(date));
        System.out.println("The day of week is : " + dayOfWeek);
        
    }
}