package br.com.sdconecta.config;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Builder;
import lombok.Getter;

@JsonInclude(value = Include.NON_NULL)
@Getter
@Builder
public class Problem {

	private Integer status;
	private OffsetDateTime timestamp;
	private String title;
	private String detail;
	private String userMessage;

	@Getter
	@Builder
	public static class Object {

		private String name;
		private String userMessage;
	}
}
