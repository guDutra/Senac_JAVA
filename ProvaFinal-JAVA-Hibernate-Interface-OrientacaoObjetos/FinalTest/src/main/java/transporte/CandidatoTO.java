package transporte;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "candidato")
public class CandidatoTO {
	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codCand")
	private int codCand;
	
	
	@Column(name = "nome")
    private String nome;
	
	@Column(name = "tema")
    private String tema;
	
	@Column(name = "nota")
    private double nota;
	
	@Column(name = "acertos")
	private int acertos;
	
	@Override
	public String toString() {
		return "CandidatoTO [codCand=" + codCand + ", nome=" + nome + ", tema=" + tema + ", nota=" + nota + ", acertos="
				+ acertos + "]";
	}

	public CandidatoTO(int codCand, String nome, String tema, double nota, int acertos) {
		super();
		this.codCand = codCand;
		this.nome = nome;
		this.tema = tema;
		this.nota = nota;
		this.acertos = acertos;
	}
	
	public CandidatoTO() {
		super();
	}

	public int getCodCand() {
		return codCand;
	}

	public void setCodCand(int codCand) {
		this.codCand = codCand;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getAcertos() {
		return acertos;
	}

	public void setAcertos(int acertos) {
		this.acertos = acertos;
	}

		
}
