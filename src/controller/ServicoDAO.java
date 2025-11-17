package controller;

import model.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServicoDAO {

    private Connection connection;
    private PreparedStatement pstdados;
    private ResultSet rsdados;
    
    private static final String sqlconsultatodos = "SELECT * FROM servicos ORDER BY descricao";
    private static final String sqlconsultaservicoPorId = "SELECT * FROM servicos WHERE id = ?";
    private static final String sqlinserir = "INSERT INTO servicos (id, descricao, preco, duracaoDias) VALUES (?, ?, ?, ?)";
    private static final String sqlalterar = "UPDATE servicos SET descricao = ?, preco = ?, duracaoDias = ? WHERE id = ?";
    private static final String sqlaexcluir = "DELETE FROM servicos WHERE id = ?";

    public ServicoDAO(Connection connection) {
        this.connection = connection;
    }

    // CRUD
    public boolean Inserir(Servico serv) {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlinserir, tipo, concorrencia);
            pstdados.setInt(1, serv.getId());
            pstdados.setString(2, serv.getDescricao());
            pstdados.setDouble(3, serv.getPreco());
            pstdados.setInt(4, serv.getDuracaoDias());
            int resposta = pstdados.executeUpdate();
            pstdados.close();
            System.out.println("Resposta da inserção = " + resposta);
            if (resposta == 1) {
                connection.commit();
                return true;
            } else {
                connection.rollback();
                return false;
            }
        } catch (SQLException erro) {
            System.out.println("Erro na execução da inserção = " + erro);
        }
        return false;
    }
    
    public boolean ConsultarTodos() {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlconsultatodos, tipo, concorrencia);
            rsdados = pstdados.executeQuery();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao executar consulta = " + erro);
        }
        return false;
    }
    
    public Servico BuscarPorId(int id) {
        Servico serv = null;
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlconsultaservicoPorId, tipo, concorrencia);
            pstdados.setInt(1, id);
            rsdados = pstdados.executeQuery();

            if (rsdados.next()) {
                serv = new Servico(
                        rsdados.getInt("id"),
                        rsdados.getString("descricao"),
                        rsdados.getDouble("preco"),
                        rsdados.getInt("duracaoDias")                 
                );
            }

            rsdados.close();
            pstdados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serv;
    }

    public boolean Alterar(Servico serv) {
       try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlalterar, tipo, concorrencia);
            pstdados.setString(1, serv.getDescricao());
            pstdados.setDouble(2, serv.getPreco());
            pstdados.setInt(3, serv.getDuracaoDias());
            pstdados.setInt(4, serv.getId());
            int resposta = pstdados.executeUpdate();
            pstdados.close();
            System.out.println("Resposta da atualização = " + resposta);
            if (resposta == 1) {
                connection.commit();
                return true;
            } else {
                connection.rollback();
                return false;
            }
        } catch (SQLException erro) {
            System.out.println("Erro na execução da atualização = " + erro);
        }
        return false;
    }

    public boolean Excluir(Servico serv) {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlaexcluir, tipo, concorrencia);
            pstdados.setInt(1, serv.getId());
            int resposta = pstdados.executeUpdate();
            pstdados.close();
            System.out.println("Resposta da exclusão = " + resposta);
            if (resposta == 1) {
                connection.commit();
                return true;
            } else {
                connection.rollback();
                return false;
            }
        } catch (SQLException erro) {
            System.out.println("Erro na execução da exclusão = " + erro);
        }
        return false;
    }

    public Servico getServico() {
        Servico serv = null;
        if (rsdados != null) {
            try {
                int id = rsdados.getInt("id");
                String descricao = rsdados.getString("descricao");
                double preco = rsdados.getDouble("preco");
                int duracaoDias = rsdados.getInt("duracaoDias");
                serv = new Servico(id, descricao, preco, duracaoDias);
            } catch (SQLException erro) {
                System.out.println(erro);
            }
        }
        return serv;
    }

    public ResultSet getRsdados() {
        return rsdados;
    }

}
