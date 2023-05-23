package aims;
import java.util.ArrayList;
import java.util.Date;

import aims.media.DigitalVideoDisc;
import aims.media.Media;
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
    // private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    // private int qtyOrdered  = 0;
    //Getter và Setter cho trường qtyOrdered
    // public int getQtyOrdered() {
    //     return this.qtyOrdered;
    // }

    // public void setQtyOrdered(int qtyOrdered) {
    //     this.qtyOrdered = qtyOrdered;
    // }
    //instance variable named "dateOrdered" to store the date-time the ordered created.
    private Date dateOrdered;
    public Date getDateOrdered(){
        return this.dateOrdered;
    }
    public void setDateOrdered(Date date){
        this.dateOrdered = date;
    }

    // - Create a class attribute named "nbOrders" in the class Order
    // - Create also a constant for limited number of orders per user for this class
    public static final int MAX_LIMITTED_ORDERS = 5;
    private int nbOrders = 0;
    public Order(){
        if(this.nbOrders >= MAX_LIMITTED_ORDERS){
            System.out.println("Da dat gioi han so luong Order duoc tao!!!");
        }
        else{
            nbOrders ++;
        }
    }

    // public void addDigitalVideoDisc(DigitalVideoDisc disc){
    //     if(qtyOrdered >= 9){
    //         System.out.println("The order is already full!!");
    //     }
    //     else{
    //         itemsOrdered[qtyOrdered] = disc;
    //         qtyOrdered += 1;
    //         System.out.printf("DVD %s da duoc them vao danh sach \n",disc.toString());
    //     }
    // }
    public void addMedia(Media media){
        itemsOrdered.add(media);
    }
    // public void removeDigitalVideoDisc(DigitalVideoDisc disc){
    //     String discString = disc.toString();
    //     int deleteIndex = -1;
    //     for(int i = 0; i < qtyOrdered ; i++){
    //         if(itemsOrdered[i].toString().equals(discString)){
    //             deleteIndex = i;
    //         }
    //     }
    //     if(deleteIndex >= 0){
    //         for(int j = deleteIndex; j < qtyOrdered - 1; j++){
    //             itemsOrdered[j] = itemsOrdered[j + 1];
    //         }
    //         itemsOrdered[qtyOrdered - 1] = null;
    //         qtyOrdered -= 1;
    //         System.out.printf("Phan tu %s da duoc xoa\n",disc.toString());
    //     }
    //     else {
    //         System.out.println("Khong tim thay phan tu tuong ung de xoa");
    //     }
// }
    public void removeMedia(Media media){
        itemsOrdered.remove(media);
    }


    public double totalCost(){
        double sumCost = 0;
        for(int i = 0; i < itemsOrdered.size(); i ++){
            sumCost += itemsOrdered.get(i).getCost();
        }
        return sumCost;
    }
    public void printItem(){
        System.out.println("*********************Order**********************");
        System.out.println("Date : " + getDateOrdered());
        for(int i = 0; i < itemsOrdered.size(); i ++){
            String tempItem = itemsOrdered.get(i).toString();
            System.out.println(tempItem);
        }
        System.out.println("Cost : " + totalCost());
        System.out.println("**************************************************");
    }
    public Media getALuckyItem(){
        int randomIndex = (int) Math.floor(Math.random()) * itemsOrdered.size();
        itemsOrdered.get(randomIndex).setCost(0);
        return itemsOrdered.get(randomIndex);
    }
}
