package ru.netology.stats;

public class Radio{
    int radioStationNumber;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void nextStationNunber() {
        if (radioStationNumber == 9) {
            int radioStationNumber = 0;
        }
        if (radioStationNumber >= 0) {
            radioStationNumber++;
        }
    }

    public void prevStationNunber() {
        if (radioStationNumber == 0) {
            int radioStationNumber = 9;
        }
        if (radioStationNumber <= 0) {
            radioStationNumber--;
        }
    }

    public int getStationNunber() {
        return radioStationNumber;
    }

    public void setStationNunber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > 9) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

public int soundVolume;
    
}
