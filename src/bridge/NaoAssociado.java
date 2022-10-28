package bridge;

public class NaoAssociado extends Pessoa{

  public NaoAssociado(float precoBase) {
    super(precoBase);
  }

  @Override
  public float calculaDesconto() {
    return this.precoBase * (1 - this.plano.calculaDesconto());
  }
}
