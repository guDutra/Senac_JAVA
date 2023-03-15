package transporte;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "questionario")
public class QuestionarioTO {

	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codQuestionario")
	private int codQuestionario;
	
	@Column(name = "tema")
    private String tema;
	
	@Column(name = "nome")
    private String nome;

	public int getCodQuestionario() {
		return codQuestionario;
	}

	public void setCodQuestionario(int codQuestionario) {
		this.codQuestionario = codQuestionario;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public QuestionarioTO(int codQuestionario, String tema, String nome) {
		super();
		this.codQuestionario = codQuestionario;
		this.tema = tema;
		this.nome = nome;
	}
	
	public QuestionarioTO() {
		super();
	}
	
}
