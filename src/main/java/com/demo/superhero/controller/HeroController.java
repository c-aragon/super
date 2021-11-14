package com.demo.superhero.controller;

import java.util.List;

import com.demo.superhero.dto.HeroDto;

/**
 * Interface for super hero
 * @author Charly
 *
 */
public interface HeroController {

	/**
	 * Create a new super hero.
	 * @param heroDto Super hero data.
	 * @return Object with super hero data.
	 */
	HeroDto createHero(HeroDto heroDto);
	
	/**
	 * Get Hero by id.
	 * @param id Id's super hero.
	 * @return Object with super hero data.
	 */
	HeroDto getHero(Long id);
	
	/**
	 * Get heroes.
	 * @return A list with super heroes.
	 */
	List<HeroDto> getHeroes();
	
	/**
	 * Update a super hero.
	 * @param id Id of super hero.
	 * @param heroDto Super hero data.
	 * @return Object with super hero data.
	 */
	HeroDto updateHero(Long id, HeroDto heroDto);
	
	/**
	 * Logical delete of super hero.
	 * @param id Id of super hero
	 * @return Object with super hero data.
	 */
	HeroDto deleteHero(Long id);
	
}
