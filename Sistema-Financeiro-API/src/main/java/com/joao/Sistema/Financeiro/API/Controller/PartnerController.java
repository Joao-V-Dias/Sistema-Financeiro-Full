package com.joao.Sistema.Financeiro.API.Controller;

import com.joao.Sistema.Financeiro.API.Model.Partner;
import com.joao.Sistema.Financeiro.API.Service.PartnerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * PartnerController -
 *
 * <p>Classe criada em 7/14/2025 por joaodias.
 *
 * <p>Essa classe faz parte do projeto Sistema-Financeiro-API.
 *
 * @author joaodias
 * @version 1.0
 * @since 7/14/2025
 */
@RestController
@RequestMapping("api/partner")
public class PartnerController{
	private final PartnerService partnerService;

	public PartnerController(PartnerService partnerService){
		this.partnerService = partnerService;
	}

	@PostMapping("/save")
	public void save(@RequestBody Partner partner){
		partnerService.save(partner);
	}

	@GetMapping("/findAll")
	public List<Partner> findAll(){
		return partnerService.findAll();
	}

	@PutMapping("/update/{id}")
	public void update(@PathVariable Long id, @RequestBody Partner partner){
		partnerService.update(id, partner);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id){
		partnerService.delete(id);
	}
}