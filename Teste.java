package ProjetoEscola;


public class Teste {
	public static void main(String[] args) {
		Professor professor = new Professor("Leonardo", 666, "Doutor");
		Aluno aluno = new Aluno("Ana", 123456789);

		Disciplina matematica = new Disciplina("Matemática", professor);
		matematica.setN1(3.0);
		matematica.setN2(9.0);
		matematica.calcularMedia(new MediaAritmetica());

		Disciplina quimica = new Disciplina("Química", professor);
		quimica.setN1(9.0);
		quimica.setN2(2.5);
		quimica.calcularMedia(new MediaAritmetica());

		System.out.println("Aluno: " + aluno.getNome() + " - Matricula: " + aluno.getMatricula());
		System.out.println("\n********* Disciplinas Cursadas**********\n");
		matematica.imprimirDados();
		quimica.imprimirDados();
		System.out.println(" *** Dados de Professor ***");
		professor.getApresentacao();
	}
	
	public static void apresentacao(Pessoa p) {
		p.getApresentacao();
	}
}