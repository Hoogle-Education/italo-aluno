package entities;

import entities.Shape;

public class Circle extends Shape {
  
  double radius;

  public Circle(String cor, double radius) {
    super(cor);
    this.radius = radius;
  }

  @Override
  public double area(){
    return radius*radius*(3.14159267);
  }

}
