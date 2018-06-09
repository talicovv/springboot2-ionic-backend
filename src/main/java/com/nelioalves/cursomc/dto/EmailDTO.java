package com.nelioalves.cursomc.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class EmailDTO implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message="You can't insert or update with empty!")
	@Email(message="It isn't e-mail valid!")
	private String email;	
	
	public EmailDTO() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
