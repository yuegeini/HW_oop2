import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RadioTest {


    @Test
    void next0() {
        Radio radio = new Radio();
        radio.setCan(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCan();
        Assertions.assertEquals(actual, expected);
    }


    @Test
    void next9() {
        Radio radio = new Radio();
        radio.setCan(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCan();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prev9() {
        Radio radio = new Radio();
        radio.setCan(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCan();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prev0() {
        Radio radio = new Radio();
        radio.setCan(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCan();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void up0() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.up();
        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void up100() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.up();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void down0() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.down();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void down100() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.down();
        int expected = 99;
        int actual = radio.getVolume();
        Assertions.assertEquals(actual, expected);
    }
}