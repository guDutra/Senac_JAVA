
package apresentacao;

import dao.AtletaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import transporte.AtletaTO;
import transporte.DataTableTO;


public class AtletaFrm extends JInternalFrame {

    private boolean operacao = true; // true <- inserção
    private AtletaDAO atletaDAO = new AtletaDAO();
    private DefaultTableModel dataModel;
    private JTable tab;
    private JScrollPane sp;
  
    public AtletaFrm() {
        initComponents();
        txtPeso.setText("00");
        txtAltura.setText("0.00");
        this.setResizable(false);
        txtCod.setText("0");
        txtCod.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNome.setText("NOME:");

        lblAltura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAltura.setText("ALTURA:");

        lblPeso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPeso.setText("PESO:");

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtAltura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtPeso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitulo.setText("CADASTRO ATLETAS");

        btnAtualizar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnInserir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnInserir.setText("INSERIR");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConsultar)
                            .addComponent(btnAtualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAltura)
                            .addComponent(lblPeso, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtAltura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(txtPeso, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(txtCod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblTitulo)
                .addGap(29, 29, 29)
                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeso)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltura)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnAtualizar)
                    .addComponent(btnLimpar))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
       limpaTela();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           
             AtletaDAO atletaDAO = new AtletaDAO();
                int conf = 0;
                Object[] options = {"SIM", "NÃO"};
                conf = JOptionPane.showOptionDialog(null, "Confirmar exclusão?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                         null, options, options[0]);

                if (conf == 0) {

                    AtletaTO atleta = getDadosTela();
                    atletaDAO.exclui(atleta.getCod());
                    limpaTela();
                }
                
            }
        });
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
       
        AtletaTO atleta = getDadosTela();
            atletaDAO.insere(atleta);
            limpaTela();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
       
      AtletaTO atleta = getDadosTela();
      String txtCodigo = txtCod.getText();
      if(codAtualiza(txtCodigo) == true) {
           atletaDAO.atualiza(atleta);
      } else {
           JOptionPane.showMessageDialog(null, "NÃO FOI POSSÍVEL ATUALIZAR O ATLETA");
            JOptionPane.showMessageDialog(null, "Certifica-se de ter consultado um atleta para depois atualiza-lo");
      }
      
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
        exibe_tabela("select * from atleta");
        escondeItems(false);
    }//GEN-LAST:event_btnConsultarActionPerformed
   
    /**
     * @param args the command line arguments
     */
    
    public void limpaTela() {
        
        txtCod.setText("0");
        txtNome.setText("");
        txtPeso.setText("00.0");
        txtAltura.setText("0");
        txtNome.requestFocus();
        
        operacao = true;
    }
    
    public AtletaTO getDadosTela() {
        
        AtletaTO atletaTO = new AtletaTO();
        
        int cod;
        String nome;
        int peso;
        Double altura;
        
        cod = Integer.parseInt(txtCod.getText());
        nome = txtNome.getText();
        peso = Integer.parseInt(txtPeso.getText());
        altura = Double.parseDouble(txtAltura.getText());
        
        atletaTO.setCod(cod);
        atletaTO.setNome(nome);
        atletaTO.setPeso(peso);
        atletaTO.setAltura(altura);
        
        
        return atletaTO;
    } 
    
    public void escondeItems(boolean visible) {
        
        lblTitulo.setVisible(visible);
        lblNome.setVisible(visible);
        lblPeso.setVisible(visible);
        lblAltura.setVisible(visible);
        
        txtNome.setVisible(visible);
        txtAltura.setVisible(visible);
        txtPeso.setVisible(visible);
        
        btnAtualizar.setVisible(visible);
        btnConsultar.setVisible(visible);
        btnInserir.setVisible(visible);
        btnLimpar.setVisible(visible);
        btnSair.setVisible(visible);
        btnExcluir.setVisible(visible);
        
    }
    
    public  void setDados(AtletaTO atleta) {
        
        txtCod.setText(Integer.toString(atleta.getCod()));
        txtNome.setText(atleta.getNome());
        txtPeso.setText(Integer.toString(atleta.getPeso()));
        txtAltura.setText(Double.toString(atleta.getAltura()));
        
    }
    
       public void exibe_tabela(String cmdSql) {
        
         System.out.println("EXIBE TABELA "+cmdSql);
        
        DataTableTO dt = atletaDAO.consultaTableModel(cmdSql);
        dataModel = new DefaultTableModel(dt.getDados(), dt.getTitulos());
        
//        dataModel = consultaDados(cmdSql);
        tab = new JTable(dataModel);

        sp = new JScrollPane(tab);
        this.getContentPane().add(sp);
        sp.setBounds(0, 0, 500, 300);

        tab.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == 27) {
                    sp.setVisible(false);
                    escondeItems(true);
                }

            }

        });

        ListSelectionModel cel = tab.getSelectionModel();

        cel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                ListSelectionModel lsm = (ListSelectionModel) e.getSource();

                if (!lsm.isSelectionEmpty()) {
                    int linha = tab.getSelectedRow();
                    int col = tab.getSelectedColumn();

                    String cod = (String) "" + tab.getValueAt(linha, 0);
                    int aux_cod = Integer.parseInt(cod);

                    String nome = (String) tab.getValueAt(linha, 1);
                    String peso = (String) "" + tab.getValueAt(linha, 2);
                    int aux_peso = Integer.parseInt(peso);
                    String altura = (String) "" + tab.getValueAt(linha, 3);
                    Double aux_altura = Double.parseDouble(altura);

                   
                    AtletaTO atletaTO = new AtletaTO(aux_cod, nome, aux_peso, Double.parseDouble(altura));
                    tab.clearSelection();
                    sp.setVisible(false);
                    operacao = true;
                    escondeItems(true);
                    setDados(atletaTO);

                }

            }
        });

    }
    
       public boolean codAtualiza (String cod) {
           
           boolean possui;
           List<AtletaTO> lista = atletaDAO.consulta("select * from atleta where cod=" + cod );
           if(!lista.isEmpty()) {
               possui = true;
           } else {
               possui = false;
           }
           return possui;
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
            java.util.logging.Logger.getLogger(AtletaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtletaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtletaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtletaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtletaFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
