package br.com.qintess.apirest.agencia.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.NotBlank;

import br.com.qintess.apirest.agencia.entity.Passagem;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AgenciaDto {
	
	
	private int id;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String local;
	
	@NotBlank
	private LocalDateTime data;
	
	@NotBlank
	private List<Passagem> passagens;
	

}
