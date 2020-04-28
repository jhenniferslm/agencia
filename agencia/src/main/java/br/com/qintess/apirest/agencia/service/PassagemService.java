package br.com.qintess.apirest.agencia.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.qintess.apirest.agencia.dto.PassagemDto;
import br.com.qintess.apirest.agencia.entity.Agencia;
import br.com.qintess.apirest.agencia.entity.Passagem;
import br.com.qintess.apirest.agencia.repository.PassagemRepository;

@Service
public class PassagemService {
	
	@Autowired
	PassagemRepository passagemRepository;

	public List<Passagem> getAllPassagem() {
		List<Passagem> passagens = new ArrayList<Passagem>();
		passagemRepository.findAll().forEach(passagem -> passagens.add(passagem));
		return passagens;
	}

	public Passagem getPassagemById(Integer id) {
		Optional<Passagem> passagem = passagemRepository.findById(id);
		if (passagem.isPresent()) {
			return passagem.get();
		}
		return null;
	}


	public void save(@Valid PassagemDto passagemDto) {
		ModelMapper mapper = new ModelMapper();
		Passagem passagem = mapper.map(passagemDto, Passagem.class);
		passagemRepository.save(passagem);
		
	}

	public Passagem delete(Integer id) {
		passagemRepository.deleteById(id);
		return null;
	}
	

}
