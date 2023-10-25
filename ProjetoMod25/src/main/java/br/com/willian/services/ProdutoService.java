/**
 * 
 */
package br.com.willian.services;

import br.com.willian.dao.IProdutoDAO;
import br.com.willian.domain.Produto;
import br.com.willian.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
