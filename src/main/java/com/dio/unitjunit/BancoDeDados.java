package com.dio.unitjunit;

import java.util.logging.Logger;

public class BancoDeDados {

  private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

  public static void iniciarConexao() {
    LOGGER.info("iniciou conexão");

  }

  public static void finalizarConexao() {
    LOGGER.info("finalizaou conexão");

  }

  public static void inserirDados(Pessoa pessoa) {
    LOGGER.info("inseriu dados");
  }

  public static void removerDados(Pessoa pessoa) {
    LOGGER.info("removeu dados");
  }

}
