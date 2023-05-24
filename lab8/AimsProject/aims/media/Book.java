package aims.media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Book extends Media implements Comparable{
    private List<String> authors = new ArrayList<String>();
    private String content;
    List<String> contentTokens;
    Map<String,Integer> wordFrequency;
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
    @Override
    public int compareTo(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            return this.getTitle().compareTo(book.getTitle());
        } else {
            return 0;
        }
    }

    public void setContent(String content) {
        this.content = content;
        processContent();
    }
    private void processContent() {
        String[] tokens = content.split("[\\s\\p{Punct}]+");
        Arrays.sort(tokens);
        contentTokens = Arrays.asList(tokens);
        wordFrequency = new TreeMap<>();
        for (String token : contentTokens) {
            wordFrequency.put(token, wordFrequency.getOrDefault(token, 0) + 1);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Content: ").append(content).append("\n");
        sb.append("Content Length: ").append(contentTokens.size()).append(" tokens\n");
        sb.append("Token List: ").append(contentTokens).append("\n");
        sb.append("Word Frequency: ").append(wordFrequency).append("\n");
        return sb.toString();
    }
}

