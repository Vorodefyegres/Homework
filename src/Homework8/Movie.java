package Homework8;

public class Movie {
    private String title;
    private String studio;
    private String rating;
    public static void main(String[] args) {
        Movie movie1 = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
        Movie movie2 = new Movie("Главный герой", "20th Century Studios");

        System.out.println("Homework8.Movie 1: " + movie1.title + ", Studio: " + movie1.studio + ", Rating: " + movie1.rating);
        System.out.println("Homework8.Movie 2: " + movie2.title + ", Studio: " + movie2.studio + ", Rating: " + movie2.rating);
    }
    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }
}