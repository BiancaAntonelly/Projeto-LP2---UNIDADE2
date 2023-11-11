package controller;

import modelo.Pessoa;

public class GeradorImpostoRenda {
    private double totalTributo;

    public double getTotalTributo() {
        return totalTributo;
    }

    public void setTotalTributo(double totalTributo) {
        this.totalTributo = totalTributo;
    }

    public double calculaValorTotalTributo(Pessoa p) {
        totalTributo = p.getConta().calcularTributos() + p.getSalario() * 0.11 + p.getSeguro().getTaxa();
        return totalTributo;
    }
}