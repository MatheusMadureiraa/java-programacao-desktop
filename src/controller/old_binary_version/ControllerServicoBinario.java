
package controller;

/**
 *
 * @author matheus
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.Servico;

public class ControllerServicoBinario {
    private final File arquivo = new File("servicos.dat");
    private ArrayList<Servico> listaServicos = new ArrayList<>();

    public ControllerServicoBinario() {
        lerArquivo();
    }

    // CRUD
    public void adicionarServico(Servico s) {
        listaServicos.add(s);
        salvarArquivo();
    }

    public void atualizarServico(int index, Servico s) {
        if (index >= 0 && index < listaServicos.size()) {
            listaServicos.set(index, s);
            salvarArquivo();
        }
    }

    public void excluirServico(int index) {
        if (index >= 0 && index < listaServicos.size()) {
            listaServicos.remove(index);
            salvarArquivo();
        }
    }

    public ArrayList<Servico> listarServicos() {
        return listaServicos;
    }

    // metodos arquivo
    private void salvarArquivo() {
        try {
            ObjectOutputStream out = ControllerArquivoBinario.criarEscritorObjeto(arquivo);
            out.writeObject(listaServicos);
            out.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }

    private void lerArquivo() {
        if (arquivo.exists()) {
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo));
                listaServicos = (ArrayList<Servico>) in.readObject();
                in.close();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Erro ao ler arquivo: " + e.getMessage());
            }
        }
    }
}
