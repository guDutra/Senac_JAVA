package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hbl.TransactionClass;
import transporte.CandidatoTO;
import transporte.QuestaoTO;

public class CandidatoDAO {
public void gravaDados(Object objeto) {
		
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
		
	}// fim do grava dados

public void excluiDados(Object objeto) {
	Transaction transaction = null;
	TransactionClass transactionClass = null;
	CandidatoTO candidatoTO = (CandidatoTO) objeto;
	
	try{
		Session session =  TransactionClass.getSessionFactory().openSession();
		transaction = (Transaction) session.beginTransaction();
		
		System.out.println("AQUIIII "+candidatoTO);
		
		session.remove(candidatoTO);
		transaction.commit();
		session.close();
		
   }
	catch(Exception e) {
		if (transaction != null) {
           transaction.rollback();
        }
        e.printStackTrace();
	}
	
}/// fim do exclui dados

public void atualizaDados(Object objeto) {
	Transaction transaction = null;
	TransactionClass transactionClass = null;
	CandidatoTO candidatoTO = (CandidatoTO) objeto;
	
	try{
		Session session =  TransactionClass.getSessionFactory().openSession();
		transaction = (Transaction) session.beginTransaction();
		
		session.update(candidatoTO);
		transaction.commit();
		session.close();
	}
	catch(Exception e) {
		if (transaction != null) {
           transaction.rollback();
        }
        e.printStackTrace();
	}	
}/// fim do atualiza dados
}
