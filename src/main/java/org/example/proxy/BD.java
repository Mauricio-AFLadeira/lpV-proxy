package org.example.proxy;

import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Colaborador> colaboradores = new HashMap<>();

    public static Colaborador getColaborador(Integer carteiraTrabalho) {
        return colaboradores.get(carteiraTrabalho);
    }

    public static void addColaborador(Colaborador Colaborador) {
        colaboradores.put(Colaborador.getcarteiraTrabalho(), Colaborador);
    }
}
