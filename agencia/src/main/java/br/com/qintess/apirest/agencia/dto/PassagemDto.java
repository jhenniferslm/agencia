package br.com.qintess.apirest.agencia.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class PassagemDto {

	private String id_agencia;

	private String id_passageiro;

	private String data;

}
