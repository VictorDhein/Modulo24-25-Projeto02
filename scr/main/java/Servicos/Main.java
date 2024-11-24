package Servicos;

public class Main {
    public static void main(String[] args) {
        // Criando a instância do mock
        IContratoDao contratoDao = new ContratoDaoMock();

        // Testando o método buscar
        System.out.println("Buscar ID 1: " + contratoDao.buscar(1));
        System.out.println("Buscar ID 4: " + contratoDao.buscar(4));

        // Testando o método excluir
        System.out.println("Excluir ID 2: " + contratoDao.excluir(2));
        System.out.println("Buscar ID 2 após exclusão: " + contratoDao.buscar(2));

        // Testando o método atualizar
        System.out.println("Atualizar ID 3: " + contratoDao.atualizar(3, "Contrato C Atualizado"));
        System.out.println("Buscar ID 3 após atualização: " + contratoDao.buscar(3));

        // Testando atualização de ID inexistente
        System.out.println("Atualizar ID 5 (não existe): " + contratoDao.atualizar(5, "Contrato Novo"));
    }
}
