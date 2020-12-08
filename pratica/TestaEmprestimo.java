package testaemprestimo;

import java.util.Date;

public class TestaEmprestimo {

    public static void main(String[] args) {
      
        // Cria instância de livro correspondente ao livro
        // a ser emprestado
        Editora editora = new Editora("POO", "Rua Estrite");
        Pessoa autor = new Pessoa("Ana", 1920);
        Livro l = new Livro("Lamentos",editora,autor,1982);

        // Cria instância que representa o empréstimo do livro
        Pessoa func = new Pessoa("Zeca", 1930);
        Pessoa usr = new Pessoa("Paulo",1989);
        Emprestimo emp = new Emprestimo(l,func,usr, new Date());

        // Imprime conteúdo de empréstimo representado
        // pela instância criada acima.
        System.out.println(emp);
    }
}
