public class EmprestimoLivro {

    private String dataInicioEmprestimo;
    private String dataRetornoPublicacao;
    private String valorMulta;
    private Pessoa pessoa;
    private Publicacoes publicacoes;

    public EmprestimoLivro(String dataInicioEmprestimo, String dataRetornoPublicacao, String valorMulta, Pessoa pessoa, Publicacoes publicacoes) {
        this.dataInicioEmprestimo = dataInicioEmprestimo;
        this.dataRetornoPublicacao = dataRetornoPublicacao;
        this.valorMulta = valorMulta;
        this.pessoa = pessoa;
        this.publicacoes = publicacoes;
    }

    public String getDataInicioEmprestimo() {
        return dataInicioEmprestimo;
    }

    public void setDataInicioEmprestimo(String dataInicioEmprestimo) {
        this.dataInicioEmprestimo = dataInicioEmprestimo;
    }

    public String getDataRetornoPublicacao() {
        return dataRetornoPublicacao;
    }

    public void setDataRetornoPublicacao(String dataRetornoPublicacao) {
        this.dataRetornoPublicacao = dataRetornoPublicacao;
    }

    public String getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(String valorMulta) {
        this.valorMulta = valorMulta;
    }


    public void EmprestimoLivro(Publicacoes publicacoes,Pessoa cliente){
    if(Pessoa.class.getClass().equals(UsuarioComum.class)&&cliente.getEmprestimoLivro()<3){
        int emprestimo=cliente.getEmprestimoLivro();
        emprestimo++;
        cliente.setEmprestimoLivro(emprestimo);
        System.out.println("Emprestimo realizado com Sucesso!");
    }else{
        if(Pessoa.class.getClass().equals(UsuarioEspecial.class)&&cliente.getEmprestimoLivro()<5){
            int emprestimo=cliente.getEmprestimoLivro();
            emprestimo++;
            cliente.setEmprestimoLivro(emprestimo);
            System.out.println("Emprestimo realizado com Sucesso!");
        }
    }
    }

    public void DevolverLivro (Publicacoes publicacoes,Pessoa cliente){
        if(Pessoa.class.getClass().equals(UsuarioComum.class)&&cliente.getEmprestimoLivro()>0){
            int emprestimo=cliente.getEmprestimoLivro();
            emprestimo--;
            cliente.setEmprestimoLivro(emprestimo);
            System.out.println("Devolução realizada com Sucesso!");
        }else{
            if(Pessoa.class.getClass().equals(UsuarioEspecial.class)&&cliente.getEmprestimoLivro()>0){
                int emprestimo=cliente.getEmprestimoLivro();
                emprestimo--;
                cliente.setEmprestimoLivro(emprestimo);
                System.out.println("Devolução realizado com Sucesso!");
            }
        }
    }
}
