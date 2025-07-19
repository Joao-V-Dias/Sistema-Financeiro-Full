package com.joao.Sistema.Financeiro.API.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * PaymentTitle -
 *
 * <p>Classe criada em 7/16/2025 por joaodias.
 *
 * <p>Essa classe faz parte do projeto Sistema-Financeiro-API.
 *
 * @author joaodias
 * @version 1.0
 * @since 7/16/2025
 */
@Getter
@Setter
@Entity
@Table(name = "paymentTitle")
public class PaymentTitle{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@Column(name = "idDocument")
	private Document document;

	@Column(name = "amount")
	private BigDecimal amount;

	@Column(name = "dueDate")
	private LocalDate dueDate;
}