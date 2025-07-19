package com.joao.Sistema.Financeiro.API.Repository;

import com.joao.Sistema.Financeiro.API.Model.Partner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerRepository extends JpaRepository<Partner, Long>{
}
