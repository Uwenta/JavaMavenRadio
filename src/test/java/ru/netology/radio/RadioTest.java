package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setNumberDate.csv")
    public void TestSetNumberRadioStation(int expected, int numberStation) {
        Radio radio = new Radio();
        radio.setNumberRadioStation(numberStation);
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setValueDate.csv")
    public void TestSetLevelValue(int expected, int levelValue) {
        Radio radio = new Radio();
        radio.setLevelValue(levelValue);
        int actual = radio.getLevelValue();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextNumberDate.csv")
    public void TestNextNumberRadioStation(int expected, int currentNumber) {
        Radio radio = new Radio();
        radio.setNumberRadioStation(currentNumber);
        radio.nextNumberRadioStation();
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevNumberDate.csv")
    public void TestPrevNumberRadioStation(int expected, int currentNumber) {
        Radio radio = new Radio();
        radio.setNumberRadioStation(currentNumber);
        radio.prevNumberRadioStation();
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/plusValueDate.csv")
    public void TestPlusLevelValue(int expected, int currentValue) {
        Radio radio = new Radio();
        radio.setLevelValue(currentValue);
        radio.plusLevelValue();
        int actual = radio.getLevelValue();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/minusValueDate.csv")
    public void TestMinusLevelValue(int expected, int currentValue) {
        Radio radio = new Radio();
        radio.setLevelValue(currentValue);
        radio.minusLevelValue();
        int actual = radio.getLevelValue();
        Assertions.assertEquals(expected, actual);
    }
}
