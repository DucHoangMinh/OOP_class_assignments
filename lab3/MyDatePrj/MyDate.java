package lab3.MyDatePrj;
import java.util.Date;
import java.util.Scanner;
import javax.xml.transform.Source;

import java.time.LocalDateTime;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class MyDate {
    private int day;
    private int month;
    private int year;
    //Constructor return current time
    public MyDate(){
        LocalDateTime timeNow = LocalDateTime.now();
        int day = timeNow.getDayOfMonth();
        int month = timeNow.getMonthValue();
        int year = timeNow.getYear();
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //Constructor with 3 attributes
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //Constructor with a String paramter
    //stringToDate format : Ex : February 19 2019
    public MyDate(String stringToDate) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd yyyy");
        Date date = formatter.parse(stringToDate);//Phương thức này cần ném exception ra
        int day = date.getDate();
        int month = date.getMonth() + 1;
        int year = date.getYear() + 1900;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    //Gettter and Setter
    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        if(day > 0 && day < 31){
            this.day = day;
        }
        else {
            System.out.println("Ngay khong hop le!!!");
        }
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if(month >= 1 && month <= 12){
            this.month = month;
        }
        else {
            System.out.println("Thang khong hop le !!!");
        }
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if(year < 0){
            System.out.println("Nam khong hop le!!!");
        }
        else {
            this.year = year;
        }
    }
    //accept() methods
    public void accept() throws ParseException{
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao ngay thang co theo format nhu sau : ");
        System.out.println("February 19 2023");
        String inputTime = input.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd yyyy");
        Date date = formatter.parse(inputTime);//Phương thức này cần ném exception ra
        this.day = date.getDate();
        this.month = date.getMonth() + 1;
        this.year = date.getYear() + 1900;
    }
    //print() methods to print out the current time
    public void print(){
        LocalDateTime timeNow = LocalDateTime.now();
        int day = timeNow.getDayOfMonth();
        int month = timeNow.getMonthValue();
        int year = timeNow.getYear();
        System.out.print("Ngay hien tai la : ");
        System.out.printf("%d / %d / %d\n",day,month,year);
    }

    //Phương thức printDate để in ra một ngày bất kỳ được truyền vào
    public void printDate(MyDate mydate){
        System.out.print("Ngay hien tai la : ");
        System.out.printf("%d / %d / %d\n",mydate.day,mydate.month,mydate.year);
    }
}
