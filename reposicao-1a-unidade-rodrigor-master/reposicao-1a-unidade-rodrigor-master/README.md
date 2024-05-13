**Universidade Federal da Paraíba - UFPB** \
**Centro de Ciências Exatas e Educação - CCAE** \
**Departamento de Ciências Exatas - DCX**

**Professor:** [Rodrigo Rebouças de Almeida](http://rodrigor.dcx.ufpb.br)

# Reposição unidade 1: 

Nome: 

Considere as seguintes funcionalidades de um sistema bancário:

- Banco cria uma conta corrente;
- Fazer o crédito de um valor em uma conta corrente;
- Fazer o débito de um valor em uma conta corrente;
- Obter o saldo de uma conta corrente;
- Tanto a conta corrente quanto o Correntista pertencem a um Banco.
- Um Banco possui um nome e um código.
- Listar as transações de crédito e débito da conta.
- Uma conta não deve permitir o saque se não houver saldo suficiente.
    - A conta deve lançar uma exceção.
- Um Correntista possui nome e cpf. 
- Uma conta corrente possui um número e um correntista.

## Implemente as classes com respectivos métodos para que as funcionalidades acima sejam atendidas:

Você pode implementar outros métodos, além dos descritos abaixo.
Apenas os métodos abaixo são obrigatórios.

- **Banco**
  - adicionarCorrentista(Correntista correntista) (1,0)
  - criarContaCorrente(Correntista correntista) (2,0)
    - se o banco não tiver o correntista passado por parâmetro, deve lançar uma exceção.
  - getContaCorrente(Correntista correntista) (1,0)
- **ContaCorrente**
  - depositar(BigDecimal valor) (1,5)
  - sacar(BigDecimal valor) (1,5)
  - getSaldo() (1,0)
  - listarTransacoes() (1,0)
- **Correntista**
- **Transacao** (1,0)
  - getValor()




Observação: os valores financeiros devem usar a classe BigDecimal.