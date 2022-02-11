package com.universitory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50, nullable = false, name = "username")
	private String username;
	
	@Column(length = 50, nullable = false, name = "pass")
	private String pass;
	
	@ManyToOne
	@JoinColumn(name = "id_type_user", nullable = false, foreignKey = @ForeignKey(name = "FK_user_type_user"))
	private com.universitory.model.TypeUser typeUser;
}
