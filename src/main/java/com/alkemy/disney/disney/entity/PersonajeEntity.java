package com.alkemy.disney.disney.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.awt.*;
import java.util.Date;


@Entity
@Table(name = "personajes")
@Getter
@Setter
public class PersonajeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;

    private String nombre;

    private Integer edad;

    private Integer peso;

    private TextArea historia;
}