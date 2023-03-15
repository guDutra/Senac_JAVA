
package view;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import dao.ConsultaDados;

public class CandidatoView extends JInternalFrame {
	private DefaultTableModel dataModel;
	private JTable tab;
	int linhaSelecionada = 0;
	int colunaSelecionada = 0;
	private JScrollPane sp;
	private ConsultaDados consultaDados;
	private JTextField txtCod;
    
    public CandidatoView() {
        initComponents();
        txtAcertos.enable(false);
        txtNome.enable(false);
        txtNota.enable(false);
        jcbTemas.enable();
        criaCod();
       txtCod.setVisible(false);
        
    }

    public void sair() {
    	dispose();
    }
   public void mostraComponentes(boolean mostra) {
	   txtNome.setVisible(mostra);
	   txtAcertos.setVisible(mostra);
	   txtNota.setVisible(mostra);
	   lblAcerto.setVisible(mostra);
	   lblNome.setVisible(mostra);
	   lblNota.setVisible(mostra);
	   lblTema.setVisible(mostra);
	   jcbTemas.setVisible(mostra);
	   btnConsultar.setVisible(mostra);
	   btnExcluir.setVisible(mostra);
	   btnSair.setVisible(mostra);
	   jLabel1.setVisible(mostra);
   }
   
   public void criaCod() {
	   txtCod = new JTextField();
	   txtCod.setBounds(100, 100, 100, 100);
	   getContentPane().add(txtCod);
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
    			                    
    			                   
    			                    String codCand =  (String) "" + tab.getValueAt(selectedRow,0);
    			                    int aux_codCand = Integer.parseInt(codCand);
    			                    String nome = (String) "" + tab.getValueAt(selectedRow,1);
    			                    String tema = (String) "" + tab.getValueAt(selectedRow,2);
    			                    String nota = (String) "" + tab.getValueAt(selectedRow,3);
    			                    double aux_nota = Double.parseDouble(nota);
    			                    String acertos = (String) "" + tab.getValueAt(selectedRow,4);
    			                    int aux_acertos= Integer.parseInt(acertos);
    			                 

    			                    setCod(aux_codCand);
    			                    setNome(nome);
    			                    setTema(tema);
    			                    setNota(aux_nota);
    			                    setAcerto(aux_acertos);
    			                   

    			                    tab.clearSelection();
    			                    sp.setVisible(false);
         
    			                    mostraComponentes(true);
    			                }
    			            }
    		});	
    	}
    }
    
   public void limpaTela() {
	   
	   txtAcertos.setText("");
	   txtNome.setText("");
	   txtNota.setText("");
	   jcbTemas.setSelectedIndex(1);
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblTema = new javax.swing.JLabel();
        lblNota = new javax.swing.JLabel();
        lblAcerto = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        jcbTemas = new javax.swing.JComboBox();
        txtNome = new javax.swing.JTextField();
        txtAcertos = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jLabel1.setText("Candidato");

        lblNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        lblTema.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTema.setText("Tema:");

        lblNota.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNota.setText("Nota:");

        lblAcerto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAcerto.setText("Acertos:");

        txtNota.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jcbTemas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbTemas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Matemática", "História", "Portugues", "Ingles", "Quimica" }));

        txtNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtAcertos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnSair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSair.setText("SAIR");

        btnExcluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnExcluir.setText("EXCLUIR");

        btnConsultar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnConsultar.setText("CONSULTAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTema, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNota, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAcerto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAcertos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSair))
                            .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTema)
                            .addComponent(jcbTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNota))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAcerto)
                    .addComponent(txtAcertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

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
    
    public double getNota() {
    	return Double.parseDouble(txtNota.getText());
    }
    
    public void setNota(double notass) {
    	txtNota.setText(Double.toString(notass));
    }
    public int getAcerto() {
    	return Integer.parseInt(txtAcertos.getText());
    }

    public void setAcerto(int cod) {
    	txtAcertos.setText(Integer.toString(cod));
    }
    
    public void addConsultarListener(ActionListener CandidatoConsultarListener) {
		
    	btnConsultar.addActionListener(CandidatoConsultarListener);
    }

    public int getCod() {
    	return Integer.parseInt(txtCod.getText());
    }
    
    public void setCod(int cod) {
    	txtCod.setText(Integer.toString(cod));
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CandidatoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CandidatoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CandidatoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CandidatoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CandidatoView().setVisible(true);
            }
        });
    }

    public void addDeletarListener(ActionListener CandidatoDeletarListener) {
    	btnExcluir.addActionListener(CandidatoDeletarListener);
    }
    
    public void addSairListener( ActionListener CandidatoSairListener) {
    	btnSair.addActionListener(CandidatoSairListener);
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> jcbTemas;
    private javax.swing.JLabel lblAcerto;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblTema;
    private javax.swing.JTextField txtAcertos;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNota;
    // End of variables declaration                   
}
