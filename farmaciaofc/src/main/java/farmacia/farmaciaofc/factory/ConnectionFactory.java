/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia.farmaciaofc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author talit
 */
public class ConnectionFactory {
    // Configurações do banco de dados

    private static final String URL = "jdbc:mariadb://localhost:3306/farmaciagasa0";
    private static final String USUARIO = "root";
    private static final String SENHA = "032200";

    // Método para obter uma conexão com o banco de dados.
    public static Connection getConnection() {
        try {
            // Carrega o driver JDBC
            Class.forName("org.mariadb.jdbc.Driver");

            // Retorna a conexão com o banco de dados
            return DriverManager.getConnection(URL, USUARIO, SENHA);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Erro ao obter a conexão com o banco de dados: " + e.getMessage(), e);
        }
    }

    // Método para fechar a conexão com o banco de dados.
    public static void closeConnection(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados: " + e.getMessage(), e);
        }
    }
}
