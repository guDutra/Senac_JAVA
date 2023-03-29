import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main {

	public static void main (String[] args) {
	
		Leitor leitor = new Leitor();
		
		int tamanho = 4;
		int cont = 5;
		int i = 1;
		int z = 1;
		int j = 1;
		
		String titulo;
		String artista;
		int cod;
		
		 ArrayList<String> nomeslivros = new ArrayList<>();
	        ArrayList<String> nomesMidia = new ArrayList<>();
	        ArrayList<String> nomesPeri = new ArrayList<>();
	        ArrayList<Integer> idl = new ArrayList<>();
	        ArrayList<Integer> idm = new ArrayList<>();
	        ArrayList<Integer> idp = new ArrayList<>();
		
		Metodos fun = new Metodos();
		Item itemVet[] = new Item[10];
		Autor autorVet[] = new Autor[10];
		Dados comand = new Dados();
		DetalhesInterface detalhes = new DetalhesInterface(); 
		Autor  autoridade = new Autor(23, "uriel", "locao", "aaa");
		
		
			
      					
			while(cont != 100) {
			fun.opcao();
			int op = leitor.leiaInt();
		
		
		switch(op) {
		
		
		case 1:
			fun.op1();
			int op1 = leitor.leiaInt();
			
			switch(op1) {
			
			case 1:
				
			Item itemL = new Livro();
			
			fun.op11(" do livro");
		
			itemL.setId(leitor.leiaInt());
			itemL.setAno(leitor.leiaInt());
			itemL.setTitulo(leitor.leiaString());
			itemL.setAutores(leitor.leiaString());
			comand.inserir(itemL, "Livro");
			nomeslivros.add(itemL.getTitulo());
            idl.add(itemL.getId());
			
			
			break;
			
			case 2:
				
				Item itemM = new Midia();
				
				fun.op11("da Midia");
				
				itemM.setId(leitor.leiaInt());
				itemM.setAno(leitor.leiaInt());
				itemM.setTitulo(leitor.leiaString());
				itemM.setAutores(leitor.leiaString());
				comand.inserir(itemM, "Midia");
				idm.add(itemM.getId());
                nomesMidia.add(itemM.getTitulo());
				
				break;
				
			case 3:
				
				Item itemP = new Periodico();
				
				fun.op11("do Periodico");
				
			    itemP.setId(leitor.leiaInt());
			    itemP.setAno(leitor.leiaInt());
			    itemP.setTitulo(leitor.leiaString());
			    itemP.setAutores(leitor.leiaString());
			    comand.inserir(itemP, "Periodico");
			    idp.add(itemP.getId());
                nomesPeri.add(itemP.getTitulo());
			    
			}//fim switch da  opcao item
		
		   break;
		   
		case 2:
			
		fun.op2();
		int op2 = leitor.leiaInt();
		
		switch(op2) {
		
		case 1:
			
			TCC tccT = new Tese();
			fun.op22("da tese");
			
			tccT.setId(leitor.leiaInt());
		    tccT.setAnoDefesa(leitor.leiaInt());
		    tccT.setAnoEntrega(leitor.leiaInt());
		    tccT.setOrientadores(leitor.leiaString());
		    comand.inserirTCC(tccT);
		    
		    break;
		    
		case 2:
			
			TCC tccD = new Dissertacao();
			fun.op22("da disserta��o");
			
			tccD.setId(leitor.leiaInt());
			tccD.setAnoDefesa(leitor.leiaInt());
			tccD.setAnoEntrega(leitor.leiaInt());
			tccD.setOrientadores(leitor.leiaString());
			comand.inserirTCC(tccD);
			
			break;
			
		case 3:
			
			TCC tccM = new Monografia();
			fun.op22("da monografia");
			
			tccM.setId(leitor.leiaInt());
			tccM.setAnoDefesa(leitor.leiaInt());
			tccM.setAnoEntrega(leitor.leiaInt());
			tccM.setOrientadores(leitor.leiaString());
			comand.inserirTCC(tccM);
			
		}// fim switch da opcao TCC
		
	break;
	
		case 3:
			
			
			
			String auxNome,auxSobrenome, auxAreaFormacao;
			int auxId;
			
			fun.op3("do autor");
			auxId = leitor.leiaInt();
			auxNome = leitor.leiaString();
			auxSobrenome = leitor.leiaString();
			auxAreaFormacao = leitor.leiaString();
			
			Autor autor = new Autor(auxId,auxNome,auxSobrenome,auxAreaFormacao);
			comand.inserirA(autor);
			
			break;
			
		case 4:
			
			cont=100;
			
			break;
			
			
		case 5:
			
			fun.op100();
			int op100 = leitor.leiaInt();
			
			switch(op100) {
			
			case 1:
				
				comand.mostrarTodos();
				
				
				break;
			
			case 2:
				
				System.out.println("Digite o tit�lo do seu item");
				titulo = leitor.leiaString();
				comand.pesquisarTitulo(titulo);
				
				break;
				
			case 3:
				
				System.out.println("Digite os orientadores do seu TCC");
				String orientador = leitor.leiaString();
				comand.pesquisarTCC(orientador);
				
				
				break;
				
				
			case 4:
				
				System.out.println("Digite o nome do Autor");
				artista = leitor.leiaString();
				comand.pesquisarAutor(artista);
				
				break;
				
			case 5:
				
				comand.mostrarTodosTCC();
				
				
				
			
				
				
				
				
			}//switch da consulta
		
		
		
			
			
			


			
		
		
	}// fim switch da primeira opcao
		
		
		
		
			}
		
		
		
		
		
		}
		
	}

	

