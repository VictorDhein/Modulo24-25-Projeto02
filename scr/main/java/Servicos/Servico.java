package Servicos;

public class Servico {
    private String nome;

    public Servico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Servico{" +
               "nome='" + nome + '\'' +
               '}';
    }
}
