package com.org.backendjava.exceptions;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExceptionDetails {
	@JsonFormat(pattern = "yyyy-MM-dd HH:ss")
	private LocalDateTime localDateTime;
	private Integer status;
	private String message;
	private String path;
}