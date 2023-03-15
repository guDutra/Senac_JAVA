
package negocio;

import dao.AtletaDAO;
import java.util.ArrayList;
import java.util.Vector;
import transporte.ImcTO;
public class ImcNegocio {
 
    AtletaDAO atletaDAO = new AtletaDAO();
        
      private  Vector imcIDEAL;
      private  Vector linhas;
      private Vector dados;
      private  Vector imcCalculados = new Vector();
      private int Pesos;
      String nome;
     ArrayList<ImcTO> imcArray  = new ArrayList<ImcTO>();
     ArrayList<ImcTO> imcMagros  = new ArrayList<ImcTO>();
     ArrayList<ImcTO> imcIdeal  = new ArrayList<ImcTO>();
     ArrayList<ImcTO> imcAcima  = new ArrayList<ImcTO>();
     ArrayList<ImcTO> imcObeso  = new ArrayList<ImcTO>();
     ArrayList<ImcTO> imcObesidadeModerada  = new ArrayList<ImcTO>();
      ArrayList<ImcTO> imcObesidadeSevera  = new ArrayList<ImcTO>();
       ArrayList<ImcTO> imcObesidadeMorbida  = new ArrayList<ImcTO>();
     
     
    
    public String calculoImc(int opc) {
         String cods = "";
        dados = atletaDAO.cadastros("select * from atleta");
         String comando="";
        for(int i = 0; i < dados.size(); i++ ) {
            
          linhas = (Vector) dados.get(i);
          
          String aux_cod = (String) "" + linhas.get(0);
          int Cods = Integer.parseInt(aux_cod);
          String Nomes = (String) "" + linhas.get(1);
          String aux_peso = (String) ""+linhas.get(2);
          int Pesos = Integer.parseInt(aux_peso);
          String aux_altura = (String) "" + linhas.get(3);
          Double Alturas = Double.parseDouble(aux_altura); 
          Double imcs = (Pesos/(Alturas*Alturas));
         ImcTO imcTO = new ImcTO();
            imcTO.setCod(Cods);
            imcTO.setNome(Nomes);
            imcTO.setAltura(Alturas);
            imcTO.setPeso(Pesos);
            imcTO.setImc(imcs);
           imcArray.add(imcTO);
           
           System.out.println(imcArray.get(i).getCod());
           System.out.println(imcArray.get(i).getNome());
          System.out.println(imcArray.get(i).getAltura());
          System.out.println(imcArray.get(i).getPeso());
          System.out.println(imcArray.get(i).getImc());
          
          
          
          if(imcs < 18.5){
              imcMagros.add(imcTO);
          }
          if(imcs >= 18.5 &&  imcs < 25){
              imcIdeal.add(imcTO);
          }
          
          if(imcs >= 25 &&  imcs < 30 ) {
            
              imcAcima.add(imcTO);
             }
          
          if(imcs >= 30) {
              
              imcObeso.add(imcTO);
          }
          
          if(imcs >= 30 && imcs < 35) {
              imcObesidadeModerada.add(imcTO);
          }
          
          if(imcs >= 35 && imcs < 40) {
              imcObesidadeSevera.add(imcTO);
          }
          
          if(imcs >= 40) {
              imcObesidadeMorbida.add(imcTO);
          }
          
        }//Fecha o for  
          
        
        for(int t = 0; t < imcMagros.size(); t++) {
            
            System.out.println(imcMagros.get(t).getNome());
            System.out.println(imcMagros.get(t).getPeso());
            System.out.println(imcMagros.get(t).getAltura());
            System.out.println(imcMagros.get(t).getCod());
            
        } 
        
        
        
                 switch(opc) {
             
             case 0: 
                 ///magro 
                 ///atletaDAO.consultaTableModel("select * from atleta where cod in (" + imcMagros.get(i).getCod() + ");");
                 
                  cods = "";
                 for(int i=0;i<imcMagros.size();i++){
                     cods = cods + imcMagros.get(i).getCod();
                     if(i != imcMagros.size()-1){
                        cods = cods + ",";
                     }
                 }
                  comando = "select * from atleta where cod in (" + cods + ");";
                  System.out.println("Comando "+comando);
                break;
                
                 
             case 1:
                 
                  cods = "";
                 for(int i=0;i<imcIdeal.size();i++){
                     cods = cods + imcIdeal.get(i).getCod();
                     if(i != imcIdeal.size()-1){
                        cods = cods + ",";
                     }
                 }
                  comando = "select * from atleta where cod in (" + cods + ");";
                  System.out.println("Comando "+comando);
                 
               
                break;
                 ///ideal
                
               case 2: 
                cods = "";
                 for(int i=0;i<imcAcima.size();i++){
                     cods = cods + imcAcima.get(i).getCod();
                     if(i != imcAcima.size()-1){
                        cods = cods + ",";
                     }
                 }
                  comando = "select * from atleta where cod in (" + cods + ");";
                  System.out.println("Comando "+comando);
                break;
                 ///acima
                
                 
             case 3: 
                  cods = "";
                 for(int i=0;i<imcObeso.size();i++){
                     cods = cods + imcObeso.get(i).getCod();
                     if(i != imcObeso.size()-1){
                        cods = cods + ",";
                     }
                 }
                  comando = "select * from atleta where cod in (" + cods + ");";
                  System.out.println("Comando "+comando);
                    break;      
                 ///obeso
             
                 
             case 4:
                cods = "";
                 for(int i=0; i < imcObesidadeModerada.size();i++){
                     cods = cods + imcObesidadeModerada.get(i).getCod();
                     if(i != imcObesidadeModerada.size()-1){
                        cods = cods + ",";
                     }
                 }
                  comando = "select * from atleta where cod in (" + cods + ");";
                  System.out.println("Comando "+comando);
                 break;
                 ///obeso moderada
                 
                 
             case 5:
                  cods = "";
                 for(int i=0; i < imcObesidadeSevera.size();i++){
                     cods = cods + imcObesidadeSevera.get(i).getCod();
                     if(i != imcObesidadeSevera.size()-1){
                        cods = cods + ",";
                     }
                 }
                  comando = "select * from atleta where cod in (" + cods + ");";
                  System.out.println("Comando "+comando);
                  break;
                 //obeso severa
                 
                 
             case 6:
                  cods = "";
                 for(int i=0; i < imcObesidadeMorbida.size();i++){
                     cods = cods + imcObesidadeMorbida.get(i).getCod();
                     if(i != imcObesidadeMorbida.size()-1){
                        cods = cods + ",";
                     }
                 }
                  comando = "select * from atleta where cod in (" + cods + ");";
                  System.out.println("Comando "+comando);
                  
                 //obesidade morbída
                
        
         }
       
        /// fim do for dadoos.size
        
         return comando;
       
      
    }
    
    
   
   
    
    
    
    
        
        
        
    }
    

