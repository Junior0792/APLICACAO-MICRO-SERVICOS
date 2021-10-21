package br.infnet.edu.aplicacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import br.infnet.edu.aplicacao.model.Comida;
import br.infnet.edu.aplicacao.repository.ComidaRepository;

@RestController
public class ComidaController {
	
	@Autowired
	private ComidaRepository comidaRepository;
	
	@RequestMapping(value = {"/comida/all",""}, method = RequestMethod.GET)
	public List<Comida> findAll(){
		
		comidaRepository.save("Arepa");
		comidaRepository.save("Sushi");
		comidaRepository.save("Pizza");
		
		return comidaRepository.findAll();
	}
}
