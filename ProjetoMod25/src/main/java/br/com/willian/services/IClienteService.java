/**
 * 
 */
package br.com.willian.services;

import br.com.willian.domain.Cliente;
import br.com.willian.exceptions.TipoChaveNaoEncontradaException;


public interface IClienteService {

	Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	void excluir(Long cpf);





}
