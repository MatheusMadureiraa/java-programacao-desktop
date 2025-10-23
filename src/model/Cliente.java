
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

    // construtores
    public Cliente() {
        this.nome = "nome não informado";
        this.email = "email não informado";
    }

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
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
    
    @Override
    public String toString() {
        return nome + ";" + email;
    }
}

