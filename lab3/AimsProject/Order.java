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
        if(qtyOrdered >= 9){
            System.out.println("The order is already full!!");
        }
        else{
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered += 1;
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
    public double totalCost(){
        double sumCost = 0;
        for(int i = 0; i < qtyOrdered; i ++){
            sumCost += itemsOrdered[i].getCost();
        }
        return sumCost;
    }
    public void printItem(){
        for(int i = 0; i < qtyOrdered; i ++){
            String tempItem = itemsOrdered[i].toString();
            System.out.println(tempItem);
        }
    }
}
