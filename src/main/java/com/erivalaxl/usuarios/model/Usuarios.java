package com.erivalaxl.usuarios.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Usuarios implements Serializable {
    private static  final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable = false)
    private int id;

    private String nombre;
    private String apeido;
    private String apeidom;
    private int edad;
    private boolean dentro;
}
