package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanFlexibleTest {
    RadiomanFlexible radio = new RadiomanFlexible(10);

    @Test
    void shouldChangeStation() {
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationUnderMinStation() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationOverMaxStation() {
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldNextStation() {
        radio.setCurrentStation(4);
        radio.nextStation();
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldOverMaxStation() {
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldPrevStation() {
        radio.setCurrentStation(9);
        radio.prevStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void shouldBelowMinStation() {
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldChangeVolume() {
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldOverMaxVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldReduceVolume() {
        radio.setCurrentVolume(55);
        radio.reduceVolume();
        assertEquals(54, radio.getCurrentVolume());
    }

    @Test
    void shouldBelowMinVolume() {
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldOverLimitVolume() {
        radio.setCurrentVolume(110);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldBelowLimitVolume() {
        radio.setCurrentVolume(-1);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

}
