package com.capas.uca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capas.uca.domain.Importancia;
import com.capas.uca.dto.ContribuyenteDTO;
import com.capas.uca.service.ContribuyenteService;
import com.capas.uca.service.ImportanciaService;

@Controller
@RequestMapping(path = { "", "/" })
public class MainController {

	@Autowired
	ImportanciaService importanciaService;
	@Autowired
	ContribuyenteService contribuyenteService;

	@GetMapping(path = { "" })
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView();
		List<Importancia> imp = importanciaService.getAll();
		System.out.println(imp.size());
		mav.addObject("importancia", imp);
		mav.setViewName("main");
		return mav;
	}

	@PostMapping(path = { "add" })
	public ModelAndView add(@ModelAttribute ContribuyenteDTO conDto) {
		contribuyenteService.insert(conDto.getImportancia(), conDto.getNombre(), conDto.getApellido(), conDto.getNit());
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/");
		return mav;
	}

	@GetMapping(path = { "all" })
	public ModelAndView all() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("contribuyentes", contribuyenteService.getAll());
		return mav;
	}

}
