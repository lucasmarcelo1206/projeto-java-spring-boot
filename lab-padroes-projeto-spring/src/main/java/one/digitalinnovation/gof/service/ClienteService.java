package one.digitalinnovation.gof.service;
import one.digitalinnovation.gof.model.Cliente;


public interface ClienteService {

    Iterable <Cliente> buscarTodos();
    Cliente buscarPorId (long id);
    void inserir (Cliente cliente);
    void deletar (long id);
    void atualizar(Long id, Cliente cliente);


    
}
