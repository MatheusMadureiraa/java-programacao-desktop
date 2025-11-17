
package model;

import java.io.Serializable;

public class Funcionario implements Serializable {
    private int id;
    private String nome;
    private String telefone;
    private double salario;
    private String cargo;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, String telefone, double salario, String cargo) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.salario = salario;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public String toString() {
        return nome + " | " + telefone + " | R$ " + salario + " | " + cargo;
    }
}