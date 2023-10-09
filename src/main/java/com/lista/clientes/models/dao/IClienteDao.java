package com.lista.clientes.models.dao;




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.lista.clientes.models.entity.Cliente;

@Repository
public interface IClienteDao extends JpaRepository<Cliente, Long>{


    Page<Cliente> findAll(Pageable pageable);


	
	
}
