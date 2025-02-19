package ru.netology.stats;

public class Radio {
    private int radioStationNumber;
    private int volumeLevel;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public int getVolumeLevel() {
        return volumeLevel;
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

    public void setVolumeLevel(int newVolumeLevel) {
        volumeLevel = newVolumeLevel;
    }

    public void nextStationNunber() {
        if (radioStationNumber == 9) {
            radioStationNumber = 0;
        } else {
            radioStationNumber ++;
        }
    }

    public void prevStationNunber() {
        if (radioStationNumber == 0) {
            radioStationNumber = 9;
        } else {
            radioStationNumber--;
        }
    }


    public void plusVolumeLevel() {
        if (volumeLevel < 100) {
            volumeLevel++;
        }
    }

    public void minusVolumeLevel() {
        if (volumeLevel > 0) {
            volumeLevel--;
        }
    }
}

