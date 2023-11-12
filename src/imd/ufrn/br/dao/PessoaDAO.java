package imd.ufrn.br.dao;

import imd.ufrn.br.modelo.Pessoa;

import java.util.ArrayList;

import imd.ufrn.br.controller.GeradorImpostoRenda;

public class PessoaDAO {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void removerPessoa(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }

    public void listarPessoas() {
        System.out.println("---------------Lista de pessoas---------------");
        for (Pessoa p : pessoas) {
            System.out.println("Nome: " + p.getNome() + "\n" + "salário: " + p.getSalario() +
                    "\n" + "Informações conta corrente: " + "\n" + "Agência: " + p.getConta().getAgencia() +
                    "\n" + "Número " + p.getConta().getNumero() + "\n" + "Saldo: " + p.getConta().getSaldo() + 
                    "\n" + "Informações seguro de vida: " + "\n" + "Número: " + p.getSeguro().getNumero() + 
                    "\n" + "Beneficiado: " + p.getSeguro().getBeneficiado() + "\n" + "Valor: " + p.getSeguro().getValor() + "\n");
        }
    }

    public void calcularTributosPessoas() {
        System.out.println("Cálculo do tributo das pessoas");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + "\n" + "Valor tributos: " + pessoa.getConta().calcularTributos() + "\n");
        }
    }

    public void imprimeImpostoTotal() {
        String nome1 = "", nome2 = "";
        double tributoMax = 0, valorMax = 0, tributoTotal = 0, tributo;
        GeradorImpostoRenda geradorImpostoRenda = new GeradorImpostoRenda();

        for (Pessoa pessoa : pessoas) {
            tributo = geradorImpostoRenda.calculaValorTotalTributo(pessoa);
            tributoTotal += tributo;
            if (tributo > tributoMax) {
                tributoMax = tributo; 
                nome1 = pessoa.getNome();
            }
            if (pessoa.getSeguro().getValor() > valorMax) {
                valorMax = pessoa.getSeguro().getValor(); 
                nome2 = pessoa.getNome();
            }
        }

        System.out.println("Imposto total a ser recolhido: " + tributoTotal + "\n" +
                "Pessoa que possui maior imposto: " + nome1 + "\n" + "Valor: " + tributoMax +
                "\n" + "Pessoa com maior seguro de vida: " + nome2 + "\n" + "valor do seguro: " + valorMax);
    }
}