package Servicos;

import java.util.HashMap;
import java.util.Map;

public class ContratoDaoMock implements IContratoDao {
    private Map<Integer, String> contratos;

    public ContratoDaoMock() {
        contratos = new HashMap<>();
        contratos.put(1, "Contrato A");
        contratos.put(2, "Contrato B");
        contratos.put(3, "Contrato C");
    }

    @Override
    public String buscar(int id) {
        return contratos.getOrDefault(id, "Contrato não encontrado");
    }

    @Override
    public boolean excluir(int id) {
        if (contratos.containsKey(id)) {
            contratos.remove(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean atualizar(int id, String novoContrato) {
        if (contratos.containsKey(id)) {
            contratos.put(id, novoContrato);
            return true;
        }
        return false;
    }

    @Override
    public boolean salvar(int id, String contrato) { // Implementação do método salvar
        if (contratos.containsKey(id)) {
            return false;
        }
        contratos.put(id, contrato);
        return true;
    }
}
