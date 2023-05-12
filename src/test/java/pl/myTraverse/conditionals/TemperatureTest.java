package pl.myTraverse.conditionals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemperatureTest {

    Temperature temperature;

    @BeforeEach
    void beforeEach() {
        temperature = new Temperature();
    }

    @Test
    void shouldCheckIfMeasuredTempNormal() {
//    given
        double temp = 35.1;
        String expected = "temperature normal";
//    when
        String result = temperature.measurement(temp);
//    then
        Assertions.assertEquals(expected, result);
    }



    @Test
    void shouldCheckIfMeasuredTempLowgradefever() {
//    given
        double temp = 37.1;
        String expected = "low-grade fever";
//    when
        String result = temperature.measurement(temp);
//    then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldCheckIfMeasuredTempFever() {
//    given
        double temp = 38.5;
        String expected = "fever";
//    when
        String result = temperature.measurement(temp);
//    then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldCheckIfMeasuredTempCallanAmbulance() {
//    given
        double temp = 40.1;
        String expected = "call an ambulance";
//    when
        String result = temperature.measurement(temp);
//    then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldCheckIfMeasuredTempMeasurementerror() {
//    given
        double temp = 35;
        String expected = "measurement error";
//    when
        String result = temperature.measurement(temp);
//    then
        Assertions.assertEquals(expected, result);
    }

}