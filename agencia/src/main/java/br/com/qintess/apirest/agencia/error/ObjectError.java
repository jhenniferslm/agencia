package br.com.qintess.apirest.agencia.error;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ObjectError {
	
	private final String message;
	private final String  field;
	private final Object parameter;

}
