package com.KSI.controller;

import com.KSI.model.Film;
import com.KSI.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService service;

    @GetMapping("/{theme}")
    public ResponseEntity<Film> getFilms (@PathVariable String theme ){
        try{
            Film film = service.getFilme(theme);
            return ResponseEntity.status(HttpStatus.OK).body(film);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


}
