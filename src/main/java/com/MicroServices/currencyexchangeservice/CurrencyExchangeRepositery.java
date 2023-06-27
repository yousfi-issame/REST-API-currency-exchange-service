package com.MicroServices.currencyexchangeservice;

import com.MicroServices.currencyexchangeservice.Controller.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepositery extends JpaRepository<CurrencyExchange, Long>{
  CurrencyExchange findByFromAndTo(String from,String to);



}
