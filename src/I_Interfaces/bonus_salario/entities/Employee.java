package I_Interfaces.bonus_salario.entities;

import I_Interfaces.bonus_salario.entities.enums.EmployeeType;
import I_Interfaces.bonus_salario.interfaces.BonusCalculation;

public abstract class Employee implements BonusCalculation {
    private String name;
    private Double salary;
    private EmployeeType  type;

    public Employee(String name, Double salary, EmployeeType type) {
        this.name = name;
        this.salary = salary;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }
}
