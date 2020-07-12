import java.util.ArrayList;

public class Teses extends Artigos {

    private int numeroDePaginas;
    private String dataDefesa;
    private String instituicaoDefendida;

    public Teses(String dataPublicacao, String titulo, ArrayList<Publicacoes> publicacoesReferencia, ArrayList<Autor> autoresPublicacao,String resumo,
                 int numeroDePaginas,String dataDefesa,String instituicaoDefendida) {
        super(dataPublicacao, titulo, publicacoesReferencia, autoresPublicacao,resumo);
        this.numeroDePaginas=numeroDePaginas;
        this.dataDefesa=dataDefesa;
        this.instituicaoDefendida=instituicaoDefendida;
    }


    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getDataDefesa() {
        return dataDefesa;
    }

    public void setDataDefesa(String dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public String getInstituicaoDefendida() {
        return instituicaoDefendida;
    }

    public void setInstituicaoDefendida(String instituicaoDefendida) {
        this.instituicaoDefendida = instituicaoDefendida;
    }
}
