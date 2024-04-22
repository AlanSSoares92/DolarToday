package br.com.cotacaododolar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.cotacaododolar.dto.ObjetoDolarAPIDTO;
import br.com.cotacaododolar.dto.UsdbrlDTO;

@Component
public class CotacaoService {
	

	List<ObjetoDolarAPIDTO> listaDolar = new ArrayList<>();
	
	public List<ObjetoDolarAPIDTO> findAll() {
		ObjetoDolarAPIDTO dto = new ObjetoDolarAPIDTO();
		dto.setUsdbrlDTO(new UsdbrlDTO());
		dto.getUsdbrlDTO().getAsk();
		dto.getUsdbrlDTO().getBid();
		dto.getUsdbrlDTO().getCode();
		dto.getUsdbrlDTO().getCodein();
		dto.getUsdbrlDTO().getCreate_date();
		dto.getUsdbrlDTO().getHigh();
		dto.getUsdbrlDTO().getLow();
		dto.getUsdbrlDTO().getName();
		dto.getUsdbrlDTO().getPctChange();
		dto.getUsdbrlDTO().getTimestamp();
		dto.getUsdbrlDTO().getVarBid();
		listaDolar.add(dto);
		
		return listaDolar;
		
	}
	
}
