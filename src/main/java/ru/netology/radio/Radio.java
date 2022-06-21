package ru.netology.radio;

public class Radio {
    private int numberRadioStation;
    private int levelValue;

    public int getNumberRadioStation (){
        return numberRadioStation;
    }

    public void setNumberRadioStation (int newNumberRadioStation) {
        if (newNumberRadioStation > 9) {
            return;
        }
        if (newNumberRadioStation < 0) {
            return;
        }
        this.numberRadioStation = newNumberRadioStation;
    }

    public int getLevelValue (){
        return levelValue;
    }

    public void setLevelValue (int newLevelValue) {
        if (newLevelValue > 10) {
            return;
        }
        if (newLevelValue < 0) {
            return;
        }
        this.levelValue = newLevelValue;
    }

    public void nextNumberRadioStation () {
        if (numberRadioStation == 9) {
            numberRadioStation = 0;
        } else {
            numberRadioStation++;
        }
    }

    public void prevNumberRadioStation () {
        if (numberRadioStation == 0) {
            numberRadioStation = 9;
        } else {
            numberRadioStation--;
        }
    }

    public void plusLevelValue () {
        if (levelValue == 10) {
            return;
        } else {
            levelValue++;
        }
    }

    public void minusLevelValue () {
        if (levelValue == 0) {
            return;
        } else {
            levelValue--;
        }
    }


}


