import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;


public  class Repositorio {

	private  ArrayList<Funcionario>  funcionarios = new ArrayList<>();
	private  ArrayList<Candidato>  candidatos = new ArrayList<>();
	private  ArrayList<AreaDoConhecimento>  conhecimentos = new ArrayList<>();
	private ArrayList<Funcionario> senhas = new ArrayList<>(); 
	private int cont = 0;
	private int contador = 0;
	private int contadorzin = 0;
	private int conatadinho = 0;
	
	public void inserirSenhas(int contin,Funcionario senhas) {
		
	this.senhas.add(this.conatadinho, senhas);
	this.conatadinho++;
			
	}

	public void inserirFuncionario(int cont, Funcionario funcionario) {
		
		funcionarios.add(this.cont, funcionario);
		this.cont++;
			
		
	}
	
	public void mostrarFuncionarios() {
		
		for(int i = 0; i < funcionarios.size(); i++)  {
				
			System.out.println("ID do funcionário: " + funcionarios.get(i).getId());
			System.out.println("NOME do funcionário:" + funcionarios.get(i).getNome());
				
		}		
		
	}
	
	public void inserirCandidatos(int contador, Candidato candidato) {
		
		candidatos.add(this.contador, candidato);
		this.contador++;
			
	}
	
	
	
	public void mostrarCandidatos() {
		
		for (int j = 0; j < candidatos.size(); j++) {
			
			System.out.println("ID do candidato: " + candidatos.get(j).getIdCandidato());
			System.out.println("NOME do candidato: "  + candidatos.get(j).getNome());
			System.out.println("IDADE do candidato: " + candidatos.get(j).getIdade());
			System.out.println("CPF do candidato: " + candidatos.get(j).getCpf());
			System.out.println("CÓDIGO DE CONHECIMENTO: " +  candidatos.get(j).getCodAreaDoConhecimento());	
		}
		
	}
	
	public void deletarCandidatos(String nomezinho) {
		
		for(int p = 0; p < candidatos.size(); p++) {
			
			if(candidatos.get(p).getNome().equals(nomezinho)) {
    			
    			candidatos.remove(p);
    		} else {
    			
    			System.out.println("O candidato digitado é inexistente");
    			
    		}
			
			
		}
		
		
	}
	
	
	public void inserirAreadoConhecimentos(int contadorzin, AreaDoConhecimento areadoconhecimento) {
		
		conhecimentos.add(this.contadorzin, areadoconhecimento);
		this.contadorzin++;
		
	}
	
	
	public void mostrarAreaDoConhecimentos() {
		
		for(int c = 0; c < conhecimentos.size(); c++) {
			
			System.out.println("ID da area de conhecimento: " + conhecimentos.get(c).getIdAreadeConhecimento());
			System.out.println("Area do conhecimento: " +conhecimentos.get(c).getAreadeconhecimento());
		
		}
		
	}
	
	public void candidatosOrdenar() {
		
		Collections.sort(candidatos);
		
for (int j = 0; j < candidatos.size(); j++) {
			
			System.out.println("ID do candidato: " + candidatos.get(j).getIdCandidato());
			System.out.println("NOME do candidato: "  + candidatos.get(j).getNome());
			System.out.println("IDADE do candidato: " + candidatos.get(j).getIdade());
			System.out.println("CPF do candidato: " + candidatos.get(j).getCpf());
			System.out.println("CÓDIGO DE CONHECIMENTO: " +  candidatos.get(j).getCodAreaDoConhecimento());	
	
		}
		
	}
	
	public boolean verificacaotela(String array, String senhaa) {
		
		
	
			
			if(array.equals(senhaa)) {
				
			return true;	
				
			} else {
				
				return false;
			
			}
			
			
			
		
		
	}
	
	
}
