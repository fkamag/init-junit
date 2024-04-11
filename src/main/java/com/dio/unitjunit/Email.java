package com.dio.unitjunit;

public class Email {

  private String destinatario;
  private String mensagem;
  private Formato formato;

  public Email(String destinatario, String mensagem, Formato formato) {
    this.destinatario = destinatario;
    this.mensagem = mensagem;
    this.formato = formato;
  }

  public String getDestinatario() {
    return destinatario;
  }

  public String getMensagem() {
    return mensagem;
  }

  public Formato getFormato() {
    return formato;
  }
}
