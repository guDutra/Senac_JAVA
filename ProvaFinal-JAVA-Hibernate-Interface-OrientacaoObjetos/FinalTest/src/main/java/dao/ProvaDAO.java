package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import controller.ProvaController;
import hbl.TransactionClass;
import model.ProvaModel;
import transporte.CandidatoTO;
import transporte.QuestaoTO;
import view.ProvaView;

public class ProvaDAO {

	private ProvaController provaController;
	private ProvaModel provaModel;
	private ProvaView provaView;
	
	public void insere(Object objeto) {
		
		Transaction transaction = null;
		TransactionClass transactionClass = null;
		CandidatoTO candidatoTO = (CandidatoTO) objeto;
		try{		
			Session session =  TransactionClass.getSessionFactory().openSession();
    		transaction = (Transaction) session.beginTransaction();
    		
    		
    		session.save(candidatoTO);
    		
    		transaction.commit();
    		 session.close();
	   } catch(Exception e) {
    		if (transaction != null) {
               transaction.rollback();
            }
            e.printStackTrace();
    	}
		
	}
	
}
