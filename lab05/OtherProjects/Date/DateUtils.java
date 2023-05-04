package lab3.MyDatePrj;
import java.util.Date;
public class DateUtils {
    Date date1;
    Date date2;
    public DateUtils(Date date1,Date date2){
        this.date1 = date1;
        this.date2 = date2;
    }
    public void compareTwoDate(){
        int compareResult = date1.compareTo(date2);
        if (compareResult < 0) {
            System.out.println("Date 1 before Date 2");
        } else if (compareResult > 0) {
            System.out.println("Date 1 after Date 2");
        } else {
            System.out.println("Date 1 equal Date 2");
        }
    }
}
