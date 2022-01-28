package com.demo.superhero.service.impl;

import com.demo.superhero.entity.Hero;
import com.demo.superhero.repository.HeroRepository;
import com.demo.superhero.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroServiceImpl implements HeroService {

    private final HeroRepository heroRepository;

    @Autowired
    public HeroServiceImpl(final HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    /**
     * Create a new superhero.
     *
     * @param hero Superhero data.
     * @return Object with superhero data.
     */
    @Override
    public Hero createHero(final Hero hero) {
        return heroRepository.save(hero);
    }
}
