
package apresentacao;

import dao.AtletaDAO;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import negocio.ImcNegocio;
import transporte.AtletaTO;
import transporte.DataTableTO;


public class ImcFrm extends JInternalFrame {

      private DefaultTableModel dataModel;
    private JTable tab;
    private JScrollPane sp;
    AtletaFrm atletaFrm = new AtletaFrm();
    AtletaDAO atletaDAO = new AtletaDAO();
    public ImcFrm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcIMCS = new javax.swing.JComboBox<>();
        lblTittle = new javax.swing.JLabel();
        btnCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jcIMCS.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcIMCS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Magro", "Ideal", "Acima", "Obeso", "Obesidade Moderada", "Obesidade Severa", "Obesidade Mórbida", " " }));

        lblTittle.setFont(new java.awt.Font("Comic Sans MS", 2, 36)); // NOI18N
        lblTittle.setText("IMC");

        btnCategoria.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        btnCategoria.setText("PROCURAR");
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(btnCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcIMCS, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcIMCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(btnCategoria)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        ImcNegocio imcNegocio = new ImcNegocio();
       
        exibe_tabela(imcNegocio.calculoImc(jcIMCS.getSelectedIndex()));
        escondeItems(false);
         
    }//GEN-LAST:event_btnCategoriaActionPerformed

   
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
                    escondeItems(true);
                   

                }

            }
        });

    }
    
     public void escondeItems(boolean mostra){
        
         lblTittle.setVisible(mostra);
         jcIMCS.setVisible(mostra);
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
            java.util.logging.Logger.getLogger(ImcFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImcFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImcFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImcFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImcFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategoria;
    private javax.swing.JComboBox<String> jcIMCS;
    private javax.swing.JLabel lblTittle;
    // End of variables declaration//GEN-END:variables
}
