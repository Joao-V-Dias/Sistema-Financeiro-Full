package com.joao.Sistema.Financeiro.API.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Banco -
 *
 * <p>Classe criada em 7/13/2025 por joaodias.
 *
 * <p>Essa classe faz parte do projeto Sistema-Financeiro-API.
 *
 * @author joaodias
 * @version 1.1
 * @since 7/13/2025
 */
@Getter
@Setter
@Entity
@Table(name = "bank")
public class Bank{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "agency")
	private String agency;

	@Column(name = "account")
	private String account;

	@Column(name = "balance")
	private BigDecimal balance;
}