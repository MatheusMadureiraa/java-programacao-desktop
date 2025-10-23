
package model;

/**
 *
 * @author matheus
 */
import java.io.Serializable;

public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nome;
    private String email;
    private String telefone;

    // construtores
    public Cliente() {
        this.nome = "nome não informado";
        this.email = "email não informado";
        this.telefone = "tel não informado";
    }

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return nome + ";" + email + ";" + telefone;
    }
}

