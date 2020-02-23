package com.novaquality.challenge.controller;

import java.util.List;

import com.novaquality.challenge.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.novaquality.challenge.persistence.model.Card;

@RestController
@RequestMapping("cards")
public class CardController {

	@Autowired
	private CardService cardService;

	@RequestMapping(value = "/scores")
	public ResponseEntity<Void> calculateScore() {
		try {
			cardService.setScoreForAllCards();
		}
		catch (IllegalStateException e) {
			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.ok().build();
	}

	// TODO añadir path al endpoint
	public ResponseEntity<List<Card>> getBestDeck() {
		// TODO implementar endpoint
		return ResponseEntity.notFound().build();
	}

	// TODO añadir path al endpoint
	public ResponseEntity<List<Card>> getCardsByScore(/* TODO añadir parámetros */) {
		// TODO implementar endpoint
		return ResponseEntity.notFound().build();
	}
}
