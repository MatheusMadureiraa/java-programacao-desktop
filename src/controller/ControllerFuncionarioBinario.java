
package controller;

/**
 *
 * @author mathe
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.Funcionario;

public class ControllerFuncionarioBinario {
    private final File arquivo = new File("funcionarios.dat");
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public ControllerFuncionarioBinario() {
        lerArquivo();
    }

    // CRUD
    public void incluir(Funcionario f) {
        funcionarios.add(f);
        salvarArquivo();
    }

    public void alterar(int index, Funcionario f) {
        if (index >= 0 && index < funcionarios.size()) {
            funcionarios.set(index, f);
            salvarArquivo();
        }
    }

    public void excluir(int index) {
        if (index >= 0 && index < funcionarios.size()) {
            funcionarios.remove(index);
            salvarArquivo();
        }
    }

    public ArrayList<Funcionario> listar() {
        return funcionarios;
    }

    // metodos do ARQUIVO
    private void salvarArquivo() {
        try {
            ObjectOutputStream out = ControllerArquivoBinario.criarEscritorObjeto(arquivo);
            out.writeObject(funcionarios);
            out.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }

    private void lerArquivo() {
        if (arquivo.exists()) {
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo));
                funcionarios = (ArrayList<Funcionario>) in.readObject();
                in.close();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Erro ao ler arquivo: " + e.getMessage());
            }
        }
    }
}
