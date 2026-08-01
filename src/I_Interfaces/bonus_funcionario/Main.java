package I_Interfaces.bonus_funcionario;

import I_Interfaces.bonus_funcionario.entities.Develop;
import I_Interfaces.bonus_funcionario.entities.Manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cadastro de Funcionário ===");
        System.out.println();
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Cargo: ");
        System.out.println("1 - Developer");
        System.out.println("2 - Manager");
        int opcao = sc.nextInt();

        System.out.print("Salario: R$");
        double salario = sc.nextDouble();
        System.out.println();

        //Saida
        System.out.println("===== DADOS DO FUNCIONÁRIO =====");
        System.out.println();

        if (opcao == 1) {
            Develop develop = new Develop(nome, salario);

            System.out.println("Nome: " + develop.getNome());
            System.out.println("Cargo: Developer");
            System.out.printf("Salário: R$ %.1f", develop.getSalary());
            System.out.printf("Bônus: R$ %.1f", develop.bonus());
        } else if (opcao == 2) {
            Manager manager = new Manager(nome, salario);

            System.out.println("Nome: " +  manager.getNome());
            System.out.println("Cargo: Manager");
            System.out.printf("Salário: R$ %.1f", manager.getSalary());
            System.out.printf("Bônus: R$ %.1f", manager.bonus());
        }
    }
}
