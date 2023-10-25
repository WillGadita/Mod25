/**
 * 
 */
package br.com.willian.dao;

import br.com.willian.dao.generic.GenericDAO;
import br.com.willian.domain.Cliente;


public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super();
	}

	@Override
	public Class<Cliente> getTipoClasse() {
		return Cliente.class;
	}

	@Override
	public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
		entityCadastrado.setNome(entity.getNome());
		entityCadastrado.setCpf(entity.getCpf());
		entityCadastrado.setEnd(entity.getEnd());
		entityCadastrado.setTel(entity.getTel());
		entityCadastrado.setNumero(entity.getNumero());
		entityCadastrado.setCidade(entity.getCidade());
		entityCadastrado.setEstado(entity.getEstado());

	}





}
