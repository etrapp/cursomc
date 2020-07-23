package com.trapp.cursomc.services;

import java.util.Optional;

//import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trapp.cursomc.domain.Categoria;
import com.trapp.cursomc.exceptions.ObjectNotFoundException;
import com.trapp.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> categoria = repo.findById(id);
		//return categoria.orElse(null);
		return categoria.orElseThrow(()->new ObjectNotFoundException("Objeto não encontrado! Id:" + id + " Tipo:" + Categoria.class.getName()));
	}
	

}