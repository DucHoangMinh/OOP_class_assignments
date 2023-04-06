package lab3.AimsProject;

// The Order class will contain a list of DigitalVideoDisc 
// objects and have methods capable of modifying the list
//Hàm xóa một phần tử trong danh sách

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    int qtyOrdered  = 0;
    //Getter và Setter cho trường qtyOrdered
    public int getQtyOrdered() {
        return this.qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(itemsOrdered.length >= 9){
            //Xem laị điều kiện để biết mảng đã full!!!
            System.out.println("The order is already full!!");
        }
        else{
            itemsOrdered[itemsOrdered.length] = disc;
            System.out.println("Phan tu da duoc luu tru");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int arrLength = itemsOrdered.length;
        String discString = disc.toString();
        int deleteIndex = -1;
        for(int i = 0; i < arrLength ; i++){
            if(itemsOrdered[i].toString().equals(discString)){
                deleteIndex = i;
            }
        }
        if(deleteIndex >= 0){
            for(int j = deleteIndex; j < arrLength - 1; j++){
                itemsOrdered[j] = itemsOrdered[j + 1];
            }
            itemsOrdered[arrLength - 1] = null;
            System.out.println("Phan tu da duoc xoa");
        }
        else {
            System.out.println("Khong tim thay phan tu tuong ung de xoa");
        }
    }
    public double totalCost(){
        int arrLength = itemsOrdered.length;
        double sumCost = 0;
        for(int i = 0; i < arrLength; i ++){
            sumCost += itemsOrdered[i].getCost();
        }
        return sumCost;
    }
}
