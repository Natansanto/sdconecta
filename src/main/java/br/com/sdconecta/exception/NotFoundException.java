package br.com.sdconecta.exception;

import br.com.sdconecta.config.BusinessException;

public class NotFoundException extends BusinessException {

	private static final long serialVersionUID = 1L;

	public NotFoundException(String mensagem) {
		super(mensagem);
	}

}
