package Servicos;

import java.util.List;

public interface IDao<T, K> {
    T buscar(K id);
    boolean excluir(K id);
    boolean atualizar(K id, T entidade);
    List<T> listar();
    boolean salvar(K id, T entidade);
}
