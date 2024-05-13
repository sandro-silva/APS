package br.ufpb.dcx.rodrigor.atividade;

import java.math.BigDecimal;

public class Transacao extends Banco {
    private BigDecimal valor;
    private String tipo;

    public Transacao(BigDecimal valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Transação: " + tipo + ", Valor: " + valor;
    }
}