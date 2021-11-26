/**
 *
 */
package com.demo.superhero.controller.impl;

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

	private HeroService heroService;

	private ModelMapper modelMapper;

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
		HeroDto newHeroDto = modelMapper.map(hero, HeroDto.class);
		return newHeroDto;
	}

	@Override
	public HeroDto getHero(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HeroDto> getHeroes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HeroDto updateHero(Long id, HeroDto heroDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HeroDto deleteHero(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
