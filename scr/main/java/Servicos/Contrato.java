package Servicos;

public class Contrato {
    private String descricao;

    public Contrato(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Contrato{" +
               "descricao='" + descricao + '\'' +
               '}';
    }
}
