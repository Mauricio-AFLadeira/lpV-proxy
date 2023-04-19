package org.example.proxy;

import java.util.List;

public class ColaboradorProxy implements IColaborador{
    private Colaborador colaborador;

    private Integer carteiraTrabalho;

    public ColaboradorProxy(Integer carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    @Override
    public List<String> obterDadosPessoais() {
        if (this.colaborador == null) {
            this.colaborador = new Colaborador(this.carteiraTrabalho);
        }
        return this.colaborador.obterDadosPessoais();
    }

    @Override
    public List<Float> obterDadosMonetarios(Funcionario funcionario) {
        if (!funcionario.isEmpregador()) {
            throw new IllegalArgumentException("Funcionário não autorizado");
        }
        if (this.colaborador == null) {
            this.colaborador = new Colaborador(this.carteiraTrabalho);
        }
        return this.colaborador.obterDadosMonetarios(funcionario);
    }
}
