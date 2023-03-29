import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Leitor {
	/**
	 * método para leitura de números inteiros.
	 * 
	 * @return um número do tipo primitivo int.
	 */
	public int leiaInt() {
		int numero = 0;
		String linha;
		boolean deuErrado = true;
		while (deuErrado == true) {
			BufferedReader entra = new BufferedReader(new InputStreamReader(System.in));
			try {
				linha = entra.readLine();
				numero = Integer.valueOf(linha).intValue();
				deuErrado = false;
			} catch (Exception erro) {
				System.out.println("erro de entrada de dados ! Digite novamente");
				numero = 0;
				deuErrado = true;
			}
		}
		return numero;
	}

	/**
	 * método para leitura de números decimais.
	 * 
	 * @return um número do tipo primitivo double.
	 */
	public double leiaDouble() {
		double numero = 0;
		String linha;
		boolean deuErrado = true;
		while (deuErrado == true) {
			BufferedReader entra = new BufferedReader(new InputStreamReader(System.in));
			try {
				linha = entra.readLine();
				numero = Double.valueOf(linha).doubleValue();
				deuErrado = false;
			} catch (Exception erro) {
				System.out.println("erro de entrada de dados! Digite novamente");
				deuErrado = true;
			}
		}
		return numero;
	}

	/**
	 * método para leitura de uma seqüência de caracteres.
	 * 
	 * @return uma seqüência de caracteres do tipo String.
	 */
	public String leiaString() {
		String linha = "";
		BufferedReader entra = new BufferedReader(new InputStreamReader(System.in));
		try {
			linha = entra.readLine();
		} catch (Exception erro) {
			System.out.println("erro de entrada de dados");
		}
		return linha;
	}
}
