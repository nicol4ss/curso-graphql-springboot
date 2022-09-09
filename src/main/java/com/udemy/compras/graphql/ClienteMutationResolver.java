package com.udemy.compras.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.udemy.compras.cliente.Cliente;

@Component
public class ClienteMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private ClienteService clienteService;

	public Cliente saveCliente(Long id, String nome, String email) {
		Cliente c = new Cliente();
		c.setId(id);
		c.setNome(nome);
		c.setEmail(email);
		return clienteService.save(c);
	}

	public Boolean deleteCliente(Long id) {
		return clienteService.deleteById(id);
	}
}
