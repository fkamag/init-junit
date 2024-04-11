package com.dio.unitjunit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

  private String nome;
  private String documento;
  private LocalDate nascimento;
  private DadosLocalizacao endereco;

  public Pessoa(String nome, String documento, LocalDate nascimento) {
    this.nome = nome;
    this.documento = documento;
    this.nascimento = nascimento;
  }

  public String getNome() {
    return nome;
  }

  public String getDocumento() {
    return documento;
  }

  public LocalDate getNascimento() {
    return nascimento;
  }

  public DadosLocalizacao getEndereco() {
    return endereco;
  }

  public void setEndereco(DadosLocalizacao endereco) {
    this.endereco = endereco;
  }

  public int getIdade() {
    return (int) ChronoUnit.YEARS.between(nascimento, LocalDate.now());
  }

  public boolean ehMaiorDeIdade() {
    return getIdade() >= 18;
  }

  public void adcionaDadosDeEndereco(DadosLocalizacao dadosLocalizacao) {
  }
}
