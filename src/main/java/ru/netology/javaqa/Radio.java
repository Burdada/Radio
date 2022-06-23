package ru.netology.javaqa;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int newCurrentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        currentStation = newStation;
    }

    public void nextStation() {
        if (currentStation <= 8) {
            newCurrentStation = currentStation + 1;
        }
        if (currentStation == 9) {
            newCurrentStation = 0;
        }
        currentStation = newCurrentStation;
    }

    public void prevStation() {
        if (currentStation >= 1) {
            newCurrentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            newCurrentStation = 9;
        }
        currentStation = newCurrentStation;
    }

    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        currentVolume = newVolume;
    }

    public void increaseVolume() {

        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}

