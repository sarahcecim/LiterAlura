package com.Alura.LiterAlura.repositories;

import com.Alura.LiterAlura.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AutorRepository extends JpaRepository<Autor, Integer> {

    @Query("select a from Autor a")
    List<Autor> findAutores();

    @Query("select a from Autor a where left(a.dtFalecimento, 4) >= ?1 ")
    List<Autor> findAutoresByDtFalecimento(String ano);


}
