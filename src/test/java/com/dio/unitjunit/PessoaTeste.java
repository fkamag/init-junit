package com.dio.unitjunit;

import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTeste {

  @Test
  void calcularIdadeCorretamente() {
    Pessoa pessoa = new Pessoa("Fábio", "18707", LocalDate.of(1970, 5, 26));
    Assertions.assertEquals(53, pessoa.getIdade());
  }

  @Test
  void retornarSeEhMaiorDeIdade() {
    Pessoa pessoa = new Pessoa("Fábio", "18707", LocalDate.of(1970, 5, 26));
    Assertions.assertTrue(pessoa.ehMaiorDeIdade());
  }


}
