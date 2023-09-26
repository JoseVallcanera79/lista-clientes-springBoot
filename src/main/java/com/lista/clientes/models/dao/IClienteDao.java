package com.lista.clientes.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lista.clientes.models.entity.Cliente;

@Repository
public interface IClienteDao extends CrudRepository<Cliente, Long>{

	
	
}
