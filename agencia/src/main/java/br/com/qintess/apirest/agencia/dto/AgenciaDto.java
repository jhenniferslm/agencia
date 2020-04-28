package br.com.qintess.apirest.agencia.dto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AgenciaDto {
	
	
	private int id;
	private String nome;
	private String local;
	private LocalDateTime data;

}
