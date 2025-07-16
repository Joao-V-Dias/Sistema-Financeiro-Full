package com.joao.Sistema.Financeiro.API.Service;

import com.joao.Sistema.Financeiro.API.Model.Bank;
import com.joao.Sistema.Financeiro.API.Repository.BankRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * BancoService -
 *
 * <p>Classe criada em 7/13/2025 por joaodias.
 *
 * <p>Essa classe faz parte do projeto Sistema-Financeiro-API.
 *
 * @author joaodias
 * @version 1.0
 * @since 7/13/2025
 */
@Service
public class BankService{
	private final BankRepository bankRepository;

	public BankService(BankRepository bankRepository){
		this.bankRepository = bankRepository;
	}

	public void save(Bank bank){
		bankRepository.save(bank);
	}

	public List<Bank> findAll(){
		return bankRepository.findAll();
	}

	public void update(Long id, Bank bank){
		Bank existing = bankRepository.findById(id).orElseThrow(() -> new RuntimeException("Banco não encontrado"));

		existing.setName(bank.getName());
		existing.setAccount(bank.getAccount());
		existing.setAgency(bank.getAgency());
		existing.setBalance(bank.getBalance());

		bankRepository.save(existing);
	}

	public void delete(Long id){
		bankRepository.deleteById(id);
	}
}