package br.com.qintess.apirest.agencia.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.qintess.apirest.agencia.dto.PassagemDto;
import br.com.qintess.apirest.agencia.entity.Agencia;
import br.com.qintess.apirest.agencia.entity.Passagem;
import br.com.qintess.apirest.agencia.service.PassagemService;

@RestController
@RequestMapping("/api/passagem")
public class PassagemController {
	

	@Autowired
	PassagemService passagemService;
	
	@GetMapping
	public ResponseEntity<?> AllPassagem() {
		List<Passagem> passagens = passagemService.getAllPassagem();
		return ResponseEntity.ok().body(passagens);
	}

	@GetMapping("/{id/passagem}")
	public ResponseEntity<?> getPassagemById(@PathVariable("id") Integer id) {
		Passagem passagem = passagemService.getPassagemById(id);
		return new ResponseEntity<>(passagem,HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Passagem> savePassagem(@Valid @RequestBody PassagemDto passagemDto) {
		passagemService.save(passagemDto);
		return new ResponseEntity<>(HttpStatus.CREATED);

	}

	@DeleteMapping("/{id}")
	private ResponseEntity<Passagem> deletePassagem(@PathVariable("id") Integer id) {
		Passagem passagem = passagemService.delete(id);
		return new ResponseEntity<>(passagem, HttpStatus.OK);
	}
}
