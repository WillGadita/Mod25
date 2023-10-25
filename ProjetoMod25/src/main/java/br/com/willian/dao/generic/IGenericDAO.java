package br.com.willian.dao.generic;

import br.com.willian.dao.Persistente;
import br.com.willian.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;


public interface IGenericDAO <T extends Persistente, E extends Serializable> {

    // Este Método é utilizado para cadastrar novos registros no Banco de Dados.

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    // Este Método é utilizado para excluir os dados do Banco de Dados.
    public void excluir(E valor);

   // Este Método é utilizado para alterar os dados no Banco de Dados.

    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

    // Método utilizado para realizar consuta no Banco de Dados.

    public T consultar(E valor);

   // Método utilizado para realizar busca de qualquer Dado realizado no sistema no Banco de Dados.

    public Collection<T> buscarTodos();
}
