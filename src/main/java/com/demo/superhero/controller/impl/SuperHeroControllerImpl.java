/**
 *
 */
package com.demo.superhero.controller.impl;

import java.util.Collections;
import java.util.List;

import com.demo.superhero.entity.Hero;
import com.demo.superhero.service.HeroService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.demo.superhero.controller.HeroController;
import com.demo.superhero.dto.HeroDto;

/**
 * Controller layer for superhero.
 * @author Charly
 *
 */
@RestController
public class SuperHeroControllerImpl implements HeroController {

	private final HeroService heroService;

	private final ModelMapper modelMapper;

	@Autowired
	public SuperHeroControllerImpl(final HeroService heroService, final ModelMapper modelMapper) {
		this.heroService = heroService;
		this.modelMapper = modelMapper;
	}

	@Override
	public HeroDto createHero(HeroDto heroDto) {
		//Transform dto to entity
		Hero hero = modelMapper.map(heroDto, Hero.class);
		hero = heroService.createHero(hero);
		//Transform entity to dto
		return modelMapper.map(hero, HeroDto.class);
	}

	@Override
	public HeroDto getHero(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HeroDto> getHeroes() {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

	@Override
	public HeroDto updateHero(long id, HeroDto heroDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HeroDto deleteHero(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
