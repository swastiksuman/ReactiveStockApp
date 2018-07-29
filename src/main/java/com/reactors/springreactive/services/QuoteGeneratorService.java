package com.reactors.springreactive.services;

import java.time.Duration;

import com.reactors.springreactive.models.Quote;

import reactor.core.publisher.Flux;

public interface QuoteGeneratorService {
	public Flux<Quote> fetchQuoteStream(Duration period);
}
