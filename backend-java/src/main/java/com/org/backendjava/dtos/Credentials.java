package com.org.backendjava.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Credentials {
	@NotNull
	@NotEmpty
	@Pattern(regexp = "^[A-Z]+$")
	private String userName;
	@NotNull
	@NotEmpty
    private String password;
}