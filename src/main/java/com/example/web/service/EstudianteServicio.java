package com.example.web.service;

import com.example.web.entity.Estudiante;

import java.util.List;

//interfaz que separa la lógica de negocio(servicios) con la lógica de acceso a datos(repositorio)
public interface EstudianteServicio {

    public List<Estudiante> mostrarEstudiantes();

    public Estudiante guardarEstudiante(Estudiante estudiante);

    public Estudiante obtenerEstudiantePorId(Long id);

    public Estudiante actualizarEstudiante(Estudiante estudiante);

    public void eliminarEstudiante(Long id);

}
