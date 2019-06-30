package com.capas.uca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capas.uca.domain.Importancia;
import com.capas.uca.repositories.ImportanciaRepository;

@Service
public class ImportanciaServiceImpl implements ImportanciaService {

	@Autowired
	ImportanciaRepository importancia;

	@Override
	public List<Importancia> getAll() {
		return importancia.findAll();
	}

}
