import java.util.ArrayList;

public class Biblioteca {

    private String nome;
    private String endereco;
    private ArrayList<Publicacoes>conjuntoPublicacoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
