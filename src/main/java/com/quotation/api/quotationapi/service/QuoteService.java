package com.quotation.api.quotationapi.service;

import java.util.List;

import com.quotation.api.quotationapi.model.Quote;

public interface QuoteService {
	
	Quote getById(Integer id);
	List<Quote> getAllQuote();
	
	String saveQuote(Quote quote);
	
	void updateQuote(Quote quote);
	
	void deleteQuoteById(Integer id);
	void deleteAllQuote();
	
	


}
