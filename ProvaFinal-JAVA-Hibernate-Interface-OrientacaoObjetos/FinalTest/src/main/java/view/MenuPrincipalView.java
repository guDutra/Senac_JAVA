package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.CandidatoController;
import controller.ProvaController;
import controller.QuestaoController;
import controller.QuestionarioController;
import model.CandidatoModel;
import model.ProvaModel;
import model.QuestaoModel;
import model.QuestionarioModel;


public class MenuPrincipalView extends JFrame implements ActionListener
{
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuCadastros = new JMenu("Cadastros");
    private JMenuItem menuItemQuestionarios = new JMenuItem("Questionários");
    private JMenuItem menuItemQuestao = new JMenuItem("Questões");
    
    private JMenuItem sairItem = new JMenuItem("Sair");
    
    private JMenu menuProva = new JMenu("Vestibular");
    private JMenuItem menuItemProva = new JMenuItem("Prova");
    
    private JMenu menuConsultaCandidato = new JMenu("Consulta");
    private JMenuItem menuItemCanidato = new JMenuItem("Candidato");
    
    private JDesktopPane desktop;
    
    public MenuPrincipalView()
    {
        super("Teste de Desenvolvimento - SENACRS");
        Container conteudo = getContentPane();
        conteudo.setLayout(null);

        //criando a Barra de Menus
        JMenuBar menuBar = new JMenuBar();//cria a barra de menu
        setJMenuBar(menuBar);//posiciona a barra de menu no alto da tela
       
        
        
        menuCadastros.add(menuItemQuestionarios);
        menuCadastros.add(menuItemQuestao);
        menuCadastros.addSeparator();// cria uma linha para separar os submenus
        
        menuCadastros.add(sairItem);//cria um submenu para o sair
        
        menuConsultaCandidato.add(menuItemCanidato);
        
        menuProva.add(menuItemProva);
        menuBar.add(menuConsultaCandidato);
        menuBar.add(menuCadastros);//adiciona o menu Cadastros na barra de Menus
        menuBar.add(menuProva);
        
        menuItemQuestionarios.addActionListener(this);//cria um ouvinte para o item Departamento
        menuItemQuestao.addActionListener(this);//cria um ouvinte para o item Funcion�rios
        menuItemCanidato.addActionListener(this);//cria um ouvinte para o item Aumento
        menuItemProva.addActionListener(this);//cria um ouvinte para o item Aumento
        sairItem.addActionListener(this);//cria um ouvinte para o submenu Sair.
        
        //Deixa a janela do tamanho da tela
        
        //Make the big window be indented 50 pixels from each edge
        //of the screen.
        int inset = 50;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //setBounds(inset, inset,
        //          screenSize.width  - inset*2,
        //          screenSize.height - inset*2);

        desktop = new JDesktopPane(); 
        setContentPane(desktop);
        desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);

        setSize(screenSize.width,screenSize.height);
        setVisible(true); 
   } 
  

    
    public void actionPerformed(ActionEvent evt){
		Object src = evt.getSource();
		if(src==menuItemQuestionarios){
			createFrame(1);
		}
		if(src==menuItemQuestao){
			createFrame(2);
		}
		if(src==menuItemProva){
			System.out.println("opa");
			createFrame(3);
		}
		
		if(src == menuItemCanidato) {
			System.out.println("TREINO");
			createFrame(4);
		}
   		if (src==sairItem){
        	System.exit(0);
        }
   }
   
    protected void createFrame(int opcao){
    	Dimension desktopSize;
    	Dimension jInternalFrameSize;
    	switch(opcao){
    		
    		case 1: QuestionarioView frmDepto = new QuestionarioView();
    		
   			QuestionarioModel questionarioModel = new QuestionarioModel();
   			QuestionarioController Questionariocontroller = new QuestionarioController(frmDepto, questionarioModel);
        			frmDepto.setVisible(true); 
        			desktop.add(frmDepto);
        			desktopSize = desktop.getSize();
        			jInternalFrameSize = frmDepto.getSize();
        			frmDepto.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
        			    (desktopSize.height- jInternalFrameSize.height)/2-200);
        			try {
						frmDepto.setSelected(true);
					}catch(java.beans.PropertyVetoException e) {}
					break;
        		
        	case 2: QuestaoView frmFunc = new QuestaoView();
        	QuestaoModel questaoModel = new QuestaoModel();
        	QuestaoController Questaocontroller = new QuestaoController(frmFunc, questaoModel);
					frmFunc.setVisible(true); 
					desktop.add(frmFunc);
					desktopSize = desktop.getSize();
					jInternalFrameSize = frmFunc.getSize();
					frmFunc.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
							(desktopSize.height- jInternalFrameSize.height)/2-100);
					try {
						frmFunc.setSelected(true);
					}catch(java.beans.PropertyVetoException e) {}
					break;
				
        	case 3: ProvaView frmAumentoSal = new ProvaView();
        	ProvaModel provaModel = new ProvaModel();
        	ProvaController provaController = new ProvaController(frmAumentoSal, provaModel);
					frmAumentoSal.setVisible(true); 
					desktop.add(frmAumentoSal);
					desktopSize = desktop.getSize();
					jInternalFrameSize = frmAumentoSal.getSize();
					frmAumentoSal.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
							(desktopSize.height- jInternalFrameSize.height)/2-100);
					try {
						frmAumentoSal.setSelected(true);
					}catch(java.beans.PropertyVetoException e) {}
					break;	
					
       	case 4: System.out.println("AQUI");
        		
        		CandidatoView candidato = new CandidatoView();
        		CandidatoModel candidatoModel = new CandidatoModel();
        		CandidatoController Controller = new CandidatoController(candidato, candidatoModel);
        		candidato.setVisible(true);
        	desktop.add(candidato);
        	desktopSize = desktop.getSize();
        	jInternalFrameSize = candidato.getSize();
        	candidato.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
					(desktopSize.height- jInternalFrameSize.height)/2-100);
			try {
				candidato.setSelected(true);
			}catch(java.beans.PropertyVetoException e) {}
			break;	
					
					
    	}     	
    }
    
    //protected void createFrameNeg(int opcao){
   	Dimension desktopSize;
   	Dimension jInternalFrameSize;

   	
   	
  // 	switch(opcao){
   	///	case 2: 
   		//	QuestionarioView questionarioControler = new QuestionarioView();
   		//	QuestionarioModel questionarioModel = new QuestionarioModel();
   	///		
   	///		QuestionarioController controller = new QuestionarioController(questionarioControler, questionarioModel);
   			
   	//		questionarioControler.setVisible(true); 
     //  		desktop.add(questionarioControler);
     //  		desktopSize = desktop.getSize();
     //  		jInternalFrameSize = questionarioControler.getSize();
     //  		questionarioControler.setLocation(
     //              (desktopSize.width - jInternalFrameSize.width)/2,
     //  			(desktopSize.height- jInternalFrameSize.height)/2-100);
     ///  		try {
    //   			questionarioControler.setSelected(true);
    //   		}catch(java.beans.PropertyVetoException e) {
    //   			e.printStackTrace();
    //           }
    //   		break;
   	//}     	
  // }
    
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
            java.util.logging.Logger.getLogger(QuestionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalView().setVisible(true);
            }
        });
    }
}