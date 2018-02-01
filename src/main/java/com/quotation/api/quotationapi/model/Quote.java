package com.quotation.api.quotationapi.model;

public class Quote {

	
	private Integer id;
	private String quote;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public Quote(Integer id, String quote) {
		super();
		this.id = id;
		this.quote = quote;
	}

	public Quote() {
		super();
	}

}
