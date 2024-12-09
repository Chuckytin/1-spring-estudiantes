package com.example.web.controller;

import com.example.web.entity.Estudiante;
import com.example.web.service.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

//Gestiona las solicitudes HTTP para la entidad Estudiante.
@Controller
public class EstudianteControlador {

    @Autowired
    private EstudianteServicio estudianteServicio;

    @GetMapping({"/estudiantes", "/"})
    public String listarEstudiantes(Model model) {
        model.addAttribute("estudiantes", estudianteServicio.mostrarEstudiantes());
        return "estudiantes"; //devuelve el archivo estudiantes
    }

    @GetMapping("/estudiantes/nuevo")
    public String mostrarFormularioRegistroEstudiante(Model model) {
        Estudiante estudiante = new Estudiante();
        model.addAttribute("estudiante", estudiante);
        return "crear_estudiante";
    }

    @PostMapping("/estudiantes")
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante) {
        estudianteServicio.guardarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        Estudiante estudiante = estudianteServicio.obtenerEstudiantePorId(id);
        if (estudiante == null) {
            throw new RuntimeException("Estudiante no encontrado con ID: " + id);
        }
        model.addAttribute("estudiante", estudiante);
        return "editar_estudiante";
    }

    @PostMapping("/estudiantes/{id}")
    public String actualizarEstudiante(@PathVariable Long id, @ModelAttribute("estudiante") Estudiante estudiante) {
        Estudiante estudianteExistente = estudianteServicio.obtenerEstudiantePorId(id);
        if (estudianteExistente == null) {
            throw new RuntimeException("Estudiante no encontrado con ID: " + id);
        }
        estudianteExistente.setNombre(estudiante.getNombre());
        estudianteExistente.setApellido(estudiante.getApellido());
        estudianteExistente.setEmail(estudiante.getEmail());
        estudianteServicio.actualizarEstudiante(estudianteExistente);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/{id}")
    public String eliminarEstudiante(@PathVariable Long id) {
        estudianteServicio.eliminarEstudiante(id);
        return "redirect:/estudiantes";
    }

}
