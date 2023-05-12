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
//        double result = aSwitch.calculate(amount, currency);
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> aSwitch.calculate(amount, currency));

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

}