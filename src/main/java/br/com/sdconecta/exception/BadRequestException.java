package br.com.sdconecta.exception;

import br.com.sdconecta.config.BusinessException;

public class BadRequestException extends BusinessException {

	private static final long serialVersionUID = 1L;

	public BadRequestException(String mensagem) {
		super(mensagem);
	}

}
