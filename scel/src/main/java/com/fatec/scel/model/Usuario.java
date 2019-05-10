package com.fatec.scel.model;

import java.util.Set;
import java.util.UUID;
import javax.persistence.*;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Usuario")
public class Usuario {
	@Id
	private UUID id;
	private String email;
	private String password;
	@ElementCollection(fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	@NotNull
	private Set<PapelDoUsuario> papel;

	protected Usuario() {
	}

	public Usuario(UUID id, String email, String password, Set<PapelDoUsuario> papel) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.papel = papel;
	}

	public UUID getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Set<PapelDoUsuario> getPapel() {
		return papel;
	}

	public String toString() {
		return getEmail();
	}
}