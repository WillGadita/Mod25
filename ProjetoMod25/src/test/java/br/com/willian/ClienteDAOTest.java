/**
 * 
 */
package br.com.willian;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.willian.dao.ClienteDAO;
import br.com.willian.dao.IClienteDAO;
import br.com.willian.domain.Cliente;
import br.com.willian.exceptions.TipoChaveNaoEncontradaException;


public class ClienteDAOTest {
	
	private IClienteDAO clienteDao;

	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDao = new ClienteDAO();
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		cliente = new Cliente();
		cliente.setNome("Willian Reis");
		cliente.setCpf(761784320486L);
		cliente.setEnd("Rua Sebastião Demétrio");
		cliente.setTel(6516461646L);
		cliente.setNumero(287);
		cliente.setCidade("Colatina");
		cliente.setEstado("ES");
		clienteDao.cadastrar(cliente);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setCpf(761784320486L);
		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}

	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Willian Reis");
		clienteDao.alterar(cliente);
		Assert.assertEquals("Willian Reis", cliente.getNome());
	}

	@Test
	public void buscarTodos() {
		Collection<Cliente> list = clienteDao.buscarTodos();
		assertTrue(list != null);
		assertTrue(list.size() == 2);
	}

	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}
	

	

}
