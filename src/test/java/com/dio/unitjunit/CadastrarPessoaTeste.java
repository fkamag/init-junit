package com.dio.unitjunit;

import static org.mockito.ArgumentMatchers.anyString;

import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

  @Mock
  private ApiDosCorreios apiDosCorreios;

  @InjectMocks
  private CadastrarPessoa cadastrarPessoa;

  @Test
  @DisplayName("1 - Validar dados de Cadastro")
  void validarDadosDeCadastro() {

    DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("SP", "Tatuí",
        "Rua Onze, 180", "", "Centro");

    Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("18270-000")).thenReturn(dadosLocalizacao);

    Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Fábio", "18707",
        LocalDate.of(1970, 5, 26), "18270-000");

    pessoa.setEndereco(dadosLocalizacao);

    Assertions.assertEquals("Fábio", pessoa.getNome());
    Assertions.assertEquals("18707", pessoa.getDocumento());
    Assertions.assertEquals("SP", pessoa.getEndereco().getUf());
  }

  @Test
  void lancarExceptionQuandoOcorrer() {

    Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString()))
        .thenThrow(IllegalArgumentException.class);

    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      cadastrarPessoa.cadastrarPessoa("Fábio", "18707",
          LocalDate.of(1970, 5, 26), "18270-000");
    });
  }



}
