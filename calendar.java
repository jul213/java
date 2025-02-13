import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;


public class TimeZoneT {

     public static void main(String []args){
        Calendar cal = new GregorianCalendar;
        TimeZone.getTimeZone("america/new_york");

        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
     }
}