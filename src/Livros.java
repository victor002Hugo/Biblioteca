import java.util.ArrayList;

public class Livros extends Publicacoes{

    private int numeroEdicao;
    private String nomeEditora;
    private int isbn;

    public Livros(String dataPublicacao, String titulo, ArrayList<Publicacoes> publicacoesReferencia, ArrayList<Autor> autoresPublicacao,
                  int numeroEdicao,String nomeEditora,int isbn) {
        super(dataPublicacao, titulo, publicacoesReferencia, autoresPublicacao);
        this.numeroEdicao=numeroEdicao;
        this.nomeEditora=nomeEditora;
        this.isbn=isbn;
    }


    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
