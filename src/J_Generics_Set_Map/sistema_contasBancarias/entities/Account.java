package J_Generics_Set_Map.sistema_contasBancarias.entities;

public class Account {
    private Integer number;
    private String titular;
    private Double balance;

    public Account(Integer number, String titular, Double balance) {
        this.number = number;
        this.titular = titular;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return getNumber() + " - " + getTitular() + " - R$ "  + String.format("%.2f", getBalance());
    }
}
