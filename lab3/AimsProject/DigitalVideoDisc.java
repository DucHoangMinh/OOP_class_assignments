package lab3.AimsProject;

import java.util.Properties;

public class DigitalVideoDisc {
    
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;
    //Tạo getter và setter cho các attribute
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

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

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    //Tạo constructor
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category) {
        super();
        this.title = title;
        this.category = category;
    }
    public DigitalVideoDisc(String title, String category, String director) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    //To string

    @Override
    public String toString() {
        return "DVD - " + title + " - " + category
            + " - " + director + " - " + length
            + ": " + cost + "$";
    }

}
