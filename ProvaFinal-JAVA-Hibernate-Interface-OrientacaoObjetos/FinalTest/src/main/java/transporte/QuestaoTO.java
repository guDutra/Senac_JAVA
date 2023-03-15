package transporte;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "questao")
public class QuestaoTO {
	///@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
  
	@Column(name = "n_pergunta")
	private int n_pergunta;
	
	@Column(name = "pergunta")
    private String pergunta;
	
	@Column(name = "altA")
    private String altA;
	
	@Column(name = "altB")
    private String altB;
	
	@Column(name = "altC")
    private String altC;
	
	
	
	@Column(name = "resposta")
	private int resposta;
 
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id_questao")
	private int id_questao;
 
 @Column(name = "altD")
 private String altD;
 
 @Column(name = "codquestionario")
	private int codquestionario;

public int getN_pergunta() {
	return n_pergunta;
}

public void setN_pergunta(int n_pergunta) {
	this.n_pergunta = n_pergunta;
}

public String getPergunta() {
	return pergunta;
}

public void setPergunta(String pergunta) {
	this.pergunta = pergunta;
}

public String getAltA() {
	return altA;
}

public void setAltA(String altA) {
	this.altA = altA;
}

public String getAltB() {
	return altB;
}

public void setAltB(String altB) {
	this.altB = altB;
}

public String getAltC() {
	return altC;
}

public void setAltC(String altC) {
	this.altC = altC;
}

public int getResposta() {
	return resposta;
}

public void setResposta(int resposta) {
	this.resposta = resposta;
}

public int getId_questao() {
	return id_questao;
}

public void setId_questao(int id_questao) {
	this.id_questao = id_questao;
}

public String getAltD() {
	return altD;
}

public void setAltD(String altD) {
	this.altD = altD;
}

public int getCodquestionario() {
	return codquestionario;
}

public void setCodquestionario(int codquestionario) {
	this.codquestionario = codquestionario;
}

public QuestaoTO(int n_pergunta, String pergunta, String altA, String altB, String altC, int resposta, int id_questao,
		String altD, int codquestionario) {
	super();
	this.n_pergunta = n_pergunta;
	this.pergunta = pergunta;
	this.altA = altA;
	this.altB = altB;
	this.altC = altC;
	this.resposta = resposta;
	this.id_questao = id_questao;
	this.altD = altD;
	this.codquestionario = codquestionario;
}

public QuestaoTO() {
	super();
}
 
 
    
 
 
 
 
}
