package dao;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import org.eclipse.persistence.internal.databaseaccess.QueryStringCall;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hbl.TransactionClass;
import transporte.CandidatoTO;
import transporte.QuestaoTO;
import transporte.QuestionarioTO;

public class ConsultaDados {
	///DataTableTO dataTableTO;
	
	public ConsultaDados() {
		
	}
	
	public DefaultTableModel consultaDadosQuestionario(String consultasql) {
		
		DefaultTableModel dataModel = null;
		Transaction transaction = null;
		
		try {
			System.out.println("nivel 1");
			Session session = TransactionClass.getSessionFactory().openSession();
			transaction = (Transaction) session.beginTransaction(); 
			Query query = session.createQuery(consultasql);
			List<QuestionarioTO> questionarioLst = ((org.hibernate.query.Query) query ).list();
			
			Vector dados = new Vector();
			for(QuestionarioTO q : questionarioLst) {
				
				Vector linha = new Vector();
				linha.add((String) "" + q.getCodQuestionario());
				linha.add(q.getNome());
				linha.add(q.getTema());
				dados.add(linha);
				
			}
			
			Vector titulos = new Vector();
			titulos.add("Cod");
			titulos.add("Nome");
			titulos.add("Tema");
			
			
			dataModel = new DefaultTableModel(dados, titulos);
			System.out.println("nivel 2");
			session.close();
		}	catch(Exception e) {
	    	if(transaction != null) {
	    		
	    		try {
	    			transaction.rollback();
	    		} catch(IllegalStateException el) {
	    			el.printStackTrace();
	    		}
	    	}
	    	e.printStackTrace();
	    	}
		
		
		return dataModel;
	}
	
public DefaultTableModel consultaDadosQuestao(String consultasql) {
		
		DefaultTableModel dataModel = null;
		Transaction transaction = null;
		
		try {
			System.out.println("nivel 1");
			Session session = TransactionClass.getSessionFactory().openSession();
			transaction = (Transaction) session.beginTransaction(); 
			Query query = session.createQuery(consultasql);
			List<QuestaoTO> questionarioLst = ((org.hibernate.query.Query) query ).list();
			
			Vector dados = new Vector();
			for(QuestaoTO q : questionarioLst) {
				
				Vector linha = new Vector();
				linha.add((String) "" + q.getN_pergunta());
				linha.add(q.getPergunta());
				linha.add(q.getAltA());
				linha.add(q.getAltB());
				linha.add(q.getAltC());
				linha.add((String) "" + q.getResposta());
				linha.add((String) "" + q.getId_questao());
				linha.add(q.getAltD());
				linha.add(q.getCodquestionario());
				dados.add(linha);
				
			}
			
			Vector titulos = new Vector();
			titulos.add("N* Pergunta");
			titulos.add("Pergunta");
			titulos.add("AltA");
			titulos.add("AltB");
			titulos.add("AltC");
			titulos.add("Resposta");
			titulos.add("Id");
			titulos.add("AltD");
			titulos.add("Cod Questionario");
			
			
			dataModel = new DefaultTableModel(dados, titulos);
			System.out.println("nivel 2");
			session.close();
		}	catch(Exception e) {
	    	if(transaction != null) {
	    		
	    		try {
	    			transaction.rollback();
	    		} catch(IllegalStateException el) {
	    			el.printStackTrace();
	    		}
	    	}
	    	e.printStackTrace();
	    	}
		
		
		return dataModel;
	}


    public List<QuestionarioTO> buscaQuestionarios(String consulta) {
    	Transaction transaction = null;
    	List<QuestionarioTO> questionarioLst = null;
    	try {
    		Session session = TransactionClass.getSessionFactory().openSession();
			transaction = (Transaction) session.beginTransaction(); 
			Query query = session.createQuery(consulta);
			questionarioLst = ((org.hibernate.query.Query) query ).list();
			
			
			session.close();
			
			
    	} catch (Exception e) {
    		
    	}
    	
    	return questionarioLst;
    }
	
    
public DefaultTableModel consultaDadosCandidato(String consultasql) {
		
		DefaultTableModel dataModel = null;
		Transaction transaction = null;
		
		try {
			System.out.println("nivel 1");
			Session session = TransactionClass.getSessionFactory().openSession();
			transaction = (Transaction) session.beginTransaction(); 
			Query query = session.createQuery(consultasql);
			List<CandidatoTO> candidatoLst = ((org.hibernate.query.Query) query ).list();
			session.close();
			Vector dados = new Vector();
			for(CandidatoTO q : candidatoLst) {
				
				Vector linha = new Vector();
				
				linha.add(q.getCodCand());
				linha.add(q.getNome());
				linha.add(q.getTema());
				linha.add((String) "" + q.getNota());
				linha.add((String) "" + q.getAcertos());
				dados.add(linha);
				
			}
			
			Vector titulos = new Vector();
			
			titulos.add("Cod");
			titulos.add("Nome");
			titulos.add("Tema");
			titulos.add("Nota");
			titulos.add("Acertos");
			
			
			dataModel = new DefaultTableModel(dados, titulos);
			System.out.println("nivel 2");
			session.close();
		}	catch(Exception e) {
	    	if(transaction != null) {
	    		
	    		try {
	    			transaction.rollback();
	    		} catch(IllegalStateException el) {
	    			el.printStackTrace();
	    		}
	    	}
	    	e.printStackTrace();
	    	}
		
		
		return dataModel;
	}
	
	
}
