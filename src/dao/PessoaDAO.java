package dao;

import modelo.Pessoa;

import java.util.ArrayList;

public class PessoaDAO {
    private ArrayList<Pessoa> pessoas = new ArrayList;

    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void removerPessoa(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }

    public ArrayList<Pessoa> listarPessoas() {
        return pessoas;
    }

//  calcularTributosPessoas() {
//
//  }
//  imprimeImpostoTotal(){
//  }

}