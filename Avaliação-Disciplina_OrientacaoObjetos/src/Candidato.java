
public class Candidato implements  Comparable<Candidato> {

	private int idCandidato;
	private String cpf;
	private String nome;
	private String idade;
	private int codAreaDoConhecimento;
	
	public Candidato(int idCandidato, String cpf, String nome, String idade, int codAreaDoConhecimento) {
		super();
		this.idCandidato = idCandidato;
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.codAreaDoConhecimento = codAreaDoConhecimento;
	}

	public int getIdCandidato() {
		return idCandidato;
	}

	public void setIdCandidato(int idCandidato) {
		this.idCandidato = idCandidato;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public int getCodAreaDoConhecimento() {
		return codAreaDoConhecimento;
	}

	public void setCodAreaDoConhecimento(int codAreaDoConhecimento) {
		this.codAreaDoConhecimento = codAreaDoConhecimento;
	}

	@Override
	public int compareTo(Candidato o) {
		
		if(this.nome.compareTo(o.getNome()) > 0) {
			
			return 1;
			
		}
		
if(this.nome.compareTo(o.getNome()) < 0) {
			
			return -1;
			
		}
		
		return 0;
	}
		
	
}
