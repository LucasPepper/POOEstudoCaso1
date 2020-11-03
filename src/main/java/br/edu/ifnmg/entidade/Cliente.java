package br.edu.ifnmg.entidade;

public abstract class Cliente {
    protected String senha;
    protected String nome;

    public void imprimirNome() {
        System.out.println(this.nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
