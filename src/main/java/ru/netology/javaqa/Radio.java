package ru.netology.javaqa;

public class Radio {
    public int currentStation;
    public int currentVolume;

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

    public void nextStation(){
        if (currentStation < 9){
            currentStation = currentStation + 1;
        } if (currentStation == 9){
            currentStation = 0;
        }
            }

    public void prevStation(){
        if (currentStation > 0){
            currentStation = currentStation - 1;
        } if (currentStation == 0){
            currentStation = 9;
        }
    }
    public int getVolume(){
        return currentVolume;
    }

    public  void setVolume(int newVolume){
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        currentVolume = newVolume;
    }

    public void increaseVolume(){

        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume(){
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
    }

