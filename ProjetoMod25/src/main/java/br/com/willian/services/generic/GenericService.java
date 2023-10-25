/**
 * 
 */
package br.com.willian.services.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.willian.dao.Persistente;
import br.com.willian.dao.generic.IGenericDAO;
import br.com.willian.exceptions.TipoChaveNaoEncontradaException;


public abstract class GenericService<T extends Persistente, E extends Serializable> 
	implements IGenericService<T, E> {

	protected IGenericDAO<T, E> dao;

	public GenericService(IGenericDAO<T, E> dao) {
		this.dao = dao;
	}

	@Override
	public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException {
		return this.dao.cadastrar(entity);
	}

	@Override
	public Collection<T> buscarTodos() {
		return this.dao.buscarTodos();
	}

	@Override
	public T consultar(E valor) {
		return this.dao.consultar(valor);
	}

	@Override
	public void excluir(E valor) {
		this.dao.excluir(valor);
	}

	@Override
	public void alterar(T entity) throws TipoChaveNaoEncontradaException {
		this.dao.alterar(entity);
	}

}

