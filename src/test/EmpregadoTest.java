package test;

import bridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmpregadoTest {

  @Test
  void deveRetornarPrecoEmpregadoSemPlano() {
    Plano plano = new SemPlano();
    Pessoa pessoa = new Empregado(80);
    pessoa.setPlano(plano);
    assertEquals(80.0f, pessoa.calculaDesconto(), 0.01f);
  }

  @Test
  void deveRetornarPrecoEmpregadoPlanoBasico() {
    Plano plano = new Basico();
    Pessoa pessoa = new Empregado(80);
    pessoa.setPlano(plano);
    assertEquals(72.0f, pessoa.calculaDesconto(), 0.01f);
  }

  @Test
  void deveRetornarPrecoEmpregadoPlanoGold() {
    Plano plano = new Gold();
    Pessoa pessoa = new Empregado(80);
    pessoa.setPlano(plano);
    assertEquals(64.0f, pessoa.calculaDesconto(), 0.01f);
  }

  @Test
  void deveRetornarPrecoEmpregadoPlanoPremium() {
    Plano plano = new Master();
    Pessoa pessoa = new Empregado(80);
    pessoa.setPlano(plano);
    assertEquals(56.0f, pessoa.calculaDesconto(), 0.01f);
  }

}