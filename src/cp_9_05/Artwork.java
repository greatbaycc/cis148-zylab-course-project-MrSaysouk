package cp_9_05;

public class Artwork {
    private String title;
    private int yearCreated;
    private Artist artist;

    public Artwork() {
        title = "None";
        yearCreated = 0;
    }

    public String getTitle() {
        return title;
    }
    public int getYearCreated() {
        return yearCreated;
    }

    public Artwork(String userTitle, int inputYear, Artist userArtist) {
        title = userTitle;
        yearCreated = inputYear;
        artist = userArtist;
    }

    public void printInfo() {
        artist.printInfo();
        System.out.println("Title: " + title + ", " + yearCreated);
    }

}

