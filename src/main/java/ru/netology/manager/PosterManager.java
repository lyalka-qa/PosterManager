package ru.netology.manager;

public class PosterManager {
    private MovieItem[] items = new MovieItem[0];
    private int lastMovies = 10;

    //String[] movieName = new String[0]; объект фильма - объект строки

    public void add(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];

        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] findAll() {
        return items;
    }

    public PosterManager(int lastMovies) {
        this.lastMovies = lastMovies;
    }

    public PosterManager() {
    }

    public MovieItem[] findLast() {
        int resultLength = lastMovies;

        MovieItem[] result = new MovieItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            int indexTo = items.length - i - 1;
            result[i] = items[indexTo];
        }

        return result;
    }

}

