package ProjetoEscola;

public class MediaPonderada implements CalcularMedia {
	
	@Override
	public double calc(double... notas) {
		if (notas.length == 0) {
			return 0;
		}
   
		double somaNotas = 0;
		double somaPesos = 0;
		
		for (int i = 0; i < notas.length; i += 2) {
			somaNotas += notas[i] * notas[i + 1];
			somaPesos += notas[i + 1];
		}

		if (somaPesos == 0) {
			return 0;
		}
   
		return somaNotas / somaPesos;
	}
}
