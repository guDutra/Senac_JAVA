
package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import dao.ConsultaDados;


public class QuestaoView extends JInternalFrame {
	private DefaultTableModel dataModel;
	private JTable tab;
	int linhaSelecionada = 0;
	int colunaSelecionada = 0;
	private JScrollPane sp;
	private ConsultaDados consultaDados;
	private JTextField txtcodQuestao;
	private JTextField txtcodQuestionario;
	private JLabel lblcodquestionario;
	///private H
    public QuestaoView() {
        initComponents();
        criaTextCod();
        txtcodQuestao.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNPergunta = new javax.swing.JLabel();
        lblPergunta = new javax.swing.JLabel();
        lblAltA = new javax.swing.JLabel();
        lblAltB = new javax.swing.JLabel();
        lblAltC = new javax.swing.JLabel();
        lblAltD = new javax.swing.JLabel();
        lblResposta = new javax.swing.JLabel();
        txtNPergunta = new javax.swing.JTextField();
        txtPergunta = new javax.swing.JTextField();
        txtAltA = new javax.swing.JTextField();
        txtAltD = new javax.swing.JTextField();
        txtResposta = new javax.swing.JTextField();
        txtAltB = new javax.swing.JTextField();
        txtAltC = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel1.setText("Questão");

        lblNPergunta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNPergunta.setText("N* Pergunta:");

        lblPergunta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPergunta.setText("Pergunta:");

        lblAltA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAltA.setText("Alternativa A:");

        lblAltB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAltB.setText("Alternativa B:");

        lblAltC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAltC.setText("Alternativa C:");

        lblAltD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAltD.setText("Alternativa D:");

        lblResposta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblResposta.setText("Resposta:");

        txtNPergunta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtPergunta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtAltA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtAltD.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtResposta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtAltB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtAltC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnConsultar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnConsultar.setText("CONSULTAR");

        btnAtualizar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAtualizar.setText("ATUALIZAR");

        btnInserir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnInserir.setText("INSERIR");

        btnLimpar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLimpar.setText("LIMPAR");

        btnExcluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnExcluir.setText("EXCLUIR");

        btnSair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSair.setText("SAIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAltD)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtAltD))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAltB)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtAltB))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAltC)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtAltC))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAltA)
                                .addComponent(lblPergunta))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAltA, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                                .addComponent(txtPergunta)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblResposta)
                            .addGap(31, 31, 31)
                            .addComponent(txtResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInserir, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSair))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNPergunta)
                            .addComponent(txtNPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPergunta)
                    .addComponent(txtPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltA)
                    .addComponent(txtAltA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltB)
                    .addComponent(txtAltB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltC)
                    .addComponent(txtAltC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltD)
                    .addComponent(txtAltD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResposta)
                    .addComponent(txtResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar)
                    .addComponent(btnInserir)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnSair)
                    .addComponent(btnConsultar))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    
    
    public void mostraComponentes(boolean mostra) {
    	
    	txtAltA.setVisible(mostra);
    	txtAltB.setVisible(mostra);
    	txtAltC.setVisible(mostra);
    	txtAltD.setVisible(mostra);
    	
    	txtNPergunta.setVisible(mostra);
    	txtPergunta.setVisible(mostra);
    	txtResposta.setVisible(mostra);
    	lblAltA.setVisible(mostra);
    	lblAltB.setVisible(mostra);
    	lblAltC.setVisible(mostra);
    	lblAltD.setVisible(mostra);
    	lblNPergunta.setVisible(mostra);
    	lblPergunta.setVisible(mostra);
    	lblResposta.setVisible(mostra);
    	jLabel1.setVisible(mostra);
    	lblcodquestionario.setVisible(mostra);
    	txtcodQuestionario.setVisible(mostra);
    	btnAtualizar.setVisible(mostra);
    	btnConsultar.setVisible(mostra);
    	btnExcluir.setVisible(mostra);
    	btnInserir.setVisible(mostra);
    	btnLimpar.setVisible(mostra);
    	btnSair.setVisible(mostra);
    }
    
    public void exibe_tabela(DefaultTableModel dataModel){
    	if(dataModel != null){
    		tab = new JTable(dataModel);			
    		tab.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    		
    		sp = new JScrollPane( tab );
    		this.getContentPane().add(sp);
    		sp.setBounds(0,0,500,300);
    		tab.addKeyListener(new KeyAdapter(){//Tabela "Escuta" o ESC e � ocultada
    			@Override
    			public void keyPressed(KeyEvent e) {  
    				if(e.getKeyCode()==27){ //tecla 27 � o ESC
    					 sp.setVisible(false);
    					 mostraComponentes(true);					
    				}
    			}
    		});
    		
    		ListSelectionModel cel = tab.getSelectionModel();
    		
    		cel.addListSelectionListener(new ListSelectionListener() {
    			public void valueChanged(ListSelectionEvent e) {
    			                //Ignore extra messages.
    			                if (e.getValueIsAdjusting()) return;
    			                
    			                ListSelectionModel lsm = (ListSelectionModel) e.getSource();
    			                if (!lsm.isSelectionEmpty()) {
    			                    int selectedRow = tab.getSelectedRow();
    			                    int selectedCol = tab.getSelectedColumn();
    			                    
    			                    String nPergunta = (String) ""+tab.getValueAt(selectedRow,0);
    			                    int aux_nPergunta = Integer.parseInt(nPergunta);
    			                    
    			                    String pergunta = (String) "" + tab.getValueAt(selectedRow,1);
    			                    String altA= (String) "" + tab.getValueAt(selectedRow,2);
    			                    String altB= (String) "" + tab.getValueAt(selectedRow,3);
    			                    String altC= (String) "" + tab.getValueAt(selectedRow,4);
    			                    String resposta = (String) ""+tab.getValueAt(selectedRow,5);
    			                    int aux_resposta = Integer.parseInt(resposta);
    			                    
    			                    String id_questao = (String) ""+tab.getValueAt(selectedRow,6);
    			                    int aux_id_questao = Integer.parseInt(id_questao);
    			                    

    			                    String altD= (String) "" + tab.getValueAt(selectedRow,7);
    			                    String codQuestionario = (String) ""+tab.getValueAt(selectedRow,8);
    			                    int aux_codQuestionario = Integer.parseInt(codQuestionario); ;

    			                    setNpergunta(aux_nPergunta);
    			                    setPergunta(pergunta);
    			                    setAltA(altA);
    			                    setAltB(altB);
    			                    setAltC(altC);
    			                    setResposta(aux_resposta);
    			                    setCod(aux_id_questao);
    			                    setAltD(altD);
    			                    setCodQuestionario(aux_codQuestionario);

    			                    tab.clearSelection();
    			                    sp.setVisible(false);
         
    			                    mostraComponentes(true);
    			                }
    			            }
    		});	
    	}
    }
    
    
 public void criaTextCod() {
    	
	 txtcodQuestao = new JTextField();
	 txtcodQuestao.setBounds(51, 109, 89, 42);
    	getContentPane().add(txtcodQuestao);
    	
    	txtcodQuestionario = new JTextField();
    	txtcodQuestionario.setFont(new java.awt.Font("Arial", 0, 14));
    	txtcodQuestionario.setBounds(158, 50, 50,20);
    	getContentPane().add(txtcodQuestionario);
    	
    	lblcodquestionario = new JLabel("Cod:");
    	lblcodquestionario.setFont(new java.awt.Font("Arial", 0, 14));
    	lblcodquestionario.setBounds(60, 50, 50,20);
    	getContentPane().add(lblcodquestionario);
    	
    	
    }
 
 public void sair() {
		dispose();
	}
 
 public int getCodQuestionario() {
	 return Integer.parseInt(txtcodQuestionario.getText());
 }
 
 public void setCodQuestionario(int codQuestionario) {
	 txtcodQuestionario.setText(Integer.toString(codQuestionario));
 }
 
 public int getCod() {
		return Integer.parseInt(txtcodQuestao.getText());
	}

	public void setCod(int cod) {
		txtcodQuestao.setText(Integer.toString(cod));
	}
	
	 public int getNpergunta() {
			return Integer.parseInt(txtNPergunta.getText());
		}

		public void setNpergunta(int nPergunta) {
			 txtNPergunta.setText(Integer.toString(nPergunta));
		}

	public String getPergunta() {
		return txtPergunta.getText();
	}

	public void setPergunta(String pergunta) {
		txtPergunta.setText(pergunta);
	}
	
	public String getAltA() {
		return txtAltA.getText();
		
	}
	
	public void setAltA(String altA) {
		txtAltA.setText(altA);
	}
	
	public String getAltB() {
		return txtAltB.getText();
		
	}
	
	public void setAltB(String altB) {
		txtAltB.setText(altB);
	}
	
	public String getAltC() {
		return txtAltC.getText();
		
	}
	
	public void setAltC(String altC) {
		txtAltC.setText(altC);
	}
	
	public String getAltD() {
		return txtAltD.getText();
		
	}
	
	public void setAltD(String altD) {
		txtAltD.setText(altD);
	}
	
	public int getResposta() {
		return Integer.parseInt(txtResposta.getText());
	}
	
	public void setResposta(int resposta) {
		txtResposta.setText(Integer.toString(resposta));
		
	}
	
	public void limpaTela() {
		
		txtcodQuestao.setText("");
		txtNPergunta.setText("");
		txtPergunta.setText("");
		txtAltA.setText("");
		txtAltB.setText("");
		txtAltC.setText("");
		txtAltD.setText("");
		txtResposta.setText("");
		txtcodQuestionario.setText("");
		
	}
	
	
    public static void main(String args[]) {
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestaoView frame = new QuestaoView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }

    public void addLimparListener(ActionListener QuestaoNovoListener) {
		btnLimpar.addActionListener(QuestaoNovoListener);
	}
	
	public void addGravarListener(ActionListener QuestaoGravarListener) {
		btnInserir.addActionListener(QuestaoGravarListener);
	}
		
		public void addConsultarListener(ActionListener listenForConsultarButton) {
			
	btnConsultar.addActionListener(listenForConsultarButton);
}

	public void addSairListernet(ActionListener QuestaoSairListener) {
		btnSair.addActionListener(QuestaoSairListener);
	}
	
	public void addDeletarListener(ActionListener QuestaoDeletarListener) {
		btnExcluir.addActionListener(QuestaoDeletarListener);
	}
    
	public void addAtualizarListener(ActionListener QuestaoAtualizarListener) {
		btnAtualizar.addActionListener(QuestaoAtualizarListener);
	}
    
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAltA;
    private javax.swing.JLabel lblAltB;
    private javax.swing.JLabel lblAltC;
    private javax.swing.JLabel lblAltD;
    private javax.swing.JLabel lblNPergunta;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JTextField txtAltA;
    private javax.swing.JTextField txtAltB;
    private javax.swing.JTextField txtAltC;
    private javax.swing.JTextField txtAltD;
    private javax.swing.JTextField txtNPergunta;
    private javax.swing.JTextField txtPergunta;
    private javax.swing.JTextField txtResposta;
    // End of variables declaration                   
}
