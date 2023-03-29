
public  class Funcionario extends Repositorio implements Interface {

	private String senha;
	private int id;
	private String nome;
	private String expecifica;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean validar(String  array, String senha) {
		
		if(array.equals(senha)) {
			
			return true;
			
		} else {
			
			return false;
		}
		
	}
	
	public String getExpecifica() {
		return expecifica;
	}
	public void setExpecifica(String expecifica) {
		this.expecifica = expecifica;
	}
	@Override
	public boolean Validar(String user, String nome, String senha, String password) {
		
		
		if(user.equals(nome) & senha == password) {
			
			
			return true;
		}
		
		return false;
	}
	
	
	
	
}
