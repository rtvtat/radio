package ru.netology.radio;

import lombok.Getter;

public class Radio {
    private int countRadioStation;
    @Getter
    private int currentRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    @Getter
    private int currentVolume = minVolume;

    public Radio() {
        this(10);
    }

    public Radio(int countRadioStation) {
        this.countRadioStation = countRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > countRadioStation - 1) {
            currentRadioStation = 0;
        } else if (currentRadioStation < 0) {
            currentRadioStation = countRadioStation - 1;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadiostation() {
        setCurrentRadioStation(currentRadioStation + 1);
    }

    public void prevRadiostation() {
        setCurrentRadioStation(currentRadioStation - 1);
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            currentVolume = 10;
        } else if (currentVolume < 0) {
            currentVolume = 0;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        setCurrentVolume(currentVolume + 1);
    }

    public void decreaseVolume() {
        setCurrentVolume(currentVolume - 1);
    }

}
