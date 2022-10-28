package bridge;

public class Empregado extends Pessoa{

  public Empregado(float precoBase) {
    super(precoBase);
  }

  @Override
  public float calculaDesconto() {
    return this.precoBase * (1 - this.plano.calculaDesconto());
  }
}
