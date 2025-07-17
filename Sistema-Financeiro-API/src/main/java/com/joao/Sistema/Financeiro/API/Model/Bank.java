package com.joao.Sistema.Financeiro.API.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
	private Integer balance;

	public void setBalance(double balance){
		this.balance = (int) balance * 100;
	}

	public double getBalance(){
		return (double) balance / 100;
	}
}