package com.demo.superhero.dto;

/**
 * Super hero dto class.
 * @author Charly
 *
 */
public class HeroDto {
	/**
	 * Id of super hero.
	 */
	private Long id;
	
	/**
	 * Super hero name.
	 */
	private String name;

	/**
	 * Get super hero name.
	 * @return super hero name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set super hero name.
	 * @param name name's super hero.
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Get super hero id.
	 * @return super hero id.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Set super hero id.
	 * @param id id's super hero.
	 */
	public void setId(final Long id) {
		this.id = id;
	}
	
}
