import java.util.ArrayList;

public class Artigos extends Publicacoes{

    private String resumo;

    public Artigos(String dataPublicacao, String titulo, ArrayList<Publicacoes> publicacoesReferencia, ArrayList<Autor> autoresPublicacao,
                   String resumo) {
        super(dataPublicacao, titulo, publicacoesReferencia, autoresPublicacao);
        this.resumo=resumo;
    }


    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}
