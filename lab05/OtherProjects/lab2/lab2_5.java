package lab2;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class lab2_5 {
    //Hàm trả về số ngày trong tháng của một năm
    public static int daysOfMonth(int month,int year){
        // Năm nhuận là năm chia hết cho 4 nhưng không chia hết cho 100,ở năm đó tháng 2 có 29 ngày 
        int result = 0;
        if(year % 4 == 0 && year % 100 != 0){
            switch(month){
                case 2:{
                    result += 29;
                    break;
                }
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:{
                    result += 31;
                    break;
                }
                case 4:
                case 6:
                case 9:
                case 11: {
                    result += 30;
                    break;
                }
            }
        }
        else {
            switch(month){
                case 2:{
                    result += 28;
                    break;
                }
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:{
                    result += 31;
                    break;
                }
                case 4:
                case 6:
                case 9:
                case 11: {
                    result += 30;
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int year;
        int month;
        do{
            System.out.println("Nhap vao thang va nam ma ban muon:");
            System.out.print("Thang : ");
            month = input.nextInt();
            System.out.print("Nam : ");
            year = input.nextInt();
            if(year < 0 || month < 1 || month > 12){
                System.out.println("Ngay thang ban nhap khong hop le, vui long nhap lai!!!");
            }
        }while(year < 0 || month < 1 || month > 12);
        System.out.printf("So ngay cua thang %d nam %d la : %d",month,year,daysOfMonth(month, year));
    }
}
