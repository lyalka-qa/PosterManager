package ru.netology.manager;

public class MovieItem {
    private String movieName;
    private String genre;
    private String imageUrl;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public MovieItem(String movieName, String genre, String imageUrl) {
        this.movieName = movieName;
        this.genre = genre;
        this.imageUrl = imageUrl;
    }

    public MovieItem() {
    }
}
