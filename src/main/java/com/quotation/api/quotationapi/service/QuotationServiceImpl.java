package com.quotation.api.quotationapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.quotation.api.quotationapi.model.Quote;

@Service("QuoteService")
public class QuotationServiceImpl implements QuoteService {

	private List<Quote> list = new ArrayList<>(Arrays.asList(new Quote(1, "Follow your dreams."),
			new Quote(2, "Live Life Fullest."), new Quote(3, "Make you dreams come true.")));

	@Override
	public Quote getById(Integer id) {
		return list.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	@Override
	public List<Quote> getAllQuote() {
		return list;

	}

	@Override
	public String saveQuote(Quote quote) {
		boolean flag= true;
		for(Quote q : list){
			if(q.getId().equals(quote.getId())){
				flag=false;
			}			
		}
		if(flag){
		list.add(quote);
		return "SUCCESS";
		}
		else
		return "Duplicate Entry";
		
	}

	@Override
	public void updateQuote(Quote quote) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteQuoteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllQuote() {
		// TODO Auto-generated method stub

	}

}
