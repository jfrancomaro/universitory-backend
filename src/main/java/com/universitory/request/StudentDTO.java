package com.universitory.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentDTO {

	private Integer id;
	
	@NotBlank(message = "Nombres son requeridos")
	private String names;
	
	@NotBlank(message = "Apellido Paterno son requeridos")
	private String lastName;
	
	@NotBlank(message = "Apellido Materno son requeridos")
	private String secondLastName;
	
	@NotBlank(message = "Correo electronico es requeridos")
	@Email(message="Correo ingresado no es correcto")
	private String email;

	@Valid
	@NotNull(message="Datos de usuario es requerido")
	private UserDTO user;
}
