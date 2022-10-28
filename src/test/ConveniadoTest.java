package test;

import bridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConveniadoTest {

  @Test
  void deveRetornarPrecoConveniadoSemPlano() {
    Plano plano = new SemPlano();
    Pessoa pessoa = new Conveniado(90);
    pessoa.setPlano(plano);
    assertEquals(90.0f, pessoa.calculaDesconto(), 0.01f);
  }

  @Test
  void deveRetornarPrecoConveniadoPlanoBasico() {
    Plano plano = new Basico();
    Pessoa pessoa = new Conveniado(90);
    pessoa.setPlano(plano);
    assertEquals(81.0f, pessoa.calculaDesconto(), 0.01f);
  }

  @Test
  void deveRetornarPrecoConveniadoPlanoGold() {
    Plano plano = new Gold();
    Pessoa pessoa = new Conveniado(90);
    pessoa.setPlano(plano);
    assertEquals(72.0f, pessoa.calculaDesconto(), 0.01f);
  }

  @Test
  void deveRetornarPrecoConveniadoPlanoPremium() {
    Plano plano = new Master();
    Pessoa pessoa = new Conveniado(90);
    pessoa.setPlano(plano);
    assertEquals(63.0f, pessoa.calculaDesconto(), 0.01f);
  }

}