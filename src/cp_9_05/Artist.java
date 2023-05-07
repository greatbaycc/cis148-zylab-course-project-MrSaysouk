package cp_9_05;

public class Artist {
    private String artistName;
    private int birthYear;
    private int deathYear;

    public Artist() {
        artistName = "None";
        birthYear = 0;
        deathYear = 0;
    }

    public Artist(String userArtistName, int userBirthYear, int userDeathYear) {
        artistName = userArtistName;
        birthYear = userBirthYear;
        deathYear = userDeathYear;
    }

    public String getName() {
        return artistName;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public int getDeathYear() {
        return deathYear;
    }
    public void printInfo() {
        if (deathYear == -1) {
            System.out.println("Artist: " + artistName + ", born " + birthYear);
        }
        else {
            System.out.println("Artist: " + artistName + " (" + birthYear + "-" + deathYear + ")");
        }
    }

}