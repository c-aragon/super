package com.demo.superhero.service.unit;

import com.demo.superhero.entity.Hero;
import com.demo.superhero.repository.HeroRepository;
import com.demo.superhero.service.HeroService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HeroServiceTest {

    @Autowired
    private HeroService heroService;

    @Autowired
    private HeroRepository heroRepository;

    @Test
    public void createHeroTest() {
        //Preparing data
        Hero hero = new Hero();
        hero.setId(1L);
        hero.setName("Super hero for test");

        //Execute test
        Hero heroResponse = heroService.createHero(hero);

        Hero newHero = heroRepository.findById(heroResponse.getId()).get();

        //Check result
        Assertions.assertEquals(hero.getId(), newHero.getId());
        Assertions.assertEquals(hero.getName(), newHero.getName());

    }

}
