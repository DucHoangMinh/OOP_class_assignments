package lab3.AimsProject;

public class Aims {
    public static void main(String [] args){
        Order anOrder = new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The LionKing");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(90);
        anOrder.addDigitalVideoDisc(dvd1);
        System.out.println(anOrder.toString());
    }
}
