package com.joao.Sistema.Financeiro.API.Repository;

import com.joao.Sistema.Financeiro.API.Model.PaymentTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentTitleRepository extends JpaRepository<PaymentTitle, Long>{
}
