package com.lista.clientes.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lista.clientes.models.dao.IClienteDao;
import com.lista.clientes.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{

	
	@Autowired
	private IClienteDao clienteDao;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	
	
}
