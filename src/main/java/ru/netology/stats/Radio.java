package ru.netology.stats;

public class Radio {
    int radioStationNumber;

    public int getRadioStationNumber() {
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

    public void nextStationNunber() {
        if (radioStationNumber < 9) {
            radioStationNumber++;
        }
        if (radioStationNumber == 9) {
            radioStationNumber = 0;
        }
    }

    public void prevStationNunber() {
        if (radioStationNumber > 0) {
            radioStationNumber--;
        }
        if (radioStationNumber == 0) {
            radioStationNumber = 9;
        }
    }

    int volumeLevel;

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int newVolumeLevel) {
        volumeLevel = newVolumeLevel;
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

