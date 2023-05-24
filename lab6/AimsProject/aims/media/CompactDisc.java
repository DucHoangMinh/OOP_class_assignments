package aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private int length;
    private ArrayList<Track> tracks = new ArrayList<>();
    public void setArtist(String artist){
        this.artist = artist;
    }
    public String getArtist(){
        return this.artist;
    }
    public void addTrack(Track track){
        boolean contained = true;
        for(int i = 0; i < tracks.size(); i++){
            if(tracks.get(i).equals(track)){
                System.out.println("Track ma ban muon them vao da tont ai");
                contained = false;
                break;
            }
        }
        if(contained){
            tracks.add(track);
        }
    }
    public void removeTrack(Track track){
        boolean contained =false;
        for(int i = 0; i < tracks.size(); i++){
            if(tracks.get(i).equals(track)){
                tracks.remove(i);
                contained = true;
                break;
            }
        }
        if(contained == false){
            System.out.println("Track ma ban muon xoa khong ton tai");
        }
    }
    public int getLength(){
        int totalLength = 0;
        for(Track track : tracks){
            totalLength += track.getLength();
        }
        return totalLength;
    }
    @Override
    public void play() {
        if(tracks.isEmpty()){
            System.out.println("Hien khong co track nao duoc luu!!");
        }
        else{
            for (Track track : tracks){
                track.getLength();
            }
        }
    }
}
