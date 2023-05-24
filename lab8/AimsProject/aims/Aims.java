package aims;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.management.openmbean.OpenType;
import javax.print.event.PrintEvent;
import javax.swing.JTable.PrintMode;

import aims.media.Book;
import aims.media.DigitalVideoDisc;

import java.util.Scanner;
public class Aims {
	public static void printMenu(){
        System.out.println("\tOrder Management Application:");
        System.out.println("----------------------------------------");
        System.out.println("1.Xem danh sach cac dvd dang duoc luu");
        //Update thay vì thêm một dvd thì sẽ thêm một trong 3 loại
        //Book,CompactDisc hoặc là DigitalVideo Disc
        System.out.println("2.Them mot item vao danh sach");
        System.out.println("3.Xoa mot dvd trong danh sach");
        System.out.println("4.Xem tong gia tri cac dvd trong danh sach");
        System.out.println("0.Thoat chuong trinh");
    }
    public static void printSubMenu(){
        System.out.println("Chon loai mon do ma ban muon them : ");
        System.out.println("2.1 : Book");
        System.out.println("2.2 : CompactDisc");
        System.out.println("2.3: Digital Video Disc");
        System.out.print("Nhap lua chon cua ban :");
    }
    public static void main(String [] args){
        Order anOrder = new Order();
        Date nowDate = new Date();
        anOrder.setDateOrdered(nowDate);
        Scanner input = new Scanner(System.in);
        //=======THÊM SẴN 4 PHẦN TỬ CHO DANH SÁCH=====
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The LionKing");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(90);
        anOrder.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The LionKing");
        dvd2.setCategory("No category");
        dvd2.setCost(20.95f);
        dvd2.setDirector("Roger Allers");
        dvd2.setLength(90);
        anOrder.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion");
        dvd3.setCategory("Animation");
        dvd3.setCost(29.95f);
        dvd3.setDirector("Roger Allers");
        dvd3.setLength(90);
        anOrder.addMedia(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The New Lion");
        dvd4.setCategory("Animation");
        dvd4.setCost(15.95f);
        dvd4.setDirector("Roger Allers");
        dvd4.setLength(90);
        anOrder.addMedia(dvd4);
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
                        printSubMenu();
                        int subChoice = input.nextInt();
                        switch(subChoice){
                            case 1: {
                                System.out.print("Nhap ten sach ban muon them : ");
                                String newBook = input.nextLine();
                                System.out.print("Nhap phan loai sach : ");
                                String bookCategory = input.nextLine();
                                System.out.print("Nhap ten tac gia : ");
                                String bookAuthor = input.nextLine();
                                System.out.println("Nhap gia cua cuon sach : ");
                                float cost = input.nextFloat();
                                List<String> authorList = new ArrayList<String>();
                                authorList.add(bookAuthor);
                                Book tmp = new Book(newBook, bookCategory,cost, authorList);
                                anOrder.addMedia(tmp);
                                break;
                            }
                            case 2 : {
                                System.out.println();
                                break;
                            }
                            case 3: {
                                System.out.println("Nhap vao cac thuoc tinh dvd ban muon them : ");
                                input.nextLine();//Tránh bị nuốt lệnh
                                System.out.print("Title : ");String title = input.nextLine();
                                System.out.print("Category : ");String category = input.nextLine();
                                System.out.print("Director : ");String director = input.nextLine();
                                System.out.print("Length : ");int length = input.nextInt();
                                System.out.print("Cost : ");Float cost = input.nextFloat();
                                DigitalVideoDisc newDVD = new DigitalVideoDisc(title, category, director, length, cost);
                                anOrder.addMedia(newDVD);
                                break;
                            }
                            default : {
                                System.out.println("Lua chon khong ton tai !!!");
                            }
                        }
                }
                case 3: {
                    System.out.println("Nhap vao cac thuoc tinh dvd ban muon xoa : ");
                    input.nextLine();//Tránh bị nuốt lệnh
                    System.out.print("Title : ");String title = input.nextLine();
                    System.out.print("Category : ");String category = input.nextLine();
                    System.out.print("Director : ");String director = input.nextLine();
                    System.out.print("Length : ");int length = input.nextInt();
                    System.out.print("Cost : ");Float cost = input.nextFloat();
                    DigitalVideoDisc delDVD = new DigitalVideoDisc(title, category, director, length, cost);
                    anOrder.removeMedia(delDVD);
                    break;
                }
                case 4 : {
                    double sumCost = anOrder.totalCost();
                    System.out.printf("Tong gia tri cac dvd trong danh sach la : %f\n",sumCost);
                    break;
                }
                case 0: {
                    System.out.println("Chuong trinh ket thuc !!!");
                    onProgram = false;
                }
            }
        }

        //Test lab08 với dvd
        DigitalVideoDisc dvd01 = new DigitalVideoDisc("Doraemon", "Cartoon", "Aoyako", 90, 30);
        DigitalVideoDisc dvd02 = new DigitalVideoDisc("Conan", "Cartoon", "Mayakoto", 99, 30);
        DigitalVideoDisc dvd03 = new DigitalVideoDisc("Tay Du Ky", "Documentary", "Hoang Minh Duc", 100, 30);
        DigitalVideoDisc dvd04 = new DigitalVideoDisc("Ta la dan choi", "Document", "Hoang Minh Nam", 100, 30);

        java.util.Collection collection = new java.util.ArrayList();
        collection.add(dvd1);
        collection.add(dvd2);
        collection.add(dvd3);

        //Iterate through the ArrayList and output thei titles'
        //(unsorted order)
        java.util.Iterator iterator= collection.iterator();
        System.out.println("-----------------------------------------------");
        System.out.println("The DVDs currently in the order are : ");
        while(iterator.hasNext()){
            System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
        }

        //Sort the collection of DVDs - based on the compareTo() method
        java.util.Collections.sort((java.util.List)collection);
        //Iterate through the ArrayList and output their titles - in sorted order
        iterator = collection.iterator();
        System.out.println("The DVDs in sorted order are : ");
        while(iterator.hasNext()){
            System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
        }
        System.out.println("-------------------------------------------------");
    }
}
