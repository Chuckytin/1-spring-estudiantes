package com.example.web.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//Mapea la tabla estudiantes de la base de datos.
@Data
@RequiredArgsConstructor
@Entity
@Table(name= "estudiantes")
public class Estudiante {

    @Id //clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //se genera automáticamente con autoincrement
    private Long id;

    @NonNull
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @NonNull
    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;

    @NonNull
    @Column(name = "email", nullable = false, length = 80, unique = true) //unique asegura que no hay valores duplicados
    private String email;

    //constructor sin parámetros necesario para Hibernate
    public Estudiante() { }

}
