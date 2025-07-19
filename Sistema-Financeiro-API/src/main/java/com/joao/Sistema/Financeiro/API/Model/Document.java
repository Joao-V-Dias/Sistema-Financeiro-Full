package com.joao.Sistema.Financeiro.API.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * Document -
 *
 * <p>Classe criada em 7/17/2025 por joaodias.
 *
 * <p>Essa classe faz parte do projeto Sistema-Financeiro-API.
 *
 * @author joaodias
 * @version 1.0
 * @since 7/17/2025
 */
@Getter
@Setter
@Entity
@Table(name = "document")
public class Document{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "number")
	private String number;

	@Column(name = "sum")
	private BigDecimal sum;


	private Partner creditor;
	private Partner debtor;
	private List<PaymentTitle> payments;
}