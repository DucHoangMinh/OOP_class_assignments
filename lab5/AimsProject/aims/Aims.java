package aims;

import java.util.Date;
import javax.management.openmbean.OpenType;
import javax.print.event.PrintEvent;
import javax.swing.JTable.PrintMode;
import java.util.Scanner;
public class Aims {
	public static void printMenu(){
        System.out.println("\tMENU");
        System.out.println("1.Xem danh sach cac dvd dang duoc luu");
        System.out.println("2.Them mot dvd vao danh sach");
        System.out.println("3.Xoa mot dvd trong danh sach");
        System.out.println("4.Xem tong gia tri cac dvd trong danh sach");
        System.out.println("5.Them mot mang cac dvd vao danh sach");
        System.out.println("0.Thoat chuong trinh");
    }
    public static void main(String [] args){
        //Mảng dùng để test phương thức 
        //addDigitalVideoDisc(DigitalVideoDisc [] dvdList) của lab 4
        DigitalVideoDisc [] dvdList = new DigitalVideoDisc[6] ;
        dvdList[0] = new DigitalVideoDisc("Mui Co Chay1"
            , "Documentation", "Hoang Minh Duc"
            , 90, 20);
        dvdList[1] = new DigitalVideoDisc("Mui Co Chay2"
            , "Documentation", "Hoang Minh Duc"
            , 90, 20);
        dvdList[2] = new DigitalVideoDisc("Mui Co Chay3"
            , "Documentation", "Hoang Minh Duc"
            , 90, 20);
        dvdList[3] = new DigitalVideoDisc("Mui Co Chay4"
            , "Documentation", "Hoang Minh Duc"
            , 90, 20);
        dvdList[4] = new DigitalVideoDisc("Mui Co Chay5"
            , "Documentation", "Hoang Minh Duc"
            , 90, 20);
        dvdList[5] = new DigitalVideoDisc("Mui Co Chay6"
            , "Documentation", "Hoang Minh Duc"
            , 90, 20);
        //====================================================

        Order anOrder = new Order();
        Date nowDate = new Date();
        anOrder.setDateOrdered(nowDate);
        Scanner input = new Scanner(System.in);
        //=======THÊM SẴN 4 PHẦN TỬ CHO DANH SÁCH=====
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The LionKing");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(90);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The LionKing");
        dvd2.setCategory("No category");
        dvd2.setCost(20.95);
        dvd2.setDirector("Roger Allers");
        dvd2.setLength(90);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion");
        dvd3.setCategory("Animation");
        dvd3.setCost(29.95);
        dvd3.setDirector("Roger Allers");
        dvd3.setLength(90);
        anOrder.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The New Lion");
        dvd4.setCategory("Animation");
        dvd4.setCost(15.95);
        dvd4.setDirector("Roger Allers");
        dvd4.setLength(90);
        anOrder.addDigitalVideoDisc(dvd4);
        //=============================================

        boolean onProgram = true;
        while(onProgram == true){
            printMenu();
            System.out.print("Nhap lua chon cua ban : ");
            int choice = input.nextInt();
            switch(choice){
                case 1: {
                    anOrder.printItem();
                    break;
                }
                case 2: {
                    if(anOrder.getQtyOrdered() >= 9){
                        System.out.println("Danh sach chua da day!!!");
                        break;
                    }
                    else{
                        System.out.println("Nhap vao cac thuoc tinh dvd ban muon them : ");
                        input.nextLine();//Tránh bị nuốt lệnh
                        System.out.print("Title : ");String title = input.nextLine();
                        System.out.print("Category : ");String category = input.nextLine();
                        System.out.print("Director : ");String director = input.nextLine();
                        System.out.print("Length : ");int length = input.nextInt();
                        System.out.print("Cost : ");double cost = input.nextDouble();
                        DigitalVideoDisc newDVD = new DigitalVideoDisc(title, category, director, length, cost);
                        anOrder.addDigitalVideoDisc(newDVD);
                        break;
                    }
                }
                case 3: {
                    System.out.println("Nhap vao cac thuoc tinh dvd ban muon xoa : ");
                    input.nextLine();//Tránh bị nuốt lệnh
                    System.out.print("Title : ");String title = input.nextLine();
                    System.out.print("Category : ");String category = input.nextLine();
                    System.out.print("Director : ");String director = input.nextLine();
                    System.out.print("Length : ");int length = input.nextInt();
                    System.out.print("Cost : ");double cost = input.nextDouble();
                    DigitalVideoDisc delDVD = new DigitalVideoDisc(title, category, director, length, cost);
                    anOrder.removeDigitalVideoDisc(delDVD);
                    break;
                }
                case 4 : {
                    double sumCost = anOrder.totalCost();
                    System.out.printf("Tong gia tri cac dvd trong danh sach la : %f\n",sumCost);
                    break;
                }
                case 5 : {
                    anOrder.addDigitalVideoDisc(dvdList);
                    break;
                }
                case 0: {
                    System.out.println("Chuong trinh ket thuc !!!");
                    onProgram = false;
                }
            }
        }

        // System.out.print("The total cost is : ");
        // System.out.println(anOrder.totalCost());
    }
}
