package lab02;
import java.util.Scanner;
public class lab2_6 {
    //Hàm in ra một mảng
    public static void printArray(double[] arr){
        int arrLenthg = arr.length;
        for(int i = 0; i < arrLenthg; i ++){
            System.out.printf("%.2f ",arr[i]);
        }
    }
    //Hàm tính tổng các phần tử một mảng
    public static double sumArray(double [] arr){
        int arrLenthg = arr.length;
        double sum = 0;
        for(int i = 0; i < arrLenthg; i ++){
            sum += arr[i];
        }
        return sum;
    }
    //Hàm tính giá trị trung bình của mảng
    public static double avgArray(double [] arr){
        int arrLenthg = arr.length;
        double sum = 0;
        for(int i = 0; i < arrLenthg; i ++){
            sum += arr[i];
        }
        return sum / arrLenthg;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang : ");
        int n = input.nextInt();
        double [] arr = new double[n];
        for(int i = 0; i < n ; i++){
            System.out.printf("Nhap vao phan tu thu %d cua mang : ", i);
            arr[i] = input.nextDouble();
        }
        //Sắp xếp lại mảng
        for(int i = 0; i < n - 1; i ++){
            for (int j = i + 1 ; j < n; j ++){
                if(arr[i] > arr[j]){
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Mang sau khi da sap xep la : "); printArray(arr);
        System.out.printf("\nTong ca phan tu trong mang la : %.2f\n", sumArray(arr));
        System.out.printf("Gia tri trung binh ca phan tu trong mang la : %.2f",avgArray(arr));
    }
}
