package com.dio.unitjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServiçoEnvioEmailTeste {

  @Mock
  private PlataformaDeEnvio plataformaDeEnvio;

  @InjectMocks
  private ServicoEnvioEmail servicoEnvioEmail;

  @Captor
  private ArgumentCaptor<Email> captor;

  @Test
  void validarDadosEnviadosParaAPlataforma() {

    String enderecoEmail = "usuario@teste.com";
    String mesagem = "Mensagem teste";
    boolean formatoHtml = false;

    servicoEnvioEmail.enviaEmail(enderecoEmail, mesagem, formatoHtml);

    Mockito.verify(plataformaDeEnvio).enviarEmail(captor.capture());

    Email email = captor.getValue();

    Assertions.assertEquals(enderecoEmail, email.getDestinatario());
    Assertions.assertEquals(mesagem, email.getMensagem());
    Assertions.assertEquals(Formato.TEXTO, email.getFormato());
  }

}
