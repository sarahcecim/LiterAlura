package com.Alura.LiterAlura.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "livros")

public class Livros {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "autor_id")
    private Autor autor;

    @Column(name = "idioma", nullable = false)
    private String idioma;

    @Column(name = "downloads")
    private Long downloads;

    @Override
    public String toString() {
        return  "----- LIVRO -----" + " \n" +
                "Titulo: " + titulo + " \n" +
                "Autor: " + autor.getNome() + " \n" +
                "Idioma: "  + idioma + " \n" +
                "Downloads: " + downloads + " \n" +
                "-----------------";
    }

}
