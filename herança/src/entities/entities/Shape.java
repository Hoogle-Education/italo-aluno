package entities;

public class Shape {
  
  private String cor;

  public Shape(String cor) {
    this.cor = cor;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  @Override
  public String toString() {
    return "Shape [cor=" + cor + "]";
  }

  public double area(){
    System.out.println("forma desconhecida");
    return -1;
  }

}
