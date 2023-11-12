package visao;

import dao.PessoaDAO;
import modelo.ContaCorrente;
import modelo.Pessoa;
import modelo.SeguroVida;

public class ImpostoRendaPF {
    public static void main(String[] args) {
        SeguroVida seguroVida1 = new SeguroVida(21230, "Sim" , 300, 31.5);
        SeguroVida seguroVida2 = new SeguroVida(43506, "Não", 500, 31.5);
        SeguroVida seguroVida3 = new SeguroVida(94827, "Não", 200, 31.5);

        ContaCorrente contaCorrente1 = new ContaCorrente("4032", "5", 2500);
        ContaCorrente contaCorrente2 = new ContaCorrente("5039", "2", 2000);
        ContaCorrente contaCorrente3 = new ContaCorrente("4032", "15", 5000);

        Pessoa pessoa1 = new Pessoa("Bianca", 1500, contaCorrente1, seguroVida1);
        Pessoa pessoa2 = new Pessoa("Vanessa", 1600, contaCorrente2, seguroVida2);
        Pessoa pessoa3 = new Pessoa("Maria", 1500, contaCorrente3, seguroVida3);

        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoaDAO.cadastrarPessoa(pessoa1);
        pessoaDAO.cadastrarPessoa(pessoa2);
        pessoaDAO.cadastrarPessoa(pessoa3);

        pessoaDAO.listarPessoas();
        pessoaDAO.calcularTributosPessoas();
        pessoaDAO.imprimeImpostoTotal();
    }
}
