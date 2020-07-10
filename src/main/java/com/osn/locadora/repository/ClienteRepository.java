package com.osn.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.osn.locadora.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	//biuscando pelo campo email
	@Transactional(readOnly = true)
	Cliente findByEmail(String email);

}
