import java.security.GeneralSecurityException;
import java.util.GregorianCalendar;

public class Pro2_64010761 {
    public static void main(String[] args) {
        GregorianCalendar gre = new GregorianCalendar();
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is " + gre.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + gre.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + gre.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + gre.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("------------------------------------\nAfter specified the elapsed time of one day after current day");
        gre.setTimeInMillis(gre.getTimeInMillis() + 3600000 * 24);
        System.out.println("Year is " + gre.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + gre.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + gre.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + gre.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(gre.getTime());
    }
}
