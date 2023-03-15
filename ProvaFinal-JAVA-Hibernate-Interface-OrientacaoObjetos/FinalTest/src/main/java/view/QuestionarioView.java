package view;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import dao.ConsultaDados;


//import transporte.DataTableTO;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class QuestionarioView extends JInternalFrame {

	private JTextField txtcodQuestionario;
	private DefaultTableModel dataModel;
	private JTable tab;
	int linhaSelecionada = 0;
	int colunaSelecionada = 0;
	private JScrollPane sp;
	private ConsultaDados consultaDados;
	//private String consultasql = "from questionario";
    public QuestionarioView() {
        initComponents();
        criaTextCod();
        txtcodQuestionario.setVisible(false);
    }

    public void criaTextCod() {
    	
    	txtcodQuestionario = new JTextField();
    	txtcodQuestionario.setBounds(51, 109, 89, 42);
    	getContentPane().add(txtcodQuestionario);
    	
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblTemas = new javax.swing.JLabel();
        jcbTemas = new javax.swing.JComboBox();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

       //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("QUESTIONARIO");

        lblTemas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTemas.setText("TEMAS:");

        jcbTemas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcbTemas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Matematica", "Historia", "Portugues", "Ingles", "Quimica" }));

        lblNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        btnConsultar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnConsultar.setText("Consultar");

        btnLimpar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLimpar.setText("Limpar");

        btnInserir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               // btnInserirActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");

        btnAtualizar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAtualizar.setText("Atualizar");

        btnSair.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSair.setText("Sair");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAtualizar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTemas)
                    .addComponent(jcbTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnSair)
                    .addComponent(btnExcluir))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>  
    
   
    
    
public void limpaTela(){
		
	    txtcodQuestionario.setText("0");
		txtNome.setText("");
	    jcbTemas.setSelectedIndex(1);
	}

public void mostraComponentes(boolean mostra) {
	
	lblNome.setVisible(mostra);
	lblTemas.setVisible(mostra);
	jcbTemas.setVisible(mostra);
	
	txtNome.setVisible(mostra);
	jLabel1.setVisible(mostra);
	btnAtualizar.setVisible(mostra);
	btnConsultar.setVisible(mostra);
	btnExcluir.setVisible(mostra);
	btnInserir.setVisible(mostra);
	btnSair.setVisible(mostra);
	btnLimpar.setVisible(mostra);
	
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
			                    
			                    String cod = (String) ""+tab.getValueAt(selectedRow,0);
			                    int aux_cod = Integer.parseInt(cod);
			                    
			                    String nome = (String) "" + tab.getValueAt(selectedRow,1);
			                    String tema= (String) "" + tab.getValueAt(selectedRow,2);
			                    
			                    
			                    
			                    
			                    
			                    
			                    
			                    setCod(aux_cod);
			                    setNome(nome);
			                    setTema(tema);
			                    
			                    
			                    
			                    
			                    tab.clearSelection();
			                    sp.setVisible(false);
			                    
			                    
			                    mostraComponentes(true);
			                }
			            }
		});	
	}
}

public void sair() {
	dispose();
}

public int getCod() {
	return Integer.parseInt(txtcodQuestionario.getText());
}

public void setCod(int cod) {
	txtcodQuestionario.setText(Integer.toString(cod));
}

public String getNome() {
	return txtNome.getText();
}

public void setNome(String nome) {
txtNome.setText(nome);
}

public String getTema() {
	return jcbTemas.getSelectedItem().toString();
}

public void setTema(String tema) {
	jcbTemas.setSelectedItem(tema);
}
    
    public static void main(String args[]) {
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionarioView frame = new QuestionarioView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }

    
    public void addLimparListener(ActionListener QuestionarioNovoListener) {
		btnLimpar.addActionListener(QuestionarioNovoListener);
	}
	
	public void addGravarListener(ActionListener QuestionarioGravarListener) {
		btnInserir.addActionListener(QuestionarioGravarListener);
	}
		
		public void addConsultarListener(ActionListener listenForConsultarButton) {
	btnConsultar.addActionListener(listenForConsultarButton);
}

	public void addSairListernet(ActionListener QuestionarioSairListener) {
		btnSair.addActionListener(QuestionarioSairListener);
	}
	
	public void addDeletarListener(ActionListener QuestionarioDeletarListener) {
		btnExcluir.addActionListener(QuestionarioDeletarListener);
	}
    
	public void addAtualizarListener(ActionListener QuestionarioAtualizarListener) {
		btnAtualizar.addActionListener(QuestionarioAtualizarListener);
	}
    
    // Variables declaration - do not modify                     
	 private javax.swing.JButton btnAtualizar;
	    private javax.swing.JButton btnConsultar;
	    private javax.swing.JButton btnExcluir;
	    private javax.swing.JButton btnInserir;
	    private javax.swing.JButton btnLimpar;
	    private javax.swing.JButton btnSair;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JComboBox<String> jcbTemas;
	    private javax.swing.JLabel lblNome;
	    private javax.swing.JLabel lblTemas;
	    private javax.swing.JTextField txtNome;
    // End of variables declaration                   
}