package com.demo.superhero.service;

import com.demo.superhero.entity.Hero;

public interface HeroService {

    /**
     * Create a new superhero.
     * @param hero Superhero data.
     * @return Object with superhero data.
     */
    Hero createHero(Hero hero);

}
