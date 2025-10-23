
package model;

/**
 *
 * @author matheus
 */
import java.io.Serializable;

public class Servico implements Serializable{
    private static final long serialVersionUID = 1L;
    private String descricao;
    private double preco;
    private int duracaoMinutos;

    // construtores
    public Servico(){
        this.descricao = "sem descrição";
        this.preco = 0;
        this.duracaoMinutos = 0;
    }
    
    public Servico(String descricao, double preco, int duracaoMinutos) {
        this.descricao = descricao;
        this.preco = preco;
        this.duracaoMinutos = duracaoMinutos;
    }

    
    // getter e setter
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String toString() {
        return descricao + ";" + preco + ";" + duracaoMinutos + " min";
    }
}
