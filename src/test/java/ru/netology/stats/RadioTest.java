package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void firstRadioStation() { //проверка допустимости набора первой (нулевой) станции
        Radio service = new Radio();

        service.setStationNunber(0);
        int expected = 0;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void lastRadioStation() { //проверка допустимости набора последней станции(девятой) станции
        Radio service = new Radio();

        service.setStationNunber(9);
        int expected = 9;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maximumRadioStation() { //проверка допустимости свыше максимальной станции
        Radio service = new Radio();

        service.setStationNunber(10);
        int expected = 0;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minimumRadioStation() { //проверка допустимости ниже минимальной станции
        Radio service = new Radio();

        service.setStationNunber(-1);
        int expected = 0;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchLastStationNext() { //проверка переключения с последней станции на следующую
        Radio service = new Radio();
        service.setStationNunber(9);

        service.nextStationNunber();

        int expected = 0;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchSecondLastStationNext() { //проверка переключения с предпоследней станции на следующую
        Radio service = new Radio();
        service.setStationNunber(8);

        service.nextStationNunber();

        int expected = 9;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchFirstStationNext() { //проверка переключения на следующую станцию
        Radio service = new Radio();
        service.setStationNunber(0);

        service.nextStationNunber();

        int expected = 1;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchSecondStationNext() { //проверка переключения на следующую станцию
        Radio service = new Radio();
        service.setStationNunber(1);

        service.nextStationNunber();

        int expected = 2;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void switchFirstStationPrev() { // проверка переключения на предыдущей станцию с первой (нулевой)
        Radio service = new Radio();
        service.setStationNunber(0);

        service.prevStationNunber();

        int expected = 9;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchLastStationPrev() { //проверка переключения на предыдущую станцию с последней
        Radio service = new Radio();
        service.setStationNunber(9);

        service.prevStationNunber();

        int expected = 8;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchSecondStationPrev() { //проверка переключения на предыдущую станцию со второй
        Radio service = new Radio();
        service.setStationNunber(1);

        service.prevStationNunber();

        int expected = 0;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchSecondLastStationPrev() { //проверка переключения на предыдущую станцию и ниже
        Radio service = new Radio();
        service.setStationNunber(8);

        service.prevStationNunber();

        int expected = 7;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchLastVolumeLevelPlus() { //проверка увеличения громкости с максимального значения
        Radio service = new Radio();
        service.setVolumeLevel(100);

        service.plusVolumeLevel();

        int expected = 100;
        int actual = service.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchFirstVolumeLevelPlus() {//проверка увеличения громкости с минимального значения
        Radio service = new Radio();
        service.setVolumeLevel(0);

        service.plusVolumeLevel();

        int expected = 1;
        int actual = service.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchFirstVolumeLevelMinus() { //проверка уменьшения громкости с минимльного значения
        Radio service = new Radio();
        service.setVolumeLevel(0);

        service.minusVolumeLevel();

        int expected = 0;
        int actual = service.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchLastVolumeLevelMinus() { // проверка уменьшения громкости с максимального значения
        Radio service = new Radio();
        service.setVolumeLevel(100);

        service.minusVolumeLevel();

        int expected = 99;
        int actual = service.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

}
