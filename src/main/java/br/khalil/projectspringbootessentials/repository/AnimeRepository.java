package br.khalil.projectspringbootessentials.repository;

import br.khalil.projectspringbootessentials.domain.Anime;

import java.util.List;

//Representa o DataBase
public interface AnimeRepository {
    List<Anime> listAll();
}
