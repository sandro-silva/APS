package br.ufpb.dcx.rodrigor.atividade;

public class Correntista extends Banco{
    private String nome;
    private String cpf;

    public Correntista(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
}
