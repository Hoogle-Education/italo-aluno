package application;

import java.util.Scanner;

public class App{

  public static double media(double x, double y, double z){
    double m = x + y + z;
    m = m/3;

    return m;
  }

  public static void main(String[] args){

    // abrindo um scanner de dados
    Scanner input = new Scanner(System.in); // stdin

    // pego a linha como entrada
    for(int i=1; i<=10; i++){
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();

      System.out.println("Media " + i + " : " + media(a, b, c));
    }

    // fechando o scanner
    input.close();

  }

}