package ProjetoEscola;

public class Disciplina {
	private String nome;
	private Professor professor;
	private double n1;
	private double n2;
	private double media;
	private boolean aprovacao;

	 public Disciplina(String nome, Professor professor) {
	     this.nome = nome;
	     this.professor = professor;
	     this.n1 = 0;
	     this.n2 = 0;
	     this.media = 0;
	     this.aprovacao = false;
	 }

	 public String getNome() {
	     return nome;
	 }

	 public Professor getProfessor() {
	     return professor;
	 }

	 public double getN1() {
	     return n1;
	 }

	 public void setN1(double n1) {
	     this.n1 = n1;
	 }

	 public double getN2() {
	     return n2;
	 }

	 public void setN2(double n2) {
	     this.n2 = n2;
	 }

	 public double getMedia() {
	     return media;
	 }

	 public boolean isAprovacao() {
	     return aprovacao;
	 }

	 public void calcularMedia(CalcularMedia calculadora) {
	     this.media = calculadora.calc(n1, n2);
	     this.aprovacao = media >= 6.0;
	 }

	 public void imprimirDados() {
	     System.out.println("Nome: " + nome + " - Professor: " + professor.getNome());
	     System.out.println("Notas");
	     System.out.println("N1: " + n1 + ", N2: " + n2 + ", Média: " + media);
	     System.out.println(aprovacao ? "Aprovado" : "Reprovado");
	     System.out.println("--------------------------------");
	 }

}
