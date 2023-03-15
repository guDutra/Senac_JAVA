package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import dao.ConsultaDados;
import model.QuestionarioModel;

import transporte.QuestionarioTO;

import view.QuestionarioView;
import dao.ConsultaDados;
import java.awt.event.*;


public class QuestionarioController {
	private QuestionarioView questionarioView;
	private QuestionarioModel questionarioModel ;
	private QuestionarioTO questionario;
	private ConsultaDados consultaDados;
	public QuestionarioController(QuestionarioView questionarioView, QuestionarioModel questionarioModel ) {
		
		this.questionarioView = questionarioView;
		this.questionarioModel = questionarioModel;
		
		this.questionarioView.addLimparListener(new QuestionarioNovoListener());
		this.questionarioView.addGravarListener(new QuestionarioGravarListener());
		this.questionarioView.addAtualizarListener(new QuestionarioAtualizarListener());
		this.questionarioView.addConsultarListener(new QuestionarioConsultarListener());
                this.questionarioView.addDeletarListener(new QuestionarioDeletarListener());
                this.questionarioView.addSairListernet(new QuestionarioSairListener());
	}
	
	class QuestionarioGravarListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			String tema = "";
			String nome = "";
			
			try {
				
				tema = questionarioView.getTema();
				nome = questionarioView.getNome();
				
				questionario = new QuestionarioTO();
				
				questionario.setCodQuestionario(0);
				questionario.setTema(tema);
				questionario.setNome(nome);
				
				questionarioModel.insere(questionario);
				consultaDados.buscaQuestionarios("from QuestionarioTO");
				questionarioView.limpaTela();
				
			} catch(Exception ex ) {
				ex.printStackTrace();
			}
			
		}
		
	}// fim grava listener
	
 class QuestionarioNovoListener implements ActionListener {
		 
			public void actionPerformed(ActionEvent e) {
			 	
			 questionarioView.limpaTela();
			 		 
		 }	 
	 }
 
 class  QuestionarioDeletarListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {

		int cod = 0;
		String tema = "";
		String nome = "";
		try {
			cod = questionarioView.getCod();
	
			
			questionario = new QuestionarioTO();
			
			questionario.setCodQuestionario(cod);
			questionario.setTema(tema);
			questionario.setNome(nome);
			
			questionarioModel.exclui(questionario);
			questionarioView.limpaTela();
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}	 
 }
 
 class QuestionarioSairListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {

		questionarioView.sair();
		
	}	 
 }
 
 class QuestionarioAtualizarListener implements ActionListener {
	 
	
		public void actionPerformed(ActionEvent e) {
			 String tema = "";
				String nome = "";
				
				try {
					
					tema = questionarioView.getTema();
					nome = questionarioView.getNome();
					
					questionario = new QuestionarioTO();
					
					questionario.setCodQuestionario(0);
					questionario.setTema(tema);
					questionario.setNome(nome);
					
					questionarioModel.atualiza(questionario);
					
					questionarioView.limpaTela();
					
				} catch(Exception ex ) {
					ex.printStackTrace();
				}
			
		}
	 
 }/// fim do atualiza listener 
 
 class QuestionarioConsultarListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
	
		String consulta = "from QuestionarioTO";
		questionarioView.mostraComponentes(false);
		questionarioView.exibe_tabela(questionarioModel.consulta(consulta));
		
		
	}
	 
 }
 
 
	
	
}
