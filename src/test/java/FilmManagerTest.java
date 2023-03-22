import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void test() {
        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findall();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testTresFilms() {
        String film1 = "Film 1";
        String film2 = "Film 2";
        String film3 = "Film 3";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testMasFilms() {
        String film1 = "Film 1";
        String film2 = "Film 2";
        String film3 = "Film 3";
        String film4 = "Film 4";
        String film5 = "Film 5";
        String film6 = "Film 6";
        String film7 = "Film 7";
        String film8 = "Film 8";
        String film9 = "Film 9";
        String film10 = "Film 10";
        String film11 = "Film 11";
        String film12 = "Film 12";
        String film13 = "Film 13";
        String film14 = "Film 14";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);
        manager.addFilm(film12);
        manager.addFilm(film13);
        manager.addFilm(film14);


        String[] expected = {"Film 14", "Film 13", "Film 12","Film 11","Film 10","Film 9","Film 8","Film 7",
                "Film 6","Film 5"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test10Films() {
        String film1 = "Film 1";
        String film2 = "Film 2";
        String film3 = "Film 3";
        String film4 = "Film 4";
        String film5 = "Film 5";
        String film6 = "Film 6";
        String film7 = "Film 7";
        String film8 = "Film 8";
        String film9 = "Film 9";
        String film10 = "Film 10";


        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);



        String[] expected = {"Film 10", "Film 9", "Film 8","Film 7","Film 6","Film 5","Film 4","Film 3",
                "Film 2","Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
