package com.novaquality.challenge.service.impl;

import com.novaquality.challenge.persistence.model.Card;
import com.novaquality.challenge.persistence.repository.CardRepository;
import com.novaquality.challenge.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    /**
     * Calculates score and sets it to all cards in repository
     */
    public void setScoreForAllCards() {
        List<Card> allCards = cardRepository.findAll();
        if (allCards.isEmpty()) {
            throw new IllegalStateException("There are no cards in repository.");
        }
        for(Card card : allCards) {
            card.setScore(calculateScore(card));
        }
    }

    /**
     * Gets the score for one card.
     * @param card Object to calculate score from
     * @return Score for card
     */
    @Override
    public Integer calculateScore(Card card) {
        return card.getRareness().getValue() +
                card.getCategory().getValue() +
                card.getCost() +
                card.getPower();
    }

    /**
     * Gets best cards
     * @param limit Length for card list
     * @return list of best limit cards
     */
    @Override
    public List<Card> getBestCards(Integer limit) {
        List<Card> bestCards = cardRepository.findByBestScore(limit);
        if(bestCards.isEmpty()) {
            throw new IllegalStateException("No cards found in repository.");
        }
        return bestCards;
    }

    /**
     * Gets cards in score interval
     * @param minScore Minimum score for interval
     * @param maxScore Maximum score for interval
     * @return list of cards with score between specified range
     */
    @Override
    public List<Card> getCardsByScoreRange(Integer minScore, Integer maxScore) {
        List<Card> cards = cardRepository.findByScoreRange(minScore, maxScore);
        if(cards.isEmpty()) {
            throw new IllegalStateException("No cards found in repository.");
        }
        return cards;
    }
}
