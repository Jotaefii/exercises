package J_Generics_Set_Map.sistema_contasBancarias.service;

import J_Generics_Set_Map.sistema_contasBancarias.entities.Account;

import java.util.*;

public class AccountService {
    Map<Integer, Account> accountMap = new HashMap<>();

    public void registerAccount(Account account) {
        if (accountMap.containsKey(account.getNumber())) {
            System.out.println("Já existe uma conta com este número!");
            return;
        }
        accountMap.put(account.getNumber(), account);
    }

    public Account searchAccount(int number) {
        for (Account account : accountMap.values())
            if (accountMap.containsKey(number)) {
                return account;
            }
        return null;
    }

    public List<Account> accountList() {
        return new ArrayList<>(accountMap.values());
    }

    public void deposit(Account account, double value) {
        double balance = account.getBalance();
        balance += value;
        account.setBalance(balance);
    }

    public void withdraw(Account account, double value) {
        double balance = account.getBalance();
        balance -= value;
        account.setBalance(balance);
    }
}
