package ProjetoEscola;

//Subclasse Professor
public class Professor extends Pessoa {
	 private int siape;
	 private String formacao;

	 public Professor(String nome, int siape, String formacao) {
	     super(nome);
	     this.siape = siape;
	     this.formacao = formacao;
	 }

	 public int getSiape() {
	     return siape;
	 }

	 public void setSiape(int siape) {
	     this.siape = siape;
	 }

	 public String getFormacao() {
	     return formacao;
	 }

	 public void setFormacao(String formacao) {
	     this.formacao = formacao;
	 }

	 @Override
	 public void getApresentacao() {
	     super.getApresentacao();
	     System.out.println("SIAPE: " + siape);
	     System.out.println("Nivel: " + formacao);
	 }
	}
