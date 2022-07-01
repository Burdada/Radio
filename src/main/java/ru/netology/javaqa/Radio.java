package ru.netology.javaqa;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int newCurrentStation;
    private int maxStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationAmount) {
        maxStation = stationAmount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > maxStation) {
            return;
        }
        currentStation = newStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            newCurrentStation = currentStation + 1;
        } else {
            newCurrentStation = 0;
        }

        currentStation = newCurrentStation;
    }

    public void prevStation() {
        if (currentStation > 1) {
            newCurrentStation = currentStation - 1;
        } else {
            newCurrentStation = maxStation;
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

