package model;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import dao.ConsultaDados;
import dao.QuestaoDAO;
import dao.QuestionarioDAO;

import transporte.QuestaoTO;
import transporte.QuestionarioTO;
public class QuestaoModel {
    
	//ConsultaDados consultaDados = new ConsultaDados();
	QuestaoDAO questaoDAO = new QuestaoDAO();
	ConsultaDados consultaDados = new ConsultaDados();
	
	DefaultTableModel dtm = new DefaultTableModel();
	public void insere(QuestaoTO questao) {
		
		questaoDAO.gravaDados(questao);
	}
	
	public void atualiza(QuestaoTO questao) {
		questaoDAO.atualizaDados(questao);
	}
	
	public void exclui(QuestaoTO questao) {
		
		questaoDAO.excluiDados(questao);
	}
	
	
	public DefaultTableModel consulta (String consultasql) {
		consultaDados = new ConsultaDados();
		 dtm = consultaDados.consultaDadosQuestao(consultasql);
		return dtm;
	}
	
	
}
