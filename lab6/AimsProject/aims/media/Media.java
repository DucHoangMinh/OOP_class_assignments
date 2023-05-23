package aims.media;

public class Media {
    private String title;
    private String category;
    private float cost;
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return this.category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return this.cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }

    public Media() {
    }
    public Media(String title){
        this.title = title;
    }
    public Media(String title, String category) {
        this.title = title;
        this.category = category;
    }

}
