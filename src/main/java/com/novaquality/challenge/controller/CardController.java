package com.novaquality.challenge.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.novaquality.challenge.persistence.model.Card;

@RestController
public class CardController {

	// TODO añadir path al endpoint
	public ResponseEntity<Void> calculateScore() {
		// TODO implementar endpoint
		return ResponseEntity.notFound().build();
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
