package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void switchingToTheNext9Page() {
        Radio service = new Radio();
        service.setStationNunber(9);

        service.nextStationNunber();

        int expected = 0;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void switchingToTheNext0Page() {
        Radio service = new Radio();
        service.setStationNunber(0);

        service.nextStationNunber();

        int expected = 1;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void switchingToTheNext5Page() {
        Radio service = new Radio();
        service.setStationNunber(5);

        service.nextStationNunber();

        int expected = 6;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void switchingToThePrev0Page() {
        Radio service = new Radio();
        service.setStationNunber(0);

        service.prevStationNunber();

        int expected = 9;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void switchingToThePrev9Page() {
        Radio service = new Radio();
        service.setStationNunber(9);

        service.prevStationNunber();

        int expected = 8;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void switchingToThePrev7Page() {
        Radio service = new Radio();
        service.setStationNunber(7);

        service.prevStationNunber();

        int expected = 6;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

}
