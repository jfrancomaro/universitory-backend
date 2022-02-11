package com.universitory.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

	private Integer id;
	
	@NotBlank(message="Campo usuario es requerido")
	@Size(min=4,max=20,message="Cantidad de digitos requeridos 4 - 20")
	private String username;
	
	@Size(min=7,max=20,message="Cantidad de digitos requeridos 7 - 20")
	@NotBlank(message="Campo contraseña es requerido")
	private String pass;

	private TypeUserDTO typeUser;
}

