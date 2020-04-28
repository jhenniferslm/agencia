package br.com.qintess.apirest.agencia.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.qintess.apirest.agencia.dto.AgenciaDto;
import br.com.qintess.apirest.agencia.entity.Agencia;

public interface AgenciaRepository extends CrudRepository<Agencia, Integer> {
	Agencia getOne(Integer id);
	void save(AgenciaDto agencia);
	void flush();
	
}
