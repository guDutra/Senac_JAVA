
package database;
import java.sql.*;

public class Conexao {
    
      private static Connection instancia = null;
    
    Conexao() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Carregado");
        
        String usuario = "root";
        String senha = "gugu2018";
        String url = "jdbc:mysql://127.0.0.1:3306/aula01bd";
        
        instancia = DriverManager.getConnection(url,usuario,senha);
        System.out.println("Conexão Ok");
    }
    
    public static Connection getConexao() 
            throws ClassNotFoundException, SQLException{
        if(instancia == null){
            new Conexao();
            
        }
        System.out.println("Conexão Retornada");
            return instancia;
    }
}
