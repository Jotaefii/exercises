package I_Interfaces.bonus_funcionario.entities;

import I_Interfaces.bonus_funcionario.interfaces.Employee;

public class Develop implements Employee {
    private String nome;
    private double salary;

    public Develop(String nome, double salary) {
        this.nome = nome;
        this.salary = salary;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double salary() {
        return getSalary();
    }
}
