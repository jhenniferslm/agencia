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

import br.com.qintess.apirest.agencia.dto.AgenciaDto;
import br.com.qintess.apirest.agencia.dto.PassagemDto;
import br.com.qintess.apirest.agencia.entity.Agencia;
import br.com.qintess.apirest.agencia.entity.Passagem;
import br.com.qintess.apirest.agencia.service.AgenciaService;

@RestController
@RequestMapping("/api/agencia")
public class AgenciaController {
	
	@Autowired
	AgenciaService agenciaService;
	
	@GetMapping
	public ResponseEntity<?> AllAgencias() {
		List<Agencia> listas = agenciaService.getAllAgencias();
		return ResponseEntity.ok().body(listas);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getAgenciaById(@PathVariable("id") Integer id) {
		Agencia agencia = agenciaService.getAgenciaById(id);
		return new ResponseEntity<>(agencia,HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Agencia> saveAgencia(@Valid @RequestBody AgenciaDto agenciaDto) {
		agenciaService.save(agenciaDto);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	private ResponseEntity<Agencia> deleteAgencia(@PathVariable("id") Integer id) {
		Agencia agencia = agenciaService.delete(id);
		return new ResponseEntity<>(agencia, HttpStatus.OK);
	
	}
}



