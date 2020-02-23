package com.novaquality.challenge.service;

import com.novaquality.challenge.persistence.model.Card;

import java.util.List;

public interface CardService {

    public void setScoreForAllCards();

    public Integer calculateScore(Card card);

    public List<Card> getBestCards(Integer limit);
}
