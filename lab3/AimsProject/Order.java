package lab3.AimsProject;

// The Order class will contain a list of DigitalVideoDisc 
// objects and have methods capable of modifying the list
//Hàm xóa một phần tử trong danh sách
import java.util.Date;
public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered  = 0;
    //Getter và Setter cho trường qtyOrdered
    public int getQtyOrdered() {
        return this.qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
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

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered >= 9){
            System.out.println("The order is already full!!");
        }
        else{
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered += 1;
            System.out.printf("DVD %s da duoc them vao danh sach \n",disc.toString());
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        String discString = disc.toString();
        int deleteIndex = -1;
        for(int i = 0; i < qtyOrdered ; i++){
            if(itemsOrdered[i].toString().equals(discString)){
                deleteIndex = i;
            }
        }
        if(deleteIndex >= 0){
            for(int j = deleteIndex; j < qtyOrdered - 1; j++){
                itemsOrdered[j] = itemsOrdered[j + 1];
            }
            itemsOrdered[qtyOrdered - 1] = null;
            qtyOrdered -= 1;
            System.out.printf("Phan tu %s da duoc xoa\n",disc.toString());
        }
        else {
            System.out.println("Khong tim thay phan tu tuong ung de xoa");
        }
    }

    //  Làm phần lab 4 1.1
    //  You will create new method has the same name but with different type of parameter. 
	//  addDigitalVideoDisc(DigitalVideoDisc [] dvdList)
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        int arrLength = dvdList.length;
        int finalIndex = -1;
        for(int i = 0; i < arrLength; i++){
            if(getQtyOrdered() >= 9){
                System.out.println("Danh sach chua da day!!!");
                finalIndex += i + 1;
                break;
            }
            addDigitalVideoDisc(dvdList[i]);
        }
        if(finalIndex >= 0){
            System.out.println("Danh sach nhung dvd chua duoc them : ");
            for(int j = finalIndex; j < arrLength ; j++){
                System.out.println(dvdList[j].toString());
            }
        }
    }
    //Làm phần lab 4 1.2
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1
                , DigitalVideoDisc dvd2){
        //Tận dụng phương thức addDigitalVideoDisc với parameter là một
        //mảng ở trên.Ta sẽ cho dvd1 và dvd2 vào 1 mảng và gọi lại addDigitalVideoDisc
        //với tham số truyền vào là một mảng
        DigitalVideoDisc [] dvdList = new DigitalVideoDisc[2];
        dvdList[0] = dvd1;
        dvdList[1] = dvd2;
        addDigitalVideoDisc(dvdList);
    }


    public double totalCost(){
        double sumCost = 0;
        for(int i = 0; i < qtyOrdered; i ++){
            sumCost += itemsOrdered[i].getCost();
        }
        return sumCost;
    }
    public void printItem(){
        System.out.println("*********************Order**********************");
        System.out.println("Date : " + getDateOrdered());
        for(int i = 0; i < qtyOrdered; i ++){
            String tempItem = itemsOrdered[i].toString();
            System.out.println(tempItem);
        }
        System.out.println("Cost : " + totalCost());
        System.out.println("**************************************************");
    }
}
