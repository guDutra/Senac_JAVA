package model;

import dao.ProvaDAO;
import dao.QuestaoDAO;
import transporte.CandidatoTO;
import transporte.QuestaoTO;

public class ProvaModel {
	ProvaDAO provaDAO = new ProvaDAO();
public void insere(CandidatoTO candidato) {
		
		provaDAO.insere(candidato);
	}
	
	
}
