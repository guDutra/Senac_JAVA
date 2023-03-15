
package view;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import dao.ConsultaDados;
import hbl.TransactionClass;
import transporte.QuestaoTO;
import transporte.QuestionarioTO;


public class ProvaView extends JInternalFrame {
	private int acertos = 0;
	private int resposta = 0;
	private ConsultaDados consultaDados;
   private JComboBox cbQuestionariosList;
   private JLabel resultadoAcertos, lblAcertos;
   private JLabel resultadoNota, lblNota;
 //  private int contador = 0;
   //private double nota = 0.00;
   private JButton btnTerminar;
   private List<QuestaoTO> questionarioLst = null;
    public ProvaView() {
        initComponents();
        criaComboBox();
        jcbQuestionarios.setVisible(false);
        criaInterfaceResultado();
        mostraPergunta(false);
        mostraResultado(false);
        encerraSessao();
        bgAlternativas.add(rbAltD);
        
    }
 
    public void mostraResultado(boolean mostra) {
    	resultadoAcertos.setVisible(mostra);
    	resultadoNota.setVisible(mostra);
    	lblAcertos.setVisible(mostra);
    	lblNota.setVisible(mostra);
    	btnTerminar.setVisible(mostra);
    }
    
    public void criaInterfaceResultado() {
    	
    	resultadoAcertos = new JLabel("ACERTOS:");
    	resultadoNota = new JLabel("NOTA:");
    	btnTerminar = new JButton("FINALIZAR PROVA");
    	lblAcertos = new JLabel("opa");
    	lblNota = new JLabel("teste");
    	resultadoAcertos.setBounds(300, 150, 100, 20);
    	resultadoNota.setBounds(300, 170, 100, 20);
    	lblAcertos.setBounds(370, 150, 100, 20);
    	lblNota.setBounds(345, 170, 100, 20);
    	btnTerminar.setBounds(230, 235, 200, 40);
    	getContentPane().add(resultadoNota);
    	getContentPane().add(resultadoAcertos);
    	getContentPane().add(lblAcertos);
    	getContentPane().add(lblNota);
    	getContentPane().add(btnTerminar);
    }
    
    public void botaoComeca(boolean mostra) {
    	btnComeçar.setVisible(mostra);
    }
    
    public List<QuestaoTO> retornaPerguntas() {
    	 String questionarioSelecionado = cbQuestionariosList.getSelectedItem().toString();
    	Transaction transaction = null;
    	List<QuestaoTO> questaoLst = null;
    	List<QuestionarioTO> questionarioLst = null;
    	try {
    		
    		Session session = TransactionClass.getSessionFactory().openSession();
			transaction = (Transaction) session.beginTransaction(); 
			Query selectQuestionario = session.createQuery("from QuestionarioTO where nome='"+questionarioSelecionado+"'");
			 questionarioLst = ((org.hibernate.query.Query) selectQuestionario ).list();
			 
			 for(int i = 0; i < questionarioLst.size(); i++) {
				 Query selectQuestao = session.createQuery("from QuestaoTO where codquestionario='"+ questionarioLst.get(i).getCodQuestionario() + "'");
				 questaoLst  = ((org.hibernate.query.Query) selectQuestao ).list();
				 questaoLst.add( (QuestaoTO) selectQuestao);
			 }
			
			/*Query query = session.createQuery("select a.* from questao a, questionario b where a.codquestionario = b.codQuestionario");
			
					// "from QuestaoTO where codquestionario='" + questionarioSelecionado + "'");
			
			List<QuestaoTO>  res = query.list();
			for(int i=0; i<res.size();i++) {
				System.out.println(res.get(i));
			}
					
			
			/*questionarioLst = ((org.hibernate.query.Query) query ).list();
			while(contador != questionarioLst.size()) {
				
				txtPergunta.setText(questionarioLst.get(contador).);
				
			}
			
			*/
			 session.close();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
		return questaoLst;
    }
    
    public void encerraSessao() {
    	Transaction transaction = null;
    	Session session = TransactionClass.getSessionFactory().openSession();
		transaction = (Transaction) session.beginTransaction(); 
		session.close();
		
    }
    
    public void colocaQuestaoTela( int contador) {
    	
    	 questionarioLst = retornaPerguntas();
   
    	if(contador >= questionarioLst.size()) {
    		mostraPergunta(false);
    		//calculaNota();
    		mostraResultado(true);
    		//System.out.println("primeiro if");
    	} 
    	
    	if(contador < questionarioLst.size()) {
    		txtPergunta.setText(questionarioLst.get(contador).getPergunta());
        	rbAltA.setText(questionarioLst.get(contador).getAltA());
        	rbAltB.setText(questionarioLst.get(contador).getAltB());
        	rbAltC.setText(questionarioLst.get(contador).getAltC());
        	rbAltD.setText(questionarioLst.get(contador).getAltD());
        //	System.out.println("segundo if");
        	mostraPergunta(true);
    	}
    	System.out.println("O contador q mostra as pergunta neste momento está com:" + contador);
    }
    
    public void mostraPergunta(boolean mostra) {
    	txtPergunta.setVisible(mostra);
    	rbAltA.setVisible(mostra);
    	rbAltB.setVisible(mostra);
    	rbAltC.setVisible(mostra);
    	rbAltD.setVisible(mostra);
    	btnProxima.setVisible(mostra);
    	
    	
    }
    
    public void criaComboBox() {
    	cbQuestionariosList = new JComboBox(this.buscaQuestionarios());
    	cbQuestionariosList.setBounds(155, 125, 200, 20);
    	getContentPane().add(cbQuestionariosList);
    }
    
    public int getRespostacorreta() {
        if (rbAltA.isSelected()){
            return 1;
        }
        if (rbAltB.isSelected()){
            return 2;
        }
        if (rbAltC.isSelected()){
            return 3;
        }
        if (rbAltD.isSelected()){
            return 4;
        }
        return 0;
    }
    
    public int verificaResposta(int contador) {
    	questionarioLst = retornaPerguntas();
    	
        
    	if(getRespostacorreta() == questionarioLst.get(contador-1).getResposta()) {
    		acertos++;
    		System.out.println("ELE ACERTOU UHUULL");
    	}



System.out.println("rsposta do list: "+questionarioLst.get(contador-1).getResposta());
System.out.println("O contador no verifica resposta está com " + contador);
    System.out.println("ACERTOS:"+acertos);
    System.out.println("RESPOSTA"+ getRespostacorreta());
    setAcertos(acertos);
   // calculaNota(acertos);
    return acertos;
    //calculaNota();
    }

   public void calculaNota(int cont) {
    	questionarioLst = retornaPerguntas();
    	int qntddPerguntas = questionarioLst.size();
    	int qntdAcertos = acertos;
    	
    	
    	int quantoValeCadaPergunta = 0;
    	//quantoValeCadaPergunta = 10/qntddPerguntas;
    	//double nota = qntdAcertos*quantoValeCadaPergunta;
    	double nota = qntdAcertos*100/qntddPerguntas;
    	 nota = nota/10;
    	System.out.println(nota);
    	setNota(nota);
    	
    }
    
    public void sair() {
    	dispose();
    }
    
    public void limpaTela() {
    	txtNomeCandidato.setText("");
    	cbQuestionariosList.setSelectedIndex(1);
    	
    }
    
    @SuppressWarnings("unchecked")
                           
    private void initComponents() {

        bgAlternativas = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblNomeCandidato = new javax.swing.JLabel();
        lblQuestionarios = new javax.swing.JLabel();
        jcbQuestionarios = new javax.swing.JComboBox();
        lblPergunta = new javax.swing.JLabel();
        txtPergunta = new javax.swing.JLabel();
        rbAltA = new javax.swing.JRadioButton();
        rbAltB = new javax.swing.JRadioButton();
        rbAltC = new javax.swing.JRadioButton();
        btnProxima = new javax.swing.JButton();
        btnComeçar = new javax.swing.JButton();
        txtNomeCandidato = new javax.swing.JTextField();
        rbAltD = new javax.swing.JRadioButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lblTitulo.setText("PROVA");

        lblNomeCandidato.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNomeCandidato.setText("NOME CANDIDATO:");

        lblQuestionarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblQuestionarios.setText("QUESTIONARIOS:");

        jcbQuestionarios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblPergunta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPergunta.setText("Pergunta:");

        txtPergunta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPergunta.setText("jLabel5");

        bgAlternativas.add(rbAltA);
        rbAltA.setText("jRadioButton1");

        bgAlternativas.add(rbAltB);
        rbAltB.setText("jRadioButton2");

        bgAlternativas.add(rbAltC);
        rbAltC.setText("jRadioButton3");

        btnProxima.setText("PRÓXIMA");

        btnComeçar.setText("COMEÇAR");

        txtNomeCandidato.setText("");

        rbAltD.setText("jRadioButton1");

        btnSair.setText("SAIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNomeCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQuestionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbQuestionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbAltD)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(rbAltC, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                                        .addComponent(rbAltB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbAltA, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                                        .addComponent(txtPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(btnProxima, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnComeçar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblQuestionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbQuestionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeCandidato)
                            .addComponent(txtNomeCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPergunta)
                    .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(rbAltA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbAltB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbAltC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbAltD)
                .addGap(18, 18, 18)
                .addComponent(btnProxima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComeçar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
        );

        pack();
    }// </editor-fold>                        

  
     public static void main(String args[]) {
      
    	 try {
             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                 if ("Nimbus".equals(info.getName())) {
                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
                     break;
                 }
             }
         } catch (ClassNotFoundException ex) {
             java.util.logging.Logger.getLogger(ProvaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             java.util.logging.Logger.getLogger(ProvaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             java.util.logging.Logger.getLogger(ProvaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(ProvaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
         //</editor-fold>

         /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                 new ProvaView().setVisible(true);
             }
         });
     }

    public String getTema() {
    	List<QuestionarioTO> TEMAquestionarioLst = null;
    	Transaction transaction = null;
    	String questionarioSelecionado = cbQuestionariosList.getSelectedItem().toString();
    	String tema = "";
    	try {
    		Session session = TransactionClass.getSessionFactory().openSession();
			transaction = (Transaction) session.beginTransaction(); 
			Query selectQuestionario = session.createQuery("from QuestionarioTO where nome='"+questionarioSelecionado+"'");
			TEMAquestionarioLst = ((org.hibernate.query.Query) selectQuestionario ).list();
			for(int i = 0; i < TEMAquestionarioLst.size(); i++) {
				tema = TEMAquestionarioLst.get(i).getTema();
			}
			session.close();
    	} catch (Exception ep) {
    		ep.printStackTrace();
    	}
    	
    	return tema;
    }
    
    public int getAcertos() {
    	return Integer.parseInt(lblAcertos.getText());
    }
    public void setAcertos(int acertoss) {
    	lblAcertos.setText(Integer.toString(acertoss));
    }
    
    public void setNota(double notass) {
    	lblNota.setText(Double.toString(notass));
    }
    
    public double getNota() {
    	return Double.parseDouble(lblNota.getText());
    }
    
    public String getNome() {
    	return txtNomeCandidato.getText();
    }
   
    public void mensagem() {
    	JOptionPane.showMessageDialog(null, "BOTA NOME");
    }
    
    
    public DefaultComboBoxModel buscaQuestionarios() {
  	DefaultComboBoxModel questionariosDCBM = new DefaultComboBoxModel();
    	ConsultaDados consultaDados = new ConsultaDados();
    	List<QuestionarioTO> lista = consultaDados.buscaQuestionarios("from QuestionarioTO");
    	/*while(lista.next()){
    		questionariosDCBM.addElement(lista.get(i).dados.getString(2));//DefaultComboBoxModel
			listaDeptos.add(new DepartamentoTO(dados.getInt(1),dados.getString(2)));//Lista de deptos
		}
		*/
    	
    	for(int i = 0; i < lista.size(); i++) {
    		
    		questionariosDCBM.addElement(lista.get(i).getNome().toString());
    		
    		
    	}
    	
    	return questionariosDCBM;
    }
    
    public void addComecaListener(ActionListener listenForComecaButton) {
    	
    	btnComeçar.addActionListener(listenForComecaButton);
    	
    }
    
    public void addProximaListener (ActionListener listerForProximaButton) {
    	btnProxima.addActionListener(listerForProximaButton);
    }
    
    public void addTerminaListener (ActionListener listenForTerminarButton) {
    	btnTerminar.addActionListener(listenForTerminarButton);
    }
    
    public void addSairListener(ActionListener listenerForSairButton) {
    	btnSair.addActionListener(listenerForSairButton);
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup bgAlternativas;
    private javax.swing.JButton btnComeçar;
    private javax.swing.JButton btnProxima;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> jcbQuestionarios;
    private javax.swing.JLabel lblNomeCandidato;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lblQuestionarios;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbAltA;
    private javax.swing.JRadioButton rbAltB;
    private javax.swing.JRadioButton rbAltC;
    private javax.swing.JRadioButton rbAltD;
    private javax.swing.JTextField txtNomeCandidato;
    private javax.swing.JLabel txtPergunta;
    // End of variables declaration                   
}
