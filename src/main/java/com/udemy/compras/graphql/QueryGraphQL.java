package com.udemy.compras.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.udemy.compras.cliente.ClienteRepository;

@Component
public class QueryGraphQL implements GraphQLQueryResolver {

	@Autowired
	private ClienteRepository clienteRep;
	public String hello() {
		return "Hello GraphQL";
	}

	public int soma(int a, int b) {
		return a + b;
	}
}
