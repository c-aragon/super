package com.demo.superhero.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.demo.superhero.dto.HeroDto;

public class HeroDtoTest {

	@Test
	public void heroDtoTest() {
		//Preparing test
		HeroDto heroDto = new HeroDto();
		heroDto.setId(1L);
		heroDto.setName("Name");

		//Test
		Assertions.assertEquals("Name", heroDto.getName());
		Assertions.assertEquals(1L, heroDto.getId());
	}

}
