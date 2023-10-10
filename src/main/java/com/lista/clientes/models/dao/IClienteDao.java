package com.lista.clientes.models.dao;




import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lista.clientes.models.entity.Cliente;
import com.lista.clientes.models.entity.Region;

@Repository
public interface IClienteDao extends JpaRepository<Cliente, Long>{


    Page<Cliente> findAll(Pageable pageable);
    

    
    @Query("from Region")
    public List<Region> findAllRegiones();



	
	
}
