package aims.media;

import java.util.Properties;

public class DigitalVideoDisc extends Media{
    private String director;
    private int length;
    //Tạo getter và setter cho các attribute
    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    //Tạo constructor
    public DigitalVideoDisc(String title) {
        super();
        setTitle(title);
    }

    public DigitalVideoDisc(String title, String category) {
        super();
        setTitle(title);
        setCategory(category);
    }
    public DigitalVideoDisc(String title, String category, String director) {
        super();
        setTitle(title);
        setCategory(category);
        this.director = director;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        setTitle(title);
        setCategory(category);
        this.director = director;
        this.length = length;
        setCost(cost);
    }
    //To string

    @Override
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory()
            + " - " + director + " - " + length
            + ": " + getCost() + "$";
    }
    
    public boolean search(String title){
        String titleStr[] = title.split(" ");
        for(int i = 0; i < titleStr.length;i++){
            if(getTitle().toLowerCase().contains(titleStr[i].toLowerCase()) == false){
                return false;
            }   
        }
        return true;
    }
}
