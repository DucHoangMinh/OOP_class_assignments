package lab3.MyDatePrj;
import java.util.Date;
import java.util.Formatter;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class DateTest {
    public static void main(String [] args) throws ParseException{
        MyDate date1 = new MyDate();
        date1.printDate(date1);
        MyDate date2 = new MyDate(12,4,2008);
        date2.printDate(date2);
        MyDate date3 = new MyDate("January 12 2011");
        date3.printDate(date3);
        MyDate date4 = new MyDate();
        date4.accept();
        date4.printDate(date4);
    }
}
