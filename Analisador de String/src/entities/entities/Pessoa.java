package entities;

public class Pessoa {
  
  // atributos
  private String nome;
  private int idade;
  private double altura;
  private long telefone; // inteiro com mais epaço

  // construtores
  public Pessoa(String nome, int idade, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  public Pessoa(String nome, int idade, double altura, long telefone) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
    this.telefone = telefone;
  }

  // getters and setters
  public String getNome(){
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public double getAltura() {
    return altura;
  }

  public long getTelefone() {
    return telefone;
  }

  public void setTelefone(long telefone) {
    this.telefone = telefone;
  }

  // métodos
  public void fazAniversario(){
    idade++;
  }

  // to string
  @Override
  public String toString() {
    return "Pessoa [altura=" + altura + ", idade=" + idade + ", nome=" + nome + ", telefone=" + telefone + "]";
  }
  
}
