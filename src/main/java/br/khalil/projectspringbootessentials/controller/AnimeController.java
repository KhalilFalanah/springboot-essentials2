package br.khalil.projectspringbootessentials.controller;

import br.khalil.projectspringbootessentials.domain.Anime;
import br.khalil.projectspringbootessentials.service.AnimeService;
import br.khalil.projectspringbootessentials.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

//.1
//.2
//.3
@RestController
@RequestMapping("animes")
@Log4j2//.4
@RequiredArgsConstructor
public class AnimeController {
    private final DateUtil dateUtil;
    private final AnimeService animeService;

    //8.
    @GetMapping
    public ResponseEntity<List<Anime>> list(){//.5
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return ResponseEntity.ok(animeService.listAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Anime> findById(@PathVariable long id){//.5
        return ResponseEntity.ok(animeService.findById(id));
    }
}
