package org.example.proxy;

import java.util.Arrays;
import java.util.List;

public class Colaborador implements IColaborador{
    private Integer carteiraTrabalho;
    private String nome;
    private String cidade;
    private Float folhaPagamento;
    private Float salario;

    public Colaborador(int carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
        Colaborador objeto = BD.getColaborador(carteiraTrabalho);
        this.nome = objeto.nome;
        this.cidade = objeto.cidade;
        this.folhaPagamento = objeto.folhaPagamento;
        this.salario = objeto.salario;
    }

    public Colaborador(Integer carteiraTrabalho, String nome, String cidade, Float folhaPagamento, Float salario) {
        this.carteiraTrabalho = carteiraTrabalho;
        this.nome = nome;
        this.cidade = cidade;
        this.folhaPagamento = folhaPagamento;
        this.salario = salario;
    }

    public Integer getcarteiraTrabalho() {
        return carteiraTrabalho;
    }

    @Override
    public List<String> obterDadosPessoais() {
        return Arrays.asList(this.nome, this.cidade);
    }

    @Override
    public List<Float> obterDadosMonetarios(Funcionario funcionario) {
        return Arrays.asList(this.folhaPagamento, this.salario);
    }
}
