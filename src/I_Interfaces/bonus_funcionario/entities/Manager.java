package I_Interfaces.bonus_funcionario.entities;

public class Manager extends Develop {
    public Manager(String nome, double salary) {
        super(nome, salary);
    }

    @Override
    public double bonus() {
        return getSalary() * 0.20;
    }
}
