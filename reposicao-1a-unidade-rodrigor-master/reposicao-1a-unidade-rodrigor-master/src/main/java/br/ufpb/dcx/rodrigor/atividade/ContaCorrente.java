package br.ufpb.dcx.rodrigor.atividade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class ContaCorrente extends Banco {
    private String numero;
    private Correntista correntista;
    private BigDecimal saldo;
    private List<Transacao> transacoes;

    public ContaCorrente(Correntista correntista) {
        super();
        this.correntista = correntista;
        this.saldo = BigDecimal.ZERO;
        this.transacoes = new ArrayList<>();
    }

    public void depositar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo.");
        }
        saldo = saldo.add(valor);
        transacoes.add(new Transacao(valor, "Crédito"));
    }

    public void sacar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser positivo.");
        }
        if (saldo.compareTo(valor) < 0) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
        saldo = saldo.subtract(valor);
        transacoes.add(new Transacao(valor, "Débito"));
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void listarTransacoes() {
        for (Transacao transacao : transacoes) {
            System.out.println(transacao);
        }
    }

    public Correntista getCorrentista() {
        return correntista;
    }
}