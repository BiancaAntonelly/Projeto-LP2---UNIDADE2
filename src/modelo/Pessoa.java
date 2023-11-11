package modelo;

public class Pessoa {
    private String nome;
    private double salario;
    private ContaCorrente conta;
    private SeguroVida seguro;
    private double tributos;

    public Pessoa() {}
    public Pessoa(String nome, double salario, ContaCorrente conta, SeguroVida seguro, double tributos) {
        this.nome = nome;
        this.salario = salario;
        this.conta = conta;
        this.seguro = seguro;
        this.tributos = tributos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    public SeguroVida getSeguro() {
        return seguro;
    }

    public void setSeguro(SeguroVida seguro) {
        this.seguro = seguro;
    }

    public double getTributos() {
        return tributos;
    }

    public void setTributos(double tributos) {
        this.tributos = tributos;
    }
}
