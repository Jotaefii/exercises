package I_Interfaces.bonus_salario.entities;

import I_Interfaces.bonus_salario.entities.enums.EmployeeType;

public class Intern extends Employee {
    public Intern(String name, Double salary, EmployeeType type) {
        super(name, salary, type);
    }

    @Override
    public double calcularBonus() {
        return getSalary() * 0.05;
    }

    @Override
    public double calcularSalarioMaisBonus() {
        return getSalary() + getSalary() * 0.05;
    }

    @Override
    public String toString() {
        return "Funcionario(a): " + getName()
                + "\nSalario: R$ " + getSalary()
                + "\nCargo: " + getType()
                + "\nBonus de 5% = R$" + calcularBonus()
                + "\nTotal: R$ " + calcularSalarioMaisBonus()
                + "\n";
    }
}
