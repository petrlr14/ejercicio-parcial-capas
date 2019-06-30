package com.capas.uca.service;

import java.util.List;

import com.capas.uca.domain.Contribuyente;

public interface ContribuyenteService {

	List<Contribuyente> getAll();

	void insert(Integer importancia, String nombre, String apellido, String nit);

}
