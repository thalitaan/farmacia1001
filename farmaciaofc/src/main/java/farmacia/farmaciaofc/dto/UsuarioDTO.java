/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia.farmaciaofc.dto;

/**
 *
 * @author talit
 */
public class UsuarioDTO {
    private int IDUsuario;
    private String Usuario, Senha;

    public UsuarioDTO (int IDUsuario, String Usuario, String Senha) {
        this.IDUsuario = IDUsuario;
        this.Usuario = Usuario;
        this.Senha = Senha;
    }
    

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    } 
}
