package model;

import javax.swing.table.DefaultTableModel;

import dao.CandidatoDAO;
import dao.ConsultaDados;
import transporte.CandidatoTO;

public class CandidatoModel {
	ConsultaDados consultaDados = new ConsultaDados();
	DefaultTableModel dtm = new DefaultTableModel();
	CandidatoDAO candidatoDAO = new CandidatoDAO();
	public void insere(CandidatoTO candidato) {
		
		candidatoDAO.gravaDados(candidato);
	}
	
	public void atualiza(CandidatoTO candidato) {
		candidatoDAO.atualizaDados(candidato);
	}
	
	public void exclui(CandidatoTO candidato) {
		
		candidatoDAO.excluiDados(candidato);
	}
	
	
	public DefaultTableModel consulta (String consultasql) {
		consultaDados = new ConsultaDados();
		 dtm = consultaDados.consultaDadosCandidato(consultasql);
		return dtm;
	}
}
