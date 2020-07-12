public abstract class Pessoa {

    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private int emprestimoLivro;

    public Pessoa(String nome, String telefone, String email, String cpf,int emprestimoLivro) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.emprestimoLivro = emprestimoLivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getEmprestimoLivro() {
        return emprestimoLivro;
    }

    public void setEmprestimoLivro(int emprestimoLivro) {
        this.emprestimoLivro = emprestimoLivro;
    }
}
