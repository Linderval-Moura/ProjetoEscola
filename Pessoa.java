package ProjetoEscola;

//Superclasse Pessoa
public class Pessoa {

 private String nome;

 public Pessoa(String nome) {
     this.nome = nome;
 }

 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public void getApresentacao() {
     System.out.println("Nome: " + nome);
 }
}
