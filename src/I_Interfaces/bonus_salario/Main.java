package I_Interfaces.bonus_salario;

import I_Interfaces.bonus_salario.entities.Develop;
import I_Interfaces.bonus_salario.entities.Employee;
import I_Interfaces.bonus_salario.entities.Intern;
import I_Interfaces.bonus_salario.entities.Manager;
import I_Interfaces.bonus_salario.entities.enums.EmployeeType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        int opcao = 1;
        while(opcao != 0){
            System.out.println("1 - Adicionar funcionario");
            System.out.println("2 - Listar funcionarios");
            System.out.println("3 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Salario: R$");
                    double salario = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Cargo: ");
                    EmployeeType cargo = EmployeeType.valueOf(sc.nextLine());

                    if (cargo == EmployeeType.SENIOR){
                        employees.add(new Manager(nome, salario, cargo));
                    } else if (cargo == EmployeeType.PLENO) {
                        employees.add(new Develop(nome, salario, cargo));
                    } else {
                        employees.add(new Intern(nome, salario, cargo));
                    }
                    break;

                case 2:
                    for (Employee e : employees){
                        System.out.println(e);
                    }
                    break;

                case 3:
                    System.out.println("Saindo....");
                    break;
            }
        }
    }
}
