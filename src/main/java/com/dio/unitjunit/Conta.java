package com.dio.unitjunit;

public class Conta {

  private int saldo;
  public Conta(int saldo) {
    this.saldo = saldo;
  }

  public void pagarBoleto(int valorPagamento) {
    validaSaldo(valorPagamento);
    debita(valorPagamento);
  }

  public void validaSaldo(int valorPagamento) {
    if (valorPagamento > saldo) {
      throw new IllegalStateException("Saldo insuficiente");
    }
  }

  public void debita(int valorPagamento) {
    this.saldo -= valorPagamento;
  }

}
