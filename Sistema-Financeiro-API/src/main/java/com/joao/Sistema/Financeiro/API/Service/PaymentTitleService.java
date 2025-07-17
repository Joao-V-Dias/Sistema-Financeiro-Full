package com.joao.Sistema.Financeiro.API.Service;

import com.joao.Sistema.Financeiro.API.Model.PaymentTitle;
import com.joao.Sistema.Financeiro.API.Repository.PaymentTitleRepository;

import java.util.List;

/**
 * PaymentTitleService -
 *
 * <p>Classe criada em 7/16/2025 por joaodias.
 *
 * <p>Essa classe faz parte do projeto Sistema-Financeiro-API.
 *
 * @author joaodias
 * @version 1.0
 * @since 7/16/2025
 */
public class PaymentTitleService{
	private PaymentTitleRepository paymentTitleRepository;

	public PaymentTitleService(PaymentTitleRepository paymentTitleRepository){
		this.paymentTitleRepository = paymentTitleRepository;
	}

	public void save(PaymentTitle paymentTitle){
		paymentTitleRepository.save(paymentTitle);
	}

	public List<PaymentTitle>findAll(){
		return	paymentTitleRepository.findAll();
	}

	public void update(Long id, PaymentTitle paymentTitle){
		PaymentTitle existing = paymentTitleRepository.findById(id).orElseThrow(() -> new RuntimeException("Titulo de pagamento nao encontrado!"));


	}

	public void delete(){

	}
}