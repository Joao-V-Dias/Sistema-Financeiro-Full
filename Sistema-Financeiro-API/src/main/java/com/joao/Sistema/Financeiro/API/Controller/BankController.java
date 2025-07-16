package com.joao.Sistema.Financeiro.API.Controller;

import com.joao.Sistema.Financeiro.API.Model.Bank;
import com.joao.Sistema.Financeiro.API.Service.BankService;
import org.springframework.http.ResponseEntity;
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
public class BankController{

	private final BankService bankService;

	public BankController(BankService bancoService){
		this.bankService = bancoService;
	}

	@PostMapping("/save")
	public void save(@RequestBody Bank bank){
		bankService.save(bank);
	}

	@GetMapping("/findAll")
	public List<Bank> findAll(){
		return bankService.findAll();
	}

	@PutMapping("/update/{id}")
	public void update(@PathVariable Long id, @RequestBody Bank bank){
		 bankService.update(id, bank);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id){
		bankService.delete(id);
	}
}