package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.QuestionarioController.QuestionarioAtualizarListener;
import controller.QuestionarioController.QuestionarioConsultarListener;
import controller.QuestionarioController.QuestionarioDeletarListener;
import controller.QuestionarioController.QuestionarioGravarListener;
import controller.QuestionarioController.QuestionarioNovoListener;
import controller.QuestionarioController.QuestionarioSairListener;
import dao.ConsultaDados;
import model.QuestaoModel;
import model.QuestionarioModel;

import transporte.QuestaoTO;
import transporte.QuestionarioTO;
import view.QuestaoView;
import view.QuestionarioView;
import dao.ConsultaDados;
import java.awt.event.*;
import dao.QuestaoDAO;

public class QuestaoController {

	private QuestaoDAO questaoDAO;
	private QuestaoModel questaoModel;
	private QuestaoView questaoView;
	private QuestaoTO questao;
	
	public QuestaoController(QuestaoView questaoView, QuestaoModel questaoModel) {
		
		this.questaoView = questaoView;
		this.questaoModel = questaoModel;
		
		this.questaoView.addLimparListener(new QuestaoNovoListener());
		this.questaoView.addGravarListener(new QuestaoGravarListener());
		this.questaoView.addAtualizarListener(new QuestaoAtualizarListener());
		this.questaoView.addConsultarListener(new QuestaoConsultarListener());
                this.questaoView.addDeletarListener(new QuestaoDeletarListener());
                this.questaoView.addSairListernet(new QuestaoSairListener());
		
	}
	
	class QuestaoGravarListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			int nPergunta = 0;
			String pergunta = "";
			String altA = "";
			String altB = "";
			String altC = "";
			String altD = "";
			int codquestionario = 0;
			int resposta = 0;
			try {
			
			
			
			nPergunta = questaoView.getNpergunta();
			pergunta = questaoView.getPergunta();
			altA = questaoView.getAltA();
			altB = questaoView.getAltB();
			altC = questaoView.getAltC();
			altD = questaoView.getAltD();
			resposta = questaoView.getResposta();
			codquestionario = questaoView.getCodQuestionario();
			
			questao = new QuestaoTO();
			
			
			questao.setN_pergunta(nPergunta);
			questao.setPergunta(pergunta);
			questao.setAltA(altA);
			questao.setAltB(altB);
			questao.setAltC(altC);
			questao.setResposta(resposta);
			questao.setId_questao(0);
			questao.setAltD(altD);
			questao.setCodquestionario(codquestionario);
			
			questaoModel.insere(questao);
			
			questaoView.limpaTela();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			
		}
		
	}/// fim do grava listener
	
	class QuestaoNovoListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			questaoView.limpaTela();
			
		}
	}/// fim do novo listener
	
	class QuestaoAtualizarListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			int nPergunta = 0;
			String pergunta = "";
			String altA = "";
			String altB = "";
			String altC = "";
			String altD = "";
			int resposta = 0;
			int codquestionario = 0;
			try {
				
				
				
				nPergunta = questaoView.getNpergunta();
				pergunta = questaoView.getPergunta();
				altA = questaoView.getAltA();
				altB = questaoView.getAltB();
				altC = questaoView.getAltC();
				altD = questaoView.getAltD();
				resposta = questaoView.getResposta();
				codquestionario = questaoView.getCodQuestionario();
				
				questao = new QuestaoTO();
				
				questao.setN_pergunta(nPergunta);
				questao.setPergunta(pergunta);
				questao.setAltA(altA);
				questao.setAltB(altB);
				questao.setAltC(altC);
				questao.setResposta(resposta);
				questao.setId_questao(0);
				questao.setAltD(altD);
				questao.setCodquestionario(codquestionario);
				
				questaoModel.atualiza(questao);
				
				questaoView.limpaTela();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			
		}
		
		
	}/// fim do atualiza listener
	
	class QuestaoDeletarListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			int nPergunta = 0;
			String pergunta = "";
			String altA = "";
			String altB = "";
			String altC = "";
			String altD = "";
			int resposta = 0;
			int codquestionario = 0;
			
			try {
				nPergunta = questaoView.getNpergunta();
				pergunta = questaoView.getPergunta();
				altA = questaoView.getAltA();
				altB = questaoView.getAltB();
				altC = questaoView.getAltC();
				altD = questaoView.getAltD();
				resposta = questaoView.getResposta();
				codquestionario = questaoView.getCodQuestionario();
				
				questao = new QuestaoTO();
				
				questao.setN_pergunta(nPergunta);
				questao.setPergunta(pergunta);
				questao.setAltA(altA);
				questao.setAltB(altB);
				questao.setAltC(altC);
				questao.setResposta(resposta);
				questao.setId_questao(0);
				questao.setAltD(altD);
				questao.setCodquestionario(codquestionario);
				
				questaoModel.exclui(questao);
				questaoView.limpaTela();
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			
		}
		
	} /// fim do deletar listener
	
	class QuestaoSairListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			questaoView.sair();
			
		}
		
		
		
	}
	
	class QuestaoConsultarListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String consulta = "from QuestaoTO";
			questaoView.mostraComponentes(false);
			questaoView.exibe_tabela(questaoModel.consulta(consulta));
			
		}
		
	}
	
}
