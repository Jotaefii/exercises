package I_Interfaces.bonus_funcionario.interfaces;

public interface Employee {
    double salary();

    default double bonus() {
        return  salary() * 0.10;
    }
}
