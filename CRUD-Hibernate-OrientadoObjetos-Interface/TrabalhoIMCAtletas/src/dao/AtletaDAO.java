
package dao;

import database.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import transporte.AtletaTO;
import transporte.DataTableTO;

public class AtletaDAO {

 public void insere(AtletaTO atleta) {
        
        Connection conexao = null;
       
        try {
            conexao = Conexao.getConexao();
            
            String sql = "insert into atleta (nome,peso,altura) values (?,?,?)";
            PreparedStatement cmdsql = conexao.prepareStatement(sql);
            
            cmdsql.setString(1, atleta.getNome());
             cmdsql.setInt(2, atleta.getPeso());
              cmdsql.setDouble(3, atleta.getAltura());
              
              cmdsql.executeUpdate();
              JOptionPane.showMessageDialog(null, "Atleta inserido com sucesso!!");
              
              
        } catch (Exception e) {
            e.printStackTrace();
        }
    } //// fim do metódo de inserir
 
 
 

 
 
 
 public List<AtletaTO> consulta (String consultaSql) {
        
        List<AtletaTO> lista = new ArrayList<AtletaTO>();
        AtletaTO atleta = null;
        
        ResultSet resultado = null;
        Connection conexao = null;
        Statement cmdsql = null;
        
        try {
            conexao = Conexao.getConexao();
            cmdsql = conexao.createStatement();
            resultado = cmdsql.executeQuery(consultaSql);
            
            while(resultado.next()) {
                
                atleta = new AtletaTO();
                atleta.setCod(resultado.getInt("cod"));
                atleta.setNome(resultado.getString("nome"));
                atleta.setPeso(resultado.getInt("peso"));
                atleta.setAltura(resultado.getDouble("altura"));
       
                lista.add(atleta);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
     
       return lista; 
    }//// fim do metódo de consulta
 
 
 
  public void atualiza(AtletaTO atleta) {
        Connection conexao = null;
        try {
            conexao = Conexao.getConexao();
            String sql = "update atleta set nome=?,peso = ?,altura=?";
            sql = sql + "where cod=?";
            
            System.out.println(sql);
            
            PreparedStatement cmdsql = conexao.prepareStatement(sql);
            cmdsql.setString(1, atleta.getNome());
            cmdsql.setInt(2, atleta.getPeso());
            cmdsql.setDouble(3, atleta.getAltura());
            cmdsql.setInt(4, atleta.getCod());
            cmdsql.executeUpdate();
           // conexao.close();
           JOptionPane.showMessageDialog(null, "ATLETA ATUALIZADO COM SUCESSO");
            
        } catch (Exception e) {
           
            
            e.printStackTrace();
            
        }  
    }//// fim do metódo de atualização
 
  public void exclui(int cod){
        Connection conexao = null;
        try {
            conexao = Conexao.getConexao();
            String sql = "delete from atleta where cod=?";
            PreparedStatement cmdsql = conexao.prepareStatement(sql);
            cmdsql.setInt(1, cod);
            cmdsql.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }/// fim do metódo de exclusão

     public DataTableTO consultaTableModel(String consulta) {
        
        System.out.println(consulta);
DataTableTO dataTableTO = new DataTableTO();
        ResultSet resultado = null;
        Connection conexao = null;
        Statement cmdsql = null;
        
        Vector dados = new Vector();
        Vector linhas;
        
           Vector titulos = new Vector();
        titulos.add("Cod");
        titulos.add("Nome");
        titulos.add("Peso");
        titulos.add("Altura");
        
        try {
            conexao = Conexao.getConexao();
            cmdsql = conexao.createStatement();
            resultado = cmdsql.executeQuery(consulta);
            ResultSetMetaData rsmd = resultado.getMetaData();
   
            resultado.next();
            do{
                
                linhas = new Vector();
                for(int i = 1; i <= rsmd.getColumnCount(); i++) {
                    
                    switch(rsmd.getColumnType(i)) {
                        
                        
                        case Types.INTEGER: linhas.add(new Long(resultado.getLong(i)));
                        break;
                        
                        case Types.CHAR: linhas.add(resultado.getString(i));
                        break;
                        
                        case Types.DOUBLE: linhas.add(new Double(resultado.getDouble(i)));
                        break;
                        
                        case Types.VARCHAR: linhas.add(resultado.getString(i));
                        break;
 
                    }
                }
                dados.add(linhas);
            } while(resultado.next());
            
            dataTableTO.setTitulos(titulos);
            dataTableTO.setDados(dados);
            }
         catch (Exception e) {
            e.printStackTrace();
        }
        return dataTableTO;
    }
     
     public Vector cadastros(String consulta) {
        
        
        System.out.println(consulta);
DataTableTO dataTableTO = new DataTableTO();
        ResultSet resultado = null;
        Connection conexao = null;
        Statement cmdsql = null;
        
        Vector dados = new Vector();
        Vector linhas;
        
         
        
        try {
            conexao = Conexao.getConexao();
            cmdsql = conexao.createStatement();
            resultado = cmdsql.executeQuery(consulta);
            ResultSetMetaData rsmd = resultado.getMetaData();
   
            resultado.next();
            do{
                
                linhas = new Vector();
                for(int i = 1; i <= rsmd.getColumnCount(); i++) {
                  
                    switch(rsmd.getColumnType(i)) {
                        
                        
                        case Types.INTEGER: linhas.add(new Long(resultado.getLong(i)));
                        break;
                        
                        case Types.CHAR: linhas.add(resultado.getString(i));
                        break;
                        
                        case Types.DOUBLE: linhas.add(new Double(resultado.getDouble(i)));
                        break;
                        
                        case Types.VARCHAR: linhas.add(resultado.getString(i));
                        break;
 
                    }
                }
                dados.add(linhas);
            } while(resultado.next());
        
            }
         catch (Exception e) {
            e.printStackTrace();
        }
        return dados;
         
         
         
         
         
     }//// fim do metodo cadastros
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}