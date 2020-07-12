package com.trapp.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/novo")
public class NovoResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String teste() {
		return "X";
	}

}
