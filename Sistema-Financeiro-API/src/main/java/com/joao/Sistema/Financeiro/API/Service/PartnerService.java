package com.joao.Sistema.Financeiro.API.Service;

import com.joao.Sistema.Financeiro.API.Model.Partner;
import com.joao.Sistema.Financeiro.API.Repository.PartnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * PartnerService -
 *
 * <p>Classe criada em 7/14/2025 por joaodias.
 *
 * <p>Essa classe faz parte do projeto Sistema-Financeiro-API.
 *
 * @author joaodias
 * @version 1.0
 * @since 7/14/2025
 */
@Service
public class PartnerService{

	private final PartnerRepository partnerRepository;

	public PartnerService(PartnerRepository partnerRepository){
		this.partnerRepository = partnerRepository;
	}

	public void save(Partner partner){
		partnerRepository.save(partner);
	}

	public List<Partner> findAll(){
		return partnerRepository.findAll();
	}

	public void delete(Long id){
		partnerRepository.deleteById(id);
	}
}