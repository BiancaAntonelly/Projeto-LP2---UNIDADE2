package imd.ufrn.br.modelo;

public class ContaCorrente implements ITributavel{
    private String agencia;
    private String numero;
    private double saldo;

    public ContaCorrente() {} 
    
    public ContaCorrente(String agencia, String numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso");
            System.out.println("Você tem " + saldo + " reais em sua conta");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$" + valor + "realizado com sucesso");
            System.out.println("Você tem " + saldo + " reais em sua conta");
        } else {
            System.out.println("Valor de depósito inválido");
        }
    }

    public boolean transferir(double valor, ContaCorrente contaDestino) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso para a conta " + contaDestino.getNumero() + ".");
            return true;
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
            return false;
        }
    }

    @Override
    public double calcularTributos() {
        return saldo * 0.0038;
    }
}