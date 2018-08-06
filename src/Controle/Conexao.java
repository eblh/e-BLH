package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    private static final String
    //Chamar o Driver
    drive = "com.mysql.jdbc.Driver", 
    //Informações referente o BD
    url = "jdbc:mysql://localhost/ion",
    usuario = "root",
    senha = "1203";
    public static Connection getconexao(){
        try{
            Class.forName(drive);
            return DriverManager.getConnection(url,usuario,senha);
        }catch (ClassNotFoundException ex){
            throw new RuntimeException("Erro na conexão", ex);
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

//TESTE
