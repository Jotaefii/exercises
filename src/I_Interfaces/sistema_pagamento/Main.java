package I_Interfaces.sistema_pagamento;

import I_Interfaces.sistema_pagamento.entities.CreditCardPayment;
import I_Interfaces.sistema_pagamento.entities.PixPayment;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 1;
        while (opcao != 0) {
            System.out.println("1 - Fazer pagamento com pix");
            System.out.println("2 - Fazer pagamento com credito");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para pagamento R$ ");
                    double valor = sc.nextDouble();

                    PixPayment pixPayment = new PixPayment(LocalDateTime.now());
                    pixPayment.pay(valor);
                    break;

                case 2:
                    System.out.print("Valor para pagamento R$ ");
                    double valor2 = sc.nextDouble();

                    CreditCardPayment creditCardPayment = new CreditCardPayment(LocalDateTime.now());
                    creditCardPayment.pay(valor2);
                    break;
            }
        }
    }
}
