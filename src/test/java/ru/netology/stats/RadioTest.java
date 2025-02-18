package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void firstRadioStation() {
        Radio service = new Radio();

        service.setStationNunber(0);
        int expected = 0;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void lastRadioStation() {
        Radio service = new Radio();

        service.setStationNunber(9);
        int expected = 9;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maximumRadioStation() {
        Radio service = new Radio();

        service.setStationNunber(10);
        int expected = 0;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minimumRadioStation() {
        Radio service = new Radio();

        service.setStationNunber(-1);
        int expected = 0;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchLastStationNext() {
        Radio service = new Radio();
        service.setStationNunber(9);

        service.nextStationNunber();

        int expected = 0;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchFirstStationNext() {
        Radio service = new Radio();
        service.setStationNunber(0);

        service.nextStationNunber();

        int expected = 1;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchFirstStationPrev() {
        Radio service = new Radio();
        service.setStationNunber(0);

        service.prevStationNunber();

        int expected = 9;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchLastStationPrev() {
        Radio service = new Radio();
        service.setStationNunber(9);

        service.prevStationNunber();

        int expected = 8;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchLastVolumeLevelPlus() {
        Radio service = new Radio();
        service.setVolumeLevel(100);

        service.plusVolumeLevel();

        int expected = 100;
        int actual = service.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchFirstVolumeLevelPlus() {
        Radio service = new Radio();
        service.setVolumeLevel(0);

        service.plusVolumeLevel();

        int expected = 1;
        int actual = service.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchFirstVolumeLevelMinus() {
        Radio service = new Radio();
        service.setVolumeLevel(0);

        service.minusVolumeLevel();

        int expected = 0;
        int actual = service.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchLastVolumeLevelMinus() {
        Radio service = new Radio();
        service.setVolumeLevel(100);

        service.minusVolumeLevel();

        int expected = 99;
        int actual = service.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

}
