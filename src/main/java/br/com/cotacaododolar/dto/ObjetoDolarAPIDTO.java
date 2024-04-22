package br.com.cotacaododolar.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ObjetoDolarAPIDTO {
	
	//https://docs.awesomeapi.com.br/api-de-moedas
	
	@JsonProperty("USDBRL")
	private UsdbrlDTO usdbrlDTO;

	public UsdbrlDTO getUsdbrlDTO() {
		return usdbrlDTO;
	}

	public void setUsdbrlDTO(UsdbrlDTO usdbrlDTO) {
		this.usdbrlDTO = usdbrlDTO;
	}
	
	

}
