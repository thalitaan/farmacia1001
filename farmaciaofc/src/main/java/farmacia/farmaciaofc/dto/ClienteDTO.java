/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia.farmaciaofc.dto;

/**
 *
 * @author talit
 */
public class ClienteDTO {
     private int IDCliente, qtdprodutos_comprados;
    private String Nome, Cupom;

    public ClienteDTO(int IDCliente, String Nome, String Cupom, int qtdprodutos_comprados) {
        this.IDCliente = IDCliente;
        this.Nome = Nome;
        this.Cupom = Cupom;
        this.qtdprodutos_comprados = qtdprodutos_comprados;
    }
    

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }
    
    
    public int getqtdprodutos_comprados() {
        return qtdprodutos_comprados;
    }

    public void setqtdprodutos_comprados(int qtdprodutos_comprados) {
        this.qtdprodutos_comprados = qtdprodutos_comprados;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCupom() {
        return Cupom;
    }

    public void setCupom(String Cupom) {
        this.Cupom = Cupom;
    }
}
