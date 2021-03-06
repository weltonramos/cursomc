package com.weltonramos.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weltonramos.cursomc.domain.Cliente;
import com.weltonramos.cursomc.exceptions.ObjectNotFoundException;
import com.weltonramos.cursomc.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> cliente= clienteRepository.findById(id);
		return cliente.orElseThrow(() -> new ObjectNotFoundException("Id não encontrado" + Cliente.class.getName()));
	}
}
