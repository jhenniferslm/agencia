package br.com.qintess.apirest.agencia.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.qintess.apirest.agencia.dto.AgenciaDto;
import br.com.qintess.apirest.agencia.entity.Agencia;
import br.com.qintess.apirest.agencia.repository.AgenciaRepository;

@Service
public class AgenciaService {

	@Autowired
	AgenciaRepository agenciaRepository;

	public List<Agencia> getAllAgencias() {
		List<Agencia> listas = new ArrayList<Agencia>();
		agenciaRepository.findAll().forEach(agencia -> listas.add(agencia));
		return listas;
	}

	public Agencia getAgenciaById(Integer id) {
		Optional<Agencia> agencia = agenciaRepository.findById(id);
		if (agencia.isPresent()) {
			return agencia.get();
		}
		return null;
	}

	public void save(AgenciaDto agenciaDto) {
		ModelMapper mapper = new ModelMapper();
		Agencia agencia = mapper.map(agenciaDto, Agencia.class);
		agenciaRepository.save(agencia);

	}

	public Agencia delete(Integer id) {
		agenciaRepository.deleteById(id);
		return null;
	}

}
