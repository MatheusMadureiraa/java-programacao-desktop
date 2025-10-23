
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
import model.Cliente;

public class ControllerClienteBinario {
    private final File arquivo = new File("clientes.dat");
    private ArrayList<Cliente> clientes = new ArrayList<>();
    
    public ControllerClienteBinario(){
        lerArquivo();
    }
    
    // CRUD
    public void adicionarCliente(Cliente c) {
        clientes.add(c);
        salvarArquivo();
    }

    public void atualizarCliente(int index, Cliente c) {
        if (index >= 0 && index < clientes.size()) {
            clientes.set(index, c);
            salvarArquivo();
        }
    }

    public void excluirCliente(int index) {
        if (index >= 0 && index < clientes.size()) {
            clientes.remove(index);
            salvarArquivo();
        }
    }

    public ArrayList<Cliente> listarClientes() {
        return clientes;
    }

    // metodos do ARQUIVO
    private void salvarArquivo() {
        try {
            ObjectOutputStream out = ControllerArquivoBinario.criarEscritorObjeto(arquivo);
            out.writeObject(clientes);
            out.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }
    
    private void lerArquivo() {
        if (arquivo.exists()) {
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo));
                clientes = (ArrayList<Cliente>) in.readObject();
                in.close();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Erro ao ler arquivo: " + e.getMessage());
            }
        }
    }
}

