
public class Autor  {

	private int Id;
	private String Nome;
	private String Sobrenome;
	private String AreaFormacao;
	
	public int getId() {
		return Id;
	}
	public Autor(int id, String nome, String sobrenome, String areaFormacao) {
		super();
		Id = id;
		Nome = nome;
		Sobrenome = sobrenome;
		AreaFormacao = areaFormacao;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	public String getAreaFormacao() {
		return AreaFormacao;
	}
	public void setAreaFormacao(String areaFormacao) {
		AreaFormacao = areaFormacao;
	}
	
	
}
