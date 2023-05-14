package pl.myTraverse.lessonFromFC.service;

import pl.myTraverse.lessonFromFC.model.Employee;

import java.math.BigDecimal;

public class SalaryCalculator {

    private static final int MAX_WORKING_DAYS = 20;
    private final Employee employee;


    public SalaryCalculator(Employee employee) {
        this.employee = employee;
    }

    public BigDecimal calculateSalaryAmount(int amountOfDays, BigDecimal bonus) {
        if (amountOfDays > MAX_WORKING_DAYS) {
            return employee.getBaseSalary().add(calculateTotalBonus(MAX_WORKING_DAYS, bonus));
        }
        return employee.getBaseSalary().add(calculateTotalBonus(amountOfDays, bonus));
    }

    private static BigDecimal calculateTotalBonus(int amountOfDays, BigDecimal bonus) {
        return bonus.multiply(new BigDecimal(amountOfDays));
    }


}
