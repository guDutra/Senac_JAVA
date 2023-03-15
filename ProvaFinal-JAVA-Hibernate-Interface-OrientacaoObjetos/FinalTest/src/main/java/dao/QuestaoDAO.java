package dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;



import java.io.*;

import jakarta.persistence.Query;
import jakarta.transaction.SystemException;
import transporte.QuestaoTO;
import transporte.QuestionarioTO;

//import org.eclipse.persistence.internal.oxm.schema.model.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
//import org.hibernate.mapping.List;
import org.hibernate.service.ServiceRegistry;


import hbl.TransactionClass;
import jakarta.transaction.SystemException;
//import jakarta.transaction.Transaction;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class QuestaoDAO {

public void gravaDados(Object objeto) {
		
		Transaction transaction = null;
		TransactionClass transactionClass = null;
		QuestaoTO questaoTO = (QuestaoTO) objeto;
		try{		
			Session session =  TransactionClass.getSessionFactory().openSession();
    		transaction = (Transaction) session.beginTransaction();
    		
    		
    		session.save(questaoTO);
    		
    		transaction.commit();
    		//session.close();
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
	QuestaoTO questaoTO = (QuestaoTO) objeto;
	
	try{
		Session session =  TransactionClass.getSessionFactory().openSession();
		transaction = (Transaction) session.beginTransaction();
		
		session.delete(questaoTO);
		transaction.commit();
		//session.close();
		
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
	QuestaoTO questaoTO = (QuestaoTO) objeto;
	
	try{
		Session session =  TransactionClass.getSessionFactory().openSession();
		transaction = (Transaction) session.beginTransaction();
		
		session.update(questaoTO);
		transaction.commit();
		//session.close();
	}
	catch(Exception e) {
		if (transaction != null) {
           transaction.rollback();
        }
        e.printStackTrace();
	}	
}/// fim do atualiza dados


}
