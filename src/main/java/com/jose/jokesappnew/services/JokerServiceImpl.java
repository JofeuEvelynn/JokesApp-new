package com.jose.jokesappnew.services;

import org.springframework.stereotype.Service;

/**
 * @author Josephvp
 * @version 1.0
 * @date 16-05-2021 08:06 AM
 */
@Service
public class JokerServiceImpl implements JokerService {
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokerServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }


    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
