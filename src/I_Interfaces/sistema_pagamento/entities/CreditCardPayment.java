package I_Interfaces.sistema_pagamento.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CreditCardPayment extends AbstractPayment {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public CreditCardPayment(LocalDateTime dataPagamento) {
        super(dataPagamento);
    }

    @Override
    public void pay(double amount) {
        System.out.println();
        System.out.println("======= CARTÃO DE CREDITO ========");
        System.out.printf("Total do pagamento: R$ %.2f%n", amount);
        System.out.println("Data: " + getDataPagamento().format(formatter));
        System.out.println();
    }
}
