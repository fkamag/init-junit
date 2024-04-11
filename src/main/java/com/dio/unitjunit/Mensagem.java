package com.dio.unitjunit;

public class Mensagem {

  private String destinatario;

  private String mensagem;

  public Mensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  public String getDestinatario() {
    return destinatario;
  }

  public String getMensagem() {
    return mensagem;
  }
}
