/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia.farmaciaofc.dao;

import farmacia.farmaciaofc.dto.FuncionarioDTO;
import farmacia.farmaciaofc.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author talit
 */
public class FuncionarioDAO {
    private Connection connection;
    
    public FuncionarioDAO() {
        connection = ConnectionFactory.getConnection();
    }
    public ResultSet autenticacaoFuncionario(FuncionarioDTO funcionario) {
        try { 
            String sql = "SELECT * FROM funcionarios WHERE IDFuncionarios = ? and Nome = ? Idade = ? and Salário = ? Setor = ?";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt (1, funcionario.getIDFuncionario());
            pst.setString(2, funcionario.getNome());
            pst.setInt (3, funcionario.getIdade());
            pst.setFloat (4, funcionario.getSalario());
            pst.setString(5, funcionario.getSetor());
            
            
            ResultSet rs = pst.executeQuery();
            return rs;
            
        } catch (SQLException e ) {
            System.err.println("Erro ao realizar operação: " + e.getMessage());
            return null;
            
        }
    }
}
