package ProjetoEscola;

public class MediaAritmetica implements CalcularMedia {
	
	@Override
	public double calc(double... notas) {
		if (notas.length == 0) {
			return 0;
		}

		double soma = 0;
		
		for (double nota : notas) {
			soma += nota;
		}
   
		return soma / notas.length;
	}
}