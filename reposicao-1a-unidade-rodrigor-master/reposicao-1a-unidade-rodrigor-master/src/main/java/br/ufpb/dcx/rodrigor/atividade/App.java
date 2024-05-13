package br.ufpb.dcx.rodrigor.atividade;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        // Criando um banco
        Banco banco = new Banco("Meu Banco", "001");

        // Criando correntistas
        Correntista correntista1 = new Correntista("João", "12345678900");
        Correntista correntista2 = new Correntista("Maria", "98765432100");

        // Adicionando correntistas ao banco
        banco.adicionarCorrentista(correntista1);
        banco.adicionarCorrentista(correntista2);

        // Criando contas correntes para os correntistas
        banco.criarContaCorrente(correntista1);
        banco.criarContaCorrente(correntista2);

        // Realizando algumas transações
        ContaCorrente conta1 = banco.getContaCorrente(correntista1);
        ContaCorrente conta2 = banco.getContaCorrente(correntista2);

        conta1.depositar(new BigDecimal("1000.00"));
        conta1.sacar(new BigDecimal("200.00"));

        conta2.depositar(new BigDecimal("500.00"));
        conta2.sacar(new BigDecimal("100.00"));

        // Listando transações
        System.out.println("Transações da Conta Corrente de " + correntista1.getNome() + ":");
        conta1.listarTransacoes();

        System.out.println("\nTransações da Conta Corrente de " + correntista2.getNome() + ":");
        conta2.listarTransacoes();
    }
}
