package com.org.backendjava.dtos.requests;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CredentialsRequest {
	@NotNull
	@NotEmpty
	@Pattern(regexp = "^[A-Z]*$")
	private String userName;
	@NotNull
	@NotEmpty
    private String password;
}