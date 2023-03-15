package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.QuestaoController.QuestaoNovoListener;
import dao.ProvaDAO;
import model.ProvaModel;
import transporte.CandidatoTO;
import view.ProvaView;

public class ProvaController {

	
	private ProvaDAO provaDAO;
	private ProvaView provaView;
	private ProvaModel provaModel;
	private CandidatoTO candidato;
	int contador = 0;
	public ProvaController(ProvaView provaView,ProvaModel provaModel) {
		
		this.provaView = provaView;
		this.provaModel = provaModel;
		this.provaView.addProximaListener(new listenForProximaButton());
		this.provaView.addComecaListener(new listenForComecaButton());
		this.provaView.addTerminaListener(new listenForTerminarButton());
		this.provaView.addSairListener(new listenForSairButton());
	}
	
	class listenForComecaButton implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			if(provaView.getNome().equals("")) {
				provaView.mensagem();
			} else {
			System.out.println("opaaaaaaaaaaaaaaaaa");
			try {
		   // 
		    provaView.botaoComeca(false);
			provaView.retornaPerguntas();
			provaView.colocaQuestaoTela(contador);
		//	provaView.verificaResposta(contador);
			System.out.println("OPA");
			contador++;
			} catch(Exception ex) {
				ex.printStackTrace();
			}///FIM DO CATCH
			}
		}
		
	}
	
	
	class listenForProximaButton implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.out.println("leeeeeeee");
			//contador++;
			try {
		  
			provaView.colocaQuestaoTela(contador);
			provaView.verificaResposta(contador);
			provaView.calculaNota(contador);
			contador++;
			
			
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
	}
	
	class listenForTerminarButton implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			int codCandidato = 0;
			String nome = "";
			String tema = "";
			int acertos = 0;
			double nota = 0.00;
			int coddquestionario = 0;
			try {
				
				nome = provaView.getNome();
				acertos = provaView.getAcertos();
				nota = provaView.getNota();
			    tema = provaView.getTema();
			    
			    candidato = new CandidatoTO();
			    
			    candidato.setCodCand(0);
			    candidato.setNome(nome);
			    candidato.setTema(tema);
			    candidato.setNota(nota);
			    candidato.setAcertos(acertos);
			    System.out.println("entrou no controller");
			    provaModel.insere(candidato);
			    provaView.mostraResultado(false);
			    provaView.mostraPergunta(false);
			    provaView.limpaTela();
			    provaView.botaoComeca(true);
			    contador = 0;
			    provaView.sair();
	
				
			} catch (Exception el) {
				el.printStackTrace();
			}
		}
		
	}
	
	class listenForSairButton implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			provaView.sair();
			contador = 0;
			
		}
		
	}
	
}
