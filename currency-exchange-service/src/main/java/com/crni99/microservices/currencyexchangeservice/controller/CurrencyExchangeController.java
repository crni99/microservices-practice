package com.crni99.microservices.currencyexchangeservice.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.crni99.microservices.currencyexchangeservice.model.CurrencyExchange;
import com.crni99.microservices.currencyexchangeservice.service.CurrencyExchangeService;

@RestController
public class CurrencyExchangeController {
	
	private Environment environment;
	private CurrencyExchangeService currencyExchangeService;

	public CurrencyExchangeController(Environment environment, CurrencyExchangeService currencyExchangeService) {
		this.environment = environment;
		this.currencyExchangeService = currencyExchangeService;
	}

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {

		CurrencyExchange currencyExchange = currencyExchangeService.retrieveExchangeValue(from, to);
		if (currencyExchange == null) {
			throw new RuntimeException("Unable to find data for " + from + " to " + to);
		}
		
		String port = environment.getProperty("local.server.port");
		currencyExchange.setEnvironment(port);
		return currencyExchange;
	}
}
