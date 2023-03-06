import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(7);

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationLessThanZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationMoreThanNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationNextLessThanNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationNextCurrentIsNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationPrevCurrentGreaterThanZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        radio.prev();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationPrevCurrentIsZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeCurrentLessThanOneHundred() {
        Radio radio = new Radio();

        radio.currentVolume = 8;

        radio.increaseVolume();

        int expected = 9;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeCurrentIsOneHundred() {
        Radio radio = new Radio();

        radio.currentVolume = 100;

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeCurrentGreaterThanZero() {
        Radio radio = new Radio();

        radio.currentVolume = 81;

        radio.decreaseVolume();

        int expected = 80;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeCurrentIsZero() {
        Radio radio = new Radio();

        radio.currentVolume = 0;

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }


}
