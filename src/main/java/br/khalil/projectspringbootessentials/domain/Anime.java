package br.khalil.projectspringbootessentials.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data//Gera get, set, toString...
@AllArgsConstructor
public class Anime {
    private Long id;
    private String name;

}
