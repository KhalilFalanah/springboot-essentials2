package br.khalil.projectspringbootessentials.controller;

import br.khalil.projectspringbootessentials.domain.Anime;
import br.khalil.projectspringbootessentials.service.AnimeService;
import  br.khalil.projectspringbootessentials.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

//@AllArgsConstructor - Cria um construtor com atributos da própria classe;
//@NoArgsConstructor - Construtor vazio;
//@RequiredArgsConstructor - Construtor para atributos finais (private final DateUtil dateUtil;)
@RestController
@RequestMapping("animes")
@Log4j2//log
@RequiredArgsConstructor
public class AnimeController {
    private final DateUtil dateUtil;
    private final AnimeService animeService;


    @GetMapping
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return animeService.listAll();
    }
}
