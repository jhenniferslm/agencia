package br.com.qintess.apirest.agencia.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.qintess.apirest.agencia.dto.PassagemDto;
import br.com.qintess.apirest.agencia.entity.Agencia;
import br.com.qintess.apirest.agencia.entity.Passagem;

public interface PassagemRepository extends CrudRepository<Passagem,Integer> {
	//Iterable<Passagem> findByAgencia(Agencia agencia);
	
	Passagem getOne(Integer id);
	void save(PassagemDto agencia);
	void flush();

}
