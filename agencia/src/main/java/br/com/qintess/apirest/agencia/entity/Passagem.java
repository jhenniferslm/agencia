package br.com.qintess.apirest.agencia.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data
public class Passagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id_agencia", nullable = false)
	private String id_agencia;

	@Column(name = "id_passageiro", nullable = false)
	private String id_passageiro;

	@Column(name = "data", nullable = false)
	private LocalDateTime data;

	@ManyToOne
	private Agencia agencia;
	
	public Passagem() {
		
	}
		
		public Passagem(Integer id, String id_agencia, String id_passageiro, LocalDateTime data) {
		this.id_agencia = id_agencia;
		this.id_passageiro = id_passageiro;
		this.data = data;
	}

}
