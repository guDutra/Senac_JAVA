import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Leitor {
	/**
	 * m�todo para leitura de n�meros inteiros.
	 * 
	 * @return um n�mero do tipo primitivo int.
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
	 * m�todo para leitura de n�meros decimais.
	 * 
	 * @return um n�mero do tipo primitivo double.
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
	 * m�todo para leitura de uma seq��ncia de caracteres.
	 * 
	 * @return uma seq��ncia de caracteres do tipo String.
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


