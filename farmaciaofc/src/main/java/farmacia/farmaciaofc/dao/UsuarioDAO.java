/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia.farmaciaofc.dao;

import farmacia.farmaciaofc.dto.FuncionarioDTO;
import farmacia.farmaciaofc.dto.UsuarioDTO;
import farmacia.farmaciaofc.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author talit
 */
public class UsuarioDAO {
    private Connection connection;
    
    public UsuarioDAO() {
        connection = ConnectionFactory.getConnection();
    }
    public ResultSet autenticacaoUsuario(UsuarioDTO usuario) {
        try { 
            String sql = "SELECT * FROM farmacialogin WHERE Usuario = ? and Senha = ?";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, usuario.getUsuario());
            pst.setString(2, usuario.getSenha());
            
            ResultSet rs = pst.executeQuery();
            return rs;
            
        } catch (SQLException e ) {
            System.err.println("Erro ao realizar operação: " + e.getMessage());
            return null;
            
        }
    }

    public ResultSet autenticacaoUsuario(FuncionarioDTO objUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
} 

