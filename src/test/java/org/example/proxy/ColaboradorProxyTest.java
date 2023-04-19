package org.example.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ColaboradorProxyTest {
    @BeforeEach
    void setUp() {
        BD.addColaborador(new Colaborador(1212, "Josué", "Juiz de Fora", 1500.0f, 1900.0f));
        BD.addColaborador(new Colaborador(832, "Mauricio", "Bicas", 10000.0f, 10000.0f));
    }

    @Test
    void deveRetornarDadosPessoaisColaborador() {
        ColaboradorProxy Colaborador = new ColaboradorProxy(1212);

        assertEquals(Arrays.asList("Josué", "Juiz de Fora"), Colaborador.obterDadosPessoais());
    }

    @Test
    void deveRetonarNotasColaborador() {
        Funcionario funcionario = new Funcionario("Vicente", true);
        ColaboradorProxy Colaborador = new ColaboradorProxy(832);

        assertEquals(Arrays.asList(10000.0f, 10000.0f), Colaborador.obterDadosMonetarios(funcionario));
    }

    @Test
    void deveRetonarExcecaoUsuarioNaoAutorizadoConsultarNotasColaborador() {
        try {
            Funcionario funcionario = new Funcionario("Jussara", false);
            ColaboradorProxy Colaborador = new ColaboradorProxy(2);

            Colaborador.obterDadosMonetarios(funcionario);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Funcionário não autorizado", e.getMessage());
        }
    }

}