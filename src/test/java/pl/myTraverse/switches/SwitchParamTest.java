package pl.myTraverse.switches;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SwitchParamTest {

    Switch aSwitch;

    @BeforeEach
    void beforeEach() {
        aSwitch = new Switch();
    }

    @ParameterizedTest
    @ValueSource(ints = {-2,0,14,42,-9})
    void shouldThrowExceptionByIncorrectData(int month){
        assertThrows(RuntimeException.class,() -> aSwitch.howManyDays(month));
    }





}