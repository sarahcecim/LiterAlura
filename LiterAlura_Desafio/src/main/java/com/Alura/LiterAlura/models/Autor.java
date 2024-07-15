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
@Table(name = "autor")

public class Autor {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "dt_nascimento", nullable = false)
    private String dtNascimento;

    @Column(name = "dt_falecimento", nullable = false)
    private String dtFalecimento;

    @Override
    public String toString() {
        return  "----- Autor -----  \n" +
				"Nome: " + nome + " \n" +
				"Data de Nascimento: " + dtNascimento + " \n" +
				"Data de Falecimento: " + dtFalecimento + " \n" +
                "-----------------";
    }
}




