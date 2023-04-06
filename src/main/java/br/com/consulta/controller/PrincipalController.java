package br.com.consulta.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.consulta.entity.Endereco;
import br.com.consulta.service.ServicoDeCep;

@RestController
@RequestMapping("/consultas")
public class PrincipalController {
	
	@RequestMapping(method = RequestMethod.GET,value  = "/endereco",params = "cep")
	public Endereco consultacep(@RequestParam("cep") String cep) throws Exception {
		 Endereco end = ServicoDeCep.buscaEnderecoPelo(cep);
		return end;
	}

}
