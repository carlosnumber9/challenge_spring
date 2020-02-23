package com.novaquality.challenge.service.impl;

import com.novaquality.challenge.persistence.model.Card;
import com.novaquality.challenge.persistence.repository.impl.InMemoryCardRepository;
import com.novaquality.challenge.service.CardService;

import java.util.List;

public class CardServiceImpl implements CardService {

    private InMemoryCardRepository cardRepository;

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
}
