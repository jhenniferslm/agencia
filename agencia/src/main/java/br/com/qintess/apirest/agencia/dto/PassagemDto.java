package br.com.qintess.apirest.agencia.dto;

import br.com.qintess.apirest.agencia.entity.Agencia;
import lombok.Data;


@Data
public class PassagemDto {

	private String id_agencia;

	private String id_passageiro;

	private String data;
	
	private Agencia agencia;

}
