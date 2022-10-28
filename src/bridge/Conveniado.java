package bridge;

public class Conveniado extends Pessoa{

  public Conveniado(float precoBase) {
    super(precoBase);
  }

  @Override
  public float calculaDesconto() {
    return this.precoBase * (1 - this.plano.calculaDesconto());
  }
}
