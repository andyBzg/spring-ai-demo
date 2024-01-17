package de.andybzg.springaidemo.service;

import de.andybzg.springaidemo.dto.PoetryDto;

public interface PoetryService {

    String getCatHaiku();

    PoetryDto getPoetryByGenreAndTheme(String genre, String theme);
}
