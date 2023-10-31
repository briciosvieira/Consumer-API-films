package com.KSI.config;

import com.KSI.model.Film;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "filmsOmdb", url = "https://www.omdbapi.com/")
public interface FilmConfiguration {

    @GetMapping("/")
    Film getFilmsByTitle(@RequestParam("key") String key ,@RequestParam("t") String title);
}
