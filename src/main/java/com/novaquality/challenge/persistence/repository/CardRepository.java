package com.novaquality.challenge.persistence.repository;


import com.novaquality.challenge.persistence.model.Card;

import java.util.List;

public interface CardRepository {

    public List<Card> findAll();

    public List<Card> findByBestScore(Integer limit);

}
