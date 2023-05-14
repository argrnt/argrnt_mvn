package pl.myTraverse.lessonFromFC.model;

import java.math.BigDecimal;

public class Employee {

    private final String name;
    private final int experienceYear;
    private final BigDecimal baseSalary;


    public Employee(String name, int experienceYear, BigDecimal baseSalary) {
        this.name = name;
        this.experienceYear = experienceYear;
        this.baseSalary = baseSalary;
    }


    public String getName() {
        return name;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", experienceYear=" + experienceYear +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
