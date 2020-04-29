package br.com.qintess.apirest.agencia.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Agencia implements Serializable {

	private static final long SerialVersiounUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "SQ_Agencia", allocationSize = 1)
	@Column(name = "ID", unique = true, nullable = false)
	private int id;

	@Column(name = "NOME", nullable = false)
	private String nome;

	@Column(name = "DESTINO", nullable = false)
	private String destino;

	@Column(name = "DATA", nullable = false)
	private LocalDateTime data;

	@OneToMany
	private List<Passagem> passagens;

	public Agencia() {
	}

	public Agencia(Integer id, String nome, String destino, LocalDateTime data) {
		this.id = id;
		this.nome = nome;
		this.destino = destino;
		this.data = data;

	}

}
