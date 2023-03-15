package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.QuestaoController.QuestaoConsultarListener;
import controller.QuestaoController.QuestaoDeletarListener;
import dao.CandidatoDAO;
import model.CandidatoModel;
import transporte.CandidatoTO;
import view.CandidatoView;

public class CandidatoController {

	private CandidatoDAO candidatoDAO;
	private CandidatoTO candidatoTO;
	private CandidatoModel candidatoModel;
	private CandidatoView candidatoView;
	private CandidatoTO candidato;
    public CandidatoController(CandidatoView candidatoView, CandidatoModel candidatoModel) {
    	
    	this.candidatoModel = candidatoModel;
    	this.candidatoView = candidatoView;
    	
    	this.candidatoView.addConsultarListener(new CandidatoConsultarListener());
    	 this.candidatoView.addDeletarListener(new CandidatoDeletarListener());
    	 this.candidatoView.addSairListener(new CandidatoSairListener());
    }
	
    class  CandidatoConsultarListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			String consulta = "from CandidatoTO";
			candidatoView.mostraComponentes(false);
			candidatoView.exibe_tabela(candidatoModel.consulta(consulta));
			
		}
    	
    }/// FIM CONSULTAR LISTENER
    
    class  CandidatoDeletarListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			int codCand = 0;
			String nome = "";
			String tema = "";
			double nota = 0.00;
			int acertos = 0;
			
			try {
				codCand = candidatoView.getCod();
				nome = candidatoView.getNome();
				tema = candidatoView.getTema();
				nota = candidatoView.getNota();
				acertos =  candidatoView.getAcerto();
				
				candidato = new CandidatoTO();
				 candidato.setCodCand(codCand);
				    candidato.setNome(nome);
				    candidato.setTema(tema);
				    candidato.setNota(nota);
				    candidato.setAcertos(acertos);
				    
				    candidatoModel.exclui(candidato);
				    candidatoView.limpaTela();
				
				
			} catch(Exception el ) {
				el.printStackTrace();
			}
			
		}
    	
    }//// fim do deleta candidato
    
    class CandidatoSairListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			candidatoView.sair();
			
		}
    	
    }
    
}
