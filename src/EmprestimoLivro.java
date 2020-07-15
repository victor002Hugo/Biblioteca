public class EmprestimoLivro {

    private String dataInicioEmprestimo;
    private String dataRetornoPublicacao;
    private double valorMulta;
    private Pessoa pessoa;
    private Publicacoes publicacoes;

    public EmprestimoLivro(String dataInicioEmprestimo, String dataRetornoPublicacao, double valorMulta, Pessoa pessoa, Publicacoes publicacoes) {
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

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }


    public void EmprestimoLivro(Publicacoes publicacoes,Pessoa cliente){
    if(Pessoa.class.getClass().equals(UsuarioComum.class)&&cliente.getEmprestimoLivro()<3){
        int emprestimo=cliente.getEmprestimoLivro();
        emprestimo++;
        cliente.setEmprestimoLivro(emprestimo);
        System.out.println("Emprestimo realizado com Sucesso!");

    }else{
        if(Pessoa.class.getClass().equals(UsuarioEspecial.class)){
            int emprestimo=cliente.getEmprestimoLivro();
            emprestimo++;
            cliente.setEmprestimoLivro(emprestimo);
            System.out.println("Emprestimo realizado com Sucesso!");
        }
    }
    }

    public void DevolverLivro (Publicacoes publicacoes,Pessoa cliente,String dataRetornoPublicacao){
        if(Pessoa.class.getClass().equals(UsuarioComum.class)&&cliente.getEmprestimoLivro()>0){
            this.dataRetornoPublicacao=dataRetornoPublicacao;
            int emprestimo=cliente.getEmprestimoLivro();
            emprestimo--;
            cliente.setEmprestimoLivro(emprestimo);
            System.out.println("Devolução realizada com Sucesso!");

            double valorMulta=0;
            this.valorMulta=valorMulta;

            System.out.println("O valor da multa é "+valorMulta);
        }else{
            if(Pessoa.class.getClass().equals(UsuarioEspecial.class)&&cliente.getEmprestimoLivro()>0){
                int emprestimo=cliente.getEmprestimoLivro();
                emprestimo--;
                cliente.setEmprestimoLivro(emprestimo);
                System.out.println("Devolução realizado com Sucesso!");
                double valorMulta=0;
                this.valorMulta=valorMulta;
                System.out.println("O valor da multa é "+valorMulta);
            }
        }
    }


    public void RenovarEmprestimo(Pessoa cliente,Publicacoes publicacoes){
        if(Pessoa.class.getClass().equals(UsuarioComum.class)){
            if(cliente.getRenovacaoLivro()<=3){
                System.out.println("Renovação Gratuita!");
            }else{
                System.out.println("A renovação sera cobrada");
            }
        }else{
            if(Pessoa.class.getClass().equals(UsuarioEspecial.class)){
                if(cliente.getRenovacaoLivro()<=5){
                    System.out.println("Renovação Gratuita!");
                }else{
                    System.out.println("A renovação sera cobrada");
                }
            }
        }
    }
}
