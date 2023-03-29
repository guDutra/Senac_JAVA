import java.util.Collection;
import java.util.Collections;
public class main {

	public static void main(String[] args) {

	
		Leitor leitor = new Leitor();
		Repositorio funcao = new Repositorio();
		Print p = new Print();
		int pao = 67;
		int y = 0;
		int c = 0;
		int j = 0;
		int a = 0;
		int z = 0;
		int l = 0;
		int protagonista = 77;
		
		Funcionario secretarios = new Funcionario();
		Funcionario aplicadores = new Funcionario();
		Funcionario gerente = new Funcionario();

		int primeromenu = 332;
		while(primeromenu != 0) {
		
		p.asterixos();
		System.out.println("VOCE ESTA LOGADO COMO GERENTE");
		p.asterixos();
		
		System.out.println("Digite sua senha" );
		gerente.setSenha(leitor.leiaString());
		System.out.println("Digite seu id");
		gerente.setId(leitor.leiaInt());
		System.out.println("Digite seu nome");
		gerente.setNome(leitor.leiaString());
		System.out.println("Digite sua Região");
		gerente.setExpecifica(leitor.leiaString());
		funcao.inserirFuncionario(y, gerente);
		
		primeromenu = 0;
		
		}
		
		int mamaefalei = 66;
		while(mamaefalei != 0) {
		
		Funcionario verificacao = new Funcionario();
		p.asterixos();
		System.out.println("Digite a senha do seu login");
		String senha = leitor.leiaString();
		
		///////////////////////////////////////////////////////////////////
		if(verificacao.validar(gerente.getSenha(),  senha)) {
			
			p.asterixos();
			System.out.println("VOCÊ ESTÁ LOGADO COMO GERENTE");
			p.asterixos();
			
			pao = 66;
			while (pao != 0) {
				
				
				p.opcoesGerente();
				int opcaodogerente = leitor.leiaInt();
				
				switch(opcaodogerente) {
				
				
				case 1:
					
					System.out.println("Digite a senha" );
					aplicadores.setSenha(leitor.leiaString());
					System.out.println("Digite o id");
					aplicadores.setId(leitor.leiaInt());
					System.out.println("Digite o nome");
					aplicadores.setNome(leitor.leiaString());
					System.out.println("Digite a Região");
					aplicadores.setExpecifica(leitor.leiaString());
					funcao.inserirFuncionario(c, aplicadores);
					
					break;
					
				case 2:
					
					System.out.println("Digite o id da area de conhecimento" );
					int idArea = leitor.leiaInt();
					System.out.println("Digite a area de conhecimento");
					String nomeAreaa = leitor.leiaString();
					
					AreaDoConhecimento areas = new AreaDoConhecimento(idArea, nomeAreaa);
					funcao.inserirAreadoConhecimentos(j, areas);
					
					break;
					
				case 3:
					
					funcao.mostrarAreaDoConhecimentos();
					
					break;
					
				case 4:
					
					System.out.println("Digite o nome do candidato que voce deseja deletar");
					String deletar = leitor.leiaString();
					
					funcao.deletarCandidatos(deletar);
					
					break;
					
				case 5:
					
					
					System.out.println("Digite o senha do secretario");
				    secretarios.setSenha(leitor.leiaString());
					System.out.println("Digite o id do secretario");
					secretarios.setId(leitor.leiaInt());
					System.out.println("Digite o nome do secretario");
					secretarios.setNome(leitor.leiaString());
					System.out.println("Digite o setor do secretario");
					secretarios.setExpecifica(leitor.leiaString());
					funcao.inserirFuncionario(z, secretarios);
					
					
					break;
					
				case 6:
					
					pao=0;	
					
					break;
					
				case 7:
					
					mamaefalei = 0;
					
					break;
				
				}/// switch das opcoes do gerente
						
				}/// fim do while quando entra como gerente
				

		}//// fim da verificação de gerente 
		
if(verificacao.validar(aplicadores.getSenha(),  senha)) {
			
	        p.asterixos();
			System.out.println("VOCE ESTA LOGADO COMO APLICADOR");
			p.asterixos();
			
			int queijo = 66;
			while(queijo != 0) {
				
			System.out.println("1 - Voce deseja consultar os candidatos");	
			System.out.println("2 - Voce deseja trocar de login");	
			System.out.println("3 - Parar o programa");
			int alternativa = leitor.leiaInt();
			
			switch(alternativa) {
			
			case 1:
				
				funcao.mostrarCandidatos();
				
				break;
				
			case 2:
			
			queijo = 0;
			
			break;
			
			case 3:
				
				protagonista = 0;
				
				break;
			
			}/// fim do switch da alternativa das opções do aplicador
		
				
			}// fim do while de quando voce loga como aplicador
	
	
		}/// if da verificação de validação do aplicador 


if(verificacao.validar(secretarios.getSenha(), senha)) {
	
	p.asterixos();
	System.out.println("VOCÊ ESTÁ LOGADO COMO SECRETÁRIOS!!!");
	p.asterixos();
	
	int refrigerante = 88;
	while(refrigerante != 0) {
		
	p.opcoesSecretario();
	int opcaoSecretario = leitor.leiaInt();
	
	switch(opcaoSecretario) {
	
	case 1:
		
		System.out.println("Digite o id do candidato");
		int idC = leitor.leiaInt();
		System.out.println("Digite o cpf do candidato");
		String cpfC = leitor.leiaString();
		System.out.println("Digite o nome do candidato");
		String nomeC = leitor.leiaString();
		System.out.println("Digite a idade do candidato");
		String idadeC = leitor.leiaString();
		System.out.println("Digite o código da areá de conhecimento");
		int codareaconhecimento = leitor.leiaInt();
		
		Candidato candidatura = new Candidato(idC, cpfC, nomeC, idadeC, codareaconhecimento);
		funcao.inserirCandidatos(l, candidatura);

		break;
		
	case 2:
		
		funcao.mostrarCandidatos();
		
		break;
		
	case 3:
		
		funcao.candidatosOrdenar();
		
		break;
		
		
	case 4:
		
		refrigerante = 0;
		
		break;
		
	
	}/// switch opcoes de secretario
	
	}//// while do secretario
	
}//// if da verificação do secretário
		
		}//// fim do while do programa

	}
}
