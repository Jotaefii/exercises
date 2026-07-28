package I_Interfaces.sistema_pagamento.entities;

import java.time.LocalDateTime;

public abstract class AbstractPayment implements I_Interfaces.sistema_pagamento.interfaces.Payment {
    private LocalDateTime dataPagamento;

    public AbstractPayment(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
