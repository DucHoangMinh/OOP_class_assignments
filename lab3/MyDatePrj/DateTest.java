package lab3.MyDatePrj;
import java.util.Date;
import java.util.Formatter;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class DateTest {
    public static void main(String [] args) throws ParseException{
        MyDate date1 = new MyDate();
        date1.print(date1);
        MyDate date2 = new MyDate(12,4,2008);
        date2.print(date2);
        MyDate date3 = new MyDate("January 12 2011");
        date3.print(date3);
        MyDate date4 = new MyDate();
        date4.accept();
        date4.print(date4);

        Date date1_1 = new Date(2003, 12, 4);
        Date date1_2 = new Date(2004, 12, 4);
        DateUtils dateUtils1 = new DateUtils(date1_1, date1_2);
        dateUtils1.compareTwoDate();
    }
}
