package Servicos;

public interface IContratoDao {
    String buscar(int id);
    boolean excluir(int id);
    boolean atualizar(int id, String novoContrato);
    boolean salvar(int id, String contrato); 
}
