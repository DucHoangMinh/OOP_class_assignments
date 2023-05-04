// Write a program for input/output from keyboard
package lab2;
import java.util.Scanner;
public class lab2_2 {
    public static String outputInfor(String name,int age,String gender,String hometown){
        String result;
        result = "You are " + name + "," + age + " years old " +
            "a " + gender + " come from " + hometown;
        return result;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.println("What is your gender?");
        String gender = input.next();
        input.nextLine();//tránh nuốt lệnh
        System.out.println("Where are you from?");
        String home = input.nextLine();
        String infor = outputInfor(name,age,gender,home);
        System.out.println(infor);
    }
}
