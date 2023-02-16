package br.com.sdconecta.exception;

import br.com.sdconecta.config.BusinessException;

public class InternalServerException extends BusinessException {
	
	private static final long serialVersionUID = 1L;

	public InternalServerException(String mensagem) {
		super(mensagem);
	}
}
