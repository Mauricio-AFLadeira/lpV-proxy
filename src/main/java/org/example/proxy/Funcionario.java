package org.example.proxy;

public class Funcionario {
    private String nome;
    private boolean empregador;

    public Funcionario(String nome, boolean empregador) {
        this.nome = nome;
        this.empregador = empregador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEmpregador() {
        return empregador;
    }

    public void setempregador(boolean empregador) {
        this.empregador = empregador;
    }
}
