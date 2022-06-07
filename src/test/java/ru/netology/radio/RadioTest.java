package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    private Radio radio = new Radio();

    @Test
    void currentStationInRange() {
        radio.setCurrentRadioStation(5);
        int actual = radio.getCurrentRadiostation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void currentStationMax() {
        radio.setCurrentRadioStation(10);
        int actual = radio.getCurrentRadiostation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void currentStationMin() {
        radio.setCurrentRadioStation(-1);
        int actual = radio.getCurrentRadiostation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void nextStationInRang() {
        radio.setCurrentRadioStation(5);

        radio.nextRadiostation();
        int actual = radio.getCurrentRadiostation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void prevStationInRange() {
        radio.setCurrentRadioStation(5);

        radio.prevRadiostation();
        int actual = radio.getCurrentRadiostation();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void nextStationMax() {
        radio.setCurrentRadioStation(9);

        radio.nextRadiostation();
        int actual = radio.getCurrentRadiostation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void prevStationMin() {
        radio.setCurrentRadioStation(0);

        radio.prevRadiostation();
        int actual = radio.getCurrentRadiostation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void currentVolumeInRange() {
        radio.setCurrentVolume(5);
        int actual = radio.getCurrentVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void currentVolumeMax() {
        radio.setCurrentVolume(11);
        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void currentVolumeMin() {
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeInRang() {
        radio.setCurrentVolume(5);

        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeInRang() {
        radio.setCurrentVolume(5);

        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeMax() {
        radio.setCurrentVolume(10);

        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeMin() {
        radio.setCurrentVolume(0);

        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void name() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(19);
        int actual = radio.getCurrentRadiostation();
        int expected = 19;

        assertEquals(expected, actual);
    }

    @Test
    void name2() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(19);
        radio.nextRadiostation();
        int actual = radio.getCurrentRadiostation();
        int expected = 0;

        assertEquals(expected, actual);
    }
}