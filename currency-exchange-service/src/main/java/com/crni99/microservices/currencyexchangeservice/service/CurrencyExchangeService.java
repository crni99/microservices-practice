package com.crni99.microservices.currencyexchangeservice.service;

import org.springframework.stereotype.Service;

import com.crni99.microservices.currencyexchangeservice.model.CurrencyExchange;
import com.crni99.microservices.currencyexchangeservice.repository.CurrencyExchangeRepository;

@Service
public class CurrencyExchangeService {
	
	private CurrencyExchangeRepository currencyExchangeRepository;
	
	public CurrencyExchangeService(CurrencyExchangeRepository currencyExchangeRepository) {
		this.currencyExchangeRepository = currencyExchangeRepository;
	}
	
	public CurrencyExchange retrieveExchangeValue(String from, String to) {
		return currencyExchangeRepository.findByFromAndTo(from, to);
	}
	
	
}
