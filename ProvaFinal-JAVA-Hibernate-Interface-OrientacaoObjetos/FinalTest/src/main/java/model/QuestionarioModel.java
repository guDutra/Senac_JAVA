package model;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import dao.ConsultaDados;
import dao.QuestionarioDAO;
import transporte.QuestionarioTO;
public class QuestionarioModel {
	ConsultaDados consultaDados = new ConsultaDados();
	QuestionarioDAO questionarioDAO = new QuestionarioDAO();
	DefaultTableModel dtm = new DefaultTableModel();
	public void insere(QuestionarioTO questionario) {
		
		questionarioDAO.gravaDados(questionario);
	}
	
	public void atualiza(QuestionarioTO questionario) {
		questionarioDAO.atualizaDados(questionario);
	}
	
	public void exclui(QuestionarioTO questionario) {
		
		questionarioDAO.excluiDados(questionario);
	}
	
	public DefaultTableModel consulta (String consultasql) {
		consultaDados = new ConsultaDados();
		 dtm = consultaDados.consultaDadosQuestionario(consultasql);
		return dtm;
	}
	
	
	
}
