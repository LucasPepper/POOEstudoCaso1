package br.edu.ifnmg.entidade;

public class Main {

    public static void main(String[] args) {
        System.out.println("Teste");

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("João");
        pessoaFisica.imprimirNome();

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Empresa ABC");
        pj.imprimirNome();

    }
}
