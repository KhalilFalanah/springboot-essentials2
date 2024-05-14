package br.khalil.projectspringbootessentials.controller;

import br.khalil.projectspringbootessentials.domain.Anime;
import  br.khalil.projectspringbootessentials.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2//log
//@AllArgsConstructor - Cria um construtor com atributos da própria classe;
//@NoArgsConstructor - Construtor vazio;
//@RequiredArgsConstructor - Construtor para atributos finais (private final DateUtil dateUtil;)
@AllArgsConstructor
public class AnimeController {

    private DateUtil dateUtil;


    //localhost:8080/anime/list
    @GetMapping(path="list")
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("Death Note"), new Anime("Naruto"), new Anime("One Piece"));
    }
}
