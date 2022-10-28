package test;

import bridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NaoAssociadoTest {

  @Test
  void deveRetornarPrecoNaoAssociadoSemPlano() {
    Plano plano = new SemPlano();
    Pessoa pessoa = new NaoAssociado(100);
    pessoa.setPlano(plano);
    assertEquals(100.0f, pessoa.calculaDesconto(), 0.01f);
  }

  @Test
  void deveRetornarPrecoNaoAssociadoPlanoBasico() {
    Plano plano = new Basico();
    Pessoa pessoa = new NaoAssociado(100);
    pessoa.setPlano(plano);
    assertEquals(90.0f, pessoa.calculaDesconto(), 0.01f);
  }

  @Test
  void deveRetornarPrecoNaoAssociadoPlanoGold() {
    Plano plano = new Gold();
    Pessoa pessoa = new NaoAssociado(100);
    pessoa.setPlano(plano);
    assertEquals(80.0f, pessoa.calculaDesconto(), 0.01f);
  }

  @Test
  void deveRetornarPrecoNaoAssociadoPlanoPremium() {
    Plano plano = new Master();
    Pessoa pessoa = new NaoAssociado(100);
    pessoa.setPlano(plano);
    assertEquals(70.0f, pessoa.calculaDesconto(), 0.01f);
  }

}