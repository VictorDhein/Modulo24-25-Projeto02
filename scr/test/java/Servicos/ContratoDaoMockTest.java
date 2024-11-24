package Servicos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContratoDaoMockTest {
    private IContratoDao contratoDao;

    @BeforeEach
    void setUp() {
        contratoDao = new ContratoDaoMock();
    }

    @Test
    void testBuscarContratoExistente() {
        assertEquals("Contrato A", contratoDao.buscar(1));
        assertEquals("Contrato B", contratoDao.buscar(2));
        assertEquals("Contrato C", contratoDao.buscar(3));
    }

    @Test
    void testBuscarContratoInexistente() {
        assertEquals("Contrato não encontrado", contratoDao.buscar(99));
    }

    @Test
    void testExcluirContratoExistente() {
        assertTrue(contratoDao.excluir(2));
        assertEquals("Contrato não encontrado", contratoDao.buscar(2));
    }

    @Test
    void testExcluirContratoInexistente() {
        assertFalse(contratoDao.excluir(99));
    }

    @Test
    void testAtualizarContratoExistente() {
        assertTrue(contratoDao.atualizar(3, "Contrato Atualizado"));
        assertEquals("Contrato Atualizado", contratoDao.buscar(3));
    }

    @Test
    void testAtualizarContratoInexistente() {
        assertFalse(contratoDao.atualizar(99, "Contrato Novo"));
        assertEquals("Contrato não encontrado", contratoDao.buscar(99));
    }
}
