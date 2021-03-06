package com.diogorolins.battleShip.model.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.diogorolins.battleShip.model.Player;

public class PlayerDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	@NotEmpty
	@Length(min=5, max=80, message = "O nome deve ter entre 5 e 80 caracteres.")
	private String name;
	
	@NotEmpty
	@Email(message = "Email inválido")
	private String email;
	private String password;

	public PlayerDTO() {
		
	}
	
	public PlayerDTO(Player player) {
		this.name = player.getName();
		this.email = player.getEmail();
		this.password = player.getPassword();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}


