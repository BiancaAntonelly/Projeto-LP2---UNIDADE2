package dao;

import modelo.Pessoa;

import java.util.ArrayList;

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
                    "\n" + "Número " + p.getConta().getNumero() + "\n" + "Saldo: " + p.getConta().getSaldo() + "\n");
        }
    }

    public void calcularTributosPessoas() {
        for (Pessoa pessoa : pessoas) {
            pessoa.setTributos(pessoa.getConta().calcularTributos());
        }
    }

    public void imprimeImpostoTotal() {
        String nome1 = "", nome2 = "";
        double tributoMax = 0, seg = 0, tributoTotal = 0;

        for (Pessoa pessoa : pessoas) {
            tributoTotal += pessoa.getTributos();
            if (pessoa.getTributos() > tributoMax)
                tributoMax = pessoa.getTributos();
            nome1 = pessoa.getNome();
            if (pessoa.getSeguro().getValor() > seg)
                seg = pessoa.getSeguro().getValor();
            nome2 = pessoa.getNome();
        }

        System.out.println("Imposto total a ser recolhido: " + tributoTotal + "\n" +
                "Pessoa que possui maior imposto: " + nome1 + "\n" + "Valor: " + tributoMax +
                "\n" + "Pessoa com maior seguro de vida: " + nome2 + "\n" + "valor do seguro: " + seg);
    }

}