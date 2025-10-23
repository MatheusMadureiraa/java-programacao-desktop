
package controller;

import java.io.*;

/**
 *
 * @author mathe
 */
public class ControllerArquivoBinario<T> extends ControllerArquivo {
    private T objeto;
    private ObjectInputStream leitor = null;
    private ObjectOutputStream escritor = null;

    public T getObjeto() { return objeto; }
    public void setObjeto(T objeto) { this.objeto = objeto; }

    @Override
    public boolean ler() {
        try {
            leitor = new ObjectInputStream(new FileInputStream(arquivo));
            objeto = (T) leitor.readObject();
            leitor.close();
            return true;
        } catch (ClassNotFoundException erro) {
            System.err.println("Classe não encontrada: " + erro.getMessage());
            return false;
        } catch (IOException erro) {
            System.err.println("Erro ao ler arquivo binário: " + erro.getMessage());
            return false;
        }
    }

    @Override
    public boolean escrever(boolean append) {
        if (arquivo != null) {
            try {
                escritor = new ObjectOutputStream(new FileOutputStream(arquivo, append));
                escritor.writeObject(objeto);
                escritor.close();
                return true;
            } catch (IOException erro) {
                System.err.println("Erro ao escrever arquivo binário: " + erro.getMessage());
                return false;
            }
        } else {
            return false;
        }
    }

    public static ObjectOutputStream criarEscritorObjeto(File arquivo) {
        ObjectOutputStream out = null;
        try {
            if (arquivo.exists()) {
                FileOutputStream fos = new FileOutputStream(arquivo, true);
                out = new ObjectOutputStream(fos) {
                    @Override
                    protected void writeStreamHeader() throws IOException {
                    }
                };
            } else {
                FileOutputStream fos = new FileOutputStream(arquivo, true);
                out = new ObjectOutputStream(fos);
            }
        } catch (IOException erro) {
            System.out.println("Erro ao criar arquivo. " + erro);
        }
        return out;
    }
}
