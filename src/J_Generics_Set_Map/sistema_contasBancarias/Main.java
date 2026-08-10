package J_Generics_Set_Map.sistema_contasBancarias;

import J_Generics_Set_Map.sistema_contasBancarias.entities.Account;
import J_Generics_Set_Map.sistema_contasBancarias.service.AccountService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AccountService accountService = new AccountService();

        int opcao = 1;
        while (opcao != 0) {
            System.out.println("========================");
            System.out.println("          BANCO         ");
            System.out.println("========================");

            System.out.println();
            System.out.println("1 - Cadastrar conta");
            System.out.println("2 - Buscar conta");
            System.out.println("3 - Listar contas");
            System.out.println("4 - Depositar");
            System.out.println("5 - Sacar");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Numero da conta: ");
                    int numberAccount = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Titular: ");
                    String titular = sc.nextLine();

                    Account account = new Account(numberAccount, titular, 0.0);
                    accountService.registerAccount(account);
                    break;

                case 2:
                    System.out.print("Busque pelo numero: ");
                    int numberSearch = sc.nextInt();

                    Account account1 = accountService.searchAccount(numberSearch);

                    System.out.println(account1.getTitular());
                    System.out.printf("Saldo: R$ %.2f%n", account1.getBalance());
                    break;

                case 3:
                    List<Account> accountList = accountService.accountList();

                    for (Account acc : accountList) {
                        System.out.println(acc);
                    }
                    break;

                case 4:
                    System.out.print("Numero da conta: ");
                    int number = sc.nextInt();

                    Account account2 = accountService.searchAccount(number);

                    if (account2 == null) {
                        System.out.print("Nenhuma conta encontrada!");
                        return;
                    }

                    System.out.print("Valor de deposito: R$ ");
                    double value = sc.nextDouble();

                    accountService.deposit(account2, value);
                    System.out.println("Deposito feito com sucesso!");
                    break;

                case 5:
                    System.out.print("Número da conta: ");
                    int number1 = sc.nextInt();

                    Account account3 = accountService.searchAccount(number1);

                    if (account3 == null) {
                        System.out.println("Conta não encontrada!");
                        return;
                    }

                    System.out.print("Valor do saque: R$ ");
                    double valueWithdraw = sc.nextDouble();

                    accountService.withdraw(account3, valueWithdraw);
                    System.out.println("Saque feito com sucesso!");
                    break;
            }
        }
    }
}
