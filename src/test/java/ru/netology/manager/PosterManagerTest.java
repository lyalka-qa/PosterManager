package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PosterManagerTest {

    private PosterManager manager = new PosterManager();
    private MovieItem first = new MovieItem("Шан-Чи и легенда десяти колец", "фэнтэзи", "image8.jpg");
    private MovieItem second = new MovieItem("Загадочное убийство", "детектив", "image9.jpg");
    private MovieItem third = new MovieItem("Первый встречный", "мелодрама", "image10.jpg");
    private MovieItem fourth = new MovieItem("Номер один", "комедия", "image1.jpg");
    private MovieItem fifth = new MovieItem("Тролли. Мировой тур", "мультфильм", "image2.jpg");
    private MovieItem sixth = new MovieItem("Человек-невидимка", "ужасы", "image3.jpg");
    private MovieItem seventh = new MovieItem("Джентельмены", "боевик", "image4.jpg");
    private MovieItem eighth = new MovieItem("Отель Белград", "комедия", "image5.jpg");
    private MovieItem ninth = new MovieItem("Вперед", "мультфильм", "image6.jpg");
    private MovieItem tenth = new MovieItem("Бладшот", "боевик", "image7.jpg");

    @BeforeEach
    void add() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
    }

    @Test
    void findAll() {
        manager.findAll();

        MovieItem[] actual = manager.findAll();
        MovieItem[] expected = new MovieItem[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast10Movies() {
        manager.findLast();

        MovieItem[] actual = manager.findLast();
        MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastLessThan10Movies() {
        PosterManager manager = new PosterManager(5);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.findLast();

        MovieItem[] actual = manager.findLast();
        MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth};

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastWhenOneMovie() {
        PosterManager manager = new PosterManager(1);

        manager.add(second);

        manager.findLast();

        MovieItem[] actual = manager.findLast();
        MovieItem[] expected = new MovieItem[]{second};

        assertArrayEquals(expected, actual);
    }

}