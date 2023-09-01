import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RadioTest {


    @Test
    void next0() {
        Radio radio = new Radio();
        radio.next();
        int expected = 1;
        int actual = radio.can;
        Assertions.assertEquals(actual, expected);
    }


    @Test
    void next9() {
        Radio radio = new Radio(0, 9);
        radio.next();
        int expected = 0;
        int actual = radio.can;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prev9() {
        Radio radio = new Radio(0, 9);
        radio.prev();
        int expected = 8;
        int actual = radio.can;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prev0() {
        Radio radio = new Radio(0, 0);
        radio.prev();
        int expected = 9;
        int actual = radio.can;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void up0() {
        Radio radio = new Radio(0, 0);
        radio.up();
        int expected = 1;
        int actual = radio.volume;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void up100() {
        Radio radio = new Radio(100, 0);
        radio.up();
        int expected = 100;
        int actual = radio.volume;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void down0() {
        Radio radio = new Radio(0, 0);
        radio.down();
        int expected = 0;
        int actual = radio.volume;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void down100() {
        Radio radio = new Radio(100, 0);
        radio.down();
        int expected = 99;
        int actual = radio.volume;
        Assertions.assertEquals(expected, actual);
    }
}