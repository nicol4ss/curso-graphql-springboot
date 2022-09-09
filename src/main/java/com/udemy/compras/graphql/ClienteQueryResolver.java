package com.udemy.compras.graphql;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.udemy.compras.cliente.Cliente;

@Component
public class ClienteQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private ClienteService clienteService;

	public Cliente cliente(Long id) {
		return clienteService.findById(id);
	}

	public List<Cliente> clientes() {
		return clienteService.findAll();
	}
}
