package br.com.qintess.apirest.agencia.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;

import br.com.qintess.apirest.agencia.entity.Passagem;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class AgenciaDto {

	private int id;

	@NotBlank(message = "{nome.not.blank}")
	private String nome;

	@NotBlank(message = "{destino.not.blank}")
	private String destino;

	@NotBlank(message = "{data.not.blank}")
	private String data;

	private double valorPassagem;

	private List<Passagem> passagens;

}
