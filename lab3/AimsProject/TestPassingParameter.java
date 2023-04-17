package lab3.AimsProject;

public class TestPassingParameter {
    public static void main(String [] args){
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc ("Cinderella");
        swap(jungleDVD, cinderellaDVD);

        System.out.println("jungle dvd title: " + jungleDVD.getTitle()); 
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle()); 
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }
    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle(); 
        dvd.setTitle(title); 
        dvd = new DigitalVideoDisc (oldTitle);
    }
}
// After the call of swap(jungleDVD, cinderellaDVD) why does the title of these two objects still remain?
// --Vì đây chỉ là truyền tham trị (pass by value)

//After the call of changeTitle(jungleDVD, cinderellaDVD.getTitle()) why is the title of the JungleDVD changed?
//--Vì dòng dvd.setTitle(title); đã set lại Title cho dvd,ở đây là set lại title cho dvd là title của cinderella


