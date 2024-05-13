package br.ufpb.dcx.rodrigor.atividade;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private String codigo;
    private List<Correntista> correntistas;
    private List<ContaCorrente> contasCorrentes;

    public Banco(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.correntistas = new ArrayList<>();
        this.contasCorrentes = new ArrayList<>();
    }

    public Banco() {
    }

    public void adicionarCorrentista(Correntista correntista) {
        if (!correntistas.contains(correntista)) {
            throw new IllegalArgumentException("Correntista não encontrado no banco.");
        }
    }

    public void criarContaCorrente(Correntista correntista) {
        adicionarCorrentista(correntista);
        ContaCorrente novaConta = new ContaCorrente(correntista);
        contasCorrentes.add(novaConta);
    }

    public ContaCorrente getContaCorrente(Correntista correntista) {
        for (ContaCorrente conta : contasCorrentes) {
            if (conta.getCorrentista().equals(correntista)) {
                return conta;
            }
        }
        throw new IllegalArgumentException("Conta corrente não encontrada para o correntista.");
    }
}