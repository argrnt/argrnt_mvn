package pl.myTraverse.switches;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SwitchTest {

    Switch aSwitch;

    @BeforeEach
    void beforeEach() {
        aSwitch = new Switch();
    }


    @Test
    void shouldCalculateUSD() {
        //        given
        double amount = 100;
        String usd = "USD";
        double expected = 23.866348448687347;
        //        when
        double result = aSwitch.calculate(amount, usd);
        //        then
        assertEquals(expected, result);
    }


    @Test
    void shouldCalculateGBP() {
        //        given
        double amount = 100;
        String gbp = "GBP";
        double expected = 19.305019305019307;
        //        when
        double result = aSwitch.calculate(amount, gbp);
        //        then
        assertEquals(expected, result);
    }


    @Test
    void shouldCalculateEUR() {
        //        given
        double amount = 100;
        String eur = "EUR";
        double expected = 22.026431718061673;
        //        when
        double result = aSwitch.calculate(amount, eur);
        //        then
        assertEquals(expected, result);
    }


    @Test
    void shouldCalculateCHF() {
        //        given
        double amount = 100;
        String chf = "CHF";
        double expected = 23.20185614849188;
        //        when
        double result = aSwitch.calculate(amount, chf);
        //        then
        assertEquals(expected, result);
    }


    @Test
    void shouldCalculateOtherCurrency() {
        //        given
        double amount = 100;
        String currency = "null";

        //        when
        //        then
        assertThrows(IllegalArgumentException.class, () -> aSwitch.calculate(amount, currency));
    }


    @Test
    void shouldCalculateOtherCurrency_2() {
        //        given
        double amount = 100;
        String currency = "CH";
        //        when
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> aSwitch.calculate(amount, currency));
        //        then
        assertEquals("Error! Following currency: " + currency + " is not available",
                illegalArgumentException.getMessage());
    }


// tests for howManyDays(int mounth)

    @Test
    void checkSumFromJanuaryHowManyDays() {
//        given
        int month = 1;
//        when
        int sum = aSwitch.howManyDays(month);
//        then
        assertEquals(31, sum);
    }

    @Test
    void checkSumFromFebruaryHowManyDays() {
//        given
        int month = 2;
//        when
        int sum = aSwitch.howManyDays(month);
//        then
        assertEquals(59, sum);
    }

    @Test
    void checkSumFromMarchHowManyDays() {
//        given
        int month = 3;
//        when
        int sum = aSwitch.howManyDays(month);
//        then
        assertEquals(90, sum);
    }

    @Test
    void checkSumFromAprilHowManyDays() {
//        given
        int month = 4;
//        when
        int sum = aSwitch.howManyDays(month);
//        then
        assertEquals(120, sum);
    }

    @Test
    void checkSumFromMayHowManyDays() {
//        given
        int month = 5;
//        when
        int sum = aSwitch.howManyDays(month);
//        then
        assertEquals(151, sum);
    }

    @Test
    void checkSumFromJuneHowManyDays() {
//        given
        int month = 6;
//        when
        int sum = aSwitch.howManyDays(month);
//        then
        assertEquals(181, sum);
    }

    @Test
    void checkSumFromJulyHowManyDays() {
//        given
        int month = 7;
//        when
        int sum = aSwitch.howManyDays(month);
//        then
        assertEquals(212, sum);
    }

    @Test
    void checkSumFromAugustHowManyDays() {
//        given
        int month = 8;
//        when
        int sum = aSwitch.howManyDays(month);
//        then
        assertEquals(243, sum);
    }

    @Test
    void checkSumFromSeptemberHowManyDays() {
//        given
        int month = 9;
//        when
        int sum = aSwitch.howManyDays(month);
//        then
        assertEquals(273, sum);
    }

    @Test
    void checkSumFromOctoberHowManyDays() {
//        given
        int month = 10;
//        when
        int sum = aSwitch.howManyDays(month);
//        then
        assertEquals(304, sum);
    }

    @Test
    void checkSumFromNovemberHowManyDays() {
//        given
        int month = 11;
//        when
        int sum = aSwitch.howManyDays(month);
//        then
        assertEquals(334, sum);
    }

    @Test
    void checkSumFromDecemberHowManyDays() {
//        given
        int month = 12;
//        when
        int sum = aSwitch.howManyDays(month);
//        then
        assertEquals(365, sum);
    }


}