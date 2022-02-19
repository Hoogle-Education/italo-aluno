package entities;

import entities.Shape;

public class Rectangle extends Shape {
  
  double base;
  double altura;

  public Rectangle(String cor, double base, double altura) {
    super(cor);
    this.base = base;
    this.altura = altura;
  }

  public Rectangle(String cor, double lado) {
    super(cor);
    this.base = lado;
    this.altura = lado;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }
  
  @Override
  public double area(){
    return base*altura;
  }

}
