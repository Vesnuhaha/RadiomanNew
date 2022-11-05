package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentStation() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationMin() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationMax() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationOverLimit() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(15);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStation() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(2);
        radio.nextStation();

        int expected = 3;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationFromMax() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStation() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(8);
        radio.prevStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationFromMin() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeIncrease() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(2);
        radio.increaseVolume();

        int expected = 3;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeIncreaseMax() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeReduce() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(10);
        radio.reduceVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeReduceFromMin() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}
