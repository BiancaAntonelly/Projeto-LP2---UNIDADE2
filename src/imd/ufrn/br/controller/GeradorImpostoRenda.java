package imd.ufrn.br.controller;

import imd.ufrn.br.modelo.Pessoa;

public class GeradorImpostoRenda {
    private double totalTributo;

    public double getTotalTributo() {
        return totalTributo;
    }

    public void setTotalTributo(double totalTributo) {
        this.totalTributo = totalTributo;
    }

    public double calculaValorTotalTributo(Pessoa p) {
        totalTributo = p.getConta().calcularTributos() + p.calcularTributos() + p.getSeguro().calcularTributos();
        return totalTributo;
    }
}