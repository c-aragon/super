/**
 * 
 */
package com.demo.superhero.controller.impl;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.demo.superhero.controller.HeroController;
import com.demo.superhero.dto.HeroDto;

/**
 * Controller layer for super hero.
 * @author Charly
 *
 */
@RestController
public class SuperHeroControllerImpl implements HeroController {

	@Override
	public HeroDto createHero(HeroDto heroDto) {
		// TODO Auto-generated method stub
		return null;
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
