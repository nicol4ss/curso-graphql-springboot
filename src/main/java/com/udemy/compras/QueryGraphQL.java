package com.udemy.compras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class QueryGraphQL implements GraphQLQueryResolver {

	public String hello() {
		return "Hello GraphQL";
	}

	public int soma(int a, int b) {
		return a + b;
	}

	public Cliente cliente() {
		return new Cliente("Nicolas", "nicolaselias@pm.me");
	}

	public List<Cliente> clientes() {
		List<Cliente> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(new Cliente("Cliente" + i, "emaildocliente"+i+"@teste.com"));
		}
		return list;
	}
}
