package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void switchingToTheNextPage() {
        Radio service = new Radio();
        service.setStationNunber(0);

        service.nextStationNunber();

        int expected = 1;
        int actual = service.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingToTheNext2Page() {
        Radio service = new Radio();
        service.setStationNunber(1);

        service.nextStationNunber();

        int expected = 2;
        int actual = service.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingToTheNext9Page() {
        Radio service = new Radio();
        service.setStationNunber(9);

        service.nextStationNunber();

        int expected = 0;
        int actual = service.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
}
