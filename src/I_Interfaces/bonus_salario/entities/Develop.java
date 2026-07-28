package I_Interfaces.bonus_salario.entities;

import I_Interfaces.bonus_salario.entities.enums.EmployeeType;

public class Develop extends Employee {
    public Develop(String name, Double salary, EmployeeType type) {
        super(name, salary, type);
    }

    @Override
    public double calcularBonus() {
        return getSalary() * 0.15;
    }

    @Override
    public double calcularSalarioMaisBonus() {
        return getSalary() + getSalary() * 0.15;
    }

    @Override
    public String toString() {
        return "Funcionario(a): " + getName()
                + "\nSalario: R$ " + getSalary()
                + "\nCargo: " + getType()
                + "\nBonus de 15% = R$" + calcularBonus()
                + "\nTotal: R$ " + calcularSalarioMaisBonus()
                + "\n";
    }
}
