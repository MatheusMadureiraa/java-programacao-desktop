package controller;

import model.Funcionario;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.JDBCUtil;

public class FuncionarioDAO {

    private Connection connection;
    private PreparedStatement pstdados;
    private ResultSet rsdados;
    
    private static final String sqlconsultatodos = "SELECT * FROM funcionarios ORDER BY nome";
    private static final String sqlconsultafuncionarioPorId = "SELECT * FROM funcionarios WHERE id = ?";
    private static final String sqlinserir = "INSERT INTO funcionarios (id, nome, telefone, salario, cargo) VALUES (?, ?, ?, ?, ?)";
    private static final String sqlalterar = "UPDATE funcionarios SET nome = ?, telefone = ?, salario = ?, cargo = ? WHERE id = ?";
    private static final String sqlaexcluir = "DELETE FROM funcionarios WHERE id = ?";

    public FuncionarioDAO(Connection connection) {
        this.connection = connection;
    }

    // CRUD
    public boolean Inserir(Funcionario func) {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlinserir, tipo, concorrencia);
            pstdados.setInt(1, func.getId());
            pstdados.setString(2, func.getNome());
            pstdados.setString(3, func.getTelefone());
            pstdados.setDouble(4, func.getSalario());
            pstdados.setString(5, func.getCargo());
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
    
    public Funcionario BuscarPorId(int id) {
        Funcionario cli = null;
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlconsultafuncionarioPorId, tipo, concorrencia);
            pstdados.setInt(1, id);
            rsdados = pstdados.executeQuery();

            if (rsdados.next()) {
                cli = new Funcionario(
                        rsdados.getInt("id"),
                        rsdados.getString("nome"),
                        rsdados.getString("telefone"),
                        rsdados.getDouble("salario"),
                        rsdados.getString("cargo")                 
                );
            }

            rsdados.close();
            pstdados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cli;
    }

    public boolean Alterar(Funcionario func) {
       try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlalterar, tipo, concorrencia);
            pstdados.setString(1, func.getNome());
            pstdados.setString(2, func.getTelefone());
            pstdados.setDouble(3, func.getSalario());
            pstdados.setString(4, func.getCargo());
            pstdados.setInt(5, func.getId());
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

    public boolean Excluir(Funcionario func) {
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            pstdados = connection.prepareStatement(sqlaexcluir, tipo, concorrencia);
            pstdados.setInt(1, func.getId());
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

    public Funcionario getFuncionario() {
        Funcionario func = null;
        if (rsdados != null) {
            try {
                int id = rsdados.getInt("id");
                String nome = rsdados.getString("nome");
                String telefone = rsdados.getString("telefone");
                double salario = rsdados.getDouble("salario");
                String cargo = rsdados.getString("cargo");
                func = new Funcionario(id, nome, telefone, salario, cargo);
            } catch (SQLException erro) {
                System.out.println(erro);
            }
        }
        return func;
    }

    public ResultSet getRsdados() {
        return rsdados;
    }

}
