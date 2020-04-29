package br.com.qintess.apirest.agencia.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class AgenciaDto {

	private int id;

	private String nome;

	private String destino;

	private String data;

	private double valorPassagem;

	// private List<Passagem> passagens;

}
