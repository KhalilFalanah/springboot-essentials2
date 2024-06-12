package br.khalil.projectspringbootessentials.controller;

import br.khalil.projectspringbootessentials.domain.Anime;
import br.khalil.projectspringbootessentials.service.AnimeService;
import br.khalil.projectspringbootessentials.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    public ResponseEntity<List<Anime>> list(){//.5
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return ResponseEntity.ok(animeService.listAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Anime> findById(@PathVariable long id){//.5
        return ResponseEntity.ok(animeService.findById(id));
    }

    //.8
    @PostMapping
    //@ResponseStatus(HttpStatus.CREATED) Can do it
    //.9
    public ResponseEntity<Anime> save(@RequestBody Anime anime){
        return new ResponseEntity<>(animeService.save(anime), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){//.11
        animeService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
