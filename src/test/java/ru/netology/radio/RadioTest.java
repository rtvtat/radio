package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void currentStationInRange() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        int actual = radio.getCurrentRadiostation();
        int expected = 5;

        assertEquals(expected, actual);
    }
    @Test
    void currentStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int actual = radio.getCurrentRadiostation();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void currentStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int actual = radio.getCurrentRadiostation();
        int expected = 9;

        assertEquals(expected, actual);
    }

        @Test
    void nextStationInRang() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.nextRadiostation();
        int actual = radio.getCurrentRadiostation();
        int expected = 6;

        assertEquals(expected, actual);
    }
    @Test
    void prevStationInRange() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.prevRadiostation();
        int actual = radio.getCurrentRadiostation();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void nextStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.nextRadiostation();
        int actual = radio.getCurrentRadiostation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void prevStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prevRadiostation();
        int actual = radio.getCurrentRadiostation();
        int expected = 9;

        assertEquals(expected, actual);
    }
    @Test
    void currentVolumeInRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int actual = radio.getCurrentVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }
    @Test
    void currentVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }
    @Test
    void currentVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeInRang() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeInRang() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
}