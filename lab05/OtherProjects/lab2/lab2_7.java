package lab2;
import java.util.Scanner;
public class lab2_7{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao kich co n*m cua mang : ");
        System.out.print("n = ");
        int n = input.nextInt();
        System.out.print("m = ");
        int m = input.nextInt();
        int [][] arr1 = new int[n][m];
        int [][] arr2 = new int[n][m];
        System.out.println("Nhap vao mang thu nhat:");
        for(int i = 0; i < n ; i ++){
            for(int j = 0; j < m; j++){
                System.out.printf("Nhap vao phan tu [%d][%d] : ",i,j);
                arr1[i][j] = input.nextInt();
            }
        }
        System.out.println("Nhap vao mang thu hai:");
        for(int i = 0; i < n ; i ++){
            for(int j = 0; j < m; j++){
                System.out.printf("Nhap vao phan tu [%d][%d] : ",i,j);
                arr2[i][j] = input.nextInt();
            }
        }
        int [][] sumArr = new int[n][m];//Ma trận tổng của hai ma trận
        for(int i = 0; i < n ; i ++){
            for(int j = 0; j < m; j++){
                sumArr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Tong cua hai mang la :");
        for(int i = 0; i < n ; i ++){
            for(int j = 0; j < m; j++){
                System.out.printf("%5d",sumArr[i][j]);
            }
            System.out.println("");
        }
    }
}