/**
 * 
 */
package br.com.willian.dao;

import br.com.willian.dao.generic.IGenericDAO;
import br.com.willian.domain.Venda;
import br.com.willian.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
