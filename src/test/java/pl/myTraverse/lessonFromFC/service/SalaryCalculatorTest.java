package pl.myTraverse.lessonFromFC.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pl.myTraverse.lessonFromFC.model.Employee;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalaryCalculatorTest {

    private SalaryCalculator salaryCalculator;
    private static Employee employeeWithSalary;

    @BeforeAll
    static void setup() {
        employeeWithSalary = new Employee("John", 10, new BigDecimal(5000));
    }

    @BeforeEach
    void init() {
        salaryCalculator = new SalaryCalculator(employeeWithSalary);
    }


//--------------------------------------------------
    @ParameterizedTest
    @MethodSource("prepareSampleSalary")
    void shouldVerifySalaryCalculation(int amountOfDays, BigDecimal bonus, BigDecimal expected) {
//        given
//        when
        BigDecimal result = salaryCalculator.calculateSalaryAmount(amountOfDays, bonus);
//        then
        assertEquals(expected, result);
    }

    public static Stream<Arguments> prepareSampleSalary() {
        return Stream.of(
                Arguments.of(10, new BigDecimal(300), new BigDecimal(8000)),
                Arguments.of( 27, new BigDecimal(200), new BigDecimal(9000))
        );
    }

//-------------------------------------------------
    @ParameterizedTest
    @MethodSource("prepareSalaryMethod_2")
    void shouldVerifySalaryCalculation_2(int amountOfDays, BigDecimal bonus, BigDecimal expected){
//        given
//        when
        BigDecimal result = salaryCalculator.calculateSalaryAmount(amountOfDays, bonus);
//        then
        assertEquals(expected,result);
    }

    public static Stream<Arguments> prepareSalaryMethod_2() {
                return Stream.of(
                        Arguments.of(20,new BigDecimal(150),new BigDecimal(8000)),
                        Arguments.of(25,new BigDecimal(150),new BigDecimal(8000)),
                        Arguments.of(10,new BigDecimal(150),new BigDecimal(6500))
                );
    }



}