package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.Usuario;
import Controle.Conexao;

public class DAOUsuario {
    private Connection con;
    private PreparedStatement qry;
    
    public void salvar(Usuario usuario){
        String sql="INSERT INTO USUARIO"
                + "(LOGIN,NOME,SENHA,STATUS,PERFIL) values(?,?,?,?,?)";
        con = Conexao.getconexao();
        try{
            qry = con.prepareStatement(sql);
            qry.setString(1, usuario.getUsuario());
            qry.setString(2, usuario.getNome());
            qry.setString(3, usuario.getSenha());
            qry.setString(4, usuario.getStatus());
            qry.setString(5, usuario.getPerfil());
            qry.execute();
    }   catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public void excluir(String login){
        String sql="DELETE FROM USUARIO" + " WHERE LOGIN = " + login;
        con = Conexao.getconexao();
        try{
            qry = con.prepareStatement(sql);
            //qry.setString(1,num);
            qry.execute();
    }   catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editar(Usuario usuario, String login){
        String sql="UPDATE USUARIO set LOGIN = ?, NOME = ?, SENHA = ?, STATUS = ?, PERFIL = ? WHERE LOGIN = " + login ;
        con = Conexao.getconexao();
        try{
            qry = con.prepareStatement(sql);
            qry.setString(1, usuario.getUsuario());
            qry.setString(2, usuario.getNome());
            qry.setString(3, usuario.getSenha());
            qry.setString(4, usuario.getStatus());
            qry.setString(5, usuario.getPerfil());
            qry.execute();
    }   catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*
    public ArrayList<Cliente> ListarTodosClientes(){
        String sql = "select Cod_Cliente, Nome, Data_Nasc, Telefone from Cliente";
        con = conexao.getconexao();
        ArrayList<Cliente> Clientes = new ArrayList<Cliente>();
        try{
            qry = con.prepareStatement(sql);
            ResultSet rs = qry.executeQuery();
            while(rs.next()){
                Cliente a = new Cliente();
                a.setCod_Cliente(rs.getInt("Cod_Cliente"));
                a.setNome(rs.getString("Nome"));
                Calendar cal = Calendar.getInstance();
                cal.setTime(rs.getDate("Data_Nasc"));
                a.setData_Nasc(cal);
                a.setTelefone(rs.getString("Telefone"));
                Clientes.add(a);
            }
            return Clientes;
        } catch (SQLException ex){
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }*/
}
