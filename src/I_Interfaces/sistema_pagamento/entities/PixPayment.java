package I_Interfaces.sistema_pagamento.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PixPayment extends AbstractPayment {
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public PixPayment(LocalDateTime dataPagamento) {
        super(dataPagamento);
    }

    @Override
    public void pay(double amount) {
        System.out.println();
        System.out.println("======= PIX ========");
        System.out.printf("Total do pagamento: R$ %.2f%n", amount);
        System.out.println("Data: " + getDataPagamento().format(dtf));
        System.out.println();
    }
}
