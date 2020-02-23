package com.novaquality.challenge.service;

import com.novaquality.challenge.persistence.model.Card;

public interface CardService {

    public void setScoreForAllCards();

    public Integer calculateScore(Card card);
}
