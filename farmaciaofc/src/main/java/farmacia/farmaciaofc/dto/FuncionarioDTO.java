/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia.farmaciaofc.dto;

/**
 *
 * @author talit
 */
public class FuncionarioDTO {
    private int IDFuncionario, Idade;
    private String Nome, Setor;
    private float Salario;
    
    public FuncionarioDTO(int IDFuncionario, String Nome, int Idade, float Salario, String Setor) {
        this.IDFuncionario = IDFuncionario;
        this.Nome = Nome;
        this.Idade = Idade;
        this.Salario = Salario;
        this.Setor = Setor;       
    }
    

    public int getIDFuncionario() {
        return IDFuncionario;
    }

    public void setIDFuncionario(int IDFuncionario) {
        this.IDFuncionario = IDFuncionario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome (String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade (int Idade) {
        this.Idade = Idade;
        
    }
    
     public float getSalario() {
        return Salario;
    }

    public void setSalario (float Salario) {
        this.Salario = Salario;
    }
    
     public String getSetor() {
        return Setor;
    }

    public void setSetor (String Setor) {
        this.Setor = Setor;
    }
}
