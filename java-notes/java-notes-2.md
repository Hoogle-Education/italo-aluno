# Funções

Agrupar alguns passos bem definidos em prol do reuso.

escopo:
```
 public <tipo_do_retorno> nomeDaFunção( <tipo> parametro1, <tipo> parametro2, ... ){
 }
```

```java
public class App {

  public static double media(double a, double b, double c){
    double media = a + b + c;
    media = media/3;

    return media;
  }


  public static void main(String[] args){
    
    Systen.out.println( media(3.0, 2.0, 5.0) );

  }

}
```