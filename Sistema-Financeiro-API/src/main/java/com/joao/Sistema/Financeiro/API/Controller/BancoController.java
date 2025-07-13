package com.joao.Sistema.Financeiro.API.Controller;

import com.joao.Sistema.Financeiro.API.Model.Bank;
import com.joao.Sistema.Financeiro.API.Service.BankService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * BancoController - Controladora de rotas referente a entidade Banco
 *
 * <p>Classe criada em 7/13/2025 por joaodias.
 *
 * <p>Essa classe faz parte do projeto Sistema-Financeiro-API.
 *
 * @author joaodias
 * @version 1.0
 * @since 7/13/2025
 */
@RestController
@RequestMapping("/api/bank")
public class BancoController{

	private final BankService bancoService;

	public BancoController(BankService bancoService){
		this.bancoService = bancoService;
	}

	@GetMapping("/findAll")
	public List<Bank> findAllBank(){
		return bancoService.findAll();
	}

	@PostMapping("/save")
	public void saveBank(@RequestBody Bank bank){
		bancoService.saveBank(bank);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteBank(@PathVariable Long id){
		bancoService.deleteBank(id);
	}
}