package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class Radio {
    private int numberRadioStation;

    private int maxLevelValue = 100;
    private int minLevelValue = 0;
    private int levelValue = 0;
    private int quantityRadioStation = 10;
    private int minNumberRadioStation = 0;
    private int maxNumberRadioStation = quantityRadioStation - 1;


    public void setNumberRadioStation (int newNumberRadioStation) {
        if (newNumberRadioStation > maxNumberRadioStation) {
            return;
        }
        if (newNumberRadioStation < minNumberRadioStation) {
            return;
        }
        this.numberRadioStation = newNumberRadioStation;
    }



    public void setLevelValue (int newLevelValue) {
        if (newLevelValue > maxLevelValue) {
            return;
        }
        if (newLevelValue < minLevelValue) {
            return;
        }
        this.levelValue = newLevelValue;
    }
    public void nextNumberRadioStation () {
        if (numberRadioStation == maxNumberRadioStation) {
            numberRadioStation = minNumberRadioStation;
        } else {
            numberRadioStation++;
        }
    }

    public void prevNumberRadioStation () {
        if (numberRadioStation == minNumberRadioStation) {
            numberRadioStation = maxNumberRadioStation;
        } else {
            numberRadioStation--;
        }
    }

    public void plusLevelValue () {
        if (levelValue == maxLevelValue) {
            return;
        } else {
            levelValue++;
        }
    }

    public void minusLevelValue () {
        if (levelValue == minLevelValue) {
            return;
        } else {
            levelValue--;
        }
    }

}



