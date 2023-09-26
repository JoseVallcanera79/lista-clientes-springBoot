package com.lista.clientes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lista.clientes.models.entity.Cliente;
import com.lista.clientes.models.services.IClienteService;

@RestController
@RequestMapping("/api")
public class ClienteResController {
	
	
	@Autowired
	private IClienteService clienteService;
	
	
	
	@GetMapping("/clientes")
	public List<Cliente> index(){
		return clienteService.findAll();
	}

}
