package com.capas.uca.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capas.uca.domain.Contribuyente;
import com.capas.uca.repositories.ContribuyenteRepository;

@Service
public class ContribuyenteServiceImpl implements ContribuyenteService {

	@Autowired
	EntityManager entityManager;

	@Autowired
	ContribuyenteRepository contribuyente;

	@Override
	public List<Contribuyente> getAll() {
		return contribuyente.findAll();
	}

	@Transactional
	@Override
	public void insert(Integer importancia, String nombre, String apellido, String nit) {
		entityManager.createNativeQuery(
				"INSERT INTO public.contribuyente(c_importancia, s_nombre, s_apellido, s_nit) VALUES(?, ?, ?, ?)")
				.setParameter(1, importancia).setParameter(2, nombre).setParameter(3, apellido).setParameter(4, nit)
				.executeUpdate();
	}

}
