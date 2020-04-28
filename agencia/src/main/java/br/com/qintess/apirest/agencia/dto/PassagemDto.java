package br.com.qintess.apirest.agencia.dto;

import java.time.LocalDateTime;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PassagemDto {
	
	
	private String id_agencia;
	

	private String id_passageiro;
	

	private LocalDateTime data;

}
