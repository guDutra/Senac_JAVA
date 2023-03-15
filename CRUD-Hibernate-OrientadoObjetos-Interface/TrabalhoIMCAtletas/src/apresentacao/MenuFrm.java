package apresentacao;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MenuFrm extends javax.swing.JFrame implements ActionListener {

 private JMenuBar menuBar= new JMenuBar();
    private JMenu menuAtletas = new JMenu("Atletas");
    private JMenuItem ImcItem = new JMenuItem("IMC");
    private JMenuItem itemAtletas = new JMenuItem("Cadastro");
    
    private JMenuItem sairItem = new JMenuItem("Sair");
    
    private JDesktopPane desktop;
    
    
 
    public MenuFrm() {
        
        super("TRABALHO - TDS" );
        Container conteudo = getContentPane();
        conteudo.setLayout(null);
        
         menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        menuAtletas.add(itemAtletas);
        menuAtletas.addSeparator();
        menuBar.add(ImcItem);
        menuBar.add(sairItem);
        menuBar.add(menuAtletas);
        
        itemAtletas.addActionListener(this);
        sairItem.addActionListener(this);
        ImcItem.addActionListener(this);
        
        int inset = 50;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        desktop = new JDesktopPane();
        setContentPane(desktop);
        desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
        
        setSize(screenSize.width, screenSize.height);
        setVisible(true);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
            java.util.logging.Logger.getLogger(MenuFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFrm().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object src = e.getSource();
        
        if(src == ImcItem) {
            criaIMCFORM(1);
        }
        if(src == itemAtletas) {
            criaATLETASFORM(1);
        }
        if(src == sairItem) {
            System.exit(0);
        }
     }
    
    protected void criaATLETASFORM(int op) {
        
         Dimension desktopSize;
        Dimension jInternalFrameSize;
        
        switch(op) {
            
            case 1:
                AtletaFrm atletaFrm = new AtletaFrm();
            atletaFrm.setVisible(true);
            desktop.add(atletaFrm);
            desktopSize = desktop.getSize();
            jInternalFrameSize = atletaFrm.getSize();
            atletaFrm.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                    (desktopSize.height - jInternalFrameSize.height)/2-200);
            
            try {
                atletaFrm.setSelected(true);
            } catch(java.beans.PropertyVetoException e) {
                e.printStackTrace();
            }
            break;
        }   
    }
    
    protected void criaIMCFORM(int op) {
        
         Dimension desktopSize;
        Dimension jInternalFrameSize;
        
        switch(op) {
            
            case 1:
                ImcFrm imcFrm = new ImcFrm();
            imcFrm.setVisible(true);
            desktop.add(imcFrm);
            desktopSize = desktop.getSize();
            jInternalFrameSize = imcFrm.getSize();
            jInternalFrameSize = imcFrm.getSize();
            imcFrm.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
                    (desktopSize.height - jInternalFrameSize.height)/2-200);
            
            try {
                imcFrm.setSelected(true);
            } catch(java.beans.PropertyVetoException e) {
                e.printStackTrace();
            }
            break;
        }   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
