package Classes;

public class Cliente {

    private String nome;
    private int nif;
    private String profissao;
    private int idade;
    private String data_de_nascimento;
    private String email;
    private String senha;

    public Cliente(String nome, int nif, String profissao, int idade, String data_de_nascimento, String email, String senha) {
        this.nome = nome;
        this.nif = nif;
        this.profissao = profissao;
        this.idade = idade;
        this.data_de_nascimento = data_de_nascimento;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_de_nascimento(String data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", nif=" + nif + ", profissao=" + profissao + ", idade=" + idade + ", data_de_nascimento=" + data_de_nascimento + ", email=" + email + ", senha=" + senha + '}';
    }

    public static class Operacoes {
        Conta contaOperacao;
        Float montante;



    }
}

