package com.joao.Sistema.Financeiro.API.Repository;

import com.joao.Sistema.Financeiro.API.Model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long>{
}
