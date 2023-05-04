package lab2;
import java.util.Scanner;
public class lab2_4 {
    //Ham in ra mot tam giac co chieu cao n dong
    public static void printRectangle(int n){
        int q = 0;
        while(n > 0){
            for(int i = 0 ; i < n ; i ++){
                System.out.print(" ");
            }
            for(int k = 0; k <= q; k ++){
                System.out.print("*");
            }
            n --;
            q += 2;
            System.out.println("");
        }
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printRectangle(n);
    }
}
