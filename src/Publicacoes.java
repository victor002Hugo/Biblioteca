import java.util.ArrayList;

public class Publicacoes {

    private String  dataPublicacao;
    private String titulo;
    private ArrayList<Publicacoes>publicacoesReferencia;
    private ArrayList<Autor>autoresPublicacao;


    public Publicacoes(String dataPublicacao, String titulo, ArrayList<Publicacoes> publicacoesReferencia, ArrayList<Autor> autoresPublicacao) {
        this.dataPublicacao = dataPublicacao;
        this.titulo = titulo;
        this.publicacoesReferencia = publicacoesReferencia;
        this.autoresPublicacao = autoresPublicacao;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Publicacoes> getPublicacoesReferencia() {
        return publicacoesReferencia;
    }

    public void setPublicacoesReferencia(ArrayList<Publicacoes> publicacoesReferencia) {
        this.publicacoesReferencia = publicacoesReferencia;
    }

    public ArrayList<Autor> getAutoresPublicacao() {
        return autoresPublicacao;
    }

    public void setAutoresPublicacao(ArrayList<Autor> autoresPublicacao) {
        this.autoresPublicacao = autoresPublicacao;
    }
}
