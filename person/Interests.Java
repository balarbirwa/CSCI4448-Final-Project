public class Interests {
    private String creativity;
    private String sports;
    private String food;
    private String hobby;
    private String music;
    private String favoriteBooks;
    private String favoriteMovies;
    private String travelDestinations;
    private String personalityTraits;
    private String hometown;
    private String job;

    // Parameterized constructor
    public Interests(String creativity, String sports, String food, String hobby, String music,
                     String favoriteBooks, String favoriteMovies, String travelDestinations,
                     String personalityTraits, String hometown, String job) {
        this.creativity = creativity;
        this.sports = sports;
        this.food = food;
        this.hobby = hobby;
        this.music = music;
        this.favoriteBooks = favoriteBooks;
        this.favoriteMovies = favoriteMovies;
        this.travelDestinations = travelDestinations;
        this.personalityTraits = personalityTraits;
        this.hometown = hometown;
        this.job = job;
    }

    // Getters and setters for each field (not shown for brevity)

    @Override
    public String toString() {
        return "Interests {" +
               "\n  Creativity: '" + creativity + '\'' +
               ",\n  Sports: '" + sports + '\'' +
               ",\n  Food: '" + food + '\'' +
               ",\n  Hobby: '" + hobby + '\'' +
               ",\n  Music: '" + music + '\'' +
               ",\n  Favorite Books: '" + favoriteBooks + '\'' +
               ",\n  Favorite Movies: '" + favoriteMovies + '\'' +
               ",\n  Travel Destinations: '" + travelDestinations + '\'' +
               ",\n  Personality Traits: '" + personalityTraits + '\'' +
               ",\n  Hometown: '" + hometown + '\'' +
               ",\n  Job: '" + job + '\'' +
               "\n}";
    }
}


