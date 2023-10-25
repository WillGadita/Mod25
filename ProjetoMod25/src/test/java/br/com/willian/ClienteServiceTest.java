/**
 * 
 */
package br.com.willian;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.willian.dao.ClienteDaoMock;
import br.com.willian.dao.IClienteDAO;
import br.com.willian.domain.Cliente;
import br.com.willian.exceptions.TipoChaveNaoEncontradaException;
import br.com.willian.services.ClienteService;
import br.com.willian.services.IClienteService;


public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setNome("Willian Reis");
		cliente.setCpf(761784320486L);
		cliente.setEnd("Rua Sebastião Demétrio");
		cliente.setTel(6516461646L);
		cliente.setNumero(287);
		cliente.setCidade("Colatina");
		cliente.setEstado("ES");
		
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Willian Reis");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Willian Reis", cliente.getNome());
	}
}
