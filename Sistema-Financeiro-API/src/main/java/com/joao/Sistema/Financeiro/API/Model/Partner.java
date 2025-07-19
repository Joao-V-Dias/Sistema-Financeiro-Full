package com.joao.Sistema.Financeiro.API.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Parceiro -
 *
 * <p>Classe criada em 7/13/2025 por joaodias.
 *
 * <p>Essa classe faz parte do projeto Sistema-Financeiro-API.
 *
 * @author joaodias
 * @version 1.0
 * @since 7/13/2025
 */

@Getter
@Setter
@Entity
@Table(name = "partner")
public class Partner{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "document")
	private String document;

	@Column(name = "phone")
	private String phone;

	@Column(name = "email")
	private String email;

	@Column(name = "dateBirth") @JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateBirth;
}