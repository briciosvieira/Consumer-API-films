package com.KSI.service;

import com.KSI.config.FilmConfiguration;
import com.KSI.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class FilmService {

    @Value("${api.key}")
    private String key;
    @Autowired
    private FilmConfiguration filmConfiguration;

    @GetMapping
    public Film getFilme (String tema){
        return filmConfiguration.getFilmsByTitle(tema, key);
    }
}
