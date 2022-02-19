# Entrpoint

`main` - > ponto de entrada

# Variáveis

**int, double, char e float**

`int` -> armazena inteiros

`double`/`float` -> guarda um número real

`char` -> caracter

sintaxe:
```
   <tipo da variável> nome ;
```

exemplos:
```java
  int n;
  char c;
  double r;
```

possibidades:
```java
  int a;
  a = 2;
  
  int b=3 , c;

  System.out.println(a);
```

# Vetores

Vetores são conjuntos de elementos mais simples.

sintaxe:
```java
  int a = 2;

  int[] v = new int[3];
  v = {1, 2, 3};
```

**TODO VETOR É INDEXADO ZERO**

## Acessando elementos de vetor

```java
  int[] v = new int[3];
  v[0] = 1;
  v[1] = 2;
  v[2] = 3;
  v[3] = 4;
```

## Revisando estruturas de repetição

sintaxe:
```
for( <condição de inicio> ; <teste de parada> ; <incremento> ){

}
```

```java
for(int i = 0; i < 10; i++ ){
}
```