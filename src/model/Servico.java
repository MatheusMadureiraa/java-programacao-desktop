
package model;

import java.io.Serializable;

public class Servico implements Serializable{
    private int id;
    private String descricao;
    private double preco;
    private int duracaoDias;

    public Servico(){
    }

    public Servico(int id, String descricao, double preco, int duracaoDias) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.duracaoDias = duracaoDias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getDuracaoDias() {
        return duracaoDias;
    }

    public void setDuracaoDias(int duracaoDias) {
        this.duracaoDias = duracaoDias;
    }

    @Override
    public String toString() {
        return descricao + ";" + preco + ";" + duracaoDias + " min";
    }
}
