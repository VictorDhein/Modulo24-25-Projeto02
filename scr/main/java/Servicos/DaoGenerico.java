package Servicos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DaoGenerico<T, K> implements IDao<T, K> {
    private Map<K, T> repositorio;

    public DaoGenerico() {
        this.repositorio = new HashMap<>();
    }

    @Override
    public T buscar(K id) {
        return repositorio.get(id);
    }

    @Override
    public boolean excluir(K id) {
        return repositorio.remove(id) != null;
    }

    @Override
    public boolean atualizar(K id, T entidade) {
        if (repositorio.containsKey(id)) {
            repositorio.put(id, entidade);
            return true;
        }
        return false;
    }

    @Override
    public List<T> listar() {
        return repositorio.values().stream().collect(Collectors.toList());
    }

    @Override
    public boolean salvar(K id, T entidade) {
        if (repositorio.containsKey(id)) {
            return false;
        }
        repositorio.put(id, entidade);
        return true;
    }
}
