package br.khalil.projectspringbootessentials.service;

import br.khalil.projectspringbootessentials.domain.Anime;
import br.khalil.projectspringbootessentials.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService  {
    //private final AnimeRepository animeRepository;
    public List<Anime> listAll(){
    return List.of(new Anime(1L, "Death Note"), new Anime(2L, "DBZ") );
    }
}
