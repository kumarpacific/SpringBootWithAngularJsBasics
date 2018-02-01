package com.quotation.api.quotationapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quotation.api.quotationapi.model.Quote;
import com.quotation.api.quotationapi.service.QuoteService;

@RestController
public class QuoteController {

	@Autowired
	private QuoteService quoteService;

	@RequestMapping(method=RequestMethod.GET, value="/quotes")
	public List<Quote> getAllQuotes() {
		return quoteService.getAllQuote();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/quote")
	public String saveQuote(@RequestBody Quote quote) {
		return quoteService.saveQuote(quote);
	}

}
