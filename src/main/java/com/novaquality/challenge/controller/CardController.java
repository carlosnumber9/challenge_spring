package com.novaquality.challenge.controller;

import java.util.ArrayList;
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

	private final Integer BEST_CARDS_LIST_LIMIT = 5;

	@Autowired
	private CardService cardService;

	@RequestMapping(value = "/scores", method = RequestMethod.GET)
	public ResponseEntity<Void> calculateScore() {
		try {
			cardService.setScoreForAllCards();
		}
		catch (IllegalStateException e) {
			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.ok().build();
	}

	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Card>> getBestDeck() {

		List<Card> bestCards = new ArrayList<>();

		try {
			bestCards = cardService.getBestCards(BEST_CARDS_LIST_LIMIT);
		}
		catch (IllegalStateException e) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(bestCards);
	}

	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Card>> getCardsByScore(
			@RequestParam(name = "minScore") Integer minScore,
			@RequestParam(name = "maxScore") Integer maxScore) {

		List<Card> cards = new ArrayList<>();

		try {
			cards = cardService.getCardsByScoreRange(minScore, maxScore);
		}
		catch (IllegalStateException e) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(cards);
	}
}
