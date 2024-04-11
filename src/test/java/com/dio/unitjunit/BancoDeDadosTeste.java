package com.dio.unitjunit;

import java.time.LocalDate;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class BancoDeDadosTeste {

  @BeforeAll
  static void configuraConexao() {
    BancoDeDados.iniciarConexao();
  }

  @Test
  @DisplayName("4 - Teste True")
  void validarDadosDeRetorno() {
    System.out.println("Verificando que dados estão corretos no banco de dados");
    Assertions.assertTrue(true);
  }

  @AfterAll
  static void finalizarConexao() {
    BancoDeDados.finalizarConexao();
  }

  @BeforeEach
  void insereDadosParaTeste() {
    BancoDeDados.inserirDados(new Pessoa("Fábio", "18707", LocalDate.of(1970,  5, 26)));
  }

  @AfterEach
  void removeDadosDoTeste() {
    BancoDeDados.removerDados(new Pessoa("Fábio", "18707", LocalDate.of(1970, 5,26)));
  }

  @Test
  @DisplayName("3 - Teste Null")
  void validarOutrosDados() {
    System.out.println("Fazendo verificação de dados");
    Assertions.assertNull(null);
  }

  @Test
  @DisplayName("2 - Teste 3")
  void validarDados3() {
    System.out.println("Fazendo verificação de dados");
    Assertions.assertNull(null);
  }

  @Test
  @DisplayName("1 - Teste 4")
  void validarDados4() {
    System.out.println("Fazendo verificação de dados");
    Assertions.assertNull(null);
  }




}
