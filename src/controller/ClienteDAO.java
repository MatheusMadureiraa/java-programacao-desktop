package controller;

import model.Cliente;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.JDBCUtil;

public class ClienteDAO {
    
    private Connection connection;
    private PreparedStatement pstdados;
    private ResultSet rsdados;

    private static final String sqlconsultaclientes = "SELECT * FROM clientes order by nome";
    private static final String sqlconsultaclientePorId = "SELECT * FROM clientes WHERE id = ?";
    private static final String sqlinserir = "INSERT INTO clientes (id, nome, email, fone) VALUES (?, ?, ?, ?)";
    private static final String sqlalterar = "UPDATE clientes SET nome = ?, email = ?, fone = ? WHERE id = ?";
    private static final String sqlaexcluir = "DELETE FROM clientes WHERE id = ?";

    public ClienteDAO(Connection connection) {
        this.connection = connection;
    }

    // CRUD
    public boolean Inserir(Cliente cli) {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlinserir, tipo, concorrencia);
            pstdados.setInt(1, cli.getId());
            pstdados.setString(2, cli.getNome());
            pstdados.setString(3, cli.getEmail());
            pstdados.setString(4, cli.getTelefone());
            int resposta = pstdados.executeUpdate();
            pstdados.close();
            //DEBUG
            System.out.println("Resposta da inserção = " + resposta);
            //FIM-DEBUG
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
            pstdados = connection.prepareStatement(sqlconsultaclientes, tipo, concorrencia);
            rsdados = pstdados.executeQuery();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao executar consulta = " + erro);
        }
        return false;
    }
    
    public Cliente BuscarPorId(int id) {
        Cliente cli = null;
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlconsultaclientePorId, tipo, concorrencia);
            pstdados.setInt(1, id);
            rsdados = pstdados.executeQuery();

            if (rsdados.next()) {
                cli = new Cliente(
                    rsdados.getInt("id"),
                    rsdados.getString("nome"),
                    rsdados.getString("email"),
                    rsdados.getString("fone")
                );
            }

            rsdados.close();
            pstdados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cli;
    }

    public boolean Alterar(Cliente cli) {
       try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlalterar, tipo, concorrencia);
            pstdados.setString(1, cli.getNome());
            pstdados.setString(2, cli.getTelefone());
            pstdados.setString(3, cli.getEmail());
            pstdados.setInt(4, cli.getId());
            int resposta = pstdados.executeUpdate();
            pstdados.close();
            //DEBUG
            System.out.println("Resposta da atualização = " + resposta);
            //FIM-DEBUG
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

    public boolean Excluir(Cliente cli) {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlaexcluir, tipo, concorrencia);
            pstdados.setInt(1, cli.getId());
            int resposta = pstdados.executeUpdate();
            pstdados.close();
            //DEBUG
            System.out.println("Resposta da exclusão = " + resposta);
            //FIM-DEBUG
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
    
    public Cliente getCliente() {
        Cliente cli = null;
        if (rsdados != null) {
            try {
                int id = rsdados.getInt("id");
                String nome = rsdados.getString("nome");
                String email = rsdados.getString("email");
                String fone = rsdados.getString("fone");
                cli = new Cliente(id, nome, email, fone);
            } catch (SQLException erro) {
                System.out.println(erro);
            }
        }
        return cli;
    }

    /**
     * @return the rsdados
     */
    public ResultSet getRsdados() {
        return rsdados;
    }

}
