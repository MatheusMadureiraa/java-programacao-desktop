
package model;

/**
 *
 * @author mathe
 */
import java.io.Serializable;

public class Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nome;
    private String telefone;
    private double salario;

    // construtores
    public Funcionario() {
        this.nome = "nome não informado";
        this.telefone = "tel não informado";
        this.salario = 0.0;
    }

    public Funcionario(String nome, String telefone, double salario) {
        this.nome = nome;
        this.telefone = telefone;
        this.salario = salario;
    }

    // getter e setters
    public String getNome() { 
        return nome; 
    }
    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public String getTelefone() { 
        return telefone; 
    }
    public void setTelefone(String telefone) { 
        this.telefone = telefone; 
    }

    public double getSalario() { 
        return salario; 
    }
    public void setSalario(double salario) { 
        this.salario = salario; 
    }
    
    @Override
    public String toString() {
        return nome + " | " + telefone + " | R$ " + salario;
    }
}