package bridge;

public abstract class Pessoa {
  protected Plano plano;

  protected float precoBase;

  public Pessoa(float precoBase) {
    this.precoBase = precoBase;
  }

  public void setPlano(Plano plano) {
    this.plano = plano;
  }

  public void setPrecoBase(float precoBase) {
    this.precoBase = precoBase;
  }

  public abstract float calculaDesconto();
}
