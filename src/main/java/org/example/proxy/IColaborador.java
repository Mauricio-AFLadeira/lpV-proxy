package org.example.proxy;

import java.util.List;

public interface IColaborador {
    List<String> obterDadosPessoais();
    List<Float> obterDadosMonetarios(Funcionario funcionario);
}
