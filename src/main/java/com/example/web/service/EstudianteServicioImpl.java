package com.example.web.service;

import com.example.web.entity.Estudiante;
import com.example.web.repository.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Usa el repositorio (EstudianteRepositorio) para interactuar con la base de datos.
@Service
public class EstudianteServicioImpl implements EstudianteServicio {

    @Autowired //inyecta automáticamente el repositorio
    private EstudianteRepositorio estudianteRepositorio;

    @Override
    public List<Estudiante> mostrarEstudiantes() {
        return estudianteRepositorio.findAll();
    }

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return estudianteRepositorio.save(estudiante);
    }

    @Override
    public Estudiante obtenerEstudiantePorId(Long id) {
        return estudianteRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado con ID: " + id));
    }

    @Override
    public Estudiante actualizarEstudiante(Estudiante estudiante) {
        return estudianteRepositorio.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(Long id) {
        estudianteRepositorio.deleteById(id);
    }
}
