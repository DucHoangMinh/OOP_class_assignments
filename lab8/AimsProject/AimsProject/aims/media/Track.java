package aims.media;

public class Track implements Playable,Comparable,Runnable{
    private String title;
    private int length;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
	    System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    @Override
    public int compareTo(Object obj) {
        if (obj instanceof Track) {
            Track track = (Track) obj;
            return this.getTitle().compareTo(track.getTitle());
        } else {
            return 0;
        }
    }

}
