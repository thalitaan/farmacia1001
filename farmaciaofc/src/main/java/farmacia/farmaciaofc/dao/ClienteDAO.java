/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia.farmaciaofc.dao;

import farmacia.farmaciaofc.dto.ClienteDTO;
import farmacia.farmaciaofc.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author talit
 */
public class ClienteDAO {
    private Connection connection;
    
    public ClienteDAO() {
        connection = ConnectionFactory.getConnection();
    }
    public ResultSet autenticacaoCliente(ClienteDTO cliente) {
        try { 
            String sql = "SELECT * FROM clientes WHERE IDCliente = ? and Nome = ? and Cupom = ? and qtdprodutos_comprados = ? ";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, cliente.getIDCliente());
            pst.setString(2, cliente.getNome());
            pst.setString(3, cliente.getCupom());
            pst.setInt(4, cliente.getqtdprodutos_comprados());
            
            ResultSet rs = pst.executeQuery();
            return rs;
            
        } catch (SQLException e ) {
            System.err.println("Erro ao realizar operação: " + e.getMessage());
            return null;
            
        }
    }


    public void adicionarCliente(ClienteDTO novoCliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<ClienteDTO> listarClientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void atualizarProduto(ClienteDTO produtoAtualizado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void atualizarCliente(ClienteDTO produtoAtualizado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void excluirCliente(int IDCliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
