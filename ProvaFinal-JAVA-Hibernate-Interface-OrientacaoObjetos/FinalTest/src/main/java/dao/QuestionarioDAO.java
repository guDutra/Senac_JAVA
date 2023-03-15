package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



import java.io.*;

import jakarta.persistence.Query;
import jakarta.transaction.SystemException;

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
public class QuestionarioDAO{


	private Connection con;
	private Statement cmdsql;
	
	
	
	public void gravaDados(Object objeto) {
		
		Transaction transaction = null;
		TransactionClass transactionClass = null;
		QuestionarioTO questionarioTO = (QuestionarioTO) objeto;
		try{		
			Session session =  TransactionClass.getSessionFactory().openSession();
    		transaction = (Transaction) session.beginTransaction();
    		
    		
    		session.save(questionarioTO);
    		
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
		QuestionarioTO questionarioTO = (QuestionarioTO) objeto;
		
		try{
			Session session =  TransactionClass.getSessionFactory().openSession();
    		transaction = (Transaction) session.beginTransaction();
    		
			session.delete(questionarioTO);
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
		QuestionarioTO questionarioTO = (QuestionarioTO) objeto;
		
		try{
			Session session =  TransactionClass.getSessionFactory().openSession();
    		transaction = (Transaction) session.beginTransaction();
			
    		session.update(questionarioTO);
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
	
//	public List QueryList() {
		
//		Query q = null;
	
//		ArrayList<List> lst = new ArrayList<List>();
///		Transaction transaction = null;
///		TransactionClass transactionClass = null;
//		QuestionarioTO questionarioTO = new QuestionarioTO();
		
//		try {
			
	//		Session session =  TransactionClass.getSessionFactory().openSession();
   // 		transaction = (Transaction) session.beginTransaction();
   //       q = session.createQuery("from Departamento");
    //       lst.add(q.getResultList());
        		
	//	} catch (Exception e) {
	//		e.printStackTrace();
	//	}
		
	//	return lst;
		
	}// fim do queryList
	
	
	
	
	
	

