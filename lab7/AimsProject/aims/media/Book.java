package aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();
    public Book(){
    }
    public Book(String title){
        super(title);
    }
    public Book(String title,String category){
        super(title,category);
    }
    public Book(String title,String category, List<String> authors){
        super(title,category);
        this.authors = authors;
    }
    public Book(String title,String category,float cost,List<String> authors){
        super(title, category, cost);
        this.authors = authors;
    }

    public List<String> getAuthors() {
        return this.authors;
    }
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    //Hàm kiểm tra xem một author đã có trong danh sách chưa
    public boolean checkContainAuthor(String author){
    	for(int i = 0; i < authors.size(); i++){
            if(authors.get(i).toLowerCase().equals(author.toLowerCase()) == false){
                return true;
            }
            break;
        }
        return false;
    }
    //Hàm thêm một author vào trong danh sách
    public void addAuthor(String authorName){
        if(checkContainAuthor(authorName) == false){
            authors.add(authorName);
        }
        else{
            System.out.println("author " + authorName + " da co trong danh sach");
        }
    }
    //Hàm xóa một author khỏi danh sách
    public void removeAuthor(String authorName){
        if(checkContainAuthor(authorName) == false){
            System.out.println("Author " + authorName + " chua co trong danh sach!!!");
        }
        else{
            for(int i = 0; i < authors.size(); i++){
                if(authors.get(i).toLowerCase().equals(authorName.toLowerCase()) == false){
                    authors.remove(i);
                }
                break;
            }
        }
    }
}

