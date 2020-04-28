package br.com.qintess.apirest.agencia.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class Passagem {

	@Id
	@Column(name = "id_agencia", nullable = false)
	private String id_agencia;
	
	@Column(name = "id_passageiro", nullable = false)
	private String id_passageiro;
	
	@Column(name = "data", nullable = false)
	private LocalDateTime data;

	/*@ManyToOne
	private Agencia agencia;*/

	public void getAgencia() {
		
	}

	public String getId_agencia() {
		return id_agencia;
	}

	public void setId_agencia(String id_agencia) {
		this.id_agencia = id_agencia;
	}

	public String getId_passageiro() {
		return id_passageiro;
	}

	public void setId_passageiro(String id_passageiro) {
		this.id_passageiro = id_passageiro;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}


}
