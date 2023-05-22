package aims;

public class DiskTest {
    public static void main(String [] args){
        DigitalVideoDisc [] dvdList = new DigitalVideoDisc[6];
        dvdList[0] = new DigitalVideoDisc("Harry Potter"
            , "Documentation", "Hoang Minh Duc"
            , 90, 20);
        dvdList[1] = new DigitalVideoDisc("Harry Pettor"
            , "Documentation", "Hoang Minh Duc"
            , 90, 20);
        dvdList[2] = new DigitalVideoDisc("Harry and Potter"
            , "Documentation", "Hoang Minh Duc"
            , 90, 20);
        dvdList[3] = new DigitalVideoDisc("My name is Minh Duc"
            , "Documentation", "Hoang Minh Duc"
            , 90, 20);
        dvdList[4] = new DigitalVideoDisc("Baby,i'm Harry and you are Potter"
            , "Documentation", "Hoang Minh Duc"
            , 90, 20);
        dvdList[5] = new DigitalVideoDisc("Harry love Potter so much"
            , "Documentation", "Hoang Minh Duc"
            , 90, 20);

        //Test phương thức Search trong lớp DigitalVideoDisc
        System.out.println(dvdList[0].search("harry Potter"));
        System.out.println(dvdList[1].search("harry Potter"));
        System.out.println(dvdList[2].search("harry Potter"));
        System.out.println(dvdList[3].search("harry Potter"));
        System.out.println(dvdList[4].search("harry Potter"));
        System.out.println(dvdList[5].search("harry Potter"));

        //Test phương thức getALuckyNumber trong lớp Order
        Order newOrder = new Order();
        newOrder.addDigitalVideoDisc(dvdList[0]);
        newOrder.addDigitalVideoDisc(dvdList[1]);
        newOrder.addDigitalVideoDisc(dvdList[2]);
        newOrder.addDigitalVideoDisc(dvdList[3]);
        newOrder.addDigitalVideoDisc(dvdList[4]);
        newOrder.addDigitalVideoDisc(dvdList[5]);
        System.out.println();
        //In ra tổng giá tiền của order trước khi lấy random ra một cái và cho nó là free
        System.out.println("Tong gia tien cua order truoc khi lay ra free item : " + newOrder.totalCost());
        //Lấy ngẫu nhiên ra một item bất kỳ,nó sẽ có giá trở thành 0 (free)
        System.out.println("Random item for free is : " + newOrder.getALuckyItem());
        //In ra tổng giá tiền order sau khi lấy random ra một cái và cho nó là free
        System.out.println("Tong gia tien cua order sau khi lay ra free item : " + newOrder.totalCost());
    }
}
