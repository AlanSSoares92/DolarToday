package br.com.cotacaododolar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotacaododolar.dto.ObjetoDolarAPIDTO;
import br.com.cotacaododolar.service.CotacaoService;

@RestController
@RequestMapping("/dolar")
public class CotacaoController {
	
	@Autowired
	private CotacaoService service;
	
	@GetMapping("today")
	public List<ObjetoDolarAPIDTO> findAll(){
		return service.findAll();
	}

}
