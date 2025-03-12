/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia.farmaciaofc.dto;

/**
 *
 * @author talit
 */
public class MedicamentoDTO {
     private int CodMedicamento;
    private String nome;
    private double preco;
    private int quantidade;

    public MedicamentoDTO(int CodMedicamento, String nome, double preco, int quantidade) {
        this.CodMedicamento = CodMedicamento;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public MedicamentoDTO(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getCodMedicamento() {
        return CodMedicamento;
    }

    public void setCodMedicamento(int CodMedicamento) {
        this.CodMedicamento = CodMedicamento;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public double getpreco() {
        return preco;
    }

    public void setpreco(double preco) {
        this.preco = preco;
    }

    public int getquantidade() {
        return quantidade;
    }

    public void setquantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.CodMedicamento;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MedicamentoDTO other = (MedicamentoDTO) obj;
        return this.CodMedicamento == other.CodMedicamento;
    }
}


